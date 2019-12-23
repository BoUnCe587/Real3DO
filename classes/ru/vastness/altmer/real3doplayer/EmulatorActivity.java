package ru.vastness.altmer.real3doplayer;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Toast;

public class EmulatorActivity extends Activity implements SurfaceHolder.Callback, View.OnTouchListener {
  private int a;
  
  private int b;
  
  private void a(String paramString) {}
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2130968600);
    SurfaceView surfaceView = (SurfaceView)findViewById(2131558477);
    surfaceView.getHolder().addCallback(this);
    surfaceView.setOnTouchListener(this);
    Intent intent = getIntent();
    this.a = intent.getIntExtra("lunchMode", 0);
    NativeCore.nativeOnCreate(this.a);
    if (((UiModeManager)getSystemService("uimode")).getCurrentModeType() == 4) {
      a("Running on a TV Device");
    } else {
      a("Running on a non-TV Device");
      Display display = getWindowManager().getDefaultDisplay();
      int i = display.getRotation();
      Point point = new Point();
      display.getSize(point);
      if (i == 0 || i == 2) {
        if (point.x > point.y) {
          if (i == 0) {
            i = 0;
          } else {
            i = 8;
          } 
        } else if (i == 0) {
          i = 1;
        } else {
          i = 9;
        } 
      } else if (point.x > point.y) {
        if (i == 1) {
          i = 0;
        } else {
          i = 8;
        } 
      } else if (i == 1) {
        i = 9;
      } else {
        i = 1;
      } 
      if (intent.getBooleanExtra("lockOrient", true) && this.a == 0)
        setRequestedOrientation(i); 
    } 
    this.b = 0;
  }
  
  protected void onDestroy() {
    NativeCore.nativeOnDestroy();
    super.onDestroy();
    a("emu onDestroy()");
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      this.b++;
      if (this.b < 2) {
        if (this.a != 0)
          Toast.makeText(this, "Once more...", 0).show(); 
        return true;
      } 
    } else {
      int i = NativeCore.onKeyEvent(paramInt, 1, paramKeyEvent.getScanCode());
      if (i != 0) {
        if (i == 1) {
          this.b = 0;
          return true;
        } 
        if (i == 2) {
          finish();
          return true;
        } 
        return true;
      } 
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt != 4) {
      int i = NativeCore.onKeyEvent(paramInt, 0, paramKeyEvent.getScanCode());
      if (i != 0) {
        if (i == 1) {
          this.b = 0;
          return true;
        } 
        if (i == 2) {
          finish();
          return true;
        } 
        return true;
      } 
    } else if (this.b < 2) {
      NativeCore.onKeyEvent(0, 2, 0);
      return true;
    } 
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    NativeCore.nativeOnPause();
    super.onPause();
    a("onPause()");
  }
  
  protected void onResume() {
    super.onResume();
    NativeCore.nativeOnResume();
    a("onResume()");
  }
  
  protected void onStart() {
    super.onStart();
    NativeCore.nativeOnStart();
    a("onStart()");
  }
  
  protected void onStop() {
    NativeCore.nativeOnStop();
    super.onStop();
    a("onStop()");
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    int j = paramMotionEvent.getPointerCount();
    switch (paramMotionEvent.getActionMasked()) {
      default:
        return true;
      case 0:
      case 5:
        i = NativeCore.onTouchEvent(paramMotionEvent.getPointerId(i), (int)paramMotionEvent.getX(i), (int)paramMotionEvent.getY(i), 513);
        if (i == 1) {
          this.b = 0;
          return true;
        } 
        if (i == 2) {
          finish();
          return true;
        } 
      case 1:
      case 6:
        i = NativeCore.onTouchEvent(paramMotionEvent.getPointerId(i), (int)paramMotionEvent.getX(i), (int)paramMotionEvent.getY(i), 512);
        if (i == 1) {
          this.b = 0;
          return true;
        } 
        if (i == 2) {
          finish();
          return true;
        } 
      case 2:
        break;
    } 
    byte b1 = 0;
    while (true) {
      if (b1 < j) {
        i = 4097;
        if (!b1)
          i = 4353; 
        int k = i;
        if (b1 == j - 1)
          k = i | 0x200; 
        if (NativeCore.onTouchEvent(paramMotionEvent.getPointerId(b1), (int)paramMotionEvent.getX(b1), (int)paramMotionEvent.getY(b1), k) == 1)
          this.b = 0; 
        b1++;
      } 
    } 
  }
  
  @TargetApi(19)
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
      getWindow().getDecorView().setSystemUiVisibility(5894); 
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {
    float f = (getResources().getDisplayMetrics()).density;
    NativeCore.nativeSetSurface(paramSurfaceHolder.getSurface(), f);
    this.b = 0;
    a("emu surfaceChanged()");
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder) {
    float f = (getResources().getDisplayMetrics()).density;
    NativeCore.nativeSetSurface(paramSurfaceHolder.getSurface(), f);
    a("emu surfaceCreated()");
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {
    NativeCore.nativeSetSurface(null, 0.0F);
    a("emu surfaceDestroyed()");
  }
}
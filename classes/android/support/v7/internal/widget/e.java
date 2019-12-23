package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v4.widget.e;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class e extends PopupWindow {
  private static final boolean a;
  
  private boolean b;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
  
  public e(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    p p = p.a(paramContext, paramAttributeSet, a.j.PopupWindow, paramInt, 0);
    if (p.d(a.j.PopupWindow_overlapAnchor))
      a(p.a(a.j.PopupWindow_overlapAnchor, false)); 
    setBackgroundDrawable(p.a(a.j.PopupWindow_android_popupBackground));
    p.b();
    if (Build.VERSION.SDK_INT < 14)
      a(this); 
  }
  
  private static void a(PopupWindow paramPopupWindow) {
    try {
      Field field1 = PopupWindow.class.getDeclaredField("mAnchor");
      field1.setAccessible(true);
      Field field2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
      field2.setAccessible(true);
      field2.set(paramPopupWindow, new ViewTreeObserver.OnScrollChangedListener(field1, paramPopupWindow, (ViewTreeObserver.OnScrollChangedListener)field2.get(paramPopupWindow)) {
            public void onScrollChanged() {
              try {
                WeakReference weakReference = (WeakReference)this.a.get(this.b);
                if (weakReference != null) {
                  if (weakReference.get() == null)
                    return; 
                  this.c.onScrollChanged();
                  return;
                } 
              } catch (IllegalAccessException illegalAccessException) {}
            }
          });
      return;
    } catch (Exception paramPopupWindow) {
      Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", paramPopupWindow);
      return;
    } 
  }
  
  public void a(boolean paramBoolean) {
    if (a) {
      this.b = paramBoolean;
      return;
    } 
    e.a(this, paramBoolean);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  @TargetApi(19)
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (a && this.b)
      paramInt2 -= paramView.getHeight(); 
    super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}
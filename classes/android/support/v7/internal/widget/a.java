package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.h.i;
import android.support.v4.h.u;
import android.support.v4.h.x;
import android.support.v7.b.a;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

abstract class a extends ViewGroup {
  protected final a a = new a(this);
  
  protected final Context b;
  
  protected ActionMenuView c;
  
  protected a d;
  
  protected int e;
  
  protected u f;
  
  private boolean g;
  
  private boolean h;
  
  a(Context paramContext) { this(paramContext, null); }
  
  a(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedValue typedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(a.a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
      this.b = new ContextThemeWrapper(paramContext, typedValue.resourceId);
      return;
    } 
    this.b = paramContext;
  }
  
  protected static int a(int paramInt1, int paramInt2, boolean paramBoolean) { return paramBoolean ? (paramInt1 - paramInt2) : (paramInt1 + paramInt2); }
  
  protected int a(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() - paramInt3);
  }
  
  protected int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    } 
    paramInt1 = i;
    if (paramBoolean)
      paramInt1 = -i; 
    return paramInt1;
  }
  
  public int getAnimatedVisibility() { return (this.f != null) ? this.a.a : getVisibility(); }
  
  public int getContentHeight() { return this.e; }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    TypedArray typedArray = getContext().obtainStyledAttributes(null, a.j.ActionBar, a.a.actionBarStyle, 0);
    setContentHeight(typedArray.getLayoutDimension(a.j.ActionBar_height, 0));
    typedArray.recycle();
    if (this.d != null)
      this.d.a(paramConfiguration); 
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = i.a(paramMotionEvent);
    if (i == 9)
      this.h = false; 
    if (!this.h) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.h = true; 
    } 
    if (i == 10 || i == 3)
      this.h = false; 
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = i.a(paramMotionEvent);
    if (i == 0)
      this.g = false; 
    if (!this.g) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.g = true; 
    } 
    if (i == 1 || i == 3)
      this.g = false; 
    return true;
  }
  
  public void setContentHeight(int paramInt) {
    this.e = paramInt;
    requestLayout();
  }
  
  public void setVisibility(int paramInt) {
    if (paramInt != getVisibility()) {
      if (this.f != null)
        this.f.a(); 
      super.setVisibility(paramInt);
    } 
  }
  
  protected class a implements x {
    int a;
    
    private boolean c = false;
    
    protected a(a this$0) {}
    
    public void a(View param1View) {
      a.a(this.b, 0);
      this.c = false;
    }
    
    public void b(View param1View) {
      if (this.c)
        return; 
      this.b.f = null;
      a.b(this.b, this.a);
    }
    
    public void c(View param1View) { this.c = true; }
  }
}
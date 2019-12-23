package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.b.a;
import android.support.v7.internal.a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {
  Drawable a;
  
  Drawable b;
  
  Drawable c;
  
  boolean d;
  
  boolean e;
  
  private boolean f;
  
  private View g;
  
  private View h;
  
  private View i;
  
  private int j;
  
  public ActionBarContainer(Context paramContext) { this(paramContext, null); }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    if (a.a()) {
      b1 = new c(this);
    } else {
      b1 = new b(this);
    } 
    setBackgroundDrawable(b1);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ActionBar);
    this.a = typedArray.getDrawable(a.j.ActionBar_background);
    this.b = typedArray.getDrawable(a.j.ActionBar_backgroundStacked);
    this.j = typedArray.getDimensionPixelSize(a.j.ActionBar_height, -1);
    if (getId() == a.e.split_action_bar) {
      this.d = true;
      this.c = typedArray.getDrawable(a.j.ActionBar_backgroundSplit);
    } 
    typedArray.recycle();
    if (this.d) {
      if (this.c == null) {
        bool = true;
      } else {
        bool = false;
      } 
    } else if (this.a == null && this.b == null) {
      bool = true;
    } else {
      bool = false;
    } 
    setWillNotDraw(bool);
  }
  
  private boolean a(View paramView) { return (paramView == null || paramView.getVisibility() == 8 || paramView.getMeasuredHeight() == 0); }
  
  private int b(View paramView) {
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    int m = layoutParams.topMargin;
    return layoutParams.bottomMargin + k + m;
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.a != null && this.a.isStateful())
      this.a.setState(getDrawableState()); 
    if (this.b != null && this.b.isStateful())
      this.b.setState(getDrawableState()); 
    if (this.c != null && this.c.isStateful())
      this.c.setState(getDrawableState()); 
  }
  
  public View getTabContainer() { return this.g; }
  
  public void jumpDrawablesToCurrentState() {
    if (Build.VERSION.SDK_INT >= 11) {
      super.jumpDrawablesToCurrentState();
      if (this.a != null)
        this.a.jumpToCurrentState(); 
      if (this.b != null)
        this.b.jumpToCurrentState(); 
      if (this.c != null)
        this.c.jumpToCurrentState(); 
    } 
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    this.h = findViewById(a.e.action_bar);
    this.i = findViewById(a.e.action_context_bar);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) { return (this.f || super.onInterceptTouchEvent(paramMotionEvent)); }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int k = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View view = this.g;
    if (view != null && view.getVisibility() != 8) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    if (view != null && view.getVisibility() != 8) {
      paramInt2 = getMeasuredHeight();
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      view.layout(paramInt1, paramInt2 - view.getMeasuredHeight() - layoutParams.bottomMargin, paramInt3, paramInt2 - layoutParams.bottomMargin);
    } 
    if (this.d) {
      if (this.c != null) {
        this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paramInt1 = k;
      } else {
        paramInt1 = 0;
      } 
    } else {
      if (this.a != null) {
        if (this.h.getVisibility() == 0) {
          this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
        } else if (this.i != null && this.i.getVisibility() == 0) {
          this.a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
        } else {
          this.a.setBounds(0, 0, 0, 0);
        } 
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      } 
      this.e = paramBoolean;
      if (paramBoolean && this.b != null) {
        this.b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        paramInt1 = k;
      } 
    } 
    if (paramInt1 != 0)
      invalidate(); 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int k = paramInt2;
    if (this.h == null) {
      k = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {
        k = paramInt2;
        if (this.j >= 0)
          k = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(paramInt2)), -2147483648); 
      } 
    } 
    super.onMeasure(paramInt1, k);
    if (this.h != null) {
      paramInt2 = View.MeasureSpec.getMode(k);
      if (this.g != null && this.g.getVisibility() != 8 && paramInt2 != 1073741824) {
        if (!a(this.h)) {
          paramInt1 = b(this.h);
        } else if (!a(this.i)) {
          paramInt1 = b(this.i);
        } else {
          paramInt1 = 0;
        } 
        if (paramInt2 == Integer.MIN_VALUE) {
          paramInt2 = View.MeasureSpec.getSize(k);
        } else {
          paramInt2 = Integer.MAX_VALUE;
        } 
        setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + b(this.g), paramInt2));
        return;
      } 
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable) {
    boolean bool = true;
    if (this.a != null) {
      this.a.setCallback(null);
      unscheduleDrawable(this.a);
    } 
    this.a = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
      if (this.h != null)
        this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom()); 
    } 
    if (this.d) {
      if (this.c != null)
        bool = false; 
    } else if (this.a != null || this.b != null) {
      bool = false;
    } 
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setSplitBackground(Drawable paramDrawable) {
    boolean bool = true;
    if (this.c != null) {
      this.c.setCallback(null);
      unscheduleDrawable(this.c);
    } 
    this.c = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
      if (this.d && this.c != null)
        this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight()); 
    } 
    if (this.d) {
      if (this.c != null)
        bool = false; 
    } else if (this.a != null || this.b != null) {
      bool = false;
    } 
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setStackedBackground(Drawable paramDrawable) {
    boolean bool = true;
    if (this.b != null) {
      this.b.setCallback(null);
      unscheduleDrawable(this.b);
    } 
    this.b = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
      if (this.e && this.b != null)
        this.b.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom()); 
    } 
    if (this.d) {
      if (this.c != null)
        bool = false; 
    } else if (this.a != null || this.b != null) {
      bool = false;
    } 
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setTabContainer(k paramk) {
    if (this.g != null)
      removeView(this.g); 
    this.g = paramk;
    if (paramk != null) {
      addView(paramk);
      ViewGroup.LayoutParams layoutParams = paramk.getLayoutParams();
      layoutParams.width = -1;
      layoutParams.height = -2;
      paramk.setAllowCollapse(false);
    } 
  }
  
  public void setTransitioning(boolean paramBoolean) {
    int k;
    this.f = paramBoolean;
    if (paramBoolean) {
      k = 393216;
    } else {
      k = 262144;
    } 
    setDescendantFocusability(k);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (this.a != null)
      this.a.setVisible(bool, false); 
    if (this.b != null)
      this.b.setVisible(bool, false); 
    if (this.c != null)
      this.c.setVisible(bool, false); 
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback) { return null; }
  
  protected boolean verifyDrawable(Drawable paramDrawable) { return ((paramDrawable == this.a && !this.d) || (paramDrawable == this.b && this.e) || (paramDrawable == this.c && this.d) || super.verifyDrawable(paramDrawable)); }
}
package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.j;
import android.support.v4.h.l;
import android.support.v4.h.u;
import android.support.v4.h.x;
import android.support.v4.h.y;
import android.support.v4.widget.j;
import android.support.v7.b.a;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class ActionBarOverlayLayout extends ViewGroup {
  static final int[] a = { a.a.actionBarSize, 16842841 };
  
  private final Runnable A = new Runnable(this) {
      public void run() {
        ActionBarOverlayLayout.a(this.a);
        ActionBarOverlayLayout.a(this.a, l.e(ActionBarOverlayLayout.c(this.a)).a(-ActionBarOverlayLayout.c(this.a).getHeight()).a(ActionBarOverlayLayout.b(this.a)));
      }
    };
  
  private final j B;
  
  private int b;
  
  private int c = 0;
  
  private ContentFrameLayout d;
  
  private ActionBarContainer e;
  
  private f f;
  
  private Drawable g;
  
  private boolean h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private int m;
  
  private int n;
  
  private final Rect o = new Rect();
  
  private final Rect p = new Rect();
  
  private final Rect q = new Rect();
  
  private final Rect r = new Rect();
  
  private final Rect s = new Rect();
  
  private final Rect t = new Rect();
  
  private a u;
  
  private final int v = 600;
  
  private j w;
  
  private u x;
  
  private final x y = new y(this) {
      public void b(View param1View) {
        ActionBarOverlayLayout.a(this.a, null);
        ActionBarOverlayLayout.a(this.a, false);
      }
      
      public void c(View param1View) {
        ActionBarOverlayLayout.a(this.a, null);
        ActionBarOverlayLayout.a(this.a, false);
      }
    };
  
  private final Runnable z = new Runnable(this) {
      public void run() {
        ActionBarOverlayLayout.a(this.a);
        ActionBarOverlayLayout.a(this.a, l.e(ActionBarOverlayLayout.c(this.a)).a(0.0F).a(ActionBarOverlayLayout.b(this.a)));
      }
    };
  
  public ActionBarOverlayLayout(Context paramContext) { this(paramContext, null); }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    this.B = new j(this);
  }
  
  private f a(View paramView) {
    if (paramView instanceof f)
      return (f)paramView; 
    if (paramView instanceof Toolbar)
      return ((Toolbar)paramView).getWrapper(); 
    throw new IllegalStateException("Can't make a decor toolbar out of " + paramView.getClass().getSimpleName());
  }
  
  private void a(Context paramContext) {
    boolean bool;
    boolean bool1 = true;
    TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(a);
    this.b = typedArray.getDimensionPixelSize(0, 0);
    this.g = typedArray.getDrawable(1);
    if (this.g == null) {
      bool = true;
    } else {
      bool = false;
    } 
    setWillNotDraw(bool);
    typedArray.recycle();
    if ((paramContext.getApplicationInfo()).targetSdkVersion < 19) {
      bool = bool1;
    } else {
      bool = false;
    } 
    this.h = bool;
    this.w = j.a(paramContext);
  }
  
  private boolean a(float paramFloat1, float paramFloat2) {
    boolean bool = false;
    this.w.a(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    if (this.w.a() > this.e.getHeight())
      bool = true; 
    return bool;
  }
  
  private boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    byte b4 = 0;
    b b1 = (b)paramView.getLayoutParams();
    byte b3 = b4;
    if (paramBoolean1) {
      b3 = b4;
      if (b1.leftMargin != paramRect.left) {
        b1.leftMargin = paramRect.left;
        b3 = 1;
      } 
    } 
    byte b2 = b3;
    if (paramBoolean2) {
      b2 = b3;
      if (b1.topMargin != paramRect.top) {
        b1.topMargin = paramRect.top;
        b2 = 1;
      } 
    } 
    int i1 = b2;
    if (paramBoolean4) {
      i1 = b2;
      if (b1.rightMargin != paramRect.right) {
        b1.rightMargin = paramRect.right;
        i1 = 1;
      } 
    } 
    if (paramBoolean3 && b1.bottomMargin != paramRect.bottom) {
      b1.bottomMargin = paramRect.bottom;
      return true;
    } 
    return i1;
  }
  
  private void c() {
    removeCallbacks(this.z);
    removeCallbacks(this.A);
    if (this.x != null)
      this.x.a(); 
  }
  
  private void d() {
    c();
    postDelayed(this.z, 600L);
  }
  
  private void e() {
    c();
    postDelayed(this.A, 600L);
  }
  
  private void f() {
    c();
    this.z.run();
  }
  
  private void g() {
    c();
    this.A.run();
  }
  
  protected b a() { return new b(-1, -1); }
  
  public b a(AttributeSet paramAttributeSet) { return new b(getContext(), paramAttributeSet); }
  
  void b() {
    if (this.d == null) {
      this.d = (ContentFrameLayout)findViewById(a.e.action_bar_activity_content);
      this.e = (ActionBarContainer)findViewById(a.e.action_bar_container);
      this.f = a(findViewById(a.e.action_bar));
    } 
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return paramLayoutParams instanceof b; }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.g != null && !this.h) {
      int i1;
      if (this.e.getVisibility() == 0) {
        i1 = (int)(this.e.getBottom() + l.c(this.e) + 0.5F);
      } else {
        i1 = 0;
      } 
      this.g.setBounds(0, i1, getWidth(), this.g.getIntrinsicHeight() + i1);
      this.g.draw(paramCanvas);
    } 
  }
  
  protected boolean fitSystemWindows(Rect paramRect) {
    b();
    if ((l.f(this) & 0x100) != 0);
    boolean bool = a(this.e, paramRect, true, true, false, true);
    this.r.set(paramRect);
    r.a(this, this.r, this.o);
    if (!this.p.equals(this.o)) {
      this.p.set(this.o);
      bool = true;
    } 
    if (bool)
      requestLayout(); 
    return true;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return new b(paramLayoutParams); }
  
  public int getActionBarHideOffset() { return (this.e != null) ? -((int)l.c(this.e)) : 0; }
  
  public int getNestedScrollAxes() { return this.B.a(); }
  
  public CharSequence getTitle() {
    b();
    return this.f.a();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    a(getContext());
    l.g(this);
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    c();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      View view = getChildAt(paramInt1);
      if (view.getVisibility() != 8) {
        b b1 = (b)view.getLayoutParams();
        int i1 = view.getMeasuredWidth();
        int i2 = view.getMeasuredHeight();
        int i3 = b1.leftMargin + paramInt3;
        int i4 = b1.topMargin + paramInt4;
        view.layout(i3, i4, i1 + i3, i2 + i4);
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    b();
    measureChildWithMargins(this.e, paramInt1, 0, paramInt2, 0);
    b b1 = (b)this.e.getLayoutParams();
    int i6 = Math.max(0, this.e.getMeasuredWidth() + b1.leftMargin + b1.rightMargin);
    int i1 = this.e.getMeasuredHeight();
    int i2 = b1.topMargin;
    int i5 = Math.max(0, b1.bottomMargin + i1 + i2);
    int i4 = r.a(0, l.b(this.e));
    if ((l.f(this) & 0x100) != 0) {
      i2 = 1;
    } else {
      i2 = 0;
    } 
    if (i2 != 0) {
      int i7 = this.b;
      i1 = i7;
      if (this.j) {
        i1 = i7;
        if (this.e.getTabContainer() != null)
          i1 = i7 + this.b; 
      } 
    } else if (this.e.getVisibility() != 8) {
      i1 = this.e.getMeasuredHeight();
    } else {
      i1 = 0;
    } 
    this.q.set(this.o);
    this.s.set(this.r);
    if (!this.i && i2 == 0) {
      Rect rect = this.q;
      rect.top = i1 + rect.top;
      rect = this.q;
      rect.bottom += 0;
    } else {
      Rect rect = this.s;
      rect.top = i1 + rect.top;
      rect = this.s;
      rect.bottom += 0;
    } 
    a(this.d, this.q, true, true, true, true);
    if (!this.t.equals(this.s)) {
      this.t.set(this.s);
      this.d.a(this.s);
    } 
    measureChildWithMargins(this.d, paramInt1, 0, paramInt2, 0);
    b1 = (b)this.d.getLayoutParams();
    i1 = Math.max(i6, this.d.getMeasuredWidth() + b1.leftMargin + b1.rightMargin);
    i2 = this.d.getMeasuredHeight();
    int i3 = b1.topMargin;
    i2 = Math.max(i5, b1.bottomMargin + i2 + i3);
    i3 = r.a(i4, l.b(this.d));
    i4 = getPaddingLeft();
    i5 = getPaddingRight();
    i2 = Math.max(i2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
    setMeasuredDimension(l.a(Math.max(i1 + i4 + i5, getSuggestedMinimumWidth()), paramInt1, i3), l.a(i2, paramInt2, i3 << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!this.k || !paramBoolean)
      return false; 
    if (a(paramFloat1, paramFloat2)) {
      g();
      this.l = true;
      return true;
    } 
    f();
    this.l = true;
    return true;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) { return false; }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.m += paramInt2;
    setActionBarHideOffset(this.m);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.B.a(paramView1, paramView2, paramInt);
    this.m = getActionBarHideOffset();
    c();
    if (this.u != null)
      this.u.c(); 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) { return ((paramInt & 0x2) == 0 || this.e.getVisibility() != 0) ? false : this.k; }
  
  public void onStopNestedScroll(View paramView) {
    if (this.k && !this.l)
      if (this.m <= this.e.getHeight()) {
        d();
      } else {
        e();
      }  
    if (this.u != null)
      this.u.d(); 
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt) {
    boolean bool2;
    boolean bool1;
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt); 
    b();
    int i1 = this.n;
    this.n = paramInt;
    if ((paramInt & 0x4) == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((paramInt & 0x100) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (this.u != null) {
      a a1 = this.u;
      if (bool2)
        bool = false; 
      a1.a(bool);
      if (bool1 || !bool2) {
        this.u.a();
      } else {
        this.u.b();
      } 
    } 
    if (((i1 ^ paramInt) & 0x100) != 0 && this.u != null)
      l.g(this); 
  }
  
  protected void onWindowVisibilityChanged(int paramInt) {
    super.onWindowVisibilityChanged(paramInt);
    this.c = paramInt;
    if (this.u != null)
      this.u.a(paramInt); 
  }
  
  public void setActionBarHideOffset(int paramInt) {
    c();
    paramInt = Math.max(0, Math.min(paramInt, this.e.getHeight()));
    l.a(this.e, -paramInt);
  }
  
  public void setActionBarVisibilityCallback(a parama) {
    this.u = parama;
    if (getWindowToken() != null) {
      this.u.a(this.c);
      if (this.n != 0) {
        onWindowSystemUiVisibilityChanged(this.n);
        l.g(this);
      } 
    } 
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean) { this.j = paramBoolean; }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean) {
    if (paramBoolean != this.k) {
      this.k = paramBoolean;
      if (!paramBoolean) {
        c();
        setActionBarHideOffset(0);
      } 
    } 
  }
  
  public void setIcon(int paramInt) {
    b();
    this.f.a(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable) {
    b();
    this.f.a(paramDrawable);
  }
  
  public void setLogo(int paramInt) {
    b();
    this.f.b(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean) {
    this.i = paramBoolean;
    if (paramBoolean && (getContext().getApplicationInfo()).targetSdkVersion < 19) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.h = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback) {
    b();
    this.f.a(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    b();
    this.f.a(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState() { return false; }
  
  public static interface a {
    void a();
    
    void a(int param1Int);
    
    void a(boolean param1Boolean);
    
    void b();
    
    void c();
    
    void d();
  }
  
  public static class b extends ViewGroup.MarginLayoutParams {
    public b(int param1Int1, int param1Int2) { super(param1Int1, param1Int2); }
    
    public b(Context param1Context, AttributeSet param1AttributeSet) { super(param1Context, param1AttributeSet); }
    
    public b(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
}
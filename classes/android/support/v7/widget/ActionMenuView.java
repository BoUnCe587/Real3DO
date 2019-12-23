package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.widget.r;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends g implements e.b, k {
  private e a;
  
  private Context b;
  
  private int c;
  
  private boolean d;
  
  private a e;
  
  private j.a f;
  
  private e.a g;
  
  private boolean h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private e l;
  
  public ActionMenuView(Context paramContext) { this(paramContext, null); }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f1 = (paramContext.getResources().getDisplayMetrics()).density;
    this.j = (int)(56.0F * f1);
    this.k = (int)(f1 * 4.0F);
    this.b = paramContext;
    this.c = 0;
  }
  
  static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Object object;
    byte b2 = 0;
    c c1 = (c)paramView.getLayoutParams();
    int m = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    if (paramView instanceof ActionMenuItemView) {
      object = (ActionMenuItemView)paramView;
    } else {
      object = null;
    } 
    if (object != null && object.b()) {
      paramInt4 = 1;
    } else {
      paramInt4 = 0;
    } 
    if (paramInt2 > 0 && (paramInt4 == 0 || paramInt2 >= 2)) {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, -2147483648), m);
      int n = paramView.getMeasuredWidth();
      paramInt3 = n / paramInt1;
      paramInt2 = paramInt3;
      if (n % paramInt1 != 0)
        paramInt2 = paramInt3 + 1; 
      paramInt3 = paramInt2;
      if (paramInt4 != 0) {
        paramInt3 = paramInt2;
        if (paramInt2 < 2)
          paramInt3 = 2; 
      } 
    } else {
      paramInt3 = 0;
    } 
    byte b1 = b2;
    if (!c1.a) {
      b1 = b2;
      if (paramInt4 != 0)
        b1 = 1; 
    } 
    c1.d = b1;
    c1.b = paramInt3;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt3 * paramInt1, 1073741824), m);
    return paramInt3;
  }
  
  private void c(int paramInt1, int paramInt2) {
    int i8 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i7 = View.MeasureSpec.getSize(paramInt2);
    int m = getPaddingLeft();
    int n = getPaddingRight();
    int i6 = getPaddingTop() + getPaddingBottom();
    int i9 = getChildMeasureSpec(paramInt2, i6, -2);
    int i10 = paramInt1 - m + n;
    paramInt1 = i10 / this.j;
    paramInt2 = this.j;
    if (paramInt1 == 0) {
      setMeasuredDimension(i10, 0);
      return;
    } 
    int i11 = this.j + i10 % paramInt2 / paramInt1;
    m = 0;
    int i3 = 0;
    int i2 = 0;
    int i4 = 0;
    int i1 = 0;
    long l1 = 0L;
    int i12 = getChildCount();
    int i5 = 0;
    while (true) {
      if (i5 < i12) {
        View view = getChildAt(i5);
        if (view.getVisibility() == 8) {
          paramInt2 = i3;
          n = paramInt1;
          paramInt1 = i4;
        } else {
          boolean bool = view instanceof ActionMenuItemView;
          i4++;
          if (bool)
            view.setPadding(this.k, 0, this.k, 0); 
          c c1 = (c)view.getLayoutParams();
          c1.f = false;
          c1.c = 0;
          c1.b = 0;
          c1.d = false;
          c1.leftMargin = 0;
          c1.rightMargin = 0;
          if (bool && ((ActionMenuItemView)view).b()) {
            bool = true;
          } else {
            bool = false;
          } 
          c1.e = bool;
          if (c1.a) {
            paramInt2 = 1;
          } else {
            paramInt2 = paramInt1;
          } 
          int i14 = a(view, i11, paramInt2, i9, i6);
          i3 = Math.max(i3, i14);
          if (c1.d) {
            paramInt2 = i2 + true;
          } else {
            paramInt2 = i2;
          } 
          if (c1.a) {
            n = 1;
          } else {
            n = i1;
          } 
          int i13 = paramInt1 - i14;
          m = Math.max(m, view.getMeasuredHeight());
          if (i14 == 1) {
            long l2 = (1 << i5);
            i2 = paramInt2;
            l1 = l2 | l1;
            paramInt2 = i3;
            paramInt1 = i4;
            i1 = n;
            n = i13;
          } else {
            paramInt1 = i4;
            i1 = i3;
            i3 = i13;
            i2 = paramInt2;
            paramInt2 = i1;
            i1 = n;
            n = i3;
          } 
        } 
        i5++;
        i4 = paramInt1;
        paramInt1 = n;
        i3 = paramInt2;
        continue;
      } 
      if (i1 != 0 && i4 == 2) {
        boolean bool = true;
      } else {
        boolean bool = false;
      } 
      n = 0;
      i5 = paramInt1;
      while (true) {
        if (i2 > 0) {
          if (i5 > 0) {
            paramInt1 = Integer.MAX_VALUE;
            long l2 = 0L;
            paramInt2 = 0;
            for (i6 = 0;; i6 = i13) {
              i13 = i6 + 1;
              i6 = paramInt2;
              paramInt2 = paramInt1;
              paramInt1 = i6;
            } 
            break;
          } 
          continue;
        } 
        continue;
      } 
      break;
    } 
  }
  
  protected c a() {
    c c1 = new c(-2, -2);
    c1.h = 16;
    return c1;
  }
  
  public c a(AttributeSet paramAttributeSet) { return new c(getContext(), paramAttributeSet); }
  
  protected c a(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams != null) {
      c c1;
      if (paramLayoutParams instanceof c) {
        c1 = new c((c)paramLayoutParams);
      } else {
        c1 = new c(c1);
      } 
      if (c1.h <= 0)
        c1.h = 16; 
      return c1;
    } 
    return a();
  }
  
  public void a(e parame) { this.a = parame; }
  
  public void a(j.a parama, e.a parama1) {
    this.f = parama;
    this.g = parama1;
  }
  
  protected boolean a(int paramInt) {
    byte b1 = 0;
    if (paramInt == 0)
      return false; 
    View view1 = getChildAt(paramInt - 1);
    View view2 = getChildAt(paramInt);
    boolean bool = b1;
    if (paramInt < getChildCount()) {
      bool = b1;
      if (view1 instanceof a)
        bool = false | ((a)view1).d(); 
    } 
    return (paramInt > 0 && view2 instanceof a) ? (((a)view2).c() | bool) : bool;
  }
  
  public boolean a(f paramf) { return this.a.a(paramf, 0); }
  
  public c b() {
    c c1 = a();
    c1.a = true;
    return c1;
  }
  
  public e c() { return this.a; }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return (paramLayoutParams != null && paramLayoutParams instanceof c); }
  
  public boolean d() { return (this.e != null && this.e.d()); }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) { return false; }
  
  public boolean e() { return (this.e != null && this.e.h()); }
  
  public void f() {
    if (this.e != null)
      this.e.f(); 
  }
  
  public Menu getMenu() {
    if (this.a == null) {
      b b1 = getContext();
      this.a = new e(b1);
      this.a.a(new d(this, null));
      this.e = new a(b1);
      this.e.c(true);
      a a1 = this.e;
      if (this.f != null) {
        j.a a2 = this.f;
      } else {
        b1 = new b(this, null);
      } 
      a1.a(b1);
      this.a.a(this.e, this.b);
      this.e.a(this);
    } 
    return this.a;
  }
  
  public Drawable getOverflowIcon() {
    getMenu();
    return this.e.c();
  }
  
  public int getPopupTheme() { return this.c; }
  
  public int getWindowAnimations() { return 0; }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    if (this.e != null) {
      this.e.b(false);
      if (this.e.h()) {
        this.e.e();
        this.e.d();
      } 
    } 
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    f();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.h) {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    int i3 = getChildCount();
    int i2 = (paramInt4 - paramInt2) / 2;
    int i4 = getDividerWidth();
    paramInt4 = 0;
    paramInt2 = 0;
    int n = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    int m = 0;
    paramBoolean = r.a(this);
    for (int i1 = 0; i1 < i3; i1 = i6) {
      View view = getChildAt(i1);
      if (view.getVisibility() == 8) {
        int i7 = m;
        int i8 = n;
        n = paramInt4;
        m = paramInt2;
        paramInt4 = i8;
        paramInt2 = i7;
      } else {
        c c1 = (c)view.getLayoutParams();
        if (c1.a) {
          int i7 = view.getMeasuredWidth();
          m = i7;
          if (a(i1))
            m = i7 + i4; 
          int i9 = view.getMeasuredHeight();
          if (paramBoolean) {
            i7 = getPaddingLeft();
            i7 = c1.leftMargin + i7;
            i8 = i7 + m;
          } else {
            i8 = getWidth() - getPaddingRight() - c1.rightMargin;
            i7 = i8 - m;
          } 
          int i10 = i2 - i9 / 2;
          view.layout(i7, i10, i8, i9 + i10);
          i7 = n - m;
          int i8 = 1;
          m = paramInt2;
          n = paramInt4;
          paramInt2 = i8;
          paramInt4 = i7;
        } else {
          int i8 = view.getMeasuredWidth() + c1.leftMargin + c1.rightMargin;
          int i7 = paramInt4 + i8;
          paramInt4 = i7;
          if (a(i1))
            paramInt4 = i7 + i4; 
          i7 = n - i8;
          i8 = paramInt2 + 1;
          n = paramInt4;
          paramInt2 = m;
          paramInt4 = i7;
          m = i8;
        } 
      } 
      int i6 = i1 + 1;
      i1 = n;
      int i5 = m;
      m = paramInt2;
      n = paramInt4;
      paramInt2 = i5;
      paramInt4 = i1;
    } 
    if (i3 == 1 && m == 0) {
      View view = getChildAt(0);
      paramInt2 = view.getMeasuredWidth();
      paramInt4 = view.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1) / 2 - paramInt2 / 2;
      paramInt3 = i2 - paramInt4 / 2;
      view.layout(paramInt1, paramInt3, paramInt2 + paramInt1, paramInt4 + paramInt3);
      return;
    } 
    if (m != 0) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    } 
    paramInt1 = paramInt2 - paramInt1;
    if (paramInt1 > 0) {
      paramInt1 = n / paramInt1;
    } else {
      paramInt1 = 0;
    } 
    paramInt3 = Math.max(0, paramInt1);
    if (paramBoolean) {
      paramInt1 = getWidth() - getPaddingRight();
      paramInt2 = 0;
      while (true) {
        if (paramInt2 < i3) {
          View view = getChildAt(paramInt2);
          c c1 = (c)view.getLayoutParams();
          if (view.getVisibility() != 8 && !c1.a) {
            paramInt1 -= c1.rightMargin;
            paramInt4 = view.getMeasuredWidth();
            m = view.getMeasuredHeight();
            n = i2 - m / 2;
            view.layout(paramInt1 - paramInt4, n, paramInt1, m + n);
            paramInt1 -= c1.leftMargin + paramInt4 + paramInt3;
          } 
          paramInt2++;
          continue;
        } 
        return;
      } 
    } 
    paramInt1 = getPaddingLeft();
    paramInt2 = 0;
    while (true) {
      if (paramInt2 < i3) {
        View view = getChildAt(paramInt2);
        c c1 = (c)view.getLayoutParams();
        if (view.getVisibility() != 8 && !c1.a) {
          paramInt1 += c1.leftMargin;
          paramInt4 = view.getMeasuredWidth();
          m = view.getMeasuredHeight();
          n = i2 - m / 2;
          view.layout(paramInt1, n, paramInt1 + paramInt4, m + n);
          paramInt1 = c1.rightMargin + paramInt4 + paramInt3 + paramInt1;
        } 
        paramInt2++;
        continue;
      } 
      return;
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool;
    boolean bool1 = this.h;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool = true;
    } else {
      bool = false;
    } 
    this.h = bool;
    if (bool1 != this.h)
      this.i = 0; 
    int m = View.MeasureSpec.getSize(paramInt1);
    if (this.h && this.a != null && m != this.i) {
      this.i = m;
      this.a.b(true);
    } 
    int n = getChildCount();
    if (this.h && n > 0) {
      c(paramInt1, paramInt2);
      return;
    } 
    for (m = 0; m < n; m++) {
      c c1 = (c)getChildAt(m).getLayoutParams();
      c1.rightMargin = 0;
      c1.leftMargin = 0;
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean) { this.e.d(paramBoolean); }
  
  public void setOnMenuItemClickListener(e parame) { this.l = parame; }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    getMenu();
    this.e.a(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean) { this.d = paramBoolean; }
  
  public void setPopupTheme(int paramInt) {
    if (this.c != paramInt) {
      this.c = paramInt;
      if (paramInt == 0) {
        this.b = getContext();
        return;
      } 
    } else {
      return;
    } 
    this.b = new ContextThemeWrapper(getContext(), paramInt);
  }
  
  public void setPresenter(a parama) {
    this.e = parama;
    this.e.a(this);
  }
  
  public static interface a {
    boolean c();
    
    boolean d();
  }
  
  private class b implements j.a {
    private b(ActionMenuView this$0) {}
    
    public void a(e param1e, boolean param1Boolean) {}
    
    public boolean a(e param1e) { return false; }
  }
  
  public static class c extends g.a {
    @ExportedProperty
    public boolean a;
    
    @ExportedProperty
    public int b;
    
    @ExportedProperty
    public int c;
    
    @ExportedProperty
    public boolean d;
    
    @ExportedProperty
    public boolean e;
    
    boolean f;
    
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = false;
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) { super(param1Context, param1AttributeSet); }
    
    public c(c param1c) {
      super(param1c);
      this.a = param1c.a;
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
  
  private class d implements e.a {
    private d(ActionMenuView this$0) {}
    
    public void a(e param1e) {
      if (ActionMenuView.b(this.a) != null)
        ActionMenuView.b(this.a).a(param1e); 
    }
    
    public boolean a(e param1e, MenuItem param1MenuItem) { return (ActionMenuView.a(this.a) != null && ActionMenuView.a(this.a).a(param1MenuItem)); }
  }
  
  public static interface e {
    boolean a(MenuItem param1MenuItem);
  }
}
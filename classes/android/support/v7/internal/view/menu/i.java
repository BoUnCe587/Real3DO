package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.a;
import android.support.v7.widget.h;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;

public class i implements j, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
  static final int a = a.g.abc_popup_menu_item_layout;
  
  boolean b;
  
  private final Context c;
  
  private final LayoutInflater d;
  
  private final e e;
  
  private final a f;
  
  private final boolean g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  private View k;
  
  private h l;
  
  private ViewTreeObserver m;
  
  private j.a n;
  
  private ViewGroup o;
  
  private boolean p;
  
  private int q;
  
  private int r = 0;
  
  public i(Context paramContext, e parame, View paramView) { this(paramContext, parame, paramView, false, a.a.popupMenuStyle); }
  
  public i(Context paramContext, e parame, View paramView, boolean paramBoolean, int paramInt) { this(paramContext, parame, paramView, paramBoolean, paramInt, 0); }
  
  public i(Context paramContext, e parame, View paramView, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.c = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.e = parame;
    this.f = new a(this, this.e);
    this.g = paramBoolean;
    this.i = paramInt1;
    this.j = paramInt2;
    Resources resources = paramContext.getResources();
    this.h = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(a.c.abc_config_prefDialogWidth));
    this.k = paramView;
    parame.a(this, paramContext);
  }
  
  private int g() {
    a a1 = this.f;
    int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i5 = a1.getCount();
    byte b1 = 0;
    int i2 = 0;
    View view = null;
    int i1 = 0;
    while (true) {
      int i6 = i1;
      if (b1 < i5) {
        i6 = a1.getItemViewType(b1);
        if (i6 != i2) {
          i2 = i6;
          view = null;
        } 
        if (this.o == null)
          this.o = new FrameLayout(this.c); 
        view = a1.getView(b1, view, this.o);
        view.measure(i3, i4);
        i6 = view.getMeasuredWidth();
        if (i6 >= this.h)
          return this.h; 
      } else {
        return i6;
      } 
      if (i6 > i1)
        i1 = i6; 
      b1++;
    } 
  }
  
  public void a() {
    if (!d())
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor"); 
  }
  
  public void a(int paramInt) { this.r = paramInt; }
  
  public void a(Context paramContext, e parame) {}
  
  public void a(e parame, boolean paramBoolean) {
    if (parame == this.e) {
      e();
      if (this.n != null) {
        this.n.a(parame, paramBoolean);
        return;
      } 
    } 
  }
  
  public void a(j.a parama) { this.n = parama; }
  
  public void a(View paramView) { this.k = paramView; }
  
  public void a(boolean paramBoolean) { this.b = paramBoolean; }
  
  public boolean a(e parame, f paramf) { return false; }
  
  public boolean a(n paramn) { // Byte code:
    //   0: aload_1
    //   1: invokevirtual hasVisibleItems : ()Z
    //   4: ifeq -> 118
    //   7: new android/support/v7/internal/view/menu/i
    //   10: dup
    //   11: aload_0
    //   12: getfield c : Landroid/content/Context;
    //   15: aload_1
    //   16: aload_0
    //   17: getfield k : Landroid/view/View;
    //   20: invokespecial <init> : (Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;)V
    //   23: astore #5
    //   25: aload #5
    //   27: aload_0
    //   28: getfield n : Landroid/support/v7/internal/view/menu/j$a;
    //   31: invokevirtual a : (Landroid/support/v7/internal/view/menu/j$a;)V
    //   34: aload_1
    //   35: invokevirtual size : ()I
    //   38: istore_3
    //   39: iconst_0
    //   40: istore_2
    //   41: iload_2
    //   42: iload_3
    //   43: if_icmpge -> 120
    //   46: aload_1
    //   47: iload_2
    //   48: invokevirtual getItem : (I)Landroid/view/MenuItem;
    //   51: astore #6
    //   53: aload #6
    //   55: invokeinterface isVisible : ()Z
    //   60: ifeq -> 111
    //   63: aload #6
    //   65: invokeinterface getIcon : ()Landroid/graphics/drawable/Drawable;
    //   70: ifnull -> 111
    //   73: iconst_1
    //   74: istore #4
    //   76: aload #5
    //   78: iload #4
    //   80: invokevirtual a : (Z)V
    //   83: aload #5
    //   85: invokevirtual d : ()Z
    //   88: ifeq -> 118
    //   91: aload_0
    //   92: getfield n : Landroid/support/v7/internal/view/menu/j$a;
    //   95: ifnull -> 109
    //   98: aload_0
    //   99: getfield n : Landroid/support/v7/internal/view/menu/j$a;
    //   102: aload_1
    //   103: invokeinterface a : (Landroid/support/v7/internal/view/menu/e;)Z
    //   108: pop
    //   109: iconst_1
    //   110: ireturn
    //   111: iload_2
    //   112: iconst_1
    //   113: iadd
    //   114: istore_2
    //   115: goto -> 41
    //   118: iconst_0
    //   119: ireturn
    //   120: iconst_0
    //   121: istore #4
    //   123: goto -> 76 }
  
  public void b(boolean paramBoolean) {
    this.p = false;
    if (this.f != null)
      this.f.notifyDataSetChanged(); 
  }
  
  public boolean b() { return false; }
  
  public boolean b(e parame, f paramf) { return false; }
  
  public h c() { return this.l; }
  
  public boolean d() {
    boolean bool = false;
    this.l = new h(this.c, null, this.i, this.j);
    this.l.a(this);
    this.l.a(this);
    this.l.a(this.f);
    this.l.a(true);
    View view = this.k;
    if (view != null) {
      if (this.m == null)
        bool = true; 
      this.m = view.getViewTreeObserver();
      if (bool)
        this.m.addOnGlobalLayoutListener(this); 
      this.l.a(view);
      this.l.d(this.r);
      if (!this.p) {
        this.q = g();
        this.p = true;
      } 
      this.l.f(this.q);
      this.l.g(2);
      this.l.c();
      this.l.m().setOnKeyListener(this);
      return true;
    } 
    return false;
  }
  
  public void e() {
    if (f())
      this.l.i(); 
  }
  
  public boolean f() { return (this.l != null && this.l.k()); }
  
  public void onDismiss() {
    this.l = null;
    this.e.close();
    if (this.m != null) {
      if (!this.m.isAlive())
        this.m = this.k.getViewTreeObserver(); 
      this.m.removeGlobalOnLayoutListener(this);
      this.m = null;
    } 
  }
  
  public void onGlobalLayout() {
    if (f()) {
      View view = this.k;
      if (view == null || !view.isShown()) {
        e();
        return;
      } 
    } else {
      return;
    } 
    if (f()) {
      this.l.c();
      return;
    } 
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    a a1;
    (a1 = this.f).a(a1).a(a1.a(paramInt), 0);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      e();
      return true;
    } 
    return false;
  }
  
  private class a extends BaseAdapter {
    private e b;
    
    private int c = -1;
    
    public a(i this$0, e param1e) {
      this.b = param1e;
      a();
    }
    
    public f a(int param1Int) {
      ArrayList arrayList;
      if (i.a(this.a)) {
        arrayList = this.b.k();
      } else {
        arrayList = this.b.h();
      } 
      int j = param1Int;
      if (this.c >= 0) {
        j = param1Int;
        if (param1Int >= this.c)
          j = param1Int + 1; 
      } 
      return (f)arrayList.get(j);
    }
    
    void a() {
      f f = i.c(this.a).n();
      if (f != null) {
        ArrayList arrayList = i.c(this.a).k();
        int j = arrayList.size();
        for (byte b1 = 0; b1 < j; b1++) {
          if ((f)arrayList.get(b1) == f) {
            this.c = b1;
            return;
          } 
        } 
      } 
      this.c = -1;
    }
    
    public int getCount() {
      ArrayList arrayList;
      if (i.a(this.a)) {
        arrayList = this.b.k();
      } else {
        arrayList = this.b.h();
      } 
      return (this.c < 0) ? arrayList.size() : (arrayList.size() - 1);
    }
    
    public long getItemId(int param1Int) { return param1Int; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      if (param1View == null)
        param1View = i.b(this.a).inflate(i.a, param1ViewGroup, false); 
      k.a a1 = (k.a)param1View;
      if (this.a.b)
        ((ListMenuItemView)param1View).setForceShowIcon(true); 
      a1.a(a(param1Int), 0);
      return param1View;
    }
    
    public void notifyDataSetChanged() {
      a();
      super.notifyDataSetChanged();
    }
  }
}
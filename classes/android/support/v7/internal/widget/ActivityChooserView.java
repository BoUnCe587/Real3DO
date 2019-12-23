package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.h.a;
import android.support.v7.b.a;
import android.support.v7.widget.g;
import android.support.v7.widget.h;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class ActivityChooserView extends ViewGroup {
  a a;
  
  private final a b;
  
  private final b c;
  
  private final g d;
  
  private final FrameLayout e;
  
  private final ImageView f;
  
  private final FrameLayout g;
  
  private final int h;
  
  private final DataSetObserver i;
  
  private final ViewTreeObserver.OnGlobalLayoutListener j;
  
  private h k;
  
  private PopupWindow.OnDismissListener l;
  
  private boolean m;
  
  private int n;
  
  private boolean o;
  
  private int p;
  
  private void a(int paramInt) {
    boolean bool;
    int i1;
    if (this.b.d() == null)
      throw new IllegalStateException("No data model. Did you call #setDataModel?"); 
    getViewTreeObserver().addOnGlobalLayoutListener(this.j);
    if (this.g.getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    int i2 = this.b.c();
    if (bool) {
      i1 = 1;
    } else {
      i1 = 0;
    } 
    if (paramInt != Integer.MAX_VALUE && i2 > i1 + paramInt) {
      this.b.a(true);
      this.b.a(paramInt - 1);
    } else {
      this.b.a(false);
      this.b.a(paramInt);
    } 
    h h1 = getListPopupWindow();
    if (!h1.k()) {
      if (this.m || !bool) {
        this.b.a(true, bool);
      } else {
        this.b.a(false, false);
      } 
      h1.f(Math.min(this.b.a(), this.h));
      h1.c();
      if (this.a != null)
        this.a.a(true); 
      h1.m().setContentDescription(getContext().getString(a.h.abc_activitychooserview_choose_application));
    } 
  }
  
  private h getListPopupWindow() {
    if (this.k == null) {
      this.k = new h(getContext());
      this.k.a(this.b);
      this.k.a(this);
      this.k.a(true);
      this.k.a(this.c);
      this.k.a(this.c);
    } 
    return this.k;
  }
  
  public boolean a() {
    if (c() || !this.o)
      return false; 
    this.m = false;
    a(this.n);
    return true;
  }
  
  public boolean b() {
    if (c()) {
      getListPopupWindow().i();
      ViewTreeObserver viewTreeObserver = getViewTreeObserver();
      if (viewTreeObserver.isAlive())
        viewTreeObserver.removeGlobalOnLayoutListener(this.j); 
    } 
    return true;
  }
  
  public boolean c() { return getListPopupWindow().k(); }
  
  public d getDataModel() { return this.b.d(); }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    d d1 = this.b.d();
    if (d1 != null)
      d1.registerObserver(this.i); 
    this.o = true;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    d d1 = this.b.d();
    if (d1 != null)
      d1.unregisterObserver(this.i); 
    ViewTreeObserver viewTreeObserver = getViewTreeObserver();
    if (viewTreeObserver.isAlive())
      viewTreeObserver.removeGlobalOnLayoutListener(this.j); 
    if (c())
      b(); 
    this.o = false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.d.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!c())
      b(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    g g1 = this.d;
    int i1 = paramInt2;
    if (this.g.getVisibility() != 0)
      i1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824); 
    measureChild(g1, paramInt1, i1);
    setMeasuredDimension(g1.getMeasuredWidth(), g1.getMeasuredHeight());
  }
  
  public void setActivityChooserModel(d paramd) {
    this.b.a(paramd);
    if (c()) {
      b();
      a();
    } 
  }
  
  public void setDefaultActionButtonContentDescription(int paramInt) { this.p = paramInt; }
  
  public void setExpandActivityOverflowButtonContentDescription(int paramInt) {
    String str = getContext().getString(paramInt);
    this.f.setContentDescription(str);
  }
  
  public void setExpandActivityOverflowButtonDrawable(Drawable paramDrawable) { this.f.setImageDrawable(paramDrawable); }
  
  public void setInitialActivityCount(int paramInt) { this.n = paramInt; }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener) { this.l = paramOnDismissListener; }
  
  public void setProvider(a parama) { this.a = parama; }
  
  public static class InnerLayout extends g {
    private static final int[] a = { 16842964 };
    
    public InnerLayout(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      p p = p.a(param1Context, param1AttributeSet, a);
      setBackgroundDrawable(p.a(0));
      p.b();
    }
  }
  
  private class a extends BaseAdapter {
    private d b;
    
    private int c;
    
    private boolean d;
    
    private boolean e;
    
    private boolean f;
    
    public int a() {
      byte b1 = 0;
      int j = this.c;
      this.c = Integer.MAX_VALUE;
      int k = View.MeasureSpec.makeMeasureSpec(0, 0);
      int m = View.MeasureSpec.makeMeasureSpec(0, 0);
      int n = getCount();
      View view = null;
      int i = 0;
      while (b1 < n) {
        view = getView(b1, view, null);
        view.measure(k, m);
        i = Math.max(i, view.getMeasuredWidth());
        b1++;
      } 
      this.c = j;
      return i;
    }
    
    public void a(int param1Int) {
      if (this.c != param1Int) {
        this.c = param1Int;
        notifyDataSetChanged();
      } 
    }
    
    public void a(d param1d) {
      d d1 = ActivityChooserView.a(this.a).d();
      if (d1 != null && this.a.isShown())
        d1.unregisterObserver(ActivityChooserView.g(this.a)); 
      this.b = param1d;
      if (param1d != null && this.a.isShown())
        param1d.registerObserver(ActivityChooserView.g(this.a)); 
      notifyDataSetChanged();
    }
    
    public void a(boolean param1Boolean) {
      if (this.f != param1Boolean) {
        this.f = param1Boolean;
        notifyDataSetChanged();
      } 
    }
    
    public void a(boolean param1Boolean1, boolean param1Boolean2) {
      if (this.d != param1Boolean1 || this.e != param1Boolean2) {
        this.d = param1Boolean1;
        this.e = param1Boolean2;
        notifyDataSetChanged();
      } 
    }
    
    public ResolveInfo b() { return this.b.b(); }
    
    public int c() { return this.b.a(); }
    
    public d d() { return this.b; }
    
    public boolean e() { return this.d; }
    
    public int getCount() {
      int j = this.b.a();
      int i = j;
      if (!this.d) {
        i = j;
        if (this.b.b() != null)
          i = j - 1; 
      } 
      j = Math.min(i, this.c);
      i = j;
      if (this.f)
        i = j + 1; 
      return i;
    }
    
    public Object getItem(int param1Int) {
      switch (getItemViewType(param1Int)) {
        default:
          throw new IllegalArgumentException();
        case 1:
          return null;
        case 0:
          break;
      } 
      int i = param1Int;
      if (!this.d) {
        i = param1Int;
        if (this.b.b() != null)
          i = param1Int + 1; 
      } 
      return this.b.a(i);
    }
    
    public long getItemId(int param1Int) { return param1Int; }
    
    public int getItemViewType(int param1Int) { return (this.f && param1Int == getCount() - 1) ? 1 : 0; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) { // Byte code:
      //   0: aload_0
      //   1: iload_1
      //   2: invokevirtual getItemViewType : (I)I
      //   5: tableswitch default -> 28, 0 -> 107, 1 -> 36
      //   28: new java/lang/IllegalArgumentException
      //   31: dup
      //   32: invokespecial <init> : ()V
      //   35: athrow
      //   36: aload_2
      //   37: ifnull -> 51
      //   40: aload_2
      //   41: astore #4
      //   43: aload_2
      //   44: invokevirtual getId : ()I
      //   47: iconst_1
      //   48: if_icmpeq -> 104
      //   51: aload_0
      //   52: getfield a : Landroid/support/v7/internal/widget/ActivityChooserView;
      //   55: invokevirtual getContext : ()Landroid/content/Context;
      //   58: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
      //   61: getstatic android/support/v7/b/a$g.abc_activity_chooser_view_list_item : I
      //   64: aload_3
      //   65: iconst_0
      //   66: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
      //   69: astore #4
      //   71: aload #4
      //   73: iconst_1
      //   74: invokevirtual setId : (I)V
      //   77: aload #4
      //   79: getstatic android/support/v7/b/a$e.title : I
      //   82: invokevirtual findViewById : (I)Landroid/view/View;
      //   85: checkcast android/widget/TextView
      //   88: aload_0
      //   89: getfield a : Landroid/support/v7/internal/widget/ActivityChooserView;
      //   92: invokevirtual getContext : ()Landroid/content/Context;
      //   95: getstatic android/support/v7/b/a$h.abc_activity_chooser_view_see_all : I
      //   98: invokevirtual getString : (I)Ljava/lang/String;
      //   101: invokevirtual setText : (Ljava/lang/CharSequence;)V
      //   104: aload #4
      //   106: areturn
      //   107: aload_2
      //   108: ifnull -> 124
      //   111: aload_2
      //   112: astore #4
      //   114: aload_2
      //   115: invokevirtual getId : ()I
      //   118: getstatic android/support/v7/b/a$e.list_item : I
      //   121: if_icmpeq -> 144
      //   124: aload_0
      //   125: getfield a : Landroid/support/v7/internal/widget/ActivityChooserView;
      //   128: invokevirtual getContext : ()Landroid/content/Context;
      //   131: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
      //   134: getstatic android/support/v7/b/a$g.abc_activity_chooser_view_list_item : I
      //   137: aload_3
      //   138: iconst_0
      //   139: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
      //   142: astore #4
      //   144: aload_0
      //   145: getfield a : Landroid/support/v7/internal/widget/ActivityChooserView;
      //   148: invokevirtual getContext : ()Landroid/content/Context;
      //   151: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
      //   154: astore_2
      //   155: aload #4
      //   157: getstatic android/support/v7/b/a$e.icon : I
      //   160: invokevirtual findViewById : (I)Landroid/view/View;
      //   163: checkcast android/widget/ImageView
      //   166: astore_3
      //   167: aload_0
      //   168: iload_1
      //   169: invokevirtual getItem : (I)Ljava/lang/Object;
      //   172: checkcast android/content/pm/ResolveInfo
      //   175: astore #5
      //   177: aload_3
      //   178: aload #5
      //   180: aload_2
      //   181: invokevirtual loadIcon : (Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
      //   184: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
      //   187: aload #4
      //   189: getstatic android/support/v7/b/a$e.title : I
      //   192: invokevirtual findViewById : (I)Landroid/view/View;
      //   195: checkcast android/widget/TextView
      //   198: aload #5
      //   200: aload_2
      //   201: invokevirtual loadLabel : (Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
      //   204: invokevirtual setText : (Ljava/lang/CharSequence;)V
      //   207: aload_0
      //   208: getfield d : Z
      //   211: ifeq -> 234
      //   214: iload_1
      //   215: ifne -> 234
      //   218: aload_0
      //   219: getfield e : Z
      //   222: ifeq -> 234
      //   225: aload #4
      //   227: iconst_1
      //   228: invokestatic a : (Landroid/view/View;Z)V
      //   231: aload #4
      //   233: areturn
      //   234: aload #4
      //   236: iconst_0
      //   237: invokestatic a : (Landroid/view/View;Z)V
      //   240: aload #4
      //   242: areturn }
    
    public int getViewTypeCount() { return 3; }
  }
  
  private class b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
    private void a() {
      if (ActivityChooserView.f(this.a) != null)
        ActivityChooserView.f(this.a).onDismiss(); 
    }
    
    public void onClick(View param1View) {
      Intent intent;
      if (param1View == ActivityChooserView.c(this.a)) {
        this.a.b();
        ResolveInfo resolveInfo = ActivityChooserView.a(this.a).b();
        int i = ActivityChooserView.a(this.a).d().a(resolveInfo);
        intent = ActivityChooserView.a(this.a).d().b(i);
        if (intent != null) {
          intent.addFlags(524288);
          this.a.getContext().startActivity(intent);
        } 
        return;
      } 
      if (intent == ActivityChooserView.d(this.a)) {
        ActivityChooserView.a(this.a, false);
        ActivityChooserView.a(this.a, ActivityChooserView.e(this.a));
        return;
      } 
      throw new IllegalArgumentException();
    }
    
    public void onDismiss() {
      a();
      if (this.a.a != null)
        this.a.a.a(false); 
    }
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      switch (((ActivityChooserView.a)param1AdapterView.getAdapter()).getItemViewType(param1Int)) {
        default:
          throw new IllegalArgumentException();
        case 1:
          ActivityChooserView.a(this.a, 2147483647);
          return;
        case 0:
          break;
      } 
      this.a.b();
      if (ActivityChooserView.b(this.a)) {
        if (param1Int > 0) {
          ActivityChooserView.a(this.a).d().c(param1Int);
          return;
        } 
        return;
      } 
      if (!ActivityChooserView.a(this.a).e())
        param1Int++; 
      Intent intent = ActivityChooserView.a(this.a).d().b(param1Int);
      if (intent != null) {
        intent.addFlags(524288);
        this.a.getContext().startActivity(intent);
        return;
      } 
    }
    
    public boolean onLongClick(View param1View) {
      if (param1View == ActivityChooserView.c(this.a)) {
        if (ActivityChooserView.a(this.a).getCount() > 0) {
          ActivityChooserView.a(this.a, true);
          ActivityChooserView.a(this.a, ActivityChooserView.e(this.a));
        } 
        return true;
      } 
      throw new IllegalArgumentException();
    }
  }
}
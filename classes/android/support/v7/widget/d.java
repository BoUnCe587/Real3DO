package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.k;
import android.support.v4.h.l;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class d extends Spinner implements k {
  private static final boolean a;
  
  private static final boolean b;
  
  private static final int[] c;
  
  private o d;
  
  private c e;
  
  private Context f;
  
  private h.b g;
  
  private SpinnerAdapter h;
  
  private boolean i;
  
  private b j;
  
  private int k;
  
  private final Rect l;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
    if (Build.VERSION.SDK_INT >= 16) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
    c = new int[] { 16843505 };
  }
  
  public d(Context paramContext, AttributeSet paramAttributeSet, int paramInt) { this(paramContext, paramAttributeSet, paramInt, -1); }
  
  public d(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) { this(paramContext, paramAttributeSet, paramInt1, paramInt2, null); }
  
  public d(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, Resources.Theme paramTheme) { // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new android/graphics/Rect
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield l : Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic android/support/v7/b/a$j.Spinner : [I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/internal/widget/p;
    //   28: astore #9
    //   30: aload_0
    //   31: aload #9
    //   33: invokevirtual c : ()Landroid/support/v7/internal/widget/o;
    //   36: putfield d : Landroid/support/v7/internal/widget/o;
    //   39: aload_0
    //   40: new android/support/v7/widget/c
    //   43: dup
    //   44: aload_0
    //   45: aload_0
    //   46: getfield d : Landroid/support/v7/internal/widget/o;
    //   49: invokespecial <init> : (Landroid/view/View;Landroid/support/v7/internal/widget/o;)V
    //   52: putfield e : Landroid/support/v7/widget/c;
    //   55: aload #5
    //   57: ifnull -> 295
    //   60: aload_0
    //   61: new android/support/v7/internal/view/b
    //   64: dup
    //   65: aload_1
    //   66: aload #5
    //   68: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   71: putfield f : Landroid/content/Context;
    //   74: aload_0
    //   75: getfield f : Landroid/content/Context;
    //   78: ifnull -> 255
    //   81: iload #4
    //   83: istore #7
    //   85: iload #4
    //   87: iconst_m1
    //   88: if_icmpne -> 157
    //   91: getstatic android/os/Build$VERSION.SDK_INT : I
    //   94: bipush #11
    //   96: if_icmplt -> 404
    //   99: aload_1
    //   100: aload_2
    //   101: getstatic android/support/v7/widget/d.c : [I
    //   104: iload_3
    //   105: iconst_0
    //   106: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   109: astore #5
    //   111: iload #4
    //   113: istore #6
    //   115: aload #5
    //   117: astore_1
    //   118: aload #5
    //   120: iconst_0
    //   121: invokevirtual hasValue : (I)Z
    //   124: ifeq -> 139
    //   127: aload #5
    //   129: astore_1
    //   130: aload #5
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokevirtual getInt : (II)I
    //   137: istore #6
    //   139: iload #6
    //   141: istore #7
    //   143: aload #5
    //   145: ifnull -> 157
    //   148: aload #5
    //   150: invokevirtual recycle : ()V
    //   153: iload #6
    //   155: istore #7
    //   157: iload #7
    //   159: iconst_1
    //   160: if_icmpne -> 255
    //   163: new android/support/v7/widget/d$b
    //   166: dup
    //   167: aload_0
    //   168: aload_0
    //   169: getfield f : Landroid/content/Context;
    //   172: aload_2
    //   173: iload_3
    //   174: invokespecial <init> : (Landroid/support/v7/widget/d;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   177: astore_1
    //   178: aload_0
    //   179: getfield f : Landroid/content/Context;
    //   182: aload_2
    //   183: getstatic android/support/v7/b/a$j.Spinner : [I
    //   186: iload_3
    //   187: iconst_0
    //   188: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/internal/widget/p;
    //   191: astore #5
    //   193: aload_0
    //   194: aload #5
    //   196: getstatic android/support/v7/b/a$j.Spinner_android_dropDownWidth : I
    //   199: bipush #-2
    //   201: invokevirtual f : (II)I
    //   204: putfield k : I
    //   207: aload_1
    //   208: aload #5
    //   210: getstatic android/support/v7/b/a$j.Spinner_android_popupBackground : I
    //   213: invokevirtual a : (I)Landroid/graphics/drawable/Drawable;
    //   216: invokevirtual a : (Landroid/graphics/drawable/Drawable;)V
    //   219: aload_1
    //   220: aload #9
    //   222: getstatic android/support/v7/b/a$j.Spinner_android_prompt : I
    //   225: invokevirtual c : (I)Ljava/lang/String;
    //   228: invokevirtual a : (Ljava/lang/CharSequence;)V
    //   231: aload #5
    //   233: invokevirtual b : ()V
    //   236: aload_0
    //   237: aload_1
    //   238: putfield j : Landroid/support/v7/widget/d$b;
    //   241: aload_0
    //   242: new android/support/v7/widget/d$1
    //   245: dup
    //   246: aload_0
    //   247: aload_0
    //   248: aload_1
    //   249: invokespecial <init> : (Landroid/support/v7/widget/d;Landroid/view/View;Landroid/support/v7/widget/d$b;)V
    //   252: putfield g : Landroid/support/v7/widget/h$b;
    //   255: aload #9
    //   257: invokevirtual b : ()V
    //   260: aload_0
    //   261: iconst_1
    //   262: putfield i : Z
    //   265: aload_0
    //   266: getfield h : Landroid/widget/SpinnerAdapter;
    //   269: ifnull -> 285
    //   272: aload_0
    //   273: aload_0
    //   274: getfield h : Landroid/widget/SpinnerAdapter;
    //   277: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   280: aload_0
    //   281: aconst_null
    //   282: putfield h : Landroid/widget/SpinnerAdapter;
    //   285: aload_0
    //   286: getfield e : Landroid/support/v7/widget/c;
    //   289: aload_2
    //   290: iload_3
    //   291: invokevirtual a : (Landroid/util/AttributeSet;I)V
    //   294: return
    //   295: aload #9
    //   297: getstatic android/support/v7/b/a$j.Spinner_popupTheme : I
    //   300: iconst_0
    //   301: invokevirtual g : (II)I
    //   304: istore #6
    //   306: iload #6
    //   308: ifeq -> 328
    //   311: aload_0
    //   312: new android/support/v7/internal/view/b
    //   315: dup
    //   316: aload_1
    //   317: iload #6
    //   319: invokespecial <init> : (Landroid/content/Context;I)V
    //   322: putfield f : Landroid/content/Context;
    //   325: goto -> 74
    //   328: getstatic android/support/v7/widget/d.a : Z
    //   331: ifne -> 346
    //   334: aload_1
    //   335: astore #5
    //   337: aload_0
    //   338: aload #5
    //   340: putfield f : Landroid/content/Context;
    //   343: goto -> 74
    //   346: aconst_null
    //   347: astore #5
    //   349: goto -> 337
    //   352: astore #8
    //   354: aconst_null
    //   355: astore #5
    //   357: aload #5
    //   359: astore_1
    //   360: ldc 'AppCompatSpinner'
    //   362: ldc 'Could not read android:spinnerMode'
    //   364: aload #8
    //   366: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   369: pop
    //   370: iload #4
    //   372: istore #7
    //   374: aload #5
    //   376: ifnull -> 157
    //   379: aload #5
    //   381: invokevirtual recycle : ()V
    //   384: iload #4
    //   386: istore #7
    //   388: goto -> 157
    //   391: astore_2
    //   392: aconst_null
    //   393: astore_1
    //   394: aload_1
    //   395: ifnull -> 402
    //   398: aload_1
    //   399: invokevirtual recycle : ()V
    //   402: aload_2
    //   403: athrow
    //   404: iconst_1
    //   405: istore #7
    //   407: goto -> 157
    //   410: astore_2
    //   411: goto -> 394
    //   414: astore #8
    //   416: goto -> 357
    // Exception table:
    //   from	to	target	type
    //   99	111	352	java/lang/Exception
    //   99	111	391	finally
    //   118	127	414	java/lang/Exception
    //   118	127	410	finally
    //   130	139	414	java/lang/Exception
    //   130	139	410	finally
    //   360	370	410	finally }
  
  private int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable) {
    if (paramSpinnerAdapter == null)
      return 0; 
    int i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int m = Math.max(0, getSelectedItemPosition());
    int i4 = Math.min(paramSpinnerAdapter.getCount(), m + 15);
    int n = Math.max(0, m - 15 - i4 - m);
    View view = null;
    int i1 = 0;
    m = 0;
    while (n < i4) {
      int i5 = paramSpinnerAdapter.getItemViewType(n);
      if (i5 != m) {
        view = null;
        m = i5;
      } 
      view = paramSpinnerAdapter.getView(n, view, this);
      if (view.getLayoutParams() == null)
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2)); 
      view.measure(i2, i3);
      i1 = Math.max(i1, view.getMeasuredWidth());
      n++;
    } 
    if (paramDrawable != null) {
      paramDrawable.getPadding(this.l);
      return this.l.left + this.l.right + i1;
    } 
    return i1;
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.e != null)
      this.e.c(); 
  }
  
  public int getDropDownHorizontalOffset() { return (this.j != null) ? this.j.f() : (b ? super.getDropDownHorizontalOffset() : 0); }
  
  public int getDropDownVerticalOffset() { return (this.j != null) ? this.j.g() : (b ? super.getDropDownVerticalOffset() : 0); }
  
  public int getDropDownWidth() { return (this.j != null) ? this.k : (b ? super.getDropDownWidth() : 0); }
  
  public Drawable getPopupBackground() { return (this.j != null) ? this.j.d() : (b ? super.getPopupBackground() : null); }
  
  public Context getPopupContext() { return (this.j != null) ? this.f : (a ? super.getPopupContext() : null); }
  
  public CharSequence getPrompt() { return (this.j != null) ? this.j.a() : super.getPrompt(); }
  
  public ColorStateList getSupportBackgroundTintList() { return (this.e != null) ? this.e.a() : null; }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() { return (this.e != null) ? this.e.b() : null; }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.j != null && this.j.k())
      this.j.i(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.j != null && View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight()); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) { return (this.g != null && this.g.onTouch(this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent); }
  
  public boolean performClick() {
    if (this.j != null && !this.j.k()) {
      this.j.c();
      return true;
    } 
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter) {
    if (!this.i) {
      this.h = paramSpinnerAdapter;
      return;
    } 
    super.setAdapter(paramSpinnerAdapter);
    if (this.j != null) {
      Context context;
      if (this.f == null) {
        context = getContext();
      } else {
        context = this.f;
      } 
      this.j.a(new a(paramSpinnerAdapter, context.getTheme()));
      return;
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    if (this.e != null)
      this.e.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    if (this.e != null)
      this.e.a(paramInt); 
  }
  
  public void setDropDownHorizontalOffset(int paramInt) {
    if (this.j != null) {
      this.j.b(paramInt);
      return;
    } 
    if (b) {
      super.setDropDownHorizontalOffset(paramInt);
      return;
    } 
  }
  
  public void setDropDownVerticalOffset(int paramInt) {
    if (this.j != null) {
      this.j.c(paramInt);
      return;
    } 
    if (b) {
      super.setDropDownVerticalOffset(paramInt);
      return;
    } 
  }
  
  public void setDropDownWidth(int paramInt) {
    if (this.j != null) {
      this.k = paramInt;
      return;
    } 
    if (b) {
      super.setDropDownWidth(paramInt);
      return;
    } 
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable) {
    if (this.j != null) {
      this.j.a(paramDrawable);
      return;
    } 
    if (b) {
      super.setPopupBackgroundDrawable(paramDrawable);
      return;
    } 
  }
  
  public void setPopupBackgroundResource(int paramInt) { setPopupBackgroundDrawable(getPopupContext().getDrawable(paramInt)); }
  
  public void setPrompt(CharSequence paramCharSequence) {
    if (this.j != null) {
      this.j.a(paramCharSequence);
      return;
    } 
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.e != null)
      this.e.a(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.e != null)
      this.e.a(paramMode); 
  }
  
  private static class a implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter a;
    
    private ListAdapter b;
    
    public a(SpinnerAdapter param1SpinnerAdapter, Resources.Theme param1Theme) {
      this.a = param1SpinnerAdapter;
      if (param1SpinnerAdapter instanceof ListAdapter)
        this.b = (ListAdapter)param1SpinnerAdapter; 
      if (param1Theme != null) {
        if (d.a() && param1SpinnerAdapter instanceof ThemedSpinnerAdapter) {
          themedSpinnerAdapter = (ThemedSpinnerAdapter)param1SpinnerAdapter;
          if (themedSpinnerAdapter.getDropDownViewTheme() != param1Theme)
            themedSpinnerAdapter.setDropDownViewTheme(param1Theme); 
          return;
        } 
      } else {
        return;
      } 
      if (themedSpinnerAdapter instanceof j) {
        j j = (j)themedSpinnerAdapter;
        if (j.a() == null) {
          j.a(param1Theme);
          return;
        } 
      } 
    }
    
    public boolean areAllItemsEnabled() {
      ListAdapter listAdapter = this.b;
      return (listAdapter != null) ? listAdapter.areAllItemsEnabled() : 1;
    }
    
    public int getCount() { return (this.a == null) ? 0 : this.a.getCount(); }
    
    public View getDropDownView(int param1Int, View param1View, ViewGroup param1ViewGroup) { return (this.a == null) ? null : this.a.getDropDownView(param1Int, param1View, param1ViewGroup); }
    
    public Object getItem(int param1Int) { return (this.a == null) ? null : this.a.getItem(param1Int); }
    
    public long getItemId(int param1Int) { return (this.a == null) ? -1L : this.a.getItemId(param1Int); }
    
    public int getItemViewType(int param1Int) { return 0; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) { return getDropDownView(param1Int, param1View, param1ViewGroup); }
    
    public int getViewTypeCount() { return 1; }
    
    public boolean hasStableIds() { return (this.a != null && this.a.hasStableIds()); }
    
    public boolean isEmpty() { return (getCount() == 0); }
    
    public boolean isEnabled(int param1Int) {
      ListAdapter listAdapter = this.b;
      return (listAdapter != null) ? listAdapter.isEnabled(param1Int) : 1;
    }
    
    public void registerDataSetObserver(DataSetObserver param1DataSetObserver) {
      if (this.a != null)
        this.a.registerDataSetObserver(param1DataSetObserver); 
    }
    
    public void unregisterDataSetObserver(DataSetObserver param1DataSetObserver) {
      if (this.a != null)
        this.a.unregisterDataSetObserver(param1DataSetObserver); 
    }
  }
  
  private class b extends h {
    private CharSequence c;
    
    private ListAdapter d;
    
    private final Rect e = new Rect();
    
    public b(d this$0, Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int);
      a(this$0);
      a(true);
      a(0);
      a(new AdapterView.OnItemClickListener(this, this$0) {
            public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
              this.b.a.setSelection(param2Int);
              if (this.b.a.getOnItemClickListener() != null)
                this.b.a.performItemClick(param2View, param2Int, d.b.a(this.b).getItemId(param2Int)); 
              this.b.i();
            }
          });
    }
    
    private boolean b(View param1View) { return (l.i(param1View) && param1View.getGlobalVisibleRect(this.e)); }
    
    public CharSequence a() { return this.c; }
    
    public void a(ListAdapter param1ListAdapter) {
      super.a(param1ListAdapter);
      this.d = param1ListAdapter;
    }
    
    public void a(CharSequence param1CharSequence) { this.c = param1CharSequence; }
    
    void b() {
      int i;
      Drawable drawable = d();
      if (drawable != null) {
        drawable.getPadding(d.b(this.a));
        if (r.a(this.a)) {
          i = (d.b(this.a)).right;
        } else {
          i = -(d.b(this.a)).left;
        } 
      } else {
        Rect rect = d.b(this.a);
        (d.b(this.a)).right = 0;
        rect.left = 0;
        i = 0;
      } 
      int j = this.a.getPaddingLeft();
      int k = this.a.getPaddingRight();
      int m = this.a.getWidth();
      if (d.c(this.a) == -2) {
        int n = d.a(this.a, (SpinnerAdapter)this.d, d());
        int i1 = (this.a.getContext().getResources().getDisplayMetrics()).widthPixels - (d.b(this.a)).left - (d.b(this.a)).right;
        if (n > i1)
          n = i1; 
        f(Math.max(n, m - j - k));
      } else if (d.c(this.a) == -1) {
        f(m - j - k);
      } else {
        f(d.c(this.a));
      } 
      if (r.a(this.a)) {
        i = m - k - h() + i;
      } else {
        i += j;
      } 
      b(i);
    }
    
    public void c() {
      boolean bool = k();
      b();
      g(2);
      super.c();
      m().setChoiceMode(1);
      h(this.a.getSelectedItemPosition());
      if (!bool) {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
          ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this) {
              public void onGlobalLayout() {
                if (!d.b.a(this.a, this.a.a)) {
                  this.a.i();
                  return;
                } 
                this.a.b();
                d.b.b(this.a);
              }
            };
          viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
          a(new PopupWindow.OnDismissListener(this, onGlobalLayoutListener) {
                public void onDismiss() {
                  ViewTreeObserver viewTreeObserver = this.b.a.getViewTreeObserver();
                  if (viewTreeObserver != null)
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a); 
                }
              });
          return;
        } 
      } 
    }
  }
  
  class null implements AdapterView.OnItemClickListener {
    null(d this$0, d param1d) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.a.setSelection(param1Int);
      if (this.b.a.getOnItemClickListener() != null)
        this.b.a.performItemClick(param1View, param1Int, d.b.a(this.b).getItemId(param1Int)); 
      this.b.i();
    }
  }
  
  class null implements ViewTreeObserver.OnGlobalLayoutListener {
    null(d this$0) {}
    
    public void onGlobalLayout() {
      if (!d.b.a(this.a, this.a.a)) {
        this.a.i();
        return;
      } 
      this.a.b();
      d.b.b(this.a);
    }
  }
  
  class null implements PopupWindow.OnDismissListener {
    null(d this$0, ViewTreeObserver.OnGlobalLayoutListener param1OnGlobalLayoutListener) {}
    
    public void onDismiss() {
      ViewTreeObserver viewTreeObserver = this.b.a.getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.removeGlobalOnLayoutListener(this.a); 
    }
  }
}
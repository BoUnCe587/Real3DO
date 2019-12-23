package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.f.d;
import android.support.v4.h.i;
import android.support.v4.h.u;
import android.support.v4.widget.d;
import android.support.v4.widget.e;
import android.support.v7.b.a;
import android.support.v7.internal.widget.e;
import android.support.v7.internal.widget.h;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class h {
  private static Method a;
  
  private Handler A = new Handler();
  
  private Rect B = new Rect();
  
  private boolean C;
  
  private int D;
  
  int b = Integer.MAX_VALUE;
  
  private Context c;
  
  private PopupWindow d;
  
  private ListAdapter e;
  
  private a f;
  
  private int g = -2;
  
  private int h = -2;
  
  private int i;
  
  private int j;
  
  private boolean k;
  
  private int l = 0;
  
  private boolean m = false;
  
  private boolean n = false;
  
  private View o;
  
  private int p = 0;
  
  private DataSetObserver q;
  
  private View r;
  
  private Drawable s;
  
  private AdapterView.OnItemClickListener t;
  
  private AdapterView.OnItemSelectedListener u;
  
  private final g v = new g(this, null);
  
  private final f w = new f(this, null);
  
  private final e x = new e(this, null);
  
  private final c y = new c(this, null);
  
  private Runnable z;
  
  static  {
    try {
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { boolean.class });
      return;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      return;
    } 
  }
  
  public h(Context paramContext) { this(paramContext, null, a.a.listPopupWindowStyle); }
  
  public h(Context paramContext, AttributeSet paramAttributeSet, int paramInt) { this(paramContext, paramAttributeSet, paramInt, 0); }
  
  public h(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.c = paramContext;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ListPopupWindow, paramInt1, paramInt2);
    this.i = typedArray.getDimensionPixelOffset(a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.j = typedArray.getDimensionPixelOffset(a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.j != 0)
      this.k = true; 
    typedArray.recycle();
    this.d = new e(paramContext, paramAttributeSet, paramInt1);
    this.d.setInputMethodMode(1);
    this.D = d.a((this.c.getResources().getConfiguration()).locale);
  }
  
  private void a() {
    if (this.o != null) {
      ViewParent viewParent = this.o.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(this.o); 
    } 
  }
  
  private int b() { // Byte code:
    //   0: aload_0
    //   1: getfield f : Landroid/support/v7/widget/h$a;
    //   4: ifnonnull -> 465
    //   7: aload_0
    //   8: getfield c : Landroid/content/Context;
    //   11: astore #7
    //   13: aload_0
    //   14: new android/support/v7/widget/h$2
    //   17: dup
    //   18: aload_0
    //   19: invokespecial <init> : (Landroid/support/v7/widget/h;)V
    //   22: putfield z : Ljava/lang/Runnable;
    //   25: aload_0
    //   26: getfield C : Z
    //   29: ifne -> 421
    //   32: iconst_1
    //   33: istore #5
    //   35: aload_0
    //   36: new android/support/v7/widget/h$a
    //   39: dup
    //   40: aload #7
    //   42: iload #5
    //   44: invokespecial <init> : (Landroid/content/Context;Z)V
    //   47: putfield f : Landroid/support/v7/widget/h$a;
    //   50: aload_0
    //   51: getfield s : Landroid/graphics/drawable/Drawable;
    //   54: ifnull -> 68
    //   57: aload_0
    //   58: getfield f : Landroid/support/v7/widget/h$a;
    //   61: aload_0
    //   62: getfield s : Landroid/graphics/drawable/Drawable;
    //   65: invokevirtual setSelector : (Landroid/graphics/drawable/Drawable;)V
    //   68: aload_0
    //   69: getfield f : Landroid/support/v7/widget/h$a;
    //   72: aload_0
    //   73: getfield e : Landroid/widget/ListAdapter;
    //   76: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   79: aload_0
    //   80: getfield f : Landroid/support/v7/widget/h$a;
    //   83: aload_0
    //   84: getfield t : Landroid/widget/AdapterView$OnItemClickListener;
    //   87: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
    //   90: aload_0
    //   91: getfield f : Landroid/support/v7/widget/h$a;
    //   94: iconst_1
    //   95: invokevirtual setFocusable : (Z)V
    //   98: aload_0
    //   99: getfield f : Landroid/support/v7/widget/h$a;
    //   102: iconst_1
    //   103: invokevirtual setFocusableInTouchMode : (Z)V
    //   106: aload_0
    //   107: getfield f : Landroid/support/v7/widget/h$a;
    //   110: new android/support/v7/widget/h$3
    //   113: dup
    //   114: aload_0
    //   115: invokespecial <init> : (Landroid/support/v7/widget/h;)V
    //   118: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   121: aload_0
    //   122: getfield f : Landroid/support/v7/widget/h$a;
    //   125: aload_0
    //   126: getfield x : Landroid/support/v7/widget/h$e;
    //   129: invokevirtual setOnScrollListener : (Landroid/widget/AbsListView$OnScrollListener;)V
    //   132: aload_0
    //   133: getfield u : Landroid/widget/AdapterView$OnItemSelectedListener;
    //   136: ifnull -> 150
    //   139: aload_0
    //   140: getfield f : Landroid/support/v7/widget/h$a;
    //   143: aload_0
    //   144: getfield u : Landroid/widget/AdapterView$OnItemSelectedListener;
    //   147: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   150: aload_0
    //   151: getfield f : Landroid/support/v7/widget/h$a;
    //   154: astore #6
    //   156: aload_0
    //   157: getfield o : Landroid/view/View;
    //   160: astore #8
    //   162: aload #8
    //   164: ifnull -> 690
    //   167: new android/widget/LinearLayout
    //   170: dup
    //   171: aload #7
    //   173: invokespecial <init> : (Landroid/content/Context;)V
    //   176: astore #7
    //   178: aload #7
    //   180: iconst_1
    //   181: invokevirtual setOrientation : (I)V
    //   184: new android/widget/LinearLayout$LayoutParams
    //   187: dup
    //   188: iconst_m1
    //   189: iconst_0
    //   190: fconst_1
    //   191: invokespecial <init> : (IIF)V
    //   194: astore #9
    //   196: aload_0
    //   197: getfield p : I
    //   200: tableswitch default -> 224, 0 -> 446, 1 -> 427
    //   224: ldc 'ListPopupWindow'
    //   226: new java/lang/StringBuilder
    //   229: dup
    //   230: invokespecial <init> : ()V
    //   233: ldc_w 'Invalid hint position '
    //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: aload_0
    //   240: getfield p : I
    //   243: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   246: invokevirtual toString : ()Ljava/lang/String;
    //   249: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   252: pop
    //   253: aload #8
    //   255: aload_0
    //   256: getfield h : I
    //   259: ldc_w -2147483648
    //   262: invokestatic makeMeasureSpec : (II)I
    //   265: iconst_0
    //   266: invokevirtual measure : (II)V
    //   269: aload #8
    //   271: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   274: checkcast android/widget/LinearLayout$LayoutParams
    //   277: astore #6
    //   279: aload #8
    //   281: invokevirtual getMeasuredHeight : ()I
    //   284: istore_1
    //   285: aload #6
    //   287: getfield topMargin : I
    //   290: istore_2
    //   291: aload #6
    //   293: getfield bottomMargin : I
    //   296: iload_1
    //   297: iload_2
    //   298: iadd
    //   299: iadd
    //   300: istore_1
    //   301: aload #7
    //   303: astore #6
    //   305: aload_0
    //   306: getfield d : Landroid/widget/PopupWindow;
    //   309: aload #6
    //   311: invokevirtual setContentView : (Landroid/view/View;)V
    //   314: aload_0
    //   315: getfield d : Landroid/widget/PopupWindow;
    //   318: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   321: astore #6
    //   323: aload #6
    //   325: ifnull -> 523
    //   328: aload #6
    //   330: aload_0
    //   331: getfield B : Landroid/graphics/Rect;
    //   334: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   337: pop
    //   338: aload_0
    //   339: getfield B : Landroid/graphics/Rect;
    //   342: getfield top : I
    //   345: aload_0
    //   346: getfield B : Landroid/graphics/Rect;
    //   349: getfield bottom : I
    //   352: iadd
    //   353: istore_2
    //   354: aload_0
    //   355: getfield k : Z
    //   358: ifne -> 682
    //   361: aload_0
    //   362: aload_0
    //   363: getfield B : Landroid/graphics/Rect;
    //   366: getfield top : I
    //   369: ineg
    //   370: putfield j : I
    //   373: aload_0
    //   374: getfield d : Landroid/widget/PopupWindow;
    //   377: invokevirtual getInputMethodMode : ()I
    //   380: iconst_2
    //   381: if_icmpne -> 384
    //   384: aload_0
    //   385: getfield d : Landroid/widget/PopupWindow;
    //   388: aload_0
    //   389: invokevirtual e : ()Landroid/view/View;
    //   392: aload_0
    //   393: getfield j : I
    //   396: invokevirtual getMaxAvailableHeight : (Landroid/view/View;I)I
    //   399: istore #4
    //   401: aload_0
    //   402: getfield m : Z
    //   405: ifne -> 416
    //   408: aload_0
    //   409: getfield g : I
    //   412: iconst_m1
    //   413: if_icmpne -> 535
    //   416: iload #4
    //   418: iload_2
    //   419: iadd
    //   420: ireturn
    //   421: iconst_0
    //   422: istore #5
    //   424: goto -> 35
    //   427: aload #7
    //   429: aload #6
    //   431: aload #9
    //   433: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   436: aload #7
    //   438: aload #8
    //   440: invokevirtual addView : (Landroid/view/View;)V
    //   443: goto -> 253
    //   446: aload #7
    //   448: aload #8
    //   450: invokevirtual addView : (Landroid/view/View;)V
    //   453: aload #7
    //   455: aload #6
    //   457: aload #9
    //   459: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   462: goto -> 253
    //   465: aload_0
    //   466: getfield d : Landroid/widget/PopupWindow;
    //   469: invokevirtual getContentView : ()Landroid/view/View;
    //   472: checkcast android/view/ViewGroup
    //   475: astore #6
    //   477: aload_0
    //   478: getfield o : Landroid/view/View;
    //   481: astore #6
    //   483: aload #6
    //   485: ifnull -> 685
    //   488: aload #6
    //   490: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   493: checkcast android/widget/LinearLayout$LayoutParams
    //   496: astore #7
    //   498: aload #6
    //   500: invokevirtual getMeasuredHeight : ()I
    //   503: istore_1
    //   504: aload #7
    //   506: getfield topMargin : I
    //   509: istore_2
    //   510: aload #7
    //   512: getfield bottomMargin : I
    //   515: iload_1
    //   516: iload_2
    //   517: iadd
    //   518: iadd
    //   519: istore_1
    //   520: goto -> 314
    //   523: aload_0
    //   524: getfield B : Landroid/graphics/Rect;
    //   527: invokevirtual setEmpty : ()V
    //   530: iconst_0
    //   531: istore_2
    //   532: goto -> 373
    //   535: aload_0
    //   536: getfield h : I
    //   539: tableswitch default -> 560, -2 -> 604, -1 -> 643
    //   560: aload_0
    //   561: getfield h : I
    //   564: ldc_w 1073741824
    //   567: invokestatic makeMeasureSpec : (II)I
    //   570: istore_3
    //   571: aload_0
    //   572: getfield f : Landroid/support/v7/widget/h$a;
    //   575: iload_3
    //   576: iconst_0
    //   577: iconst_m1
    //   578: iload #4
    //   580: iload_1
    //   581: isub
    //   582: iconst_m1
    //   583: invokevirtual a : (IIIII)I
    //   586: istore #4
    //   588: iload_1
    //   589: istore_3
    //   590: iload #4
    //   592: ifle -> 599
    //   595: iload_1
    //   596: iload_2
    //   597: iadd
    //   598: istore_3
    //   599: iload #4
    //   601: iload_3
    //   602: iadd
    //   603: ireturn
    //   604: aload_0
    //   605: getfield c : Landroid/content/Context;
    //   608: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   611: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   614: getfield widthPixels : I
    //   617: aload_0
    //   618: getfield B : Landroid/graphics/Rect;
    //   621: getfield left : I
    //   624: aload_0
    //   625: getfield B : Landroid/graphics/Rect;
    //   628: getfield right : I
    //   631: iadd
    //   632: isub
    //   633: ldc_w -2147483648
    //   636: invokestatic makeMeasureSpec : (II)I
    //   639: istore_3
    //   640: goto -> 571
    //   643: aload_0
    //   644: getfield c : Landroid/content/Context;
    //   647: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   650: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   653: getfield widthPixels : I
    //   656: aload_0
    //   657: getfield B : Landroid/graphics/Rect;
    //   660: getfield left : I
    //   663: aload_0
    //   664: getfield B : Landroid/graphics/Rect;
    //   667: getfield right : I
    //   670: iadd
    //   671: isub
    //   672: ldc_w 1073741824
    //   675: invokestatic makeMeasureSpec : (II)I
    //   678: istore_3
    //   679: goto -> 571
    //   682: goto -> 373
    //   685: iconst_0
    //   686: istore_1
    //   687: goto -> 314
    //   690: iconst_0
    //   691: istore_1
    //   692: goto -> 305 }
  
  private void b(boolean paramBoolean) {
    if (a != null)
      try {
        a.invoke(this.d, new Object[] { Boolean.valueOf(paramBoolean) });
        return;
      } catch (Exception exception) {
        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        return;
      }  
  }
  
  public void a(int paramInt) { this.p = paramInt; }
  
  public void a(Drawable paramDrawable) { this.d.setBackgroundDrawable(paramDrawable); }
  
  public void a(View paramView) { this.r = paramView; }
  
  public void a(AdapterView.OnItemClickListener paramOnItemClickListener) { this.t = paramOnItemClickListener; }
  
  public void a(ListAdapter paramListAdapter) {
    if (this.q == null) {
      this.q = new d(this, null);
    } else if (this.e != null) {
      this.e.unregisterDataSetObserver(this.q);
    } 
    this.e = paramListAdapter;
    if (this.e != null)
      paramListAdapter.registerDataSetObserver(this.q); 
    if (this.f != null)
      this.f.setAdapter(this.e); 
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener) { this.d.setOnDismissListener(paramOnDismissListener); }
  
  public void a(boolean paramBoolean) {
    this.C = paramBoolean;
    this.d.setFocusable(paramBoolean);
  }
  
  public void b(int paramInt) { this.i = paramInt; }
  
  public void c() {
    byte b1;
    boolean bool1 = true;
    byte b3 = 0;
    byte b2 = -1;
    int i1 = b();
    boolean bool2 = l();
    if (this.d.isShowing()) {
      if (this.h == -1) {
        b1 = -1;
      } else if (this.h == -2) {
        b1 = e().getWidth();
      } else {
        b1 = this.h;
      } 
      if (this.g == -1) {
        if (!bool2)
          i1 = -1; 
        if (bool2) {
          PopupWindow popupWindow2 = this.d;
          if (this.h != -1)
            b2 = 0; 
          popupWindow2.setWindowLayoutMode(b2, 0);
        } else {
          PopupWindow popupWindow2 = this.d;
          if (this.h == -1) {
            b2 = -1;
          } else {
            b2 = 0;
          } 
          popupWindow2.setWindowLayoutMode(b2, -1);
        } 
      } else if (this.g != -2) {
        i1 = this.g;
      } 
      PopupWindow popupWindow1 = this.d;
      bool1 = b3;
      if (!this.n) {
        bool1 = b3;
        if (!this.m)
          bool1 = true; 
      } 
      popupWindow1.setOutsideTouchable(bool1);
      this.d.update(e(), this.i, this.j, b1, i1);
      return;
    } 
    if (this.h == -1) {
      b1 = -1;
    } else if (this.h == -2) {
      this.d.setWidth(e().getWidth());
      b1 = 0;
    } else {
      this.d.setWidth(this.h);
      b1 = 0;
    } 
    if (this.g == -1) {
      i1 = -1;
    } else if (this.g == -2) {
      this.d.setHeight(i1);
      i1 = 0;
    } else {
      this.d.setHeight(this.g);
      i1 = 0;
    } 
    this.d.setWindowLayoutMode(b1, i1);
    b(true);
    PopupWindow popupWindow = this.d;
    if (this.n || this.m)
      bool1 = false; 
    popupWindow.setOutsideTouchable(bool1);
    this.d.setTouchInterceptor(this.w);
    e.a(this.d, e(), this.i, this.j, this.l);
    this.f.setSelection(-1);
    if (!this.C || this.f.isInTouchMode())
      j(); 
    if (!this.C) {
      this.A.post(this.y);
      return;
    } 
  }
  
  public void c(int paramInt) {
    this.j = paramInt;
    this.k = true;
  }
  
  public Drawable d() { return this.d.getBackground(); }
  
  public void d(int paramInt) { this.l = paramInt; }
  
  public View e() { return this.r; }
  
  public void e(int paramInt) { this.h = paramInt; }
  
  public int f() { return this.i; }
  
  public void f(int paramInt) {
    Drawable drawable = this.d.getBackground();
    if (drawable != null) {
      drawable.getPadding(this.B);
      this.h = this.B.left + this.B.right + paramInt;
      return;
    } 
    e(paramInt);
  }
  
  public int g() { return !this.k ? 0 : this.j; }
  
  public void g(int paramInt) { this.d.setInputMethodMode(paramInt); }
  
  public int h() { return this.h; }
  
  public void h(int paramInt) {
    a a1 = this.f;
    if (k() && a1 != null) {
      a.a(a1, false);
      a1.setSelection(paramInt);
      if (Build.VERSION.SDK_INT >= 11 && a1.getChoiceMode() != 0)
        a1.setItemChecked(paramInt, true); 
    } 
  }
  
  public void i() {
    this.d.dismiss();
    a();
    this.d.setContentView(null);
    this.f = null;
    this.A.removeCallbacks(this.v);
  }
  
  public void j() {
    a a1 = this.f;
    if (a1 != null) {
      a.a(a1, true);
      a1.requestLayout();
    } 
  }
  
  public boolean k() { return this.d.isShowing(); }
  
  public boolean l() { return (this.d.getInputMethodMode() == 2); }
  
  public ListView m() { return this.f; }
  
  private static class a extends h {
    private boolean f;
    
    private boolean g;
    
    private boolean h;
    
    private u i;
    
    private d j;
    
    public a(Context param1Context, boolean param1Boolean) {
      super(param1Context, null, a.a.dropDownListViewStyle);
      this.g = param1Boolean;
      setCacheColorHint(0);
    }
    
    private void a(View param1View, int param1Int) { performItemClick(param1View, param1Int, getItemIdAtPosition(param1Int)); }
    
    private void a(View param1View, int param1Int, float param1Float1, float param1Float2) {
      this.h = true;
      setPressed(true);
      layoutChildren();
      setSelection(param1Int);
      a(param1Int, param1View, param1Float1, param1Float2);
      setSelectorEnabled(false);
      refreshDrawableState();
    }
    
    private void d() {
      this.h = false;
      setPressed(false);
      drawableStateChanged();
      if (this.i != null) {
        this.i.a();
        this.i = null;
      } 
    }
    
    public boolean a(MotionEvent param1MotionEvent, int param1Int) { // Byte code:
      //   0: aload_1
      //   1: invokestatic a : (Landroid/view/MotionEvent;)I
      //   4: istore_3
      //   5: iload_3
      //   6: tableswitch default -> 32, 1 -> 104, 2 -> 225, 3 -> 96
      //   32: iconst_0
      //   33: istore_2
      //   34: iconst_1
      //   35: istore #6
      //   37: iload #6
      //   39: ifeq -> 46
      //   42: iload_2
      //   43: ifeq -> 50
      //   46: aload_0
      //   47: invokespecial d : ()V
      //   50: iload #6
      //   52: ifeq -> 206
      //   55: aload_0
      //   56: getfield j : Landroid/support/v4/widget/d;
      //   59: ifnonnull -> 74
      //   62: aload_0
      //   63: new android/support/v4/widget/d
      //   66: dup
      //   67: aload_0
      //   68: invokespecial <init> : (Landroid/widget/ListView;)V
      //   71: putfield j : Landroid/support/v4/widget/d;
      //   74: aload_0
      //   75: getfield j : Landroid/support/v4/widget/d;
      //   78: iconst_1
      //   79: invokevirtual a : (Z)Landroid/support/v4/widget/a;
      //   82: pop
      //   83: aload_0
      //   84: getfield j : Landroid/support/v4/widget/d;
      //   87: aload_0
      //   88: aload_1
      //   89: invokevirtual onTouch : (Landroid/view/View;Landroid/view/MotionEvent;)Z
      //   92: pop
      //   93: iload #6
      //   95: ireturn
      //   96: iconst_0
      //   97: istore_2
      //   98: iconst_0
      //   99: istore #6
      //   101: goto -> 37
      //   104: iconst_0
      //   105: istore #6
      //   107: aload_1
      //   108: iload_2
      //   109: invokevirtual findPointerIndex : (I)I
      //   112: istore #4
      //   114: iload #4
      //   116: ifge -> 127
      //   119: iconst_0
      //   120: istore_2
      //   121: iconst_0
      //   122: istore #6
      //   124: goto -> 37
      //   127: aload_1
      //   128: iload #4
      //   130: invokevirtual getX : (I)F
      //   133: f2i
      //   134: istore_2
      //   135: aload_1
      //   136: iload #4
      //   138: invokevirtual getY : (I)F
      //   141: f2i
      //   142: istore #4
      //   144: aload_0
      //   145: iload_2
      //   146: iload #4
      //   148: invokevirtual pointToPosition : (II)I
      //   151: istore #5
      //   153: iload #5
      //   155: iconst_m1
      //   156: if_icmpne -> 164
      //   159: iconst_1
      //   160: istore_2
      //   161: goto -> 37
      //   164: aload_0
      //   165: iload #5
      //   167: aload_0
      //   168: invokevirtual getFirstVisiblePosition : ()I
      //   171: isub
      //   172: invokevirtual getChildAt : (I)Landroid/view/View;
      //   175: astore #7
      //   177: aload_0
      //   178: aload #7
      //   180: iload #5
      //   182: iload_2
      //   183: i2f
      //   184: iload #4
      //   186: i2f
      //   187: invokespecial a : (Landroid/view/View;IFF)V
      //   190: iload_3
      //   191: iconst_1
      //   192: if_icmpne -> 32
      //   195: aload_0
      //   196: aload #7
      //   198: iload #5
      //   200: invokespecial a : (Landroid/view/View;I)V
      //   203: goto -> 32
      //   206: aload_0
      //   207: getfield j : Landroid/support/v4/widget/d;
      //   210: ifnull -> 93
      //   213: aload_0
      //   214: getfield j : Landroid/support/v4/widget/d;
      //   217: iconst_0
      //   218: invokevirtual a : (Z)Landroid/support/v4/widget/a;
      //   221: pop
      //   222: iload #6
      //   224: ireturn
      //   225: iconst_1
      //   226: istore #6
      //   228: goto -> 107 }
    
    protected boolean c() { return (this.h || super.c()); }
    
    public boolean hasFocus() { return (this.g || super.hasFocus()); }
    
    public boolean hasWindowFocus() { return (this.g || super.hasWindowFocus()); }
    
    public boolean isFocused() { return (this.g || super.isFocused()); }
    
    public boolean isInTouchMode() { return ((this.g && this.f) || super.isInTouchMode()); }
  }
  
  public static abstract class b implements View.OnTouchListener {
    private final float a;
    
    private final int b;
    
    private final int c;
    
    private final View d;
    
    private Runnable e;
    
    private Runnable f;
    
    private boolean g;
    
    private boolean h;
    
    private int i;
    
    private final int[] j = new int[2];
    
    public b(View param1View) {
      this.d = param1View;
      this.a = ViewConfiguration.get(param1View.getContext()).getScaledTouchSlop();
      this.b = ViewConfiguration.getTapTimeout();
      this.c = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    private boolean a(MotionEvent param1MotionEvent) {
      View view = this.d;
      if (view.isEnabled()) {
        int k;
        switch (i.a(param1MotionEvent)) {
          default:
            return false;
          case 0:
            this.i = param1MotionEvent.getPointerId(0);
            this.h = false;
            if (this.e == null)
              this.e = new a(this, null); 
            view.postDelayed(this.e, this.b);
            if (this.f == null)
              this.f = new b(this, null); 
            view.postDelayed(this.f, this.c);
            return false;
          case 2:
            k = param1MotionEvent.findPointerIndex(this.i);
            if (k >= 0 && !a(view, param1MotionEvent.getX(k), param1MotionEvent.getY(k), this.a)) {
              d();
              view.getParent().requestDisallowInterceptTouchEvent(true);
              return true;
            } 
            return false;
          case 1:
          case 3:
            break;
        } 
        d();
        return false;
      } 
      return false;
    }
    
    private static boolean a(View param1View, float param1Float1, float param1Float2, float param1Float3) { return (param1Float1 >= -param1Float3 && param1Float2 >= -param1Float3 && param1Float1 < (param1View.getRight() - param1View.getLeft()) + param1Float3 && param1Float2 < (param1View.getBottom() - param1View.getTop()) + param1Float3); }
    
    private boolean a(View param1View, MotionEvent param1MotionEvent) {
      int[] arrayOfInt = this.j;
      param1View.getLocationOnScreen(arrayOfInt);
      param1MotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
      return true;
    }
    
    private boolean b(MotionEvent param1MotionEvent) {
      boolean bool = true;
      View view = this.d;
      h h1 = a();
      if (h1 != null && h1.k()) {
        h.a a1 = h.a(h1);
        if (a1 != null && a1.isShown()) {
          MotionEvent motionEvent = MotionEvent.obtainNoHistory(param1MotionEvent);
          b(view, motionEvent);
          a(a1, motionEvent);
          boolean bool1 = a1.a(motionEvent, this.i);
          motionEvent.recycle();
          int k = i.a(param1MotionEvent);
          if (k != 1 && k != 3) {
            k = 1;
          } else {
            k = 0;
          } 
          if (!bool1 || k == 0)
            bool = false; 
          return bool;
        } 
      } 
      return false;
    }
    
    private boolean b(View param1View, MotionEvent param1MotionEvent) {
      int[] arrayOfInt = this.j;
      param1View.getLocationOnScreen(arrayOfInt);
      param1MotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
      return true;
    }
    
    private void d() {
      if (this.f != null)
        this.d.removeCallbacks(this.f); 
      if (this.e != null)
        this.d.removeCallbacks(this.e); 
    }
    
    private void e() {
      d();
      View view = this.d;
      if (view.isEnabled() && !view.isLongClickable() && b()) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        view.onTouchEvent(motionEvent);
        motionEvent.recycle();
        this.g = true;
        this.h = true;
        return;
      } 
    }
    
    public abstract h a();
    
    protected boolean b() {
      h h1 = a();
      if (h1 != null && !h1.k())
        h1.c(); 
      return true;
    }
    
    protected boolean c() {
      h h1 = a();
      if (h1 != null && h1.k())
        h1.i(); 
      return true;
    }
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int k;
      byte b1 = 0;
      boolean bool = this.g;
      if (bool) {
        if (this.h) {
          k = b(param1MotionEvent);
        } else if (b(param1MotionEvent) || !c()) {
          k = 1;
        } else {
          k = 0;
        } 
      } else {
        if (a(param1MotionEvent) && b()) {
          k = 1;
        } else {
          k = 0;
        } 
        if (k) {
          long l = SystemClock.uptimeMillis();
          MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          this.d.onTouchEvent(motionEvent);
          motionEvent.recycle();
        } 
      } 
      this.g = k;
      if (!k) {
        k = b1;
        return bool ? true : k;
      } 
      return true;
    }
    
    private class a implements Runnable {
      private a(h.b this$0) {}
      
      public void run() { h.b.a(this.a).getParent().requestDisallowInterceptTouchEvent(true); }
    }
    
    private class b implements Runnable {
      private b(h.b this$0) {}
      
      public void run() { h.b.b(this.a); }
    }
  }
  
  private class a implements Runnable {
    private a(h this$0) {}
    
    public void run() { h.b.a(this.a).getParent().requestDisallowInterceptTouchEvent(true); }
  }
  
  private class b implements Runnable {
    private b(h this$0) {}
    
    public void run() { h.b.b(this.a); }
  }
  
  private class c implements Runnable {
    private c(h this$0) {}
    
    public void run() { this.a.j(); }
  }
  
  private class d extends DataSetObserver {
    private d(h this$0) {}
    
    public void onChanged() {
      if (this.a.k())
        this.a.c(); 
    }
    
    public void onInvalidated() { this.a.i(); }
  }
  
  private class e implements AbsListView.OnScrollListener {
    private e(h this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (param1Int == 1 && !this.a.l() && h.b(this.a).getContentView() != null) {
        h.d(this.a).removeCallbacks(h.c(this.a));
        h.c(this.a).run();
      } 
    }
  }
  
  private class f implements View.OnTouchListener {
    private f(h this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int i = param1MotionEvent.getAction();
      int j = (int)param1MotionEvent.getX();
      int k = (int)param1MotionEvent.getY();
      if (i == 0 && h.b(this.a) != null && h.b(this.a).isShowing() && j >= 0 && j < h.b(this.a).getWidth() && k >= 0 && k < h.b(this.a).getHeight()) {
        h.d(this.a).postDelayed(h.c(this.a), 250L);
        return false;
      } 
      if (i == 1)
        h.d(this.a).removeCallbacks(h.c(this.a)); 
      return false;
    }
  }
  
  private class g implements Runnable {
    private g(h this$0) {}
    
    public void run() {
      if (h.a(this.a) != null && h.a(this.a).getCount() > h.a(this.a).getChildCount() && h.a(this.a).getChildCount() <= this.a.b) {
        h.b(this.a).setInputMethodMode(2);
        this.a.c();
      } 
    }
  }
}
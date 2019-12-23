package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.l;
import android.support.v7.b.a;
import android.support.v7.internal.widget.p;
import android.support.v7.internal.widget.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class g extends ViewGroup {
  private boolean a = true;
  
  private int b = -1;
  
  private int c = 0;
  
  private int d;
  
  private int e = 8388659;
  
  private int f;
  
  private float g;
  
  private boolean h;
  
  private int[] i;
  
  private int[] j;
  
  private Drawable k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  public g(Context paramContext) { this(paramContext, null); }
  
  public g(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public g(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    p p = p.a(paramContext, paramAttributeSet, a.j.LinearLayoutCompat, paramInt, 0);
    paramInt = p.a(a.j.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0)
      setOrientation(paramInt); 
    paramInt = p.a(a.j.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0)
      setGravity(paramInt); 
    boolean bool = p.a(a.j.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool)
      setBaselineAligned(bool); 
    this.g = p.a(a.j.LinearLayoutCompat_android_weightSum, -1.0F);
    this.b = p.a(a.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.h = p.a(a.j.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(p.a(a.j.LinearLayoutCompat_divider));
    this.n = p.a(a.j.LinearLayoutCompat_showDividers, 0);
    this.o = p.e(a.j.LinearLayoutCompat_dividerPadding, 0);
    p.b();
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4); }
  
  private void c(int paramInt1, int paramInt2) {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (byte b1 = 0; b1 < paramInt1; b1++) {
      View view = b(b1);
      if (view.getVisibility() != 8) {
        a a1 = (a)view.getLayoutParams();
        if (a1.width == -1) {
          int i2 = a1.height;
          a1.height = view.getMeasuredHeight();
          measureChildWithMargins(view, i1, 0, paramInt2, 0);
          a1.height = i2;
        } 
      } 
    } 
  }
  
  private void d(int paramInt1, int paramInt2) {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    for (byte b1 = 0; b1 < paramInt1; b1++) {
      View view = b(b1);
      if (view.getVisibility() != 8) {
        a a1 = (a)view.getLayoutParams();
        if (a1.height == -1) {
          int i2 = a1.width;
          a1.width = view.getMeasuredWidth();
          measureChildWithMargins(view, paramInt2, 0, i1, 0);
          a1.width = i2;
        } 
      } 
    } 
  }
  
  int a(View paramView) { return 0; }
  
  int a(View paramView, int paramInt) { return 0; }
  
  void a(int paramInt1, int paramInt2) {
    this.f = 0;
    int i2 = 0;
    int i1 = 0;
    int i6 = 0;
    int i9 = 0;
    int i3 = 1;
    float f1 = 0.0F;
    int i10 = getVirtualChildCount();
    int i11 = View.MeasureSpec.getMode(paramInt1);
    int i12 = View.MeasureSpec.getMode(paramInt2);
    int i8 = 0;
    int i5 = 0;
    int i13 = this.b;
    boolean bool = this.h;
    int i4 = Integer.MIN_VALUE;
    int i7 = 0;
    while (true) {
      if (i7 < i10) {
        View view = b(i7);
        if (view == null) {
          this.f += d(i7);
          int i17 = i4;
          byte b1 = i5;
          i5 = i2;
          i4 = i1;
          i2 = b1;
          i1 = i17;
        } else if (view.getVisibility() == 8) {
          int i17 = i7 + a(view, i7);
          i7 = i4;
          byte b1 = i5;
          i4 = i1;
          i5 = i2;
          i1 = i7;
          i2 = b1;
          i7 = i17;
        } else {
          int i18;
          if (c(i7))
            this.f += this.m; 
          a a1 = (a)view.getLayoutParams();
          f1 += a1.g;
          if (i12 == 1073741824 && a1.height == 0 && a1.g > 0.0F) {
            i5 = this.f;
            this.f = Math.max(i5, a1.topMargin + i5 + a1.bottomMargin);
            i18 = 1;
            i17 = i4;
          } else {
            i18 = Integer.MIN_VALUE;
            i17 = i18;
            if (a1.height == 0) {
              i17 = i18;
              if (a1.g > 0.0F) {
                i17 = 0;
                a1.height = -2;
              } 
            } 
            if (f1 == 0.0F) {
              i18 = this.f;
            } else {
              i18 = 0;
            } 
            a(view, i7, paramInt1, 0, paramInt2, i18);
            if (i17 != Integer.MIN_VALUE)
              a1.height = i17; 
            int i22 = view.getMeasuredHeight();
            i17 = this.f;
            this.f = Math.max(i17, i17 + i22 + a1.topMargin + a1.bottomMargin + b(view));
            i17 = i4;
            i18 = i5;
            if (bool) {
              i17 = Math.max(i22, i4);
              i18 = i5;
            } 
          } 
          if (i13 >= 0 && i13 == i7 + 1)
            this.c = this.f; 
          if (i7 < i13 && a1.g > 0.0F)
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."); 
          i5 = 0;
          if (i11 != 1073741824 && a1.width == -1) {
            i4 = 1;
            i5 = 1;
          } else {
            i4 = i8;
          } 
          i8 = a1.leftMargin;
          i8 = a1.rightMargin + i8;
          int i19 = view.getMeasuredWidth() + i8;
          int i21 = Math.max(i2, i19);
          int i20 = r.a(i1, l.b(view));
          if (i3 && a1.width == -1) {
            i3 = 1;
          } else {
            i3 = 0;
          } 
          if (a1.g > 0.0F) {
            if (i5 == 0)
              i8 = i19; 
            i2 = Math.max(i9, i8);
            i1 = i6;
          } else {
            if (i5 == 0)
              i8 = i19; 
            i1 = Math.max(i6, i8);
            i2 = i9;
          } 
          i7 += a(view, i7);
          i9 = i2;
          i6 = i1;
          i5 = i21;
          i1 = i17;
          int i17 = i20;
          i8 = i4;
          i2 = i18;
          i4 = i17;
        } 
        i7++;
        int i15 = i4;
        int i16 = i5;
        i4 = i1;
        i5 = i2;
        i1 = i15;
        i2 = i16;
        continue;
      } 
      if (this.f > 0 && c(i10))
        this.f += this.m; 
      if (bool && (i12 == Integer.MIN_VALUE || i12 == 0)) {
        this.f = 0;
        for (i7 = 0; i7 < i10; i7++) {
          View view = b(i7);
          if (view == null) {
            this.f += d(i7);
          } else if (view.getVisibility() == 8) {
            i7 = a(view, i7) + i7;
          } else {
            a a1 = (a)view.getLayoutParams();
            int i15 = this.f;
            int i16 = a1.topMargin;
            this.f = Math.max(i15, a1.bottomMargin + i15 + i4 + i16 + b(view));
          } 
        } 
      } 
      this.f += getPaddingTop() + getPaddingBottom();
      int i14 = l.a(Math.max(this.f, getSuggestedMinimumHeight()), paramInt2, 0);
      i7 = (0xFFFFFF & i14) - this.f;
      if (i5 != 0 || (i7 != 0 && f1 > 0.0F)) {
        if (this.g > 0.0F)
          f1 = this.g; 
        this.f = 0;
        i4 = 0;
        i5 = i3;
        i3 = i6;
        i6 = i7;
        i7 = i4;
        i4 = i2;
        i2 = i5;
        i5 = i6;
        while (true) {
          if (i7 < i10) {
            View view = b(i7);
            if (view.getVisibility() == 8) {
              i6 = i3;
              i3 = i4;
              i4 = i6;
            } else {
              a a1 = (a)view.getLayoutParams();
              float f2 = a1.g;
              if (f2 > 0.0F) {
                i9 = (int)(i5 * f2 / f1);
                int i16 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + a1.leftMargin + a1.rightMargin, a1.width);
                if (a1.height != 0 || i12 != 1073741824) {
                  int i17 = i9 + view.getMeasuredHeight();
                  i6 = i17;
                  if (i17 < 0)
                    i6 = 0; 
                  view.measure(i16, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                } else {
                  if (i9 > 0) {
                    i6 = i9;
                  } else {
                    i6 = 0;
                  } 
                  view.measure(i16, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                } 
                i1 = r.a(i1, l.b(view) & 0xFFFFFF00);
                i6 = i5 - i9;
                i5 = i1;
                f1 -= f2;
                i1 = i6;
              } else {
                i6 = i1;
                i1 = i5;
                i5 = i6;
              } 
              i9 = a1.leftMargin + a1.rightMargin;
              int i15 = view.getMeasuredWidth() + i9;
              i6 = Math.max(i4, i15);
              if (i11 != 1073741824 && a1.width == -1) {
                i4 = 1;
              } else {
                i4 = 0;
              } 
              if (i4 != 0) {
                i4 = i9;
              } else {
                i4 = i15;
              } 
              i4 = Math.max(i3, i4);
              if (i2 != 0 && a1.width == -1) {
                i2 = 1;
              } else {
                i2 = 0;
              } 
              i3 = this.f;
              i9 = view.getMeasuredHeight();
              i15 = a1.topMargin;
              this.f = Math.max(i3, a1.bottomMargin + i9 + i3 + i15 + b(view));
              i3 = i6;
              i6 = i1;
              i1 = i5;
              i5 = i6;
            } 
            i7++;
            i6 = i3;
            i3 = i4;
            i4 = i6;
            continue;
          } 
          this.f += getPaddingTop() + getPaddingBottom();
          i5 = i2;
          i2 = i3;
          i3 = i5;
          if (i3 != 0 || i11 == 1073741824)
            i2 = i4; 
          setMeasuredDimension(l.a(Math.max(i2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), paramInt1, i1), i14);
          if (i8 != 0)
            c(i10, paramInt2); 
          return;
        } 
        break;
      } 
      i6 = Math.max(i6, i9);
      if (bool && i12 != 1073741824)
        for (i5 = 0; i5 < i10; i5++) {
          View view = b(i5);
          if (view != null && view.getVisibility() != 8 && ((a)view.getLayoutParams()).g > 0.0F)
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824)); 
        }  
      i4 = i6;
      i5 = i2;
      i2 = i4;
      i4 = i5;
      continue;
    } 
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { // Byte code:
    //   0: aload_0
    //   1: invokevirtual getPaddingLeft : ()I
    //   4: istore #5
    //   6: iload_3
    //   7: iload_1
    //   8: isub
    //   9: istore #6
    //   11: aload_0
    //   12: invokevirtual getPaddingRight : ()I
    //   15: istore #7
    //   17: aload_0
    //   18: invokevirtual getPaddingRight : ()I
    //   21: istore #8
    //   23: aload_0
    //   24: invokevirtual getVirtualChildCount : ()I
    //   27: istore #9
    //   29: aload_0
    //   30: getfield e : I
    //   33: istore_1
    //   34: aload_0
    //   35: getfield e : I
    //   38: istore #10
    //   40: iload_1
    //   41: bipush #112
    //   43: iand
    //   44: lookupswitch default -> 72, 16 -> 134, 80 -> 116
    //   72: aload_0
    //   73: invokevirtual getPaddingTop : ()I
    //   76: istore_1
    //   77: iconst_0
    //   78: istore_3
    //   79: iload_1
    //   80: istore_2
    //   81: iload_3
    //   82: istore_1
    //   83: iload_1
    //   84: iload #9
    //   86: if_icmpge -> 380
    //   89: aload_0
    //   90: iload_1
    //   91: invokevirtual b : (I)Landroid/view/View;
    //   94: astore #13
    //   96: aload #13
    //   98: ifnonnull -> 154
    //   101: iload_2
    //   102: aload_0
    //   103: iload_1
    //   104: invokevirtual d : (I)I
    //   107: iadd
    //   108: istore_2
    //   109: iload_1
    //   110: iconst_1
    //   111: iadd
    //   112: istore_1
    //   113: goto -> 83
    //   116: aload_0
    //   117: invokevirtual getPaddingTop : ()I
    //   120: iload #4
    //   122: iadd
    //   123: iload_2
    //   124: isub
    //   125: aload_0
    //   126: getfield f : I
    //   129: isub
    //   130: istore_1
    //   131: goto -> 77
    //   134: aload_0
    //   135: invokevirtual getPaddingTop : ()I
    //   138: iload #4
    //   140: iload_2
    //   141: isub
    //   142: aload_0
    //   143: getfield f : I
    //   146: isub
    //   147: iconst_2
    //   148: idiv
    //   149: iadd
    //   150: istore_1
    //   151: goto -> 77
    //   154: aload #13
    //   156: invokevirtual getVisibility : ()I
    //   159: bipush #8
    //   161: if_icmpeq -> 384
    //   164: aload #13
    //   166: invokevirtual getMeasuredWidth : ()I
    //   169: istore #11
    //   171: aload #13
    //   173: invokevirtual getMeasuredHeight : ()I
    //   176: istore #12
    //   178: aload #13
    //   180: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   183: checkcast android/support/v7/widget/g$a
    //   186: astore #14
    //   188: aload #14
    //   190: getfield h : I
    //   193: istore #4
    //   195: iload #4
    //   197: istore_3
    //   198: iload #4
    //   200: ifge -> 210
    //   203: iload #10
    //   205: ldc_w 8388615
    //   208: iand
    //   209: istore_3
    //   210: iload_3
    //   211: aload_0
    //   212: invokestatic a : (Landroid/view/View;)I
    //   215: invokestatic a : (II)I
    //   218: bipush #7
    //   220: iand
    //   221: lookupswitch default -> 248, 1 -> 330, 5 -> 362
    //   248: iload #5
    //   250: aload #14
    //   252: getfield leftMargin : I
    //   255: iadd
    //   256: istore_3
    //   257: aload_0
    //   258: iload_1
    //   259: invokevirtual c : (I)Z
    //   262: ifeq -> 381
    //   265: aload_0
    //   266: getfield m : I
    //   269: iload_2
    //   270: iadd
    //   271: istore_2
    //   272: iload_2
    //   273: aload #14
    //   275: getfield topMargin : I
    //   278: iadd
    //   279: istore_2
    //   280: aload_0
    //   281: aload #13
    //   283: iload_3
    //   284: iload_2
    //   285: aload_0
    //   286: aload #13
    //   288: invokevirtual a : (Landroid/view/View;)I
    //   291: iadd
    //   292: iload #11
    //   294: iload #12
    //   296: invokespecial a : (Landroid/view/View;IIII)V
    //   299: iload_2
    //   300: aload #14
    //   302: getfield bottomMargin : I
    //   305: iload #12
    //   307: iadd
    //   308: aload_0
    //   309: aload #13
    //   311: invokevirtual b : (Landroid/view/View;)I
    //   314: iadd
    //   315: iadd
    //   316: istore_2
    //   317: aload_0
    //   318: aload #13
    //   320: iload_1
    //   321: invokevirtual a : (Landroid/view/View;I)I
    //   324: iload_1
    //   325: iadd
    //   326: istore_1
    //   327: goto -> 109
    //   330: iload #6
    //   332: iload #5
    //   334: isub
    //   335: iload #8
    //   337: isub
    //   338: iload #11
    //   340: isub
    //   341: iconst_2
    //   342: idiv
    //   343: iload #5
    //   345: iadd
    //   346: aload #14
    //   348: getfield leftMargin : I
    //   351: iadd
    //   352: aload #14
    //   354: getfield rightMargin : I
    //   357: isub
    //   358: istore_3
    //   359: goto -> 257
    //   362: iload #6
    //   364: iload #7
    //   366: isub
    //   367: iload #11
    //   369: isub
    //   370: aload #14
    //   372: getfield rightMargin : I
    //   375: isub
    //   376: istore_3
    //   377: goto -> 257
    //   380: return
    //   381: goto -> 272
    //   384: goto -> 109 }
  
  void a(Canvas paramCanvas) {
    int i2 = getVirtualChildCount();
    int i1;
    for (i1 = 0; i1 < i2; i1++) {
      View view = b(i1);
      if (view != null && view.getVisibility() != 8 && c(i1)) {
        a a1 = (a)view.getLayoutParams();
        a(paramCanvas, view.getTop() - a1.topMargin - this.m);
      } 
    } 
    if (c(i2)) {
      View view = b(i2 - 1);
      if (view == null) {
        i1 = getHeight() - getPaddingBottom() - this.m;
      } else {
        a a1 = (a)view.getLayoutParams();
        i1 = view.getBottom();
        i1 = a1.bottomMargin + i1;
      } 
      a(paramCanvas, i1);
    } 
  }
  
  void a(Canvas paramCanvas, int paramInt) {
    this.k.setBounds(getPaddingLeft() + this.o, paramInt, getWidth() - getPaddingRight() - this.o, this.m + paramInt);
    this.k.draw(paramCanvas);
  }
  
  void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5); }
  
  int b(View paramView) { return 0; }
  
  public a b(AttributeSet paramAttributeSet) { return new a(getContext(), paramAttributeSet); }
  
  protected a b(ViewGroup.LayoutParams paramLayoutParams) { return new a(paramLayoutParams); }
  
  View b(int paramInt) { return getChildAt(paramInt); }
  
  void b(int paramInt1, int paramInt2) {
    boolean bool;
    this.f = 0;
    int i3 = 0;
    int i2 = 0;
    int i6 = 0;
    int i8 = 0;
    int i1 = 1;
    float f1 = 0.0F;
    int i10 = getVirtualChildCount();
    int i12 = View.MeasureSpec.getMode(paramInt1);
    int i11 = View.MeasureSpec.getMode(paramInt2);
    int i7 = 0;
    int i5 = 0;
    if (this.i == null || this.j == null) {
      this.i = new int[4];
      this.j = new int[4];
    } 
    int[] arrayOfInt1 = this.i;
    int[] arrayOfInt2 = this.j;
    arrayOfInt1[3] = -1;
    arrayOfInt1[2] = -1;
    arrayOfInt1[1] = -1;
    arrayOfInt1[0] = -1;
    arrayOfInt2[3] = -1;
    arrayOfInt2[2] = -1;
    arrayOfInt2[1] = -1;
    arrayOfInt2[0] = -1;
    boolean bool1 = this.a;
    boolean bool2 = this.h;
    if (i12 == 1073741824) {
      bool = true;
    } else {
      bool = false;
    } 
    int i4 = Integer.MIN_VALUE;
    int i9 = 0;
    while (true) {
      if (i9 < i10) {
        View view = b(i9);
        if (view == null) {
          this.f += d(i9);
          int i14 = i4;
          int i15 = i5;
          i5 = i3;
          i4 = i2;
          i3 = i1;
          i2 = i15;
          i1 = i14;
        } else if (view.getVisibility() == 8) {
          int i16 = i9 + a(view, i9);
          i9 = i4;
          int i15 = i5;
          i4 = i1;
          i5 = i2;
          int i14 = i3;
          i1 = i9;
          i2 = i15;
          i9 = i16;
          i3 = i4;
          i4 = i5;
          i5 = i14;
        } else {
          int i15;
          if (c(i9))
            this.f += this.l; 
          a a1 = (a)view.getLayoutParams();
          f1 += a1.g;
          if (i12 == 1073741824 && a1.width == 0 && a1.g > 0.0F) {
            if (bool) {
              this.f += a1.leftMargin + a1.rightMargin;
            } else {
              i14 = this.f;
              this.f = Math.max(i14, a1.leftMargin + i14 + a1.rightMargin);
            } 
            if (bool1) {
              i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
              view.measure(i14, i14);
              i15 = i5;
              i14 = i4;
            } else {
              i15 = 1;
              i14 = i4;
            } 
          } else {
            i15 = Integer.MIN_VALUE;
            i14 = i15;
            if (a1.width == 0) {
              i14 = i15;
              if (a1.g > 0.0F) {
                i14 = 0;
                a1.width = -2;
              } 
            } 
            if (f1 == 0.0F) {
              i15 = this.f;
            } else {
              i15 = 0;
            } 
            a(view, i9, paramInt1, i15, paramInt2, 0);
            if (i14 != Integer.MIN_VALUE)
              a1.width = i14; 
            int i19 = view.getMeasuredWidth();
            if (bool) {
              this.f += a1.leftMargin + i19 + a1.rightMargin + b(view);
            } else {
              i14 = this.f;
              this.f = Math.max(i14, i14 + i19 + a1.leftMargin + a1.rightMargin + b(view));
            } 
            i14 = i4;
            i15 = i5;
            if (bool2) {
              i14 = Math.max(i19, i4);
              i15 = i5;
            } 
          } 
          i5 = 0;
          if (i11 != 1073741824 && a1.height == -1) {
            i4 = 1;
            i5 = 1;
          } else {
            i4 = i7;
          } 
          i7 = a1.topMargin;
          i7 = a1.bottomMargin + i7;
          int i16 = view.getMeasuredHeight() + i7;
          int i17 = r.a(i2, l.b(view));
          if (bool1) {
            int i19 = view.getBaseline();
            if (i19 != -1) {
              if (a1.h < 0) {
                i2 = this.e;
              } else {
                i2 = a1.h;
              } 
              i2 = ((i2 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt1[i2] = Math.max(arrayOfInt1[i2], i19);
              arrayOfInt2[i2] = Math.max(arrayOfInt2[i2], i16 - i19);
            } 
          } 
          int i18 = Math.max(i3, i16);
          if (i1 != 0 && a1.height == -1) {
            i3 = 1;
          } else {
            i3 = 0;
          } 
          if (a1.g > 0.0F) {
            if (i5 == 0)
              i7 = i16; 
            i2 = Math.max(i8, i7);
            i1 = i6;
          } else {
            if (i5 == 0)
              i7 = i16; 
            i1 = Math.max(i6, i7);
            i2 = i8;
          } 
          i9 += a(view, i9);
          i8 = i2;
          i6 = i1;
          i5 = i18;
          i1 = i14;
          int i14 = i17;
          i7 = i4;
          i2 = i15;
          i4 = i14;
        } 
        continue;
      } 
      if (this.f > 0 && c(i10))
        this.f += this.l; 
      if (arrayOfInt1[1] != -1 || arrayOfInt1[0] != -1 || arrayOfInt1[2] != -1 || arrayOfInt1[3] != -1) {
        i9 = Math.max(i3, Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(arrayOfInt1[1], arrayOfInt1[2]))) + Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))));
      } else {
        i9 = i3;
      } 
      if (bool2 && (i12 == Integer.MIN_VALUE || i12 == 0)) {
        this.f = 0;
        for (i3 = 0; i3 < i10; i3++) {
          View view = b(i3);
          if (view == null) {
            this.f += d(i3);
          } else if (view.getVisibility() == 8) {
            i3 = a(view, i3) + i3;
          } else {
            a a1 = (a)view.getLayoutParams();
            if (bool) {
              int i14 = this.f;
              int i15 = a1.leftMargin;
              this.f = a1.rightMargin + i15 + i4 + b(view) + i14;
            } else {
              int i14 = this.f;
              int i15 = a1.leftMargin;
              this.f = Math.max(i14, a1.rightMargin + i14 + i4 + i15 + b(view));
            } 
          } 
        } 
      } 
      this.f += getPaddingLeft() + getPaddingRight();
      int i13 = l.a(Math.max(this.f, getSuggestedMinimumWidth()), paramInt1, 0);
      i3 = (0xFFFFFF & i13) - this.f;
      if (i5 != 0 || (i3 != 0 && f1 > 0.0F)) {
        if (this.g > 0.0F)
          f1 = this.g; 
        arrayOfInt1[3] = -1;
        arrayOfInt1[2] = -1;
        arrayOfInt1[1] = -1;
        arrayOfInt1[0] = -1;
        arrayOfInt2[3] = -1;
        arrayOfInt2[2] = -1;
        arrayOfInt2[1] = -1;
        arrayOfInt2[0] = -1;
        this.f = 0;
        i9 = 0;
        i8 = i6;
        i5 = i2;
        i4 = i3;
        i3 = -1;
        i6 = i9;
        i2 = i8;
        while (true) {
          i8 = i6 + 1;
          i6 = i4;
          i4 = i1;
          i1 = i2;
          i2 = i3;
          i3 = i6;
          i6 = i8;
        } 
        break;
      } 
      i5 = Math.max(i6, i8);
      if (bool2 && i12 != 1073741824)
        for (i3 = 0; i3 < i10; i3++) {
          View view = b(i3);
          if (view != null && view.getVisibility() != 8 && ((a)view.getLayoutParams()).g > 0.0F)
            view.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824)); 
        }  
      i3 = i5;
      i4 = i9;
      i5 = i1;
      i1 = i2;
      continue;
      i9++;
      i13 = i4;
      i14 = i5;
      i4 = i1;
      i5 = i2;
      i1 = i3;
      i2 = i13;
      i3 = i14;
    } 
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { // Byte code:
    //   0: aload_0
    //   1: invokestatic a : (Landroid/view/View;)Z
    //   4: istore #17
    //   6: aload_0
    //   7: invokevirtual getPaddingTop : ()I
    //   10: istore #7
    //   12: iload #4
    //   14: iload_2
    //   15: isub
    //   16: istore #9
    //   18: aload_0
    //   19: invokevirtual getPaddingBottom : ()I
    //   22: istore #10
    //   24: aload_0
    //   25: invokevirtual getPaddingBottom : ()I
    //   28: istore #11
    //   30: aload_0
    //   31: invokevirtual getVirtualChildCount : ()I
    //   34: istore #12
    //   36: aload_0
    //   37: getfield e : I
    //   40: istore_2
    //   41: aload_0
    //   42: getfield e : I
    //   45: istore #13
    //   47: aload_0
    //   48: getfield a : Z
    //   51: istore #18
    //   53: aload_0
    //   54: getfield i : [I
    //   57: astore #19
    //   59: aload_0
    //   60: getfield j : [I
    //   63: astore #20
    //   65: iload_2
    //   66: ldc_w 8388615
    //   69: iand
    //   70: aload_0
    //   71: invokestatic a : (Landroid/view/View;)I
    //   74: invokestatic a : (II)I
    //   77: lookupswitch default -> 104, 1 -> 190, 5 -> 173
    //   104: aload_0
    //   105: invokevirtual getPaddingLeft : ()I
    //   108: istore_1
    //   109: iload #17
    //   111: ifeq -> 529
    //   114: iconst_m1
    //   115: istore #4
    //   117: iload #12
    //   119: iconst_1
    //   120: isub
    //   121: istore #5
    //   123: iconst_0
    //   124: istore_2
    //   125: iload_1
    //   126: istore_3
    //   127: iload_2
    //   128: iload #12
    //   130: if_icmpge -> 514
    //   133: iload #5
    //   135: iload #4
    //   137: iload_2
    //   138: imul
    //   139: iadd
    //   140: istore #14
    //   142: aload_0
    //   143: iload #14
    //   145: invokevirtual b : (I)Landroid/view/View;
    //   148: astore #21
    //   150: aload #21
    //   152: ifnonnull -> 209
    //   155: iload_3
    //   156: aload_0
    //   157: iload #14
    //   159: invokevirtual d : (I)I
    //   162: iadd
    //   163: istore_3
    //   164: iload_2
    //   165: istore_1
    //   166: iload_1
    //   167: iconst_1
    //   168: iadd
    //   169: istore_2
    //   170: goto -> 127
    //   173: aload_0
    //   174: invokevirtual getPaddingLeft : ()I
    //   177: iload_3
    //   178: iadd
    //   179: iload_1
    //   180: isub
    //   181: aload_0
    //   182: getfield f : I
    //   185: isub
    //   186: istore_1
    //   187: goto -> 109
    //   190: aload_0
    //   191: invokevirtual getPaddingLeft : ()I
    //   194: iload_3
    //   195: iload_1
    //   196: isub
    //   197: aload_0
    //   198: getfield f : I
    //   201: isub
    //   202: iconst_2
    //   203: idiv
    //   204: iadd
    //   205: istore_1
    //   206: goto -> 109
    //   209: aload #21
    //   211: invokevirtual getVisibility : ()I
    //   214: bipush #8
    //   216: if_icmpeq -> 524
    //   219: aload #21
    //   221: invokevirtual getMeasuredWidth : ()I
    //   224: istore #15
    //   226: aload #21
    //   228: invokevirtual getMeasuredHeight : ()I
    //   231: istore #16
    //   233: aload #21
    //   235: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   238: checkcast android/support/v7/widget/g$a
    //   241: astore #22
    //   243: iload #18
    //   245: ifeq -> 518
    //   248: aload #22
    //   250: getfield height : I
    //   253: iconst_m1
    //   254: if_icmpeq -> 518
    //   257: aload #21
    //   259: invokevirtual getBaseline : ()I
    //   262: istore #6
    //   264: aload #22
    //   266: getfield h : I
    //   269: istore #8
    //   271: iload #8
    //   273: istore_1
    //   274: iload #8
    //   276: ifge -> 285
    //   279: iload #13
    //   281: bipush #112
    //   283: iand
    //   284: istore_1
    //   285: iload_1
    //   286: bipush #112
    //   288: iand
    //   289: lookupswitch default -> 324, 16 -> 435, 48 -> 402, 80 -> 467
    //   324: iload #7
    //   326: istore_1
    //   327: aload_0
    //   328: iload #14
    //   330: invokevirtual c : (I)Z
    //   333: ifeq -> 515
    //   336: aload_0
    //   337: getfield l : I
    //   340: iload_3
    //   341: iadd
    //   342: istore_3
    //   343: iload_3
    //   344: aload #22
    //   346: getfield leftMargin : I
    //   349: iadd
    //   350: istore_3
    //   351: aload_0
    //   352: aload #21
    //   354: iload_3
    //   355: aload_0
    //   356: aload #21
    //   358: invokevirtual a : (Landroid/view/View;)I
    //   361: iadd
    //   362: iload_1
    //   363: iload #15
    //   365: iload #16
    //   367: invokespecial a : (Landroid/view/View;IIII)V
    //   370: iload_3
    //   371: aload #22
    //   373: getfield rightMargin : I
    //   376: iload #15
    //   378: iadd
    //   379: aload_0
    //   380: aload #21
    //   382: invokevirtual b : (Landroid/view/View;)I
    //   385: iadd
    //   386: iadd
    //   387: istore_3
    //   388: aload_0
    //   389: aload #21
    //   391: iload #14
    //   393: invokevirtual a : (Landroid/view/View;I)I
    //   396: iload_2
    //   397: iadd
    //   398: istore_1
    //   399: goto -> 166
    //   402: iload #7
    //   404: aload #22
    //   406: getfield topMargin : I
    //   409: iadd
    //   410: istore #8
    //   412: iload #8
    //   414: istore_1
    //   415: iload #6
    //   417: iconst_m1
    //   418: if_icmpeq -> 327
    //   421: iload #8
    //   423: aload #19
    //   425: iconst_1
    //   426: iaload
    //   427: iload #6
    //   429: isub
    //   430: iadd
    //   431: istore_1
    //   432: goto -> 327
    //   435: iload #9
    //   437: iload #7
    //   439: isub
    //   440: iload #11
    //   442: isub
    //   443: iload #16
    //   445: isub
    //   446: iconst_2
    //   447: idiv
    //   448: iload #7
    //   450: iadd
    //   451: aload #22
    //   453: getfield topMargin : I
    //   456: iadd
    //   457: aload #22
    //   459: getfield bottomMargin : I
    //   462: isub
    //   463: istore_1
    //   464: goto -> 327
    //   467: iload #9
    //   469: iload #10
    //   471: isub
    //   472: iload #16
    //   474: isub
    //   475: aload #22
    //   477: getfield bottomMargin : I
    //   480: isub
    //   481: istore #8
    //   483: iload #8
    //   485: istore_1
    //   486: iload #6
    //   488: iconst_m1
    //   489: if_icmpeq -> 327
    //   492: aload #21
    //   494: invokevirtual getMeasuredHeight : ()I
    //   497: istore_1
    //   498: iload #8
    //   500: aload #20
    //   502: iconst_2
    //   503: iaload
    //   504: iload_1
    //   505: iload #6
    //   507: isub
    //   508: isub
    //   509: isub
    //   510: istore_1
    //   511: goto -> 327
    //   514: return
    //   515: goto -> 343
    //   518: iconst_m1
    //   519: istore #6
    //   521: goto -> 264
    //   524: iload_2
    //   525: istore_1
    //   526: goto -> 166
    //   529: iconst_1
    //   530: istore #4
    //   532: iconst_0
    //   533: istore #5
    //   535: goto -> 123 }
  
  void b(Canvas paramCanvas) {
    int i2 = getVirtualChildCount();
    boolean bool = r.a(this);
    int i1;
    for (i1 = 0; i1 < i2; i1++) {
      View view = b(i1);
      if (view != null && view.getVisibility() != 8 && c(i1)) {
        int i3;
        a a1 = (a)view.getLayoutParams();
        if (bool) {
          i3 = view.getRight();
          i3 = a1.rightMargin + i3;
        } else {
          i3 = view.getLeft() - a1.leftMargin - this.l;
        } 
        b(paramCanvas, i3);
      } 
    } 
    if (c(i2)) {
      View view = b(i2 - 1);
      if (view == null) {
        if (bool) {
          i1 = getPaddingLeft();
        } else {
          i1 = getWidth() - getPaddingRight() - this.l;
        } 
      } else {
        a a1 = (a)view.getLayoutParams();
        if (bool) {
          i1 = view.getLeft() - a1.leftMargin - this.l;
        } else {
          i1 = view.getRight();
          i1 = a1.rightMargin + i1;
        } 
      } 
      b(paramCanvas, i1);
    } 
  }
  
  void b(Canvas paramCanvas, int paramInt) {
    this.k.setBounds(paramInt, getPaddingTop() + this.o, this.l + paramInt, getHeight() - getPaddingBottom() - this.o);
    this.k.draw(paramCanvas);
  }
  
  protected boolean c(int paramInt) {
    if (paramInt == 0)
      return !((this.n & true) == 0); 
    if (paramInt == getChildCount())
      return !((this.n & 0x4) == 0); 
    if ((this.n & 0x2) != 0) {
      while (--paramInt >= 0) {
        if (getChildAt(paramInt).getVisibility() == 8) {
          paramInt--;
          continue;
        } 
        return true;
      } 
    } else {
      return false;
    } 
    return false;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) { return paramLayoutParams instanceof a; }
  
  int d(int paramInt) { return 0; }
  
  protected a g() { return (this.d == 0) ? new a(-2, -2) : ((this.d == 1) ? new a(-1, -2) : null); }
  
  public int getBaseline() {
    int i1 = -1;
    if (this.b < 0)
      return super.getBaseline(); 
    if (getChildCount() <= this.b)
      throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."); 
    View view = getChildAt(this.b);
    int i2 = view.getBaseline();
    if (i2 == -1) {
      if (this.b != 0)
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."); 
      return i1;
    } 
    i1 = this.c;
    if (this.d == 1) {
      int i3 = this.e & 0x70;
      if (i3 != 48) {
        switch (i3) {
          default:
            return ((a)view.getLayoutParams()).topMargin + i1 + i2;
          case 80:
            i1 = getBottom() - getTop() - getPaddingBottom() - this.f;
          case 16:
            break;
        } 
        i1 += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.f) / 2;
      } 
    } 
  }
  
  public int getBaselineAlignedChildIndex() { return this.b; }
  
  public Drawable getDividerDrawable() { return this.k; }
  
  public int getDividerPadding() { return this.o; }
  
  public int getDividerWidth() { return this.l; }
  
  public int getOrientation() { return this.d; }
  
  public int getShowDividers() { return this.n; }
  
  int getVirtualChildCount() { return getChildCount(); }
  
  public float getWeightSum() { return this.g; }
  
  protected void onDraw(Canvas paramCanvas) {
    if (this.k == null)
      return; 
    if (this.d == 1) {
      a(paramCanvas);
      return;
    } 
    b(paramCanvas);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (Build.VERSION.SDK_INT >= 14) {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(g.class.getName());
    } 
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    if (Build.VERSION.SDK_INT >= 14) {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(g.class.getName());
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.d == 1) {
      a(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    b(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.d == 1) {
      a(paramInt1, paramInt2);
      return;
    } 
    b(paramInt1, paramInt2);
  }
  
  public void setBaselineAligned(boolean paramBoolean) { this.a = paramBoolean; }
  
  public void setBaselineAlignedChildIndex(int paramInt) {
    if (paramInt < 0 || paramInt >= getChildCount())
      throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")"); 
    this.b = paramInt;
  }
  
  public void setDividerDrawable(Drawable paramDrawable) {
    boolean bool = false;
    if (paramDrawable == this.k)
      return; 
    this.k = paramDrawable;
    if (paramDrawable != null) {
      this.l = paramDrawable.getIntrinsicWidth();
      this.m = paramDrawable.getIntrinsicHeight();
    } else {
      this.l = 0;
      this.m = 0;
    } 
    if (paramDrawable == null)
      bool = true; 
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt) { this.o = paramInt; }
  
  public void setGravity(int paramInt) {
    if (this.e != paramInt) {
      if ((0x800007 & paramInt) == 0)
        paramInt = 0x800003 | paramInt; 
      int i1 = paramInt;
      if ((paramInt & 0x70) == 0)
        i1 = paramInt | 0x30; 
      this.e = i1;
      requestLayout();
    } 
  }
  
  public void setHorizontalGravity(int paramInt) {
    paramInt &= 0x800007;
    if ((this.e & 0x800007) != paramInt) {
      this.e = paramInt | this.e & 0xFF7FFFF8;
      requestLayout();
    } 
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean) { this.h = paramBoolean; }
  
  public void setOrientation(int paramInt) {
    if (this.d != paramInt) {
      this.d = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDividers(int paramInt) {
    if (paramInt != this.n)
      requestLayout(); 
    this.n = paramInt;
  }
  
  public void setVerticalGravity(int paramInt) {
    paramInt &= 0x70;
    if ((this.e & 0x70) != paramInt) {
      this.e = paramInt | this.e & 0xFFFFFF8F;
      requestLayout();
    } 
  }
  
  public void setWeightSum(float paramFloat) { this.g = Math.max(0.0F, paramFloat); }
  
  public boolean shouldDelayChildPressedState() { return false; }
  
  public static class a extends ViewGroup.MarginLayoutParams {
    public float g;
    
    public int h = -1;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.g = 0.0F;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, a.j.LinearLayoutCompat_Layout);
      this.g = typedArray.getFloat(a.j.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.h = typedArray.getInt(a.j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      typedArray.recycle();
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
}
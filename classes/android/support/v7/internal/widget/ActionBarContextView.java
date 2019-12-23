package android.support.v7.internal.widget;

import android.content.Context;
import android.os.Build;
import android.support.v7.b.a;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a {
  private CharSequence g;
  
  private CharSequence h;
  
  private View i;
  
  private View j;
  
  private LinearLayout k;
  
  private TextView l;
  
  private TextView m;
  
  private int n;
  
  private int o;
  
  private boolean p;
  
  private int q;
  
  public ActionBarContextView(Context paramContext) { this(paramContext, null); }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.actionModeStyle); }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    p p1 = p.a(paramContext, paramAttributeSet, a.j.ActionMode, paramInt, 0);
    setBackgroundDrawable(p1.a(a.j.ActionMode_background));
    this.n = p1.g(a.j.ActionMode_titleTextStyle, 0);
    this.o = p1.g(a.j.ActionMode_subtitleTextStyle, 0);
    this.e = p1.f(a.j.ActionMode_height, 0);
    this.q = p1.g(a.j.ActionMode_closeItemLayout, a.g.abc_action_mode_close_item_material);
    p1.b();
  }
  
  private void a() { // Byte code:
    //   0: bipush #8
    //   2: istore #4
    //   4: iconst_1
    //   5: istore_2
    //   6: aload_0
    //   7: getfield k : Landroid/widget/LinearLayout;
    //   10: ifnonnull -> 123
    //   13: aload_0
    //   14: invokevirtual getContext : ()Landroid/content/Context;
    //   17: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   20: getstatic android/support/v7/b/a$g.abc_action_bar_title_item : I
    //   23: aload_0
    //   24: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   27: pop
    //   28: aload_0
    //   29: aload_0
    //   30: aload_0
    //   31: invokevirtual getChildCount : ()I
    //   34: iconst_1
    //   35: isub
    //   36: invokevirtual getChildAt : (I)Landroid/view/View;
    //   39: checkcast android/widget/LinearLayout
    //   42: putfield k : Landroid/widget/LinearLayout;
    //   45: aload_0
    //   46: aload_0
    //   47: getfield k : Landroid/widget/LinearLayout;
    //   50: getstatic android/support/v7/b/a$e.action_bar_title : I
    //   53: invokevirtual findViewById : (I)Landroid/view/View;
    //   56: checkcast android/widget/TextView
    //   59: putfield l : Landroid/widget/TextView;
    //   62: aload_0
    //   63: aload_0
    //   64: getfield k : Landroid/widget/LinearLayout;
    //   67: getstatic android/support/v7/b/a$e.action_bar_subtitle : I
    //   70: invokevirtual findViewById : (I)Landroid/view/View;
    //   73: checkcast android/widget/TextView
    //   76: putfield m : Landroid/widget/TextView;
    //   79: aload_0
    //   80: getfield n : I
    //   83: ifeq -> 101
    //   86: aload_0
    //   87: getfield l : Landroid/widget/TextView;
    //   90: aload_0
    //   91: invokevirtual getContext : ()Landroid/content/Context;
    //   94: aload_0
    //   95: getfield n : I
    //   98: invokevirtual setTextAppearance : (Landroid/content/Context;I)V
    //   101: aload_0
    //   102: getfield o : I
    //   105: ifeq -> 123
    //   108: aload_0
    //   109: getfield m : Landroid/widget/TextView;
    //   112: aload_0
    //   113: invokevirtual getContext : ()Landroid/content/Context;
    //   116: aload_0
    //   117: getfield o : I
    //   120: invokevirtual setTextAppearance : (Landroid/content/Context;I)V
    //   123: aload_0
    //   124: getfield l : Landroid/widget/TextView;
    //   127: aload_0
    //   128: getfield g : Ljava/lang/CharSequence;
    //   131: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   134: aload_0
    //   135: getfield m : Landroid/widget/TextView;
    //   138: aload_0
    //   139: getfield h : Ljava/lang/CharSequence;
    //   142: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   145: aload_0
    //   146: getfield g : Ljava/lang/CharSequence;
    //   149: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   152: ifne -> 229
    //   155: iconst_1
    //   156: istore_1
    //   157: aload_0
    //   158: getfield h : Ljava/lang/CharSequence;
    //   161: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   164: ifne -> 234
    //   167: aload_0
    //   168: getfield m : Landroid/widget/TextView;
    //   171: astore #5
    //   173: iload_2
    //   174: ifeq -> 239
    //   177: iconst_0
    //   178: istore_3
    //   179: aload #5
    //   181: iload_3
    //   182: invokevirtual setVisibility : (I)V
    //   185: aload_0
    //   186: getfield k : Landroid/widget/LinearLayout;
    //   189: astore #5
    //   191: iload_1
    //   192: ifne -> 202
    //   195: iload #4
    //   197: istore_1
    //   198: iload_2
    //   199: ifeq -> 204
    //   202: iconst_0
    //   203: istore_1
    //   204: aload #5
    //   206: iload_1
    //   207: invokevirtual setVisibility : (I)V
    //   210: aload_0
    //   211: getfield k : Landroid/widget/LinearLayout;
    //   214: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   217: ifnonnull -> 228
    //   220: aload_0
    //   221: aload_0
    //   222: getfield k : Landroid/widget/LinearLayout;
    //   225: invokevirtual addView : (Landroid/view/View;)V
    //   228: return
    //   229: iconst_0
    //   230: istore_1
    //   231: goto -> 157
    //   234: iconst_0
    //   235: istore_2
    //   236: goto -> 167
    //   239: bipush #8
    //   241: istore_3
    //   242: goto -> 179 }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() { return new ViewGroup.MarginLayoutParams(-1, -2); }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) { return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet); }
  
  public CharSequence getSubtitle() { return this.h; }
  
  public CharSequence getTitle() { return this.g; }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.d != null) {
      this.d.e();
      this.d.g();
    } 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (Build.VERSION.SDK_INT >= 14) {
      if (paramAccessibilityEvent.getEventType() == 32) {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.g);
        return;
      } 
    } else {
      return;
    } 
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i1;
    paramBoolean = r.a(this);
    if (paramBoolean) {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i1 = getPaddingLeft();
    } 
    int i2 = getPaddingTop();
    int i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    if (this.i != null && this.i.getVisibility() != 8) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
      if (paramBoolean) {
        paramInt2 = marginLayoutParams.rightMargin;
      } else {
        paramInt2 = marginLayoutParams.leftMargin;
      } 
      if (paramBoolean) {
        paramInt4 = marginLayoutParams.leftMargin;
      } else {
        paramInt4 = marginLayoutParams.rightMargin;
      } 
      paramInt2 = a(i1, paramInt2, paramBoolean);
      paramInt2 = a(a(this.i, paramInt2, i2, i3, paramBoolean) + paramInt2, paramInt4, paramBoolean);
    } else {
      paramInt2 = i1;
    } 
    paramInt4 = paramInt2;
    if (this.k != null) {
      paramInt4 = paramInt2;
      if (this.j == null) {
        paramInt4 = paramInt2;
        if (this.k.getVisibility() != 8)
          paramInt4 = paramInt2 + a(this.k, paramInt2, i2, i3, paramBoolean); 
      } 
    } 
    if (this.j != null)
      a(this.j, paramInt4, i2, i3, paramBoolean); 
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    } 
    if (this.c != null) {
      ActionMenuView actionMenuView = this.c;
      if (!paramBoolean) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      } 
      a(actionMenuView, paramInt1, i2, i3, paramBoolean);
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int i1;
    int i3 = 1073741824;
    int i4 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)"); 
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\""); 
    int i6 = View.MeasureSpec.getSize(paramInt1);
    if (this.e > 0) {
      i1 = this.e;
    } else {
      i1 = View.MeasureSpec.getSize(paramInt2);
    } 
    int i7 = getPaddingTop() + getPaddingBottom();
    paramInt1 = i6 - getPaddingLeft() - getPaddingRight();
    int i5 = i1 - i7;
    int i2 = View.MeasureSpec.makeMeasureSpec(i5, -2147483648);
    paramInt2 = paramInt1;
    if (this.i != null) {
      paramInt1 = a(this.i, paramInt1, i2, 0);
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
      paramInt2 = marginLayoutParams.leftMargin;
      paramInt2 = paramInt1 - marginLayoutParams.rightMargin + paramInt2;
    } 
    paramInt1 = paramInt2;
    if (this.c != null) {
      paramInt1 = paramInt2;
      if (this.c.getParent() == this)
        paramInt1 = a(this.c, paramInt2, i2, 0); 
    } 
    paramInt2 = paramInt1;
    if (this.k != null) {
      paramInt2 = paramInt1;
      if (this.j == null)
        if (this.p) {
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.k.measure(paramInt2, i2);
          int i8 = this.k.getMeasuredWidth();
          if (i8 <= paramInt1) {
            i2 = 1;
          } else {
            i2 = 0;
          } 
          paramInt2 = paramInt1;
          if (i2 != 0)
            paramInt2 = paramInt1 - i8; 
          LinearLayout linearLayout = this.k;
          if (i2 != 0) {
            paramInt1 = 0;
          } else {
            paramInt1 = 8;
          } 
          linearLayout.setVisibility(paramInt1);
        } else {
          paramInt2 = a(this.k, paramInt1, i2, 0);
        }  
    } 
    if (this.j != null) {
      ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
      if (layoutParams.width != -2) {
        paramInt1 = 1073741824;
      } else {
        paramInt1 = Integer.MIN_VALUE;
      } 
      i2 = paramInt2;
      if (layoutParams.width >= 0)
        i2 = Math.min(layoutParams.width, paramInt2); 
      if (layoutParams.height != -2) {
        paramInt2 = i3;
      } else {
        paramInt2 = Integer.MIN_VALUE;
      } 
      if (layoutParams.height >= 0) {
        i3 = Math.min(layoutParams.height, i5);
      } else {
        i3 = i5;
      } 
      this.j.measure(View.MeasureSpec.makeMeasureSpec(i2, paramInt1), View.MeasureSpec.makeMeasureSpec(i3, paramInt2));
    } 
    if (this.e <= 0) {
      i2 = getChildCount();
      paramInt1 = 0;
      for (paramInt2 = i4; paramInt2 < i2; paramInt2++) {
        i1 = getChildAt(paramInt2).getMeasuredHeight() + i7;
        if (i1 > paramInt1)
          paramInt1 = i1; 
      } 
      setMeasuredDimension(i6, paramInt1);
      return;
    } 
    setMeasuredDimension(i6, i1);
  }
  
  public void setContentHeight(int paramInt) { this.e = paramInt; }
  
  public void setCustomView(View paramView) {
    if (this.j != null)
      removeView(this.j); 
    this.j = paramView;
    if (paramView != null && this.k != null) {
      removeView(this.k);
      this.k = null;
    } 
    if (paramView != null)
      addView(paramView); 
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.h = paramCharSequence;
    a();
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.g = paramCharSequence;
    a();
  }
  
  public void setTitleOptional(boolean paramBoolean) {
    if (paramBoolean != this.p)
      requestLayout(); 
    this.p = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() { return false; }
}

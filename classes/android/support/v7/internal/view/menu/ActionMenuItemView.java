package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.h.l;
import android.support.v7.b.a;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.f;
import android.support.v7.widget.h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class ActionMenuItemView extends f implements k.a, ActionMenuView.a, View.OnClickListener, View.OnLongClickListener {
  private f a;
  
  private CharSequence b;
  
  private Drawable c;
  
  private e.b d;
  
  private h.b e;
  
  private b f;
  
  private boolean g;
  
  private boolean h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  public ActionMenuItemView(Context paramContext) { this(paramContext, null); }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Resources resources = paramContext.getResources();
    this.g = resources.getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ActionMenuItemView, paramInt, 0);
    this.i = typedArray.getDimensionPixelSize(a.j.ActionMenuItemView_android_minWidth, 0);
    typedArray.recycle();
    this.k = (int)((resources.getDisplayMetrics()).density * 32.0F + 0.5F);
    setOnClickListener(this);
    setOnLongClickListener(this);
    this.j = -1;
  }
  
  private void e() { // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: getfield b : Ljava/lang/CharSequence;
    //   6: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   9: ifne -> 70
    //   12: iconst_1
    //   13: istore_1
    //   14: aload_0
    //   15: getfield c : Landroid/graphics/drawable/Drawable;
    //   18: ifnull -> 49
    //   21: iload_3
    //   22: istore_2
    //   23: aload_0
    //   24: getfield a : Landroid/support/v7/internal/view/menu/f;
    //   27: invokevirtual m : ()Z
    //   30: ifeq -> 51
    //   33: aload_0
    //   34: getfield g : Z
    //   37: ifne -> 49
    //   40: iload_3
    //   41: istore_2
    //   42: aload_0
    //   43: getfield h : Z
    //   46: ifeq -> 51
    //   49: iconst_1
    //   50: istore_2
    //   51: iload_1
    //   52: iload_2
    //   53: iand
    //   54: ifeq -> 75
    //   57: aload_0
    //   58: getfield b : Ljava/lang/CharSequence;
    //   61: astore #4
    //   63: aload_0
    //   64: aload #4
    //   66: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   69: return
    //   70: iconst_0
    //   71: istore_1
    //   72: goto -> 14
    //   75: aconst_null
    //   76: astore #4
    //   78: goto -> 63 }
  
  public void a(f paramf, int paramInt) {
    this.a = paramf;
    setIcon(paramf.getIcon());
    setTitle(paramf.a(this));
    setId(paramf.getItemId());
    if (paramf.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setEnabled(paramf.isEnabled());
    if (paramf.hasSubMenu() && this.e == null)
      this.e = new a(this); 
  }
  
  public boolean a() { return true; }
  
  public boolean b() { return !TextUtils.isEmpty(getText()); }
  
  public boolean c() { return (b() && this.a.getIcon() == null); }
  
  public boolean d() { return b(); }
  
  public f getItemData() { return this.a; }
  
  public void onClick(View paramView) {
    if (this.d != null)
      this.d.a(this.a); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    this.g = getContext().getResources().getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    e();
  }
  
  public boolean onLongClick(View paramView) {
    if (b())
      return false; 
    int[] arrayOfInt = new int[2];
    Rect rect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(rect);
    Context context = getContext();
    int m = getWidth();
    int i1 = getHeight();
    int i2 = arrayOfInt[1];
    int i3 = i1 / 2;
    int n = arrayOfInt[0];
    n = m / 2 + n;
    m = n;
    if (l.a(paramView) == 0)
      m = (context.getResources().getDisplayMetrics()).widthPixels - n; 
    Toast toast = Toast.makeText(context, this.a.getTitle(), 0);
    if (i2 + i3 < rect.height()) {
      toast.setGravity(8388661, m, arrayOfInt[1] + i1 - rect.top);
      toast.show();
      return true;
    } 
    toast.setGravity(81, 0, i1);
    toast.show();
    return true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool = b();
    if (bool && this.j >= 0)
      super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
    super.onMeasure(paramInt1, paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int n = getMeasuredWidth();
    if (m == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, this.i);
    } else {
      paramInt1 = this.i;
    } 
    if (m != 1073741824 && this.i > 0 && n < paramInt1)
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2); 
    if (!bool && this.c != null)
      super.setPadding((getMeasuredWidth() - this.c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) { return (this.a.hasSubMenu() && this.e != null && this.e.onTouch(this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent); }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean) {
    if (this.h != paramBoolean) {
      this.h = paramBoolean;
      if (this.a != null)
        this.a.h(); 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.c = paramDrawable;
    if (paramDrawable != null) {
      int i2 = paramDrawable.getIntrinsicWidth();
      int i1 = paramDrawable.getIntrinsicHeight();
      int n = i1;
      int m = i2;
      if (i2 > this.k) {
        float f1 = this.k / i2;
        m = this.k;
        n = (int)(i1 * f1);
      } 
      i2 = n;
      i1 = m;
      if (n > this.k) {
        float f1 = this.k / n;
        i2 = this.k;
        i1 = (int)(m * f1);
      } 
      paramDrawable.setBounds(0, 0, i1, i2);
    } 
    setCompoundDrawables(paramDrawable, null, null, null);
    e();
  }
  
  public void setItemInvoker(e.b paramb) { this.d = paramb; }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.j = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb) { this.f = paramb; }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.b = paramCharSequence;
    setContentDescription(this.b);
    e();
  }
  
  private class a extends h.b {
    public a(ActionMenuItemView this$0) { super(this$0); }
    
    public h a() { return (ActionMenuItemView.a(this.a) != null) ? ActionMenuItemView.a(this.a).a() : null; }
    
    protected boolean b() {
      byte b1 = 0;
      int i = b1;
      if (ActionMenuItemView.b(this.a) != null) {
        i = b1;
        if (ActionMenuItemView.b(this.a).a(ActionMenuItemView.c(this.a))) {
          h h = a();
          i = b1;
          if (h != null) {
            i = b1;
            if (h.k())
              i = 1; 
          } 
        } 
      } 
      return i;
    }
  }
  
  public static abstract class b {
    public abstract h a();
  }
}
package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.h.k;
import android.support.v7.b.a;
import android.support.v7.internal.widget.m;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.p;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class b extends AutoCompleteTextView implements k {
  private static final int[] a = { 16843126 };
  
  private o b;
  
  private c c;
  
  private e d;
  
  public b(Context paramContext) { this(paramContext, null); }
  
  public b(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, a.a.autoCompleteTextViewStyle); }
  
  public b(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(m.a(paramContext), paramAttributeSet, paramInt);
    p p = p.a(getContext(), paramAttributeSet, a, paramInt, 0);
    this.b = p.c();
    if (p.d(0))
      setDropDownBackgroundDrawable(p.a(0)); 
    p.b();
    this.c = new c(this, this.b);
    this.c.a(paramAttributeSet, paramInt);
    this.d = new e(this);
    this.d.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    if (this.c != null)
      this.c.c(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() { return (this.c != null) ? this.c.a() : null; }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() { return (this.c != null) ? this.c.b() : null; }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    if (this.c != null)
      this.c.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    if (this.c != null)
      this.c.a(paramInt); 
  }
  
  public void setDropDownBackgroundResource(int paramInt) {
    if (this.b != null) {
      setDropDownBackgroundDrawable(this.b.a(paramInt));
      return;
    } 
    super.setDropDownBackgroundResource(paramInt);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.c != null)
      this.c.a(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.c != null)
      this.c.a(paramMode); 
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (this.d != null)
      this.d.a(paramContext, paramInt); 
  }
}
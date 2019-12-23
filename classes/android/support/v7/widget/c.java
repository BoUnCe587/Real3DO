package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.h.l;
import android.support.v7.b.a;
import android.support.v7.c.a.a;
import android.support.v7.internal.widget.n;
import android.support.v7.internal.widget.o;
import android.util.AttributeSet;
import android.view.View;

class c {
  private final View a;
  
  private final o b;
  
  private n c;
  
  private n d;
  
  c(View paramView, o paramo) {
    this.a = paramView;
    this.b = paramo;
  }
  
  ColorStateList a() { return (this.d != null) ? this.d.a : null; }
  
  void a(int paramInt) {
    ColorStateList colorStateList;
    if (this.b != null) {
      colorStateList = this.b.c(paramInt);
    } else {
      colorStateList = null;
    } 
    b(colorStateList);
  }
  
  void a(ColorStateList paramColorStateList) {
    if (this.d == null)
      this.d = new n(); 
    this.d.a = paramColorStateList;
    this.d.d = true;
    c();
  }
  
  void a(PorterDuff.Mode paramMode) {
    if (this.d == null)
      this.d = new n(); 
    this.d.b = paramMode;
    this.d.c = true;
    c();
  }
  
  void a(Drawable paramDrawable) { b(null); }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    typedArray = this.a.getContext().obtainStyledAttributes(paramAttributeSet, a.j.ViewBackgroundHelper, paramInt, 0);
    try {
      if (typedArray.hasValue(a.j.ViewBackgroundHelper_android_background)) {
        ColorStateList colorStateList = this.b.c(typedArray.getResourceId(a.j.ViewBackgroundHelper_android_background, -1));
        if (colorStateList != null)
          b(colorStateList); 
      } 
      if (typedArray.hasValue(a.j.ViewBackgroundHelper_backgroundTint))
        l.a(this.a, typedArray.getColorStateList(a.j.ViewBackgroundHelper_backgroundTint)); 
      if (typedArray.hasValue(a.j.ViewBackgroundHelper_backgroundTintMode))
        l.a(this.a, a.a(typedArray.getInt(a.j.ViewBackgroundHelper_backgroundTintMode, -1), null)); 
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  PorterDuff.Mode b() { return (this.d != null) ? this.d.b : null; }
  
  void b(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      if (this.c == null)
        this.c = new n(); 
      this.c.a = paramColorStateList;
      this.c.d = true;
    } else {
      this.c = null;
    } 
    c();
  }
  
  void c() {
    if (this.a.getBackground() != null) {
      if (this.d != null) {
        o.a(this.a, this.d);
        return;
      } 
    } else {
      return;
    } 
    if (this.c != null) {
      o.a(this.a, this.c);
      return;
    } 
  }
}
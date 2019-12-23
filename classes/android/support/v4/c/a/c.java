package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

class c {
  public static Drawable a(Drawable paramDrawable) {
    Drawable drawable = paramDrawable;
    if (!(paramDrawable instanceof h))
      drawable = new h(paramDrawable); 
    return drawable;
  }
  
  public static void a(Drawable paramDrawable, int paramInt) {
    if (paramDrawable instanceof g)
      ((g)paramDrawable).setTint(paramInt); 
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList) {
    if (paramDrawable instanceof g)
      ((g)paramDrawable).setTintList(paramColorStateList); 
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode) {
    if (paramDrawable instanceof g)
      ((g)paramDrawable).setTintMode(paramMode); 
  }
}

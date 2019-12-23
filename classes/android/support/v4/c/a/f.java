package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

class f {
  public static Drawable a(Drawable paramDrawable) {
    if (!(paramDrawable instanceof android.graphics.drawable.GradientDrawable)) {
      Drawable drawable = paramDrawable;
      return (paramDrawable instanceof android.graphics.drawable.DrawableContainer) ? new k(paramDrawable) : drawable;
    } 
    return new k(paramDrawable);
  }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) { paramDrawable.setHotspot(paramFloat1, paramFloat2); }
  
  public static void a(Drawable paramDrawable, int paramInt) {
    if (paramDrawable instanceof k) {
      c.a(paramDrawable, paramInt);
      return;
    } 
    paramDrawable.setTint(paramInt);
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4); }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList) {
    if (paramDrawable instanceof k) {
      c.a(paramDrawable, paramColorStateList);
      return;
    } 
    paramDrawable.setTintList(paramColorStateList);
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode) {
    if (paramDrawable instanceof k) {
      c.a(paramDrawable, paramMode);
      return;
    } 
    paramDrawable.setTintMode(paramMode);
  }
}

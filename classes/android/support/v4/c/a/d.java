package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

class d {
  public static void a(Drawable paramDrawable) { paramDrawable.jumpToCurrentState(); }
  
  public static Drawable b(Drawable paramDrawable) {
    Drawable drawable = paramDrawable;
    if (!(paramDrawable instanceof i))
      drawable = new i(paramDrawable); 
    return drawable;
  }
}
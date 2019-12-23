package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

class e {
  public static void a(Drawable paramDrawable, boolean paramBoolean) { paramDrawable.setAutoMirrored(paramBoolean); }
  
  public static boolean a(Drawable paramDrawable) { return paramDrawable.isAutoMirrored(); }
  
  public static Drawable b(Drawable paramDrawable) {
    Drawable drawable = paramDrawable;
    if (!(paramDrawable instanceof j))
      drawable = new j(paramDrawable); 
    return drawable;
  }
}
package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import java.lang.reflect.Field;

class m {
  private static Field a;
  
  private static boolean b;
  
  static int a(View paramView) {
    if (!b) {
      try {
        a = View.class.getDeclaredField("mMinHeight");
        a.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      b = true;
    } 
    if (a != null)
      try {
        return ((Integer)a.get(paramView)).intValue();
      } catch (Exception paramView) {} 
    return 0;
  }
  
  static void a(View paramView, ColorStateList paramColorStateList) {
    if (paramView instanceof k)
      ((k)paramView).setSupportBackgroundTintList(paramColorStateList); 
  }
  
  static void a(View paramView, PorterDuff.Mode paramMode) {
    if (paramView instanceof k)
      ((k)paramView).setSupportBackgroundTintMode(paramMode); 
  }
  
  static boolean b(View paramView) { return (paramView.getWindowToken() != null); }
}
package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;

class r {
  public static void a(View paramView) { paramView.requestApplyInsets(); }
  
  static void a(View paramView, ColorStateList paramColorStateList) { paramView.setBackgroundTintList(paramColorStateList); }
  
  static void a(View paramView, PorterDuff.Mode paramMode) { paramView.setBackgroundTintMode(paramMode); }
}

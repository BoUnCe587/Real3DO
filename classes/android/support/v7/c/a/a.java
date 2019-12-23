package android.support.v7.c.a;

import android.graphics.PorterDuff;
import android.os.Build;

public class a {
  public static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode) {
    switch (paramInt) {
      default:
        return paramMode;
      case 3:
        return PorterDuff.Mode.SRC_OVER;
      case 5:
        return PorterDuff.Mode.SRC_IN;
      case 9:
        return PorterDuff.Mode.SRC_ATOP;
      case 14:
        return PorterDuff.Mode.MULTIPLY;
      case 15:
        return PorterDuff.Mode.SCREEN;
      case 16:
        break;
    } 
    if (Build.VERSION.SDK_INT >= 11)
      return PorterDuff.Mode.valueOf("ADD"); 
  }
}
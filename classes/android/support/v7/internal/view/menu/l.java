package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.v4.d.a.b;
import android.support.v4.d.a.c;
import android.view.MenuItem;
import android.view.SubMenu;

public final class l {
  public static MenuItem a(Context paramContext, b paramb) {
    if (Build.VERSION.SDK_INT >= 16)
      return new h(paramContext, paramb); 
    if (Build.VERSION.SDK_INT >= 14)
      return new g(paramContext, paramb); 
    throw new UnsupportedOperationException();
  }
  
  public static SubMenu a(Context paramContext, c paramc) {
    if (Build.VERSION.SDK_INT >= 14)
      return new o(paramContext, paramc); 
    throw new UnsupportedOperationException();
  }
}
package android.support.v4.h;

import android.view.MenuItem;
import android.view.View;

class g {
  public static MenuItem a(MenuItem paramMenuItem, View paramView) { return paramMenuItem.setActionView(paramView); }
  
  public static void a(MenuItem paramMenuItem, int paramInt) { paramMenuItem.setShowAsAction(paramInt); }
  
  public static MenuItem b(MenuItem paramMenuItem, int paramInt) { return paramMenuItem.setActionView(paramInt); }
}

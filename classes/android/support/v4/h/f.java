package android.support.v4.h;

import android.os.Build;
import android.support.v4.d.a.b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class f {
  static final d a;
  
  static  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14) {
      a = new c();
      return;
    } 
    if (i >= 11) {
      a = new b();
      return;
    } 
    a = new a();
  }
  
  public static MenuItem a(MenuItem paramMenuItem, a parama) {
    if (paramMenuItem instanceof b)
      return ((b)paramMenuItem).a(parama); 
    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    return paramMenuItem;
  }
  
  public static MenuItem a(MenuItem paramMenuItem, View paramView) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).setActionView(paramView) : a.a(paramMenuItem, paramView); }
  
  public static void a(MenuItem paramMenuItem, int paramInt) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setShowAsAction(paramInt);
      return;
    } 
    a.a(paramMenuItem, paramInt);
  }
  
  public static boolean a(MenuItem paramMenuItem) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).expandActionView() : a.a(paramMenuItem); }
  
  public static MenuItem b(MenuItem paramMenuItem, int paramInt) { return (paramMenuItem instanceof b) ? ((b)paramMenuItem).setActionView(paramInt) : a.b(paramMenuItem, paramInt); }
  
  static class a implements d {
    public MenuItem a(MenuItem param1MenuItem, View param1View) { return param1MenuItem; }
    
    public void a(MenuItem param1MenuItem, int param1Int) {}
    
    public boolean a(MenuItem param1MenuItem) { return false; }
    
    public MenuItem b(MenuItem param1MenuItem, int param1Int) { return param1MenuItem; }
  }
  
  static class b implements d {
    public MenuItem a(MenuItem param1MenuItem, View param1View) { return g.a(param1MenuItem, param1View); }
    
    public void a(MenuItem param1MenuItem, int param1Int) { g.a(param1MenuItem, param1Int); }
    
    public boolean a(MenuItem param1MenuItem) { return false; }
    
    public MenuItem b(MenuItem param1MenuItem, int param1Int) { return g.b(param1MenuItem, param1Int); }
  }
  
  static class c extends b {
    public boolean a(MenuItem param1MenuItem) { return h.a(param1MenuItem); }
  }
  
  static interface d {
    MenuItem a(MenuItem param1MenuItem, View param1View);
    
    void a(MenuItem param1MenuItem, int param1Int);
    
    boolean a(MenuItem param1MenuItem);
    
    MenuItem b(MenuItem param1MenuItem, int param1Int);
  }
  
  public static interface e {
    boolean a(MenuItem param1MenuItem);
    
    boolean b(MenuItem param1MenuItem);
  }
}
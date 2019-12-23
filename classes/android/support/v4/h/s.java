package android.support.v4.h;

import android.os.Build;
import android.view.ViewConfiguration;

public class s {
  static final e a;
  
  static  {
    if (Build.VERSION.SDK_INT >= 14) {
      a = new d();
      return;
    } 
    if (Build.VERSION.SDK_INT >= 11) {
      a = new c();
      return;
    } 
    if (Build.VERSION.SDK_INT >= 8) {
      a = new b();
      return;
    } 
    a = new a();
  }
  
  public static boolean a(ViewConfiguration paramViewConfiguration) { return a.a(paramViewConfiguration); }
  
  static class a implements e {
    public boolean a(ViewConfiguration param1ViewConfiguration) { return true; }
  }
  
  static class b extends a {}
  
  static class c extends b {
    public boolean a(ViewConfiguration param1ViewConfiguration) { return false; }
  }
  
  static class d extends c {
    public boolean a(ViewConfiguration param1ViewConfiguration) { return t.a(param1ViewConfiguration); }
  }
  
  static interface e {
    boolean a(ViewConfiguration param1ViewConfiguration);
  }
}
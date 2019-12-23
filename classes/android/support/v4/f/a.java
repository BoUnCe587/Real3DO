package android.support.v4.f;

import android.os.Build;
import java.util.Locale;

public class a {
  private static final a a;
  
  static  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      a = new d();
      return;
    } 
    if (i >= 14) {
      a = new c();
      return;
    } 
    a = new b();
  }
  
  public static String a(Locale paramLocale) { return a.a(paramLocale); }
  
  static interface a {
    String a(Locale param1Locale);
  }
  
  static class b implements a {
    public String a(Locale param1Locale) { return null; }
  }
  
  static class c implements a {
    public String a(Locale param1Locale) { return c.a(param1Locale); }
  }
  
  static class d implements a {
    public String a(Locale param1Locale) { return b.a(param1Locale); }
  }
}

package android.support.v4.h;

import android.os.Build;

public class b {
  static final a a;
  
  static  {
    if (Build.VERSION.SDK_INT >= 17) {
      a = new c();
      return;
    } 
    a = new b();
  }
  
  public static int a(int paramInt1, int paramInt2) { return a.a(paramInt1, paramInt2); }
  
  static interface a {
    int a(int param1Int1, int param1Int2);
  }
  
  static class b implements a {
    public int a(int param1Int1, int param1Int2) { return 0xFF7FFFFF & param1Int1; }
  }
  
  static class c implements a {
    public int a(int param1Int1, int param1Int2) { return c.a(param1Int1, param1Int2); }
  }
}

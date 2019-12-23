package android.support.v4.h;

import android.os.Build;
import android.view.ViewGroup;

public class d {
  static final a a;
  
  static  {
    if (Build.VERSION.SDK_INT >= 17) {
      a = new c();
      return;
    } 
    a = new b();
  }
  
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams) { return a.a(paramMarginLayoutParams); }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams) { return a.b(paramMarginLayoutParams); }
  
  static interface a {
    int a(ViewGroup.MarginLayoutParams param1MarginLayoutParams);
    
    int b(ViewGroup.MarginLayoutParams param1MarginLayoutParams);
  }
  
  static class b implements a {
    public int a(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return param1MarginLayoutParams.leftMargin; }
    
    public int b(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return param1MarginLayoutParams.rightMargin; }
  }
  
  static class c implements a {
    public int a(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return e.a(param1MarginLayoutParams); }
    
    public int b(ViewGroup.MarginLayoutParams param1MarginLayoutParams) { return e.b(param1MarginLayoutParams); }
  }
}
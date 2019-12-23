package android.support.v4.h;

import android.os.Build;
import android.view.MotionEvent;

public class i {
  static final e a;
  
  static  {
    if (Build.VERSION.SDK_INT >= 12) {
      a = new d();
      return;
    } 
    if (Build.VERSION.SDK_INT >= 9) {
      a = new c();
      return;
    } 
    if (Build.VERSION.SDK_INT >= 5) {
      a = new b();
      return;
    } 
    a = new a();
  }
  
  public static int a(MotionEvent paramMotionEvent) { return paramMotionEvent.getAction() & 0xFF; }
  
  static class a implements e {}
  
  static class b extends a {}
  
  static class c extends b {}
  
  static class d extends c {}
  
  static interface e {}
}

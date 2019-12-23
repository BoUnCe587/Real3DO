package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.h.l;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

public class r {
  private static Method a;
  
  static  {
    if (Build.VERSION.SDK_INT >= 18)
      try {
        a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
        if (!a.isAccessible())
          a.setAccessible(true); 
        return;
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        return;
      }  
  }
  
  public static int a(int paramInt1, int paramInt2) { return paramInt1 | paramInt2; }
  
  public static void a(View paramView, Rect paramRect1, Rect paramRect2) {
    if (a != null)
      try {
        a.invoke(paramView, new Object[] { paramRect1, paramRect2 });
        return;
      } catch (Exception paramView) {
        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", paramView);
        return;
      }  
  }
  
  public static boolean a(View paramView) { return (l.a(paramView) == 1); }
}

package android.support.v4.f;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class b {
  private static Method a;
  
  static  {
    try {
      a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      return;
    } catch (Exception exception) {
      throw new IllegalStateException(exception);
    } 
  }
  
  public static String a(Locale paramLocale) {
    try {
      return ((Locale)a.invoke(null, new Object[] { paramLocale })).getScript();
    } catch (InvocationTargetException invocationTargetException) {
      Log.w("ICUCompatIcs", invocationTargetException);
    } catch (IllegalAccessException illegalAccessException) {
      Log.w("ICUCompatIcs", illegalAccessException);
    } 
    return paramLocale.getScript();
  }
}

package android.support.v4.f;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

class c {
  private static Method a;
  
  private static Method b;
  
  static  {
    try {
      Class clazz = Class.forName("libcore.icu.ICU");
      if (clazz != null) {
        a = clazz.getMethod("getScript", new Class[] { String.class });
        b = clazz.getMethod("addLikelySubtags", new Class[] { String.class });
      } 
      return;
    } catch (Exception exception) {
      a = null;
      b = null;
      Log.w("ICUCompatIcs", exception);
      return;
    } 
  }
  
  private static String a(String paramString) {
    try {
      if (a != null)
        return (String)a.invoke(null, new Object[] { paramString }); 
    } catch (IllegalAccessException paramString) {
      Log.w("ICUCompatIcs", paramString);
    } catch (InvocationTargetException paramString) {
      Log.w("ICUCompatIcs", paramString);
    } 
    return null;
  }
  
  public static String a(Locale paramLocale) {
    String str = b(paramLocale);
    return (str != null) ? a(str) : null;
  }
  
  private static String b(Locale paramLocale) {
    String str = paramLocale.toString();
    try {
      if (b != null)
        return (String)b.invoke(null, new Object[] { str }); 
    } catch (IllegalAccessException illegalAccessException) {
      Log.w("ICUCompatIcs", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      Log.w("ICUCompatIcs", invocationTargetException);
    } 
    return str;
  }
}


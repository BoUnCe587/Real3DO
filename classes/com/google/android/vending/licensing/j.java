package com.google.android.vending.licensing;

import android.content.SharedPreferences;
import android.util.Log;

public class j {
  private final SharedPreferences a;
  
  private final h b;
  
  private SharedPreferences.Editor c;
  
  public j(SharedPreferences paramSharedPreferences, h paramh) {
    this.a = paramSharedPreferences;
    this.b = paramh;
    this.c = null;
  }
  
  public void a() {
    if (this.c != null) {
      this.c.commit();
      this.c = null;
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (this.c == null)
      this.c = this.a.edit(); 
    paramString2 = this.b.a(paramString2, paramString1);
    this.c.putString(paramString1, paramString2);
  }
  
  public String b(String paramString1, String paramString2) {
    String str2 = this.a.getString(paramString1, null);
    str1 = paramString2;
    if (str2 != null)
      try {
        return this.b.b(str2, paramString1);
      } catch (m str1) {
        Log.w("PreferenceObfuscator", "Validation error while reading preference: " + paramString1);
        return paramString2;
      }  
    return str1;
  }
}
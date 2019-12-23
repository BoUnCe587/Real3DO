package com.google.android.vending.licensing;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class k {
  public int a;
  
  public int b;
  
  public String c;
  
  public String d;
  
  public String e;
  
  public long f;
  
  public String g;
  
  public static k a(String paramString) {
    String str;
    int i = paramString.indexOf(':');
    if (-1 == i) {
      String str1 = "";
      str = paramString;
      paramString = str1;
    } else {
      str = paramString.substring(0, i);
      if (i >= paramString.length()) {
        paramString = "";
      } else {
        paramString = paramString.substring(i + 1);
      } 
    } 
    String[] arrayOfString = TextUtils.split(str, Pattern.quote("|"));
    if (arrayOfString.length < 6)
      throw new IllegalArgumentException("Wrong number of fields."); 
    k k1 = new k();
    k1.g = paramString;
    k1.a = Integer.parseInt(arrayOfString[0]);
    k1.b = Integer.parseInt(arrayOfString[1]);
    k1.c = arrayOfString[2];
    k1.d = arrayOfString[3];
    k1.e = arrayOfString[4];
    k1.f = Long.parseLong(arrayOfString[5]);
    return k1;
  }
  
  public String toString() { return TextUtils.join("|", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, Long.valueOf(this.f) }); }
}
package com.google.android.vending.licensing;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class l implements i {
  private long a;
  
  private long b;
  
  private long c;
  
  private long d;
  
  private long e = 0L;
  
  private int f;
  
  private j g;
  
  public l(Context paramContext, h paramh) {
    this.g = new j(paramContext.getSharedPreferences("com.android.vending.licensing.ServerManagedPolicy", 0), paramh);
    this.f = Integer.parseInt(this.g.b("lastResponse", Integer.toString(291)));
    this.a = Long.parseLong(this.g.b("validityTimestamp", "0"));
    this.b = Long.parseLong(this.g.b("retryUntil", "0"));
    this.c = Long.parseLong(this.g.b("maxRetries", "0"));
    this.d = Long.parseLong(this.g.b("retryCount", "0"));
  }
  
  private void a(int paramInt) {
    this.e = System.currentTimeMillis();
    this.f = paramInt;
    this.g.a("lastResponse", Integer.toString(paramInt));
  }
  
  private void a(long paramLong) {
    this.d = paramLong;
    this.g.a("retryCount", Long.toString(paramLong));
  }
  
  private void a(String paramString) {
    String str;
    Long long;
    try {
      long l1 = Long.parseLong(paramString);
      Long long1 = Long.valueOf(l1);
      str = paramString;
      long = long1;
    } catch (NumberFormatException paramString) {
      Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
      str = (long = Long.valueOf(System.currentTimeMillis() + 60000L)).toString(long.longValue());
    } 
    this.a = long.longValue();
    this.g.a("validityTimestamp", str);
  }
  
  private void b(String paramString) {
    String str;
    Long long;
    try {
      long l1 = Long.parseLong(paramString);
      Long long1 = Long.valueOf(l1);
      str = paramString;
      long = long1;
    } catch (NumberFormatException paramString) {
      Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
      str = "0";
      long = Long.valueOf(0L);
    } 
    this.b = long.longValue();
    this.g.a("retryUntil", str);
  }
  
  private void c(String paramString) {
    String str;
    Long long;
    try {
      long l1 = Long.parseLong(paramString);
      Long long1 = Long.valueOf(l1);
      str = paramString;
      long = long1;
    } catch (NumberFormatException paramString) {
      Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
      str = "0";
      long = Long.valueOf(0L);
    } 
    this.c = long.longValue();
    this.g.a("maxRetries", str);
  }
  
  private Map<String, String> d(String paramString) {
    HashMap hashMap = new HashMap();
    try {
      for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI("?" + paramString), "UTF-8"))
        hashMap.put(nameValuePair.getName(), nameValuePair.getValue()); 
    } catch (URISyntaxException paramString) {
      Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
    } 
    return hashMap;
  }
  
  public void a(int paramInt, k paramk) {
    if (paramInt != 291) {
      a(0L);
    } else {
      a(this.d + 1L);
    } 
    if (paramInt == 256) {
      Map map = d(paramk.g);
      this.f = paramInt;
      a((String)map.get("VT"));
      b((String)map.get("GT"));
      c((String)map.get("GR"));
    } else if (paramInt == 561) {
      a("0");
      b("0");
      c("0");
    } 
    a(paramInt);
    this.g.a();
  }
  
  public boolean a() {
    long l1 = System.currentTimeMillis();
    if (this.f == 256) {
      if (l1 <= this.a);
      return true;
    } 
    return (this.f == 291 && l1 < this.e + 60000L && (l1 <= this.b || this.d <= this.c)) ? true : true;
  }
}
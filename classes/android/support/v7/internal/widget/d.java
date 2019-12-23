package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.v4.e.a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class d extends DataSetObservable {
  private static final String a = d.class.getSimpleName();
  
  private static final Object b = new Object();
  
  private static final Map<String, d> c = new HashMap();
  
  private final Object d;
  
  private final List<a> e;
  
  private final List<c> f;
  
  private final Context g;
  
  private final String h;
  
  private Intent i;
  
  private b j;
  
  private int k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private d p;
  
  private boolean a(c paramc) {
    boolean bool = this.f.add(paramc);
    if (bool) {
      this.n = true;
      i();
      d();
      f();
      notifyChanged();
    } 
    return bool;
  }
  
  private void d() {
    if (!this.m)
      throw new IllegalStateException("No preceding call to #readHistoricalData"); 
    if (this.n) {
      this.n = false;
      if (!TextUtils.isEmpty(this.h)) {
        a.a(new e(this, null), new Object[] { new ArrayList(this.f), this.h });
        return;
      } 
    } 
  }
  
  private void e() {
    boolean bool1 = g();
    boolean bool2 = h();
    i();
    if (bool1 | bool2) {
      f();
      notifyChanged();
    } 
  }
  
  private boolean f() {
    if (this.j != null && this.i != null && !this.e.isEmpty() && !this.f.isEmpty()) {
      this.j.a(this.i, this.e, Collections.unmodifiableList(this.f));
      return true;
    } 
    return false;
  }
  
  private boolean g() {
    byte b1 = 0;
    int i1 = b1;
    if (this.o) {
      i1 = b1;
      if (this.i != null) {
        this.o = false;
        this.e.clear();
        List list = this.g.getPackageManager().queryIntentActivities(this.i, 0);
        int i2 = list.size();
        for (byte b2 = 0; b2 < i2; b2++) {
          ResolveInfo resolveInfo = (ResolveInfo)list.get(b2);
          this.e.add(new a(this, resolveInfo));
        } 
        i1 = 1;
      } 
    } 
    return i1;
  }
  
  private boolean h() {
    if (this.l && this.n && !TextUtils.isEmpty(this.h)) {
      this.l = false;
      this.m = true;
      j();
      return true;
    } 
    return false;
  }
  
  private void i() {
    int i1 = this.f.size() - this.k;
    if (i1 > 0) {
      this.n = true;
      byte b1 = 0;
      while (true) {
        if (b1 < i1) {
          c c1 = (c)this.f.remove(0);
          b1++;
          continue;
        } 
        return;
      } 
    } 
  }
  
  private void j() {
    try {
      fileInputStream = this.g.openFileInput(this.h);
      try {
        XmlPullParser xmlPullParser = Xml.newPullParser();
        xmlPullParser.setInput(fileInputStream, "UTF-8");
        int i1;
        for (i1 = 0; i1 != 1 && i1 != 2; i1 = xmlPullParser.next());
        if (!"historical-records".equals(xmlPullParser.getName()))
          throw new XmlPullParserException("Share records file does not start with historical-records tag."); 
        List list = this.f;
        list.clear();
        while (true) {
          i1 = xmlPullParser.next();
          if (i1 == 1)
            return; 
          if (i1 != 3 && i1 != 4) {
            if (!"historical-record".equals(xmlPullParser.getName()))
              throw new XmlPullParserException("Share records file not well-formed."); 
            list.add(new c(xmlPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParser.getAttributeValue(null, "weight"))));
          } 
        } 
      } catch (XmlPullParserException xmlPullParserException) {
        Log.e(a, "Error reading historical recrod file: " + this.h, xmlPullParserException);
        return;
      } catch (IOException iOException) {
        Log.e(a, "Error reading historical recrod file: " + this.h, iOException);
        return;
      } finally {
        if (fileInputStream != null)
          try {
            fileInputStream.close();
          } catch (IOException fileInputStream) {} 
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      return;
    } 
  }
  
  public int a() {
    synchronized (this.d) {
      e();
      return this.e.size();
    } 
  }
  
  public int a(ResolveInfo paramResolveInfo) {
    synchronized (this.d) {
      e();
      List list = this.e;
      int i1 = list.size();
      for (byte b1 = 0;; b1++) {
        if (b1 < i1) {
          if (((a)list.get(b1)).a == paramResolveInfo)
            return b1; 
        } else {
          return -1;
        } 
      } 
    } 
  }
  
  public ResolveInfo a(int paramInt) {
    synchronized (this.d) {
      e();
      return ((a)this.e.get(paramInt)).a;
    } 
  }
  
  public Intent b(int paramInt) {
    synchronized (this.d) {
      if (this.i == null)
        return null; 
      e();
      a a1 = (a)this.e.get(paramInt);
      ComponentName componentName = new ComponentName(a1.a.activityInfo.packageName, a1.a.activityInfo.name);
      Intent intent = new Intent(this.i);
      intent.setComponent(componentName);
      if (this.p != null) {
        Intent intent1 = new Intent(intent);
        if (this.p.a(this, intent1))
          return null; 
      } 
      a(new c(componentName, System.currentTimeMillis(), 1.0F));
      return intent;
    } 
  }
  
  public ResolveInfo b() {
    synchronized (this.d) {
      e();
      if (!this.e.isEmpty())
        return ((a)this.e.get(0)).a; 
      return null;
    } 
  }
  
  public void c(int paramInt) {
    synchronized (this.d) {
      float f1;
      e();
      a a1 = (a)this.e.get(paramInt);
      a a2 = (a)this.e.get(0);
      if (a2 != null) {
        f1 = a2.b - a1.b + 5.0F;
      } else {
        f1 = 1.0F;
      } 
      a(new c(new ComponentName(a1.a.activityInfo.packageName, a1.a.activityInfo.name), System.currentTimeMillis(), f1));
      return;
    } 
  }
  
  public final class a extends Object implements Comparable<a> {
    public final ResolveInfo a;
    
    public float b;
    
    public a(d this$0, ResolveInfo param1ResolveInfo) { this.a = param1ResolveInfo; }
    
    public int a(a param1a) { return Float.floatToIntBits(param1a.b) - Float.floatToIntBits(this.b); }
    
    public boolean equals(Object param1Object) {
      if (this != param1Object) {
        if (param1Object == null)
          return false; 
        if (getClass() != param1Object.getClass())
          return false; 
        param1Object = (a)param1Object;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(param1Object.b))
          return false; 
      } 
      return true;
    }
    
    public int hashCode() { return Float.floatToIntBits(this.b) + 31; }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("[");
      stringBuilder.append("resolveInfo:").append(this.a.toString());
      stringBuilder.append("; weight:").append(new BigDecimal(this.b));
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
  
  public static interface b {
    void a(Intent param1Intent, List<d.a> param1List1, List<d.c> param1List2);
  }
  
  public static final class c {
    public final ComponentName a;
    
    public final long b;
    
    public final float c;
    
    public c(ComponentName param1ComponentName, long param1Long, float param1Float) {
      this.a = param1ComponentName;
      this.b = param1Long;
      this.c = param1Float;
    }
    
    public c(String param1String, long param1Long, float param1Float) { this(ComponentName.unflattenFromString(param1String), param1Long, param1Float); }
    
    public boolean equals(Object param1Object) {
      if (this != param1Object) {
        if (param1Object == null)
          return false; 
        if (getClass() != param1Object.getClass())
          return false; 
        param1Object = (c)param1Object;
        if (this.a == null) {
          if (param1Object.a != null)
            return false; 
        } else if (!this.a.equals(param1Object.a)) {
          return false;
        } 
        if (this.b != param1Object.b)
          return false; 
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(param1Object.c))
          return false; 
      } 
      return true;
    }
    
    public int hashCode() {
      if (this.a == null) {
        boolean bool = false;
        return ((bool + 31) * 31 + (int)(this.b ^ this.b >>> 32)) * 31 + Float.floatToIntBits(this.c);
      } 
      int i = this.a.hashCode();
      return ((i + 31) * 31 + (int)(this.b ^ this.b >>> 32)) * 31 + Float.floatToIntBits(this.c);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("[");
      stringBuilder.append("; activity:").append(this.a);
      stringBuilder.append("; time:").append(this.b);
      stringBuilder.append("; weight:").append(new BigDecimal(this.c));
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
  
  public static interface d {
    boolean a(d param1d, Intent param1Intent);
  }
  
  private final class e extends AsyncTask<Object, Void, Void> {
    private e(d this$0) {}
    
    public Void a(Object... param1VarArgs) {
      byte b = 0;
      list = (List)param1VarArgs[0];
      XmlSerializer xmlSerializer = (String)param1VarArgs[1];
      try {
        fileOutputStream = d.a(this.a).openFileOutput(xmlSerializer, 0);
        xmlSerializer = Xml.newSerializer();
        try {
          xmlSerializer.setOutput(fileOutputStream, null);
          xmlSerializer.startDocument("UTF-8", Boolean.valueOf(true));
          xmlSerializer.startTag(null, "historical-records");
          int i = list.size();
          while (b < i) {
            d.c c = (d.c)list.remove(0);
            xmlSerializer.startTag(null, "historical-record");
            xmlSerializer.attribute(null, "activity", c.a.flattenToString());
            xmlSerializer.attribute(null, "time", String.valueOf(c.b));
            xmlSerializer.attribute(null, "weight", String.valueOf(c.c));
            xmlSerializer.endTag(null, "historical-record");
            b++;
          } 
          xmlSerializer.endTag(null, "historical-records");
          xmlSerializer.endDocument();
          d.a(this.a, true);
          return null;
        } catch (IllegalArgumentException list) {
          Log.e(d.c(), "Error writing historical recrod file: " + d.b(this.a), list);
          d.a(this.a, true);
          return null;
        } catch (IllegalStateException list) {
          Log.e(d.c(), "Error writing historical recrod file: " + d.b(this.a), list);
          d.a(this.a, true);
          return null;
        } catch (IOException list) {
          Log.e(d.c(), "Error writing historical recrod file: " + d.b(this.a), list);
          d.a(this.a, true);
          return null;
        } finally {
          list = null;
        } 
      } catch (FileNotFoundException param1VarArgs) {
        Log.e(d.c(), "Error writing historical recrod file: " + xmlSerializer, param1VarArgs);
        return null;
      } 
      if (param1VarArgs != null)
        try {
          param1VarArgs.close();
        } catch (IOException param1VarArgs) {} 
      throw list;
    }
  }
}
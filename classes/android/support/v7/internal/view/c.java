package android.support.v7.internal.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.h.a;
import android.support.v4.h.f;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c extends MenuInflater {
  private static final Class<?>[] a = { Context.class };
  
  private static final Class<?>[] b = a;
  
  private final Object[] c;
  
  private final Object[] d;
  
  private Context e;
  
  private Object f;
  
  public c(Context paramContext) {
    super(paramContext);
    this.e = paramContext;
    this.c = new Object[] { paramContext };
    this.d = this.c;
  }
  
  private Object a(Object paramObject) { return (!(paramObject instanceof android.app.Activity) && paramObject instanceof ContextWrapper) ? a(((ContextWrapper)paramObject).getBaseContext()) : paramObject; }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu) {
    b b1 = new b(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    while (true) {
      if (i == 2) {
        String str = paramXmlPullParser.getName();
        if (str.equals("menu")) {
          i = paramXmlPullParser.next();
        } else {
          throw new RuntimeException("Expecting menu, got " + str);
        } 
      } else {
        int m = paramXmlPullParser.next();
        i = m;
        if (m == 1) {
          i = m;
        } else {
          continue;
        } 
      } 
      paramMenu = null;
      int k = 0;
      int j = i;
      boolean bool = false;
      i = k;
      while (!bool) {
        String str2;
        String str1;
        switch (j) {
          default:
            j = paramXmlPullParser.next();
            continue;
          case 2:
            if (i == 0) {
              String str = paramXmlPullParser.getName();
              if (str.equals("group")) {
                b1.a(paramAttributeSet);
              } else if (str.equals("item")) {
                b1.b(paramAttributeSet);
              } else if (str.equals("menu")) {
                a(paramXmlPullParser, paramAttributeSet, b1.c());
              } else {
                str1 = str;
                i = 1;
              } 
            } 
          case 3:
            str2 = paramXmlPullParser.getName();
            if (i != 0 && str2.equals(str1)) {
              str1 = null;
              i = 0;
            } else if (str2.equals("group")) {
              b1.a();
            } else if (str2.equals("item")) {
              if (!b1.d())
                if (b.a(b1) != null && b.a(b1).e()) {
                  b1.c();
                } else {
                  b1.b();
                }  
            } else if (str2.equals("menu")) {
              bool = true;
            } 
          case 1:
            break;
        } 
        throw new RuntimeException("Unexpected end of document");
      } 
      return;
    } 
  }
  
  private Object c() {
    if (this.f == null)
      this.f = a(this.e); 
    return this.f;
  }
  
  public void inflate(int paramInt, Menu paramMenu) {
    if (!(paramMenu instanceof android.support.v4.d.a.a)) {
      super.inflate(paramInt, paramMenu);
      return;
    } 
    xmlResourceParser1 = null;
    xmlResourceParser3 = null;
    XmlResourceParser xmlResourceParser2 = null;
    try {
      xmlResourceParser = this.e.getResources().getLayout(paramInt);
      xmlResourceParser2 = xmlResourceParser;
      xmlResourceParser1 = xmlResourceParser;
      xmlResourceParser3 = xmlResourceParser;
      a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), paramMenu);
    } catch (XmlPullParserException paramMenu) {
      xmlResourceParser1 = xmlResourceParser2;
      throw new InflateException("Error inflating menu XML", paramMenu);
    } catch (IOException paramMenu) {
    
    } finally {
      if (xmlResourceParser1 != null)
        xmlResourceParser1.close(); 
    } 
  }
  
  private static class a implements MenuItem.OnMenuItemClickListener {
    private static final Class<?>[] a = { MenuItem.class };
    
    private Object b;
    
    private Method c;
    
    public a(Object param1Object, String param1String) {
      this.b = param1Object;
      Class clazz = param1Object.getClass();
      try {
        this.c = clazz.getMethod(param1String, a);
        return;
      } catch (Exception param1Object) {
        InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + param1String + " in class " + clazz.getName());
        inflateException.initCause(param1Object);
        throw inflateException;
      } 
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      try {
        if (this.c.getReturnType() == boolean.class)
          return ((Boolean)this.c.invoke(this.b, new Object[] { param1MenuItem })).booleanValue(); 
        this.c.invoke(this.b, new Object[] { param1MenuItem });
        return true;
      } catch (Exception param1MenuItem) {
        throw new RuntimeException(param1MenuItem);
      } 
    }
  }
  
  private class b {
    private Menu b;
    
    private int c;
    
    private int d;
    
    private int e;
    
    private int f;
    
    private boolean g;
    
    private boolean h;
    
    private boolean i;
    
    private int j;
    
    private int k;
    
    private CharSequence l;
    
    private CharSequence m;
    
    private int n;
    
    private char o;
    
    private char p;
    
    private int q;
    
    private boolean r;
    
    private boolean s;
    
    private boolean t;
    
    private int u;
    
    private int v;
    
    private String w;
    
    private String x;
    
    private String y;
    
    private a z;
    
    public b(c this$0, Menu param1Menu) {
      this.b = param1Menu;
      a();
    }
    
    private char a(String param1String) { return (param1String == null) ? Character.MIN_VALUE : param1String.charAt(0); }
    
    private <T> T a(String param1String, Class<?>[] param1ArrayOfClass, Object[] param1ArrayOfObject) {
      try {
        Constructor constructor = c.a(this.a).getClassLoader().loadClass(param1String).getConstructor(param1ArrayOfClass);
        constructor.setAccessible(true);
        return (T)constructor.newInstance(param1ArrayOfObject);
      } catch (Exception param1ArrayOfClass) {
        Log.w("SupportMenuInflater", "Cannot instantiate class: " + param1String, param1ArrayOfClass);
        return null;
      } 
    }
    
    private void a(MenuItem param1MenuItem) {
      boolean bool1;
      boolean bool = true;
      MenuItem menuItem = param1MenuItem.setChecked(this.r).setVisible(this.s).setEnabled(this.t);
      if (this.q >= 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      menuItem.setCheckable(bool1).setTitleCondensed(this.m).setIcon(this.n).setAlphabeticShortcut(this.o).setNumericShortcut(this.p);
      if (this.u >= 0)
        f.a(param1MenuItem, this.u); 
      if (this.y != null) {
        if (c.a(this.a).isRestricted())
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context"); 
        param1MenuItem.setOnMenuItemClickListener(new c.a(c.c(this.a), this.y));
      } 
      if (param1MenuItem instanceof f)
        f f1 = (f)param1MenuItem; 
      if (this.q >= 2)
        if (param1MenuItem instanceof f) {
          ((f)param1MenuItem).a(true);
        } else if (param1MenuItem instanceof g) {
          ((g)param1MenuItem).a(true);
        }  
      if (this.w != null) {
        f.a(param1MenuItem, (View)a(this.w, c.b(), c.d(this.a)));
      } else {
        bool = false;
      } 
      if (this.v > 0)
        if (!bool) {
          f.b(param1MenuItem, this.v);
        } else {
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }  
      if (this.z != null)
        f.a(param1MenuItem, this.z); 
    }
    
    public void a() {
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = true;
      this.h = true;
    }
    
    public void a(AttributeSet param1AttributeSet) {
      TypedArray typedArray = c.a(this.a).obtainStyledAttributes(param1AttributeSet, a.j.MenuGroup);
      this.c = typedArray.getResourceId(a.j.MenuGroup_android_id, 0);
      this.d = typedArray.getInt(a.j.MenuGroup_android_menuCategory, 0);
      this.e = typedArray.getInt(a.j.MenuGroup_android_orderInCategory, 0);
      this.f = typedArray.getInt(a.j.MenuGroup_android_checkableBehavior, 0);
      this.g = typedArray.getBoolean(a.j.MenuGroup_android_visible, true);
      this.h = typedArray.getBoolean(a.j.MenuGroup_android_enabled, true);
      typedArray.recycle();
    }
    
    public void b() {
      this.i = true;
      a(this.b.add(this.c, this.j, this.k, this.l));
    }
    
    public void b(AttributeSet param1AttributeSet) {
      boolean bool1;
      boolean bool2 = true;
      TypedArray typedArray = c.a(this.a).obtainStyledAttributes(param1AttributeSet, a.j.MenuItem);
      this.j = typedArray.getResourceId(a.j.MenuItem_android_id, 0);
      this.k = typedArray.getInt(a.j.MenuItem_android_menuCategory, this.d) & 0xFFFF0000 | typedArray.getInt(a.j.MenuItem_android_orderInCategory, this.e) & 0xFFFF;
      this.l = typedArray.getText(a.j.MenuItem_android_title);
      this.m = typedArray.getText(a.j.MenuItem_android_titleCondensed);
      this.n = typedArray.getResourceId(a.j.MenuItem_android_icon, 0);
      this.o = a(typedArray.getString(a.j.MenuItem_android_alphabeticShortcut));
      this.p = a(typedArray.getString(a.j.MenuItem_android_numericShortcut));
      if (typedArray.hasValue(a.j.MenuItem_android_checkable)) {
        if (typedArray.getBoolean(a.j.MenuItem_android_checkable, false)) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        this.q = bool1;
      } else {
        this.q = this.f;
      } 
      this.r = typedArray.getBoolean(a.j.MenuItem_android_checked, false);
      this.s = typedArray.getBoolean(a.j.MenuItem_android_visible, this.g);
      this.t = typedArray.getBoolean(a.j.MenuItem_android_enabled, this.h);
      this.u = typedArray.getInt(a.j.MenuItem_showAsAction, -1);
      this.y = typedArray.getString(a.j.MenuItem_android_onClick);
      this.v = typedArray.getResourceId(a.j.MenuItem_actionLayout, 0);
      this.w = typedArray.getString(a.j.MenuItem_actionViewClass);
      this.x = typedArray.getString(a.j.MenuItem_actionProviderClass);
      if (this.x != null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      } 
      if (bool1 && this.v == 0 && this.w == null) {
        this.z = (a)a(this.x, c.a(), c.b(this.a));
      } else {
        if (bool1)
          Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified."); 
        this.z = null;
      } 
      typedArray.recycle();
      this.i = false;
    }
    
    public SubMenu c() {
      this.i = true;
      SubMenu subMenu = this.b.addSubMenu(this.c, this.j, this.k, this.l);
      a(subMenu.getItem());
      return subMenu;
    }
    
    public boolean d() { return this.i; }
  }
}
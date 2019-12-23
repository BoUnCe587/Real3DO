package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.support.v4.d.a.a;
import android.support.v4.h.a;
import android.support.v7.b.a;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class e implements a {
  private static final int[] d = { 1, 4, 5, 3, 2, 0 };
  
  CharSequence a;
  
  Drawable b;
  
  View c;
  
  private final Context e;
  
  private final Resources f;
  
  private boolean g;
  
  private boolean h;
  
  private a i;
  
  private ArrayList<f> j;
  
  private ArrayList<f> k;
  
  private boolean l;
  
  private ArrayList<f> m;
  
  private ArrayList<f> n;
  
  private boolean o;
  
  private int p = 0;
  
  private ContextMenu.ContextMenuInfo q;
  
  private boolean r = false;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = false;
  
  private ArrayList<f> v = new ArrayList();
  
  private CopyOnWriteArrayList<WeakReference<j>> w = new CopyOnWriteArrayList();
  
  private f x;
  
  private boolean y;
  
  public e(Context paramContext) {
    this.e = paramContext;
    this.f = paramContext.getResources();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = true;
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = true;
    d(true);
  }
  
  private static int a(ArrayList<f> paramArrayList, int paramInt) {
    for (int i1 = paramArrayList.size() - 1; i1 >= 0; i1--) {
      if (((f)paramArrayList.get(i1)).c() <= paramInt)
        return i1 + 1; 
    } 
    return 0;
  }
  
  private f a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) { return new f(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5); }
  
  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView) {
    Resources resources = c();
    if (paramView != null) {
      this.c = paramView;
      this.a = null;
      this.b = null;
    } else {
      if (paramInt1 > 0) {
        this.a = resources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        this.a = paramCharSequence;
      } 
      if (paramInt2 > 0) {
        this.b = a.a(d(), paramInt2);
      } else if (paramDrawable != null) {
        this.b = paramDrawable;
      } 
      this.c = null;
    } 
    b(false);
  }
  
  private void a(int paramInt, boolean paramBoolean) {
    if (paramInt >= 0 && paramInt < this.j.size()) {
      this.j.remove(paramInt);
      if (paramBoolean) {
        b(true);
        return;
      } 
    } 
  }
  
  private boolean a(n paramn, j paramj) {
    boolean bool = false;
    if (this.w.isEmpty())
      return false; 
    if (paramj != null)
      bool = paramj.a(paramn); 
    for (WeakReference weakReference : this.w) {
      j j1 = (j)weakReference.get();
      if (j1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      if (!bool)
        bool = j1.a(paramn); 
    } 
    return bool;
  }
  
  private static int c(int paramInt) {
    int i1 = (0xFFFF0000 & paramInt) >> 16;
    if (i1 < 0 || i1 >= d.length)
      throw new IllegalArgumentException("order does not contain a valid category."); 
    return d[i1] << 16 | 0xFFFF & paramInt;
  }
  
  private void c(boolean paramBoolean) {
    if (this.w.isEmpty())
      return; 
    f();
    for (WeakReference weakReference : this.w) {
      j j1 = (j)weakReference.get();
      if (j1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      j1.b(paramBoolean);
    } 
    g();
  }
  
  private void d(boolean paramBoolean) {
    boolean bool = true;
    if (paramBoolean && (this.f.getConfiguration()).keyboard != 1 && this.f.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    this.h = paramBoolean;
  }
  
  public int a(int paramInt) {
    int i1 = size();
    for (byte b1 = 0; b1 < i1; b1++) {
      if (((f)this.j.get(b1)).getItemId() == paramInt)
        return b1; 
    } 
    return -1;
  }
  
  public int a(int paramInt1, int paramInt2) {
    int i2 = size();
    int i1 = paramInt2;
    if (paramInt2 < 0)
      i1 = 0; 
    while (i1 < i2) {
      if (((f)this.j.get(i1)).getGroupId() == paramInt1)
        return i1; 
      i1++;
    } 
    return -1;
  }
  
  protected e a(Drawable paramDrawable) {
    a(0, null, 0, paramDrawable, null);
    return this;
  }
  
  protected e a(View paramView) {
    a(0, null, 0, null, paramView);
    return this;
  }
  
  protected e a(CharSequence paramCharSequence) {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  f a(int paramInt, KeyEvent paramKeyEvent) { // Byte code:
    //   0: aload_0
    //   1: getfield v : Ljava/util/ArrayList;
    //   4: astore #9
    //   6: aload #9
    //   8: invokevirtual clear : ()V
    //   11: aload_0
    //   12: aload #9
    //   14: iload_1
    //   15: aload_2
    //   16: invokevirtual a : (Ljava/util/List;ILandroid/view/KeyEvent;)V
    //   19: aload #9
    //   21: invokevirtual isEmpty : ()Z
    //   24: ifeq -> 31
    //   27: aconst_null
    //   28: astore_2
    //   29: aload_2
    //   30: areturn
    //   31: aload_2
    //   32: invokevirtual getMetaState : ()I
    //   35: istore #5
    //   37: new android/view/KeyCharacterMap$KeyData
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore #10
    //   46: aload_2
    //   47: aload #10
    //   49: invokevirtual getKeyData : (Landroid/view/KeyCharacterMap$KeyData;)Z
    //   52: pop
    //   53: aload #9
    //   55: invokevirtual size : ()I
    //   58: istore #6
    //   60: iload #6
    //   62: iconst_1
    //   63: if_icmpne -> 76
    //   66: aload #9
    //   68: iconst_0
    //   69: invokevirtual get : (I)Ljava/lang/Object;
    //   72: checkcast android/support/v7/internal/view/menu/f
    //   75: areturn
    //   76: aload_0
    //   77: invokevirtual a : ()Z
    //   80: istore #7
    //   82: iconst_0
    //   83: istore_3
    //   84: iload_3
    //   85: iload #6
    //   87: if_icmpge -> 195
    //   90: aload #9
    //   92: iload_3
    //   93: invokevirtual get : (I)Ljava/lang/Object;
    //   96: checkcast android/support/v7/internal/view/menu/f
    //   99: astore #8
    //   101: iload #7
    //   103: ifeq -> 185
    //   106: aload #8
    //   108: invokevirtual getAlphabeticShortcut : ()C
    //   111: istore #4
    //   113: iload #4
    //   115: aload #10
    //   117: getfield meta : [C
    //   120: iconst_0
    //   121: caload
    //   122: if_icmpne -> 135
    //   125: aload #8
    //   127: astore_2
    //   128: iload #5
    //   130: iconst_2
    //   131: iand
    //   132: ifeq -> 29
    //   135: iload #4
    //   137: aload #10
    //   139: getfield meta : [C
    //   142: iconst_2
    //   143: caload
    //   144: if_icmpne -> 157
    //   147: aload #8
    //   149: astore_2
    //   150: iload #5
    //   152: iconst_2
    //   153: iand
    //   154: ifne -> 29
    //   157: iload #7
    //   159: ifeq -> 178
    //   162: iload #4
    //   164: bipush #8
    //   166: if_icmpne -> 178
    //   169: aload #8
    //   171: astore_2
    //   172: iload_1
    //   173: bipush #67
    //   175: if_icmpeq -> 29
    //   178: iload_3
    //   179: iconst_1
    //   180: iadd
    //   181: istore_3
    //   182: goto -> 84
    //   185: aload #8
    //   187: invokevirtual getNumericShortcut : ()C
    //   190: istore #4
    //   192: goto -> 113
    //   195: aconst_null
    //   196: areturn }
  
  protected MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    int i1 = c(paramInt3);
    f f1 = a(paramInt1, paramInt2, paramInt3, i1, paramCharSequence, this.p);
    if (this.q != null)
      f1.a(this.q); 
    this.j.add(a(this.j, i1), f1);
    b(true);
    return f1;
  }
  
  public void a(a parama) { this.i = parama; }
  
  void a(f paramf) {
    this.l = true;
    b(true);
  }
  
  public void a(j paramj, Context paramContext) {
    this.w.add(new WeakReference(paramj));
    paramj.a(paramContext, this);
    this.o = true;
  }
  
  void a(MenuItem paramMenuItem) {
    int i1 = paramMenuItem.getGroupId();
    int i2 = this.j.size();
    for (byte b1 = 0; b1 < i2; b1++) {
      f f1 = (f)this.j.get(b1);
      if (f1.getGroupId() == i1 && f1.g() && f1.isCheckable()) {
        boolean bool;
        if (f1 == paramMenuItem) {
          bool = true;
        } else {
          bool = false;
        } 
        f1.b(bool);
      } 
    } 
  }
  
  void a(List<f> paramList, int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = a();
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    if (paramKeyEvent.getKeyData(keyData) || paramInt == 67) {
      int i2 = this.j.size();
      byte b1 = 0;
      while (true) {
        if (b1 < i2) {
          char c1;
          f f1 = (f)this.j.get(b1);
          if (f1.hasSubMenu())
            ((e)f1.getSubMenu()).a(paramList, paramInt, paramKeyEvent); 
          if (bool) {
            c1 = f1.getAlphabeticShortcut();
          } else {
            c1 = f1.getNumericShortcut();
          } 
          if ((i1 & 0x5) == 0 && c1 != '\000' && (c1 == keyData.meta[0] || c1 == keyData.meta[2] || (bool && c1 == '\b' && paramInt == 67)) && f1.isEnabled())
            paramList.add(f1); 
          b1++;
          continue;
        } 
        return;
      } 
    } 
  }
  
  public final void a(boolean paramBoolean) {
    if (this.u)
      return; 
    this.u = true;
    for (WeakReference weakReference : this.w) {
      j j1 = (j)weakReference.get();
      if (j1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      j1.a(this, paramBoolean);
    } 
    this.u = false;
  }
  
  boolean a() { return this.g; }
  
  boolean a(e parame, MenuItem paramMenuItem) { return (this.i != null && this.i.a(parame, paramMenuItem)); }
  
  public boolean a(MenuItem paramMenuItem, int paramInt) { return a(paramMenuItem, null, paramInt); }
  
  public boolean a(MenuItem paramMenuItem, j paramj, int paramInt) {
    boolean bool;
    byte b1 = 0;
    f f1 = (f)paramMenuItem;
    int i1 = b1;
    if (f1 != null) {
      if (!f1.isEnabled())
        return b1; 
    } else {
      return i1;
    } 
    boolean bool1 = f1.b();
    a a1 = f1.a();
    if (a1 != null && a1.e()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (f1.n()) {
      boolean bool2 = f1.expandActionView() | bool1;
      bool1 = bool2;
      if (bool2) {
        a(true);
        return bool2;
      } 
      return bool1;
    } 
    if (f1.hasSubMenu() || bool) {
      a(false);
      if (!f1.hasSubMenu())
        f1.a(new n(d(), this, f1)); 
      n n1 = (n)f1.getSubMenu();
      if (bool)
        a1.a(n1); 
      boolean bool2 = a(n1, paramj) | bool1;
      bool1 = bool2;
      if (!bool2) {
        a(true);
        return bool2;
      } 
      return bool1;
    } 
    if ((paramInt & true) == 0)
      a(true); 
    return bool1;
  }
  
  public MenuItem add(int paramInt) { return a(0, 0, 0, this.f.getString(paramInt)); }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return a(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4)); }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) { return a(paramInt1, paramInt2, paramInt3, paramCharSequence); }
  
  public MenuItem add(CharSequence paramCharSequence) { return a(0, 0, 0, paramCharSequence); }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    byte b1;
    PackageManager packageManager = this.e.getPackageManager();
    List list = packageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    if (list != null) {
      b1 = list.size();
    } else {
      b1 = 0;
    } 
    if ((paramInt4 & true) == 0)
      removeGroup(paramInt1); 
    for (paramInt4 = 0; paramInt4 < b1; paramInt4++) {
      ResolveInfo resolveInfo = (ResolveInfo)list.get(paramInt4);
      if (resolveInfo.specificIndex < 0) {
        intent = paramIntent;
      } else {
        intent = paramArrayOfIntent[resolveInfo.specificIndex];
      } 
      Intent intent = new Intent(intent);
      intent.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
      MenuItem menuItem = add(paramInt1, paramInt2, paramInt3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent);
      if (paramArrayOfMenuItem != null && resolveInfo.specificIndex >= 0)
        paramArrayOfMenuItem[resolveInfo.specificIndex] = menuItem; 
    } 
    return b1;
  }
  
  public SubMenu addSubMenu(int paramInt) { return addSubMenu(0, 0, 0, this.f.getString(paramInt)); }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return addSubMenu(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4)); }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    f f1 = (f)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    n n1 = new n(this.e, this, f1);
    f1.a(n1);
    return n1;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence) { return addSubMenu(0, 0, 0, paramCharSequence); }
  
  public int b(int paramInt) { return a(paramInt, 0); }
  
  void b(f paramf) {
    this.o = true;
    b(true);
  }
  
  public void b(boolean paramBoolean) {
    if (!this.r) {
      if (paramBoolean) {
        this.l = true;
        this.o = true;
      } 
      c(paramBoolean);
      return;
    } 
    this.s = true;
  }
  
  public boolean b() { return this.h; }
  
  Resources c() { return this.f; }
  
  public boolean c(f paramf) {
    boolean bool = false;
    if (!this.w.isEmpty()) {
      f();
      Iterator iterator = this.w.iterator();
      boolean bool1 = false;
      while (iterator.hasNext()) {
        WeakReference weakReference = (WeakReference)iterator.next();
        j j1 = (j)weakReference.get();
        if (j1 == null) {
          this.w.remove(weakReference);
          continue;
        } 
        bool = j1.a(this, paramf);
        bool1 = bool;
        if (bool) {
          bool1 = bool;
          break;
        } 
      } 
      g();
      bool = bool1;
      if (bool1) {
        this.x = paramf;
        return bool1;
      } 
    } 
    return bool;
  }
  
  public void clear() {
    if (this.x != null)
      d(this.x); 
    this.j.clear();
    b(true);
  }
  
  public void clearHeader() {
    this.b = null;
    this.a = null;
    this.c = null;
    b(false);
  }
  
  public void close() { a(true); }
  
  public Context d() { return this.e; }
  
  public boolean d(f paramf) {
    boolean bool1 = false;
    int i1 = bool1;
    if (!this.w.isEmpty()) {
      if (this.x != paramf)
        return bool1; 
    } else {
      return i1;
    } 
    f();
    Iterator iterator = this.w.iterator();
    bool1 = false;
    while (iterator.hasNext()) {
      WeakReference weakReference = (WeakReference)iterator.next();
      j j1 = (j)weakReference.get();
      if (j1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
      boolean bool = j1.b(this, paramf);
      bool1 = bool;
      if (bool) {
        bool1 = bool;
        break;
      } 
    } 
    g();
    boolean bool2 = bool1;
    if (bool1) {
      this.x = null;
      return bool1;
    } 
    return bool2;
  }
  
  public void e() {
    if (this.i != null)
      this.i.a(this); 
  }
  
  public void f() {
    if (!this.r) {
      this.r = true;
      this.s = false;
    } 
  }
  
  public MenuItem findItem(int paramInt) {
    int i1 = size();
    for (byte b1 = 0; b1 < i1; b1++) {
      MenuItem menuItem = (f)this.j.get(b1);
      if (menuItem.getItemId() != paramInt) {
        if (menuItem.hasSubMenu()) {
          MenuItem menuItem1 = menuItem.getSubMenu().findItem(paramInt);
          menuItem = menuItem1;
          if (menuItem1 == null)
            continue; 
          return menuItem;
        } 
        continue;
      } 
      return menuItem;
    } 
    return null;
  }
  
  public void g() {
    this.r = false;
    if (this.s) {
      this.s = false;
      b(true);
    } 
  }
  
  public MenuItem getItem(int paramInt) { return (MenuItem)this.j.get(paramInt); }
  
  public ArrayList<f> h() {
    if (!this.l)
      return this.k; 
    this.k.clear();
    int i1 = this.j.size();
    for (byte b1 = 0; b1 < i1; b1++) {
      f f1 = (f)this.j.get(b1);
      if (f1.isVisible())
        this.k.add(f1); 
    } 
    this.l = false;
    this.o = true;
    return this.k;
  }
  
  public boolean hasVisibleItems() {
    if (this.y)
      return true; 
    int i1 = size();
    for (byte b1 = 0; b1 < i1; b1++) {
      if (((f)this.j.get(b1)).isVisible())
        return true; 
    } 
    return false;
  }
  
  public void i() {
    ArrayList arrayList = h();
    if (!this.o)
      return; 
    Iterator iterator = this.w.iterator();
    int i1;
    for (i1 = 0; iterator.hasNext(); i1 = j1.b() | i1) {
      WeakReference weakReference = (WeakReference)iterator.next();
      j j1 = (j)weakReference.get();
      if (j1 == null) {
        this.w.remove(weakReference);
        continue;
      } 
    } 
    if (i1) {
      this.m.clear();
      this.n.clear();
      int i2 = arrayList.size();
      i1 = 0;
      while (i1 < i2) {
        f f1 = (f)arrayList.get(i1);
        if (f1.j()) {
          this.m.add(f1);
        } else {
          this.n.add(f1);
        } 
        int i3 = i1 + 1;
      } 
    } else {
      this.m.clear();
      this.n.clear();
      this.n.addAll(h());
    } 
    this.o = false;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) { return (a(paramInt, paramKeyEvent) != null); }
  
  public ArrayList<f> j() {
    i();
    return this.m;
  }
  
  public ArrayList<f> k() {
    i();
    return this.n;
  }
  
  public e l() { return this; }
  
  boolean m() { return this.t; }
  
  public f n() { return this.x; }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2) { return a(findItem(paramInt1), paramInt2); }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    f f1 = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (f1 != null)
      bool = a(f1, paramInt2); 
    if ((paramInt2 & 0x2) != 0)
      a(true); 
    return bool;
  }
  
  public void removeGroup(int paramInt) {
    int i1 = b(paramInt);
    if (i1 >= 0) {
      int i2 = this.j.size();
      for (byte b1 = 0; b1 < i2 - i1 && ((f)this.j.get(i1)).getGroupId() == paramInt; b1++)
        a(i1, false); 
      b(true);
    } 
  }
  
  public void removeItem(int paramInt) { a(a(paramInt), true); }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int i1 = this.j.size();
    byte b1;
    for (b1 = 0; b1 < i1; b1++) {
      f f1 = (f)this.j.get(b1);
      if (f1.getGroupId() == paramInt) {
        f1.a(paramBoolean2);
        f1.setCheckable(paramBoolean1);
      } 
    } 
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean) {
    int i1 = this.j.size();
    for (byte b1 = 0; b1 < i1; b1++) {
      f f1 = (f)this.j.get(b1);
      if (f1.getGroupId() == paramInt)
        f1.setEnabled(paramBoolean); 
    } 
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean) {
    int i1 = this.j.size();
    byte b1 = 0;
    boolean bool = false;
    while (b1 < i1) {
      f f1 = (f)this.j.get(b1);
      if (f1.getGroupId() == paramInt && f1.c(paramBoolean))
        bool = true; 
      b1++;
    } 
    if (bool)
      b(true); 
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.g = paramBoolean;
    b(false);
  }
  
  public int size() { return this.j.size(); }
  
  public static interface a {
    void a(e param1e);
    
    boolean a(e param1e, MenuItem param1MenuItem);
  }
  
  public static interface b {
    boolean a(f param1f);
  }
}
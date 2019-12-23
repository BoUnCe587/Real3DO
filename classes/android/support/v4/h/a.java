package android.support.v4.h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class a {
  private final Context a;
  
  private a b;
  
  private b c;
  
  public a(Context paramContext) { this.a = paramContext; }
  
  public abstract View a();
  
  public View a(MenuItem paramMenuItem) { return a(); }
  
  public void a(a parama) { this.b = parama; }
  
  public void a(b paramb) {
    if (this.c != null && paramb != null)
      Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?"); 
    this.c = paramb;
  }
  
  public void a(SubMenu paramSubMenu) {}
  
  public void a(boolean paramBoolean) {
    if (this.b != null)
      this.b.a(paramBoolean); 
  }
  
  public boolean b() { return false; }
  
  public boolean c() { return true; }
  
  public boolean d() { return false; }
  
  public boolean e() { return false; }
  
  public void f() {
    this.c = null;
    this.b = null;
  }
  
  public static interface a {
    void a(boolean param1Boolean);
  }
  
  public static interface b {
    void a(boolean param1Boolean);
  }
}

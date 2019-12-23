package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class n extends e implements SubMenu {
  private e d;
  
  private f e;
  
  public n(Context paramContext, e parame, f paramf) {
    super(paramContext);
    this.d = parame;
    this.e = paramf;
  }
  
  public void a(e.a parama) { this.d.a(parama); }
  
  public boolean a() { return this.d.a(); }
  
  boolean a(e parame, MenuItem paramMenuItem) { return (super.a(parame, paramMenuItem) || this.d.a(parame, paramMenuItem)); }
  
  public boolean b() { return this.d.b(); }
  
  public boolean c(f paramf) { return this.d.c(paramf); }
  
  public boolean d(f paramf) { return this.d.d(paramf); }
  
  public MenuItem getItem() { return this.e; }
  
  public e l() { return this.d; }
  
  public Menu o() { return this.d; }
  
  public SubMenu setHeaderIcon(int paramInt) {
    a(a.a(d(), paramInt));
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    a(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    a(d().getResources().getString(paramInt));
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    a(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView) {
    a(paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt) {
    this.e.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.e.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean) { this.d.setQwertyMode(paramBoolean); }
}
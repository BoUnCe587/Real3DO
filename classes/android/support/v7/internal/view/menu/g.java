package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.b;
import android.support.v4.h.a;
import android.support.v4.h.f;
import android.support.v7.d.a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@TargetApi(14)
public class g extends c<b> implements MenuItem {
  private Method c;
  
  g(Context paramContext, b paramb) { super(paramContext, paramb); }
  
  a a(ActionProvider paramActionProvider) { return new a(this, this.a, paramActionProvider); }
  
  public void a(boolean paramBoolean) {
    try {
      if (this.c == null)
        this.c = ((b)this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { boolean.class }); 
      this.c.invoke(this.b, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    } catch (Exception exception) {
      Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
      return;
    } 
  }
  
  public boolean collapseActionView() { return ((b)this.b).collapseActionView(); }
  
  public boolean expandActionView() { return ((b)this.b).expandActionView(); }
  
  public ActionProvider getActionProvider() {
    a a = ((b)this.b).a();
    return (a instanceof a) ? ((a)a).a : null;
  }
  
  public View getActionView() {
    View view2 = ((b)this.b).getActionView();
    View view1 = view2;
    if (view2 instanceof b)
      view1 = ((b)view2).c(); 
    return view1;
  }
  
  public char getAlphabeticShortcut() { return ((b)this.b).getAlphabeticShortcut(); }
  
  public int getGroupId() { return ((b)this.b).getGroupId(); }
  
  public Drawable getIcon() { return ((b)this.b).getIcon(); }
  
  public Intent getIntent() { return ((b)this.b).getIntent(); }
  
  public int getItemId() { return ((b)this.b).getItemId(); }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() { return ((b)this.b).getMenuInfo(); }
  
  public char getNumericShortcut() { return ((b)this.b).getNumericShortcut(); }
  
  public int getOrder() { return ((b)this.b).getOrder(); }
  
  public SubMenu getSubMenu() { return a(((b)this.b).getSubMenu()); }
  
  public CharSequence getTitle() { return ((b)this.b).getTitle(); }
  
  public CharSequence getTitleCondensed() { return ((b)this.b).getTitleCondensed(); }
  
  public boolean hasSubMenu() { return ((b)this.b).hasSubMenu(); }
  
  public boolean isActionViewExpanded() { return ((b)this.b).isActionViewExpanded(); }
  
  public boolean isCheckable() { return ((b)this.b).isCheckable(); }
  
  public boolean isChecked() { return ((b)this.b).isChecked(); }
  
  public boolean isEnabled() { return ((b)this.b).isEnabled(); }
  
  public boolean isVisible() { return ((b)this.b).isVisible(); }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    b b = (b)this.b;
    if (paramActionProvider != null) {
      a a = a(paramActionProvider);
      b.a(a);
      return this;
    } 
    paramActionProvider = null;
    b.a(paramActionProvider);
    return this;
  }
  
  public MenuItem setActionView(int paramInt) {
    ((b)this.b).setActionView(paramInt);
    View view = ((b)this.b).getActionView();
    if (view instanceof CollapsibleActionView)
      ((b)this.b).setActionView(new b(view)); 
    return this;
  }
  
  public MenuItem setActionView(View paramView) {
    b b = paramView;
    if (paramView instanceof CollapsibleActionView)
      b = new b(paramView); 
    ((b)this.b).setActionView(b);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    ((b)this.b).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    ((b)this.b).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    ((b)this.b).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    ((b)this.b).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt) {
    ((b)this.b).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    ((b)this.b).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    ((b)this.b).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    ((b)this.b).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    b b = (b)this.b;
    if (paramOnActionExpandListener != null) {
      c c1 = new c(this, paramOnActionExpandListener);
      b.a(c1);
      return this;
    } 
    paramOnActionExpandListener = null;
    b.a(paramOnActionExpandListener);
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    b b = (b)this.b;
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new d(this, paramOnMenuItemClickListener);
      b.setOnMenuItemClickListener(paramOnMenuItemClickListener);
      return this;
    } 
    paramOnMenuItemClickListener = null;
    b.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    ((b)this.b).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public void setShowAsAction(int paramInt) { ((b)this.b).setShowAsAction(paramInt); }
  
  public MenuItem setShowAsActionFlags(int paramInt) {
    ((b)this.b).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt) {
    ((b)this.b).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    ((b)this.b).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    ((b)this.b).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) { return ((b)this.b).setVisible(paramBoolean); }
  
  class a extends a {
    final ActionProvider a;
    
    public a(g this$0, Context param1Context, ActionProvider param1ActionProvider) {
      super(param1Context);
      this.a = param1ActionProvider;
    }
    
    public View a() { return this.a.onCreateActionView(); }
    
    public void a(SubMenu param1SubMenu) { this.a.onPrepareSubMenu(this.b.a(param1SubMenu)); }
    
    public boolean d() { return this.a.onPerformDefaultAction(); }
    
    public boolean e() { return this.a.hasSubMenu(); }
  }
  
  static class b extends FrameLayout implements a {
    final CollapsibleActionView a;
    
    b(View param1View) {
      super(param1View.getContext());
      this.a = (CollapsibleActionView)param1View;
      addView(param1View);
    }
    
    public void a() { this.a.onActionViewExpanded(); }
    
    public void b() { this.a.onActionViewCollapsed(); }
    
    View c() { return (View)this.a; }
  }
  
  private class c extends d<MenuItem.OnActionExpandListener> implements f.e {
    c(g this$0, MenuItem.OnActionExpandListener param1OnActionExpandListener) { super(param1OnActionExpandListener); }
    
    public boolean a(MenuItem param1MenuItem) { return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionExpand(this.a.a(param1MenuItem)); }
    
    public boolean b(MenuItem param1MenuItem) { return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionCollapse(this.a.a(param1MenuItem)); }
  }
  
  private class d extends d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
    d(g this$0, MenuItem.OnMenuItemClickListener param1OnMenuItemClickListener) { super(param1OnMenuItemClickListener); }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) { return ((MenuItem.OnMenuItemClickListener)this.b).onMenuItemClick(this.a.a(param1MenuItem)); }
  }
}
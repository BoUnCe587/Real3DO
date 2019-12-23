package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.d.a.b;
import android.support.v4.h.a;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
class h extends g {
  h(Context paramContext, b paramb) { super(paramContext, paramb); }
  
  g.a a(ActionProvider paramActionProvider) { return new a(this, this.a, paramActionProvider); }
  
  class a extends g.a implements ActionProvider.VisibilityListener {
    a.b c;
    
    public a(h this$0, Context param1Context, ActionProvider param1ActionProvider) { super(this$0, param1Context, param1ActionProvider); }
    
    public View a(MenuItem param1MenuItem) { return this.a.onCreateActionView(param1MenuItem); }
    
    public void a(a.b param1b) {
      this.c = param1b;
      ActionProvider actionProvider = this.a;
      if (param1b != null) {
        a a1 = this;
      } else {
        param1b = null;
      } 
      actionProvider.setVisibilityListener(param1b);
    }
    
    public boolean b() { return this.a.overridesItemVisibility(); }
    
    public boolean c() { return this.a.isVisible(); }
    
    public void onActionProviderVisibilityChanged(boolean param1Boolean) {
      if (this.c != null)
        this.c.a(param1Boolean); 
    }
  }
}
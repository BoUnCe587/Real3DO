package android.support.v4.d.a;

import android.support.v4.h.a;
import android.support.v4.h.f;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
  b a(a parama);
  
  b a(f.e parame);
  
  a a();
  
  boolean collapseActionView();
  
  boolean expandActionView();
  
  View getActionView();
  
  boolean isActionViewExpanded();
  
  MenuItem setActionView(int paramInt);
  
  MenuItem setActionView(View paramView);
  
  void setShowAsAction(int paramInt);
  
  MenuItem setShowAsActionFlags(int paramInt);
}
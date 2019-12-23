package android.support.v7.internal.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.support.v7.b.a;
import android.view.LayoutInflater;

public class b extends ContextWrapper {
  private int a;
  
  private Resources.Theme b;
  
  private LayoutInflater c;
  
  public b(Context paramContext, int paramInt) {
    super(paramContext);
    this.a = paramInt;
  }
  
  public b(Context paramContext, Resources.Theme paramTheme) {
    super(paramContext);
    this.b = paramTheme;
  }
  
  private void a() {
    boolean bool;
    if (this.b == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.b = getResources().newTheme();
      Resources.Theme theme = getBaseContext().getTheme();
      if (theme != null)
        this.b.setTo(theme); 
    } 
    a(this.b, this.a, bool);
  }
  
  protected void a(Resources.Theme paramTheme, int paramInt, boolean paramBoolean) { paramTheme.applyStyle(paramInt, true); }
  
  public Object getSystemService(String paramString) {
    if ("layout_inflater".equals(paramString)) {
      if (this.c == null)
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this); 
      return this.c;
    } 
    return getBaseContext().getSystemService(paramString);
  }
  
  public Resources.Theme getTheme() {
    if (this.b != null)
      return this.b; 
    if (this.a == 0)
      this.a = a.i.Theme_AppCompat_Light; 
    a();
    return this.b;
  }
  
  public void setTheme(int paramInt) {
    if (this.a != paramInt) {
      this.a = paramInt;
      a();
    } 
  }
}
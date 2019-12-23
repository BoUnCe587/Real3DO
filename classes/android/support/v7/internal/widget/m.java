package android.support.v7.internal.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class m extends ContextWrapper {
  private Resources a;
  
  private m(Context paramContext) { super(paramContext); }
  
  public static Context a(Context paramContext) {
    m m1 = paramContext;
    if (!(paramContext instanceof m))
      m1 = new m(paramContext); 
    return m1;
  }
  
  public Resources getResources() {
    if (this.a == null)
      this.a = new a(super.getResources(), o.a(this)); 
    return this.a;
  }
  
  static class a extends i {
    private final o a;
    
    public a(Resources param1Resources, o param1o) {
      super(param1Resources);
      this.a = param1o;
    }
    
    public Drawable getDrawable(int param1Int) {
      Drawable drawable = super.getDrawable(param1Int);
      if (drawable != null)
        this.a.a(param1Int, drawable); 
      return drawable;
    }
  }
}
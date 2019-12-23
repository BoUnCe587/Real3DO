package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class j {
  Object a;
  
  a b;
  
  private j(int paramInt, Context paramContext, Interpolator paramInterpolator) {
    if (paramInt >= 14) {
      this.b = new d();
    } else if (paramInt >= 9) {
      this.b = new c();
    } else {
      this.b = new b();
    } 
    this.a = this.b.a(paramContext, paramInterpolator);
  }
  
  j(Context paramContext, Interpolator paramInterpolator) { this(Build.VERSION.SDK_INT, paramContext, paramInterpolator); }
  
  public static j a(Context paramContext) { return a(paramContext, null); }
  
  public static j a(Context paramContext, Interpolator paramInterpolator) { return new j(paramContext, paramInterpolator); }
  
  public int a() { return this.b.a(this.a); }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) { this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8); }
  
  static interface a {
    int a(Object param1Object);
    
    Object a(Context param1Context, Interpolator param1Interpolator);
    
    void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8);
  }
  
  static class b implements a {
    public int a(Object param1Object) { return ((Scroller)param1Object).getFinalY(); }
    
    public Object a(Context param1Context, Interpolator param1Interpolator) { return (param1Interpolator != null) ? new Scroller(param1Context, param1Interpolator) : new Scroller(param1Context); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) { ((Scroller)param1Object).fling(param1Int1, param1Int2, param1Int3, param1Int4, param1Int5, param1Int6, param1Int7, param1Int8); }
  }
  
  static class c implements a {
    public int a(Object param1Object) { return k.a(param1Object); }
    
    public Object a(Context param1Context, Interpolator param1Interpolator) { return k.a(param1Context, param1Interpolator); }
    
    public void a(Object param1Object, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) { k.a(param1Object, param1Int1, param1Int2, param1Int3, param1Int4, param1Int5, param1Int6, param1Int7, param1Int8); }
  }
  
  static class d extends c {}
}
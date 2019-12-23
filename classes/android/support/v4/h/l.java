package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

public class l {
  static final k a;
  
  static  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      a = new j();
      return;
    } 
    if (i >= 19) {
      a = new i();
      return;
    } 
    if (i >= 17) {
      a = new g();
      return;
    } 
    if (i >= 16) {
      a = new f();
      return;
    } 
    if (i >= 14) {
      a = new e();
      return;
    } 
    if (i >= 11) {
      a = new d();
      return;
    } 
    if (i >= 9) {
      a = new c();
      return;
    } 
    if (i >= 7) {
      a = new b();
      return;
    } 
    a = new a();
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3) { return a.a(paramInt1, paramInt2, paramInt3); }
  
  public static int a(View paramView) { return a.a(paramView); }
  
  public static void a(View paramView, float paramFloat) { a.a(paramView, paramFloat); }
  
  public static void a(View paramView, int paramInt, Paint paramPaint) { a.a(paramView, paramInt, paramPaint); }
  
  public static void a(View paramView, ColorStateList paramColorStateList) { a.a(paramView, paramColorStateList); }
  
  public static void a(View paramView, PorterDuff.Mode paramMode) { a.a(paramView, paramMode); }
  
  public static void a(View paramView, Runnable paramRunnable) { a.a(paramView, paramRunnable); }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong) { a.a(paramView, paramRunnable, paramLong); }
  
  public static void a(View paramView, boolean paramBoolean) { a.a(paramView, paramBoolean); }
  
  public static int b(View paramView) { return a.b(paramView); }
  
  public static float c(View paramView) { return a.c(paramView); }
  
  public static int d(View paramView) { return a.d(paramView); }
  
  public static u e(View paramView) { return a.e(paramView); }
  
  public static int f(View paramView) { return a.f(paramView); }
  
  public static void g(View paramView) { a.g(paramView); }
  
  public static void h(View paramView) { a.h(paramView); }
  
  public static boolean i(View paramView) { return a.i(paramView); }
  
  static class a implements k {
    WeakHashMap<View, u> a = null;
    
    public int a(int param1Int1, int param1Int2, int param1Int3) { return View.resolveSize(param1Int1, param1Int2); }
    
    public int a(View param1View) { return 0; }
    
    long a() { return 10L; }
    
    public void a(View param1View, float param1Float) {}
    
    public void a(View param1View, int param1Int, Paint param1Paint) {}
    
    public void a(View param1View, ColorStateList param1ColorStateList) { m.a(param1View, param1ColorStateList); }
    
    public void a(View param1View, PorterDuff.Mode param1Mode) { m.a(param1View, param1Mode); }
    
    public void a(View param1View, Runnable param1Runnable) { param1View.postDelayed(param1Runnable, a()); }
    
    public void a(View param1View, Runnable param1Runnable, long param1Long) { param1View.postDelayed(param1Runnable, a() + param1Long); }
    
    public void a(View param1View, boolean param1Boolean) {}
    
    public int b(View param1View) { return 0; }
    
    public float c(View param1View) { return 0.0F; }
    
    public int d(View param1View) { return m.a(param1View); }
    
    public u e(View param1View) { return new u(param1View); }
    
    public int f(View param1View) { return 0; }
    
    public void g(View param1View) {}
    
    public void h(View param1View) {}
    
    public boolean i(View param1View) { return m.b(param1View); }
  }
  
  static class b extends a {}
  
  static class c extends b {}
  
  static class d extends c {
    public int a(int param1Int1, int param1Int2, int param1Int3) { return n.a(param1Int1, param1Int2, param1Int3); }
    
    long a() { return n.a(); }
    
    public void a(View param1View, float param1Float) { n.a(param1View, param1Float); }
    
    public void a(View param1View, int param1Int, Paint param1Paint) { n.a(param1View, param1Int, param1Paint); }
    
    public void a(View param1View, boolean param1Boolean) { n.a(param1View, param1Boolean); }
    
    public int b(View param1View) { return n.a(param1View); }
    
    public float c(View param1View) { return n.b(param1View); }
    
    public void h(View param1View) { n.c(param1View); }
  }
  
  static class e extends d {
    static boolean b = false;
    
    public u e(View param1View) {
      if (this.a == null)
        this.a = new WeakHashMap(); 
      u u2 = (u)this.a.get(param1View);
      u u1 = u2;
      if (u2 == null) {
        u1 = new u(param1View);
        this.a.put(param1View, u1);
      } 
      return u1;
    }
  }
  
  static class f extends e {
    public void a(View param1View, Runnable param1Runnable) { o.a(param1View, param1Runnable); }
    
    public void a(View param1View, Runnable param1Runnable, long param1Long) { o.a(param1View, param1Runnable, param1Long); }
    
    public int d(View param1View) { return o.a(param1View); }
    
    public void g(View param1View) { o.b(param1View); }
  }
  
  static class g extends f {
    public int a(View param1View) { return p.a(param1View); }
    
    public int f(View param1View) { return p.b(param1View); }
  }
  
  static class h extends g {}
  
  static class i extends h {
    public boolean i(View param1View) { return q.a(param1View); }
  }
  
  static class j extends i {
    public void a(View param1View, ColorStateList param1ColorStateList) { r.a(param1View, param1ColorStateList); }
    
    public void a(View param1View, PorterDuff.Mode param1Mode) { r.a(param1View, param1Mode); }
    
    public void g(View param1View) { r.a(param1View); }
  }
  
  static interface k {
    int a(int param1Int1, int param1Int2, int param1Int3);
    
    int a(View param1View);
    
    void a(View param1View, float param1Float);
    
    void a(View param1View, int param1Int, Paint param1Paint);
    
    void a(View param1View, ColorStateList param1ColorStateList);
    
    void a(View param1View, PorterDuff.Mode param1Mode);
    
    void a(View param1View, Runnable param1Runnable);
    
    void a(View param1View, Runnable param1Runnable, long param1Long);
    
    void a(View param1View, boolean param1Boolean);
    
    int b(View param1View);
    
    float c(View param1View);
    
    int d(View param1View);
    
    u e(View param1View);
    
    int f(View param1View);
    
    void g(View param1View);
    
    void h(View param1View);
    
    boolean i(View param1View);
  }
}
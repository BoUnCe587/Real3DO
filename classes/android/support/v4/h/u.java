package android.support.v4.h;

import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class u {
  static final g a;
  
  private WeakReference<View> b;
  
  private Runnable c = null;
  
  private Runnable d = null;
  
  private int e = -1;
  
  static  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      a = new f();
      return;
    } 
    if (i >= 19) {
      a = new e();
      return;
    } 
    if (i >= 18) {
      a = new c();
      return;
    } 
    if (i >= 16) {
      a = new d();
      return;
    } 
    if (i >= 14) {
      a = new b();
      return;
    } 
    a = new a();
  }
  
  u(View paramView) { this.b = new WeakReference(paramView); }
  
  public u a(float paramFloat) {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view, paramFloat); 
    return this;
  }
  
  public u a(x paramx) {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view, paramx); 
    return this;
  }
  
  public void a() {
    View view = (View)this.b.get();
    if (view != null)
      a.a(this, view); 
  }
  
  static class a implements g {
    WeakHashMap<View, Runnable> a = null;
    
    private void b(u param1u, View param1View) {
      Object object = param1View.getTag(2113929216);
      if (object instanceof x) {
        object = (x)object;
      } else {
        object = null;
      } 
      Runnable runnable2 = u.a(param1u);
      Runnable runnable1 = u.b(param1u);
      if (runnable2 != null)
        runnable2.run(); 
      if (object != null) {
        object.a(param1View);
        object.b(param1View);
      } 
      if (runnable1 != null)
        runnable1.run(); 
      if (this.a != null)
        this.a.remove(param1View); 
    }
    
    private void c(u param1u, View param1View) {
      Object object;
      if (this.a != null) {
        object = (Runnable)this.a.get(param1View);
      } else {
        object = null;
      } 
      a a1 = object;
      if (object == null) {
        a1 = new a(this, param1u, param1View, null);
        if (this.a == null)
          this.a = new WeakHashMap(); 
        this.a.put(param1View, a1);
      } 
      param1View.removeCallbacks(a1);
      param1View.post(a1);
    }
    
    public void a(u param1u, View param1View) { c(param1u, param1View); }
    
    public void a(u param1u, View param1View, float param1Float) { c(param1u, param1View); }
    
    public void a(u param1u, View param1View, x param1x) { param1View.setTag(2113929216, param1x); }
    
    class a implements Runnable {
      WeakReference<View> a;
      
      u b;
      
      private a(u.a this$0, u param2u, View param2View) {
        this.a = new WeakReference(param2View);
        this.b = param2u;
      }
      
      public void run() {
        View view = (View)this.a.get();
        if (view != null)
          u.a.a(this.c, this.b, view); 
      }
    }
  }
  
  class a implements Runnable {
    WeakReference<View> a;
    
    u b;
    
    private a(u this$0, u param1u, View param1View) {
      this.a = new WeakReference(param1View);
      this.b = param1u;
    }
    
    public void run() {
      View view = (View)this.a.get();
      if (view != null)
        u.a.a(this.c, this.b, view); 
    }
  }
  
  static class b extends a {
    WeakHashMap<View, Integer> b = null;
    
    public void a(u param1u, View param1View) { v.a(param1View); }
    
    public void a(u param1u, View param1View, float param1Float) { v.a(param1View, param1Float); }
    
    public void a(u param1u, View param1View, x param1x) {
      param1View.setTag(2113929216, param1x);
      v.a(param1View, new a(param1u));
    }
    
    static class a implements x {
      u a;
      
      a(u param2u) { this.a = param2u; }
      
      public void a(View param2View) {
        if (u.c(this.a) >= 0)
          l.a(param2View, 2, null); 
        if (u.a(this.a) != null)
          u.a(this.a).run(); 
        Object object = param2View.getTag(2113929216);
        if (object instanceof x) {
          object = (x)object;
        } else {
          object = null;
        } 
        if (object != null)
          object.a(param2View); 
      }
      
      public void b(View param2View) {
        if (u.c(this.a) >= 0) {
          l.a(param2View, u.c(this.a), null);
          u.a(this.a, -1);
        } 
        if (u.b(this.a) != null)
          u.b(this.a).run(); 
        Object object = param2View.getTag(2113929216);
        if (object instanceof x) {
          object = (x)object;
        } else {
          object = null;
        } 
        if (object != null)
          object.b(param2View); 
      }
      
      public void c(View param2View) {
        Object object = param2View.getTag(2113929216);
        if (object instanceof x) {
          object = (x)object;
        } else {
          object = null;
        } 
        if (object != null)
          object.c(param2View); 
      }
    }
  }
  
  static class a implements x {
    u a;
    
    a(u param1u) { this.a = param1u; }
    
    public void a(View param1View) {
      if (u.c(this.a) >= 0)
        l.a(param1View, 2, null); 
      if (u.a(this.a) != null)
        u.a(this.a).run(); 
      Object object = param1View.getTag(2113929216);
      if (object instanceof x) {
        object = (x)object;
      } else {
        object = null;
      } 
      if (object != null)
        object.a(param1View); 
    }
    
    public void b(View param1View) {
      if (u.c(this.a) >= 0) {
        l.a(param1View, u.c(this.a), null);
        u.a(this.a, -1);
      } 
      if (u.b(this.a) != null)
        u.b(this.a).run(); 
      Object object = param1View.getTag(2113929216);
      if (object instanceof x) {
        object = (x)object;
      } else {
        object = null;
      } 
      if (object != null)
        object.b(param1View); 
    }
    
    public void c(View param1View) {
      Object object = param1View.getTag(2113929216);
      if (object instanceof x) {
        object = (x)object;
      } else {
        object = null;
      } 
      if (object != null)
        object.c(param1View); 
    }
  }
  
  static class c extends d {}
  
  static class d extends b {
    public void a(u param1u, View param1View, x param1x) { w.a(param1View, param1x); }
  }
  
  static class e extends c {}
  
  static class f extends e {}
  
  static interface g {
    void a(u param1u, View param1View);
    
    void a(u param1u, View param1View, float param1Float);
    
    void a(u param1u, View param1View, x param1x);
  }
}
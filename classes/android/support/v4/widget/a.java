package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.h.i;
import android.support.v4.h.l;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a implements View.OnTouchListener {
  private static final int r = ViewConfiguration.getTapTimeout();
  
  private final a a = new a();
  
  private final Interpolator b = new AccelerateInterpolator();
  
  private final View c;
  
  private Runnable d;
  
  private float[] e = { 0.0F, 0.0F };
  
  private float[] f = { Float.MAX_VALUE, Float.MAX_VALUE };
  
  private int g;
  
  private int h;
  
  private float[] i = { 0.0F, 0.0F };
  
  private float[] j = { 0.0F, 0.0F };
  
  private float[] k = { Float.MAX_VALUE, Float.MAX_VALUE };
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private boolean q;
  
  public a(View paramView) {
    this.c = paramView;
    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
    int i1 = (int)(1575.0F * displayMetrics.density + 0.5F);
    int i2 = (int)(displayMetrics.density * 315.0F + 0.5F);
    a(i1, i1);
    b(i2, i2);
    a(1);
    e(Float.MAX_VALUE, Float.MAX_VALUE);
    d(0.2F, 0.2F);
    c(1.0F, 1.0F);
    b(r);
    c(500);
    d(500);
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    float f1 = 0.0F;
    paramFloat1 = b(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat3 = f(paramFloat4, paramFloat1);
    paramFloat2 = f(paramFloat2 - paramFloat4, paramFloat1) - paramFloat3;
    if (paramFloat2 < 0.0F) {
      paramFloat1 = -this.b.getInterpolation(-paramFloat2);
    } else {
      paramFloat1 = f1;
      if (paramFloat2 > 0.0F) {
        paramFloat1 = this.b.getInterpolation(paramFloat2);
      } else {
        return paramFloat1;
      } 
    } 
    return b(paramFloat1, -1.0F, 1.0F);
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramFloat1 = a(this.e[paramInt], paramFloat2, this.f[paramInt], paramFloat1);
    if (paramFloat1 == 0.0F)
      return 0.0F; 
    float f2 = this.i[paramInt];
    paramFloat2 = this.j[paramInt];
    float f1 = this.k[paramInt];
    paramFloat3 = f2 * paramFloat3;
    return (paramFloat1 > 0.0F) ? b(paramFloat1 * paramFloat3, paramFloat2, f1) : -b(-paramFloat1 * paramFloat3, paramFloat2, f1);
  }
  
  private boolean a() {
    a a1 = this.a;
    int i1 = a1.f();
    int i2 = a1.e();
    return ((i1 != 0 && f(i1)) || (i2 != 0 && e(i2)));
  }
  
  private static float b(float paramFloat1, float paramFloat2, float paramFloat3) { return (paramFloat1 > paramFloat3) ? paramFloat3 : ((paramFloat1 < paramFloat2) ? paramFloat2 : paramFloat1); }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3) { return (paramInt1 > paramInt3) ? paramInt3 : ((paramInt1 < paramInt2) ? paramInt2 : paramInt1); }
  
  private void b() {
    if (this.d == null)
      this.d = new b(this, null); 
    this.o = true;
    this.m = true;
    if (!this.l && this.h > 0) {
      l.a(this.c, this.d, this.h);
    } else {
      this.d.run();
    } 
    this.l = true;
  }
  
  private void c() {
    if (this.m) {
      this.o = false;
      return;
    } 
    this.a.b();
  }
  
  private void d() {
    long l1 = SystemClock.uptimeMillis();
    MotionEvent motionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
    this.c.onTouchEvent(motionEvent);
    motionEvent.recycle();
  }
  
  private float f(float paramFloat1, float paramFloat2) {
    if (paramFloat2 != 0.0F) {
      switch (this.g) {
        default:
          return 0.0F;
        case 0:
        case 1:
          if (paramFloat1 < paramFloat2) {
            if (paramFloat1 >= 0.0F)
              return 1.0F - paramFloat1 / paramFloat2; 
            if (this.o && this.g == 1)
              return 1.0F; 
          } 
          return 0.0F;
        case 2:
          break;
      } 
      if (paramFloat1 < 0.0F)
        return paramFloat1 / -paramFloat2; 
    } 
    return 0.0F;
  }
  
  public a a(float paramFloat1, float paramFloat2) {
    this.k[0] = paramFloat1 / 1000.0F;
    this.k[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  public a a(int paramInt) {
    this.g = paramInt;
    return this;
  }
  
  public a a(boolean paramBoolean) {
    if (this.p && !paramBoolean)
      c(); 
    this.p = paramBoolean;
    return this;
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public a b(float paramFloat1, float paramFloat2) {
    this.j[0] = paramFloat1 / 1000.0F;
    this.j[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  public a b(int paramInt) {
    this.h = paramInt;
    return this;
  }
  
  public a c(float paramFloat1, float paramFloat2) {
    this.i[0] = paramFloat1 / 1000.0F;
    this.i[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  public a c(int paramInt) {
    this.a.a(paramInt);
    return this;
  }
  
  public a d(float paramFloat1, float paramFloat2) {
    this.e[0] = paramFloat1;
    this.e[1] = paramFloat2;
    return this;
  }
  
  public a d(int paramInt) {
    this.a.b(paramInt);
    return this;
  }
  
  public a e(float paramFloat1, float paramFloat2) {
    this.f[0] = paramFloat1;
    this.f[1] = paramFloat2;
    return this;
  }
  
  public abstract boolean e(int paramInt);
  
  public abstract boolean f(int paramInt);
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    float f2;
    float f1;
    null = true;
    if (!this.p)
      return false; 
    switch (i.a(paramMotionEvent)) {
      default:
        if (this.q && this.o)
          return null; 
        break;
      case 0:
        this.n = true;
        this.l = false;
      case 2:
        f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.c.getWidth());
        f2 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.c.getHeight());
        this.a.a(f1, f2);
        if (!this.o && a())
          b(); 
      case 1:
      case 3:
        c();
    } 
    return false;
  }
  
  private static class a {
    private int a;
    
    private int b;
    
    private float c;
    
    private float d;
    
    private long e = Float.MIN_VALUE;
    
    private long f = 0L;
    
    private int g = 0;
    
    private int h = 0;
    
    private long i = -1L;
    
    private float j;
    
    private int k;
    
    private float a(float param1Float) { return -4.0F * param1Float * param1Float + 4.0F * param1Float; }
    
    private float a(long param1Long) {
      if (param1Long < this.e)
        return 0.0F; 
      if (this.i < 0L || param1Long < this.i)
        return a.a((float)(param1Long - this.e) / this.a, 0.0F, 1.0F) * 0.5F; 
      long l = this.i;
      float f1 = this.j;
      float f2 = this.j;
      return a.a((float)(param1Long - l) / this.k, 0.0F, 1.0F) * f2 + 1.0F - f1;
    }
    
    public void a() {
      this.e = AnimationUtils.currentAnimationTimeMillis();
      this.i = -1L;
      this.f = this.e;
      this.j = 0.5F;
      this.g = 0;
      this.h = 0;
    }
    
    public void a(float param1Float1, float param1Float2) {
      this.c = param1Float1;
      this.d = param1Float2;
    }
    
    public void a(int param1Int) { this.a = param1Int; }
    
    public void b() {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.k = a.a((int)(l - this.e), 0, this.b);
      this.j = a(l);
      this.i = l;
    }
    
    public void b(int param1Int) { this.b = param1Int; }
    
    public boolean c() { return (this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + this.k); }
    
    public void d() {
      if (this.f == 0L)
        throw new RuntimeException("Cannot compute scroll delta before calling start()"); 
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      float f1 = a(a(l1));
      long l2 = l1 - this.f;
      this.f = l1;
      this.g = (int)((float)l2 * f1 * this.c);
      this.h = (int)((float)l2 * f1 * this.d);
    }
    
    public int e() { return (int)(this.c / Math.abs(this.c)); }
    
    public int f() { return (int)(this.d / Math.abs(this.d)); }
    
    public int g() { return this.g; }
    
    public int h() { return this.h; }
  }
  
  private class b implements Runnable {
    private b(a this$0) {}
    
    public void run() {
      if (!a.a(this.a))
        return; 
      if (a.b(this.a)) {
        a.a(this.a, false);
        a.c(this.a).a();
      } 
      a.a a1 = a.c(this.a);
      if (a1.c() || !a.d(this.a)) {
        a.b(this.a, false);
        return;
      } 
      if (a.e(this.a)) {
        a.c(this.a, false);
        a.f(this.a);
      } 
      a1.d();
      int i = a1.g();
      int j = a1.h();
      this.a.a(i, j);
      l.a(a.g(this.a), this);
    }
  }
}

package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

public class a {
  static final b a;
  
  static  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      a = new h();
      return;
    } 
    if (i >= 22) {
      a = new g();
      return;
    } 
    if (i >= 21) {
      a = new f();
      return;
    } 
    if (i >= 19) {
      a = new e();
      return;
    } 
    if (i >= 17) {
      a = new d();
      return;
    } 
    if (i >= 11) {
      a = new c();
      return;
    } 
    a = new a();
  }
  
  public static void a(Drawable paramDrawable) { a.a(paramDrawable); }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) { a.a(paramDrawable, paramFloat1, paramFloat2); }
  
  public static void a(Drawable paramDrawable, int paramInt) { a.a(paramDrawable, paramInt); }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { a.a(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList) { a.a(paramDrawable, paramColorStateList); }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode) { a.a(paramDrawable, paramMode); }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean) { a.a(paramDrawable, paramBoolean); }
  
  public static boolean b(Drawable paramDrawable) { return a.b(paramDrawable); }
  
  public static Drawable c(Drawable paramDrawable) { return a.c(paramDrawable); }
  
  static class a implements b {
    public void a(Drawable param1Drawable) {}
    
    public void a(Drawable param1Drawable, float param1Float1, float param1Float2) {}
    
    public void a(Drawable param1Drawable, int param1Int) { c.a(param1Drawable, param1Int); }
    
    public void a(Drawable param1Drawable, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    public void a(Drawable param1Drawable, ColorStateList param1ColorStateList) { c.a(param1Drawable, param1ColorStateList); }
    
    public void a(Drawable param1Drawable, PorterDuff.Mode param1Mode) { c.a(param1Drawable, param1Mode); }
    
    public void a(Drawable param1Drawable, boolean param1Boolean) {}
    
    public boolean b(Drawable param1Drawable) { return false; }
    
    public Drawable c(Drawable param1Drawable) { return c.a(param1Drawable); }
  }
  
  static interface b {
    void a(Drawable param1Drawable);
    
    void a(Drawable param1Drawable, float param1Float1, float param1Float2);
    
    void a(Drawable param1Drawable, int param1Int);
    
    void a(Drawable param1Drawable, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
    
    void a(Drawable param1Drawable, ColorStateList param1ColorStateList);
    
    void a(Drawable param1Drawable, PorterDuff.Mode param1Mode);
    
    void a(Drawable param1Drawable, boolean param1Boolean);
    
    boolean b(Drawable param1Drawable);
    
    Drawable c(Drawable param1Drawable);
  }
  
  static class c extends a {
    public void a(Drawable param1Drawable) { d.a(param1Drawable); }
    
    public Drawable c(Drawable param1Drawable) { return d.b(param1Drawable); }
  }
  
  static class d extends c {}
  
  static class e extends d {
    public void a(Drawable param1Drawable, boolean param1Boolean) { e.a(param1Drawable, param1Boolean); }
    
    public boolean b(Drawable param1Drawable) { return e.a(param1Drawable); }
    
    public Drawable c(Drawable param1Drawable) { return e.b(param1Drawable); }
  }
  
  static class f extends e {
    public void a(Drawable param1Drawable, float param1Float1, float param1Float2) { f.a(param1Drawable, param1Float1, param1Float2); }
    
    public void a(Drawable param1Drawable, int param1Int) { f.a(param1Drawable, param1Int); }
    
    public void a(Drawable param1Drawable, int param1Int1, int param1Int2, int param1Int3, int param1Int4) { f.a(param1Drawable, param1Int1, param1Int2, param1Int3, param1Int4); }
    
    public void a(Drawable param1Drawable, ColorStateList param1ColorStateList) { f.a(param1Drawable, param1ColorStateList); }
    
    public void a(Drawable param1Drawable, PorterDuff.Mode param1Mode) { f.a(param1Drawable, param1Mode); }
    
    public Drawable c(Drawable param1Drawable) { return f.a(param1Drawable); }
  }
  
  static class g extends f {
    public Drawable c(Drawable param1Drawable) { return b.a(param1Drawable); }
  }
  
  static class h extends g {}
}
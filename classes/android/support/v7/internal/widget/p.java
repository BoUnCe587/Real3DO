package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class p {
  private final Context a;
  
  private final TypedArray b;
  
  private o c;
  
  private p(Context paramContext, TypedArray paramTypedArray) {
    this.a = paramContext;
    this.b = paramTypedArray;
  }
  
  public static p a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt) { return new p(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt)); }
  
  public static p a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2) { return new p(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2)); }
  
  public float a(int paramInt, float paramFloat) { return this.b.getFloat(paramInt, paramFloat); }
  
  public int a() { return this.b.length(); }
  
  public int a(int paramInt1, int paramInt2) { return this.b.getInt(paramInt1, paramInt2); }
  
  public Drawable a(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
        return c().a(i); 
    } 
    return this.b.getDrawable(paramInt);
  }
  
  public boolean a(int paramInt, boolean paramBoolean) { return this.b.getBoolean(paramInt, paramBoolean); }
  
  public int b(int paramInt1, int paramInt2) { return this.b.getColor(paramInt1, paramInt2); }
  
  public CharSequence b(int paramInt) { return this.b.getText(paramInt); }
  
  public void b() { this.b.recycle(); }
  
  public int c(int paramInt1, int paramInt2) { return this.b.getInteger(paramInt1, paramInt2); }
  
  public o c() {
    if (this.c == null)
      this.c = o.a(this.a); 
    return this.c;
  }
  
  public String c(int paramInt) { return this.b.getString(paramInt); }
  
  public int d(int paramInt1, int paramInt2) { return this.b.getDimensionPixelOffset(paramInt1, paramInt2); }
  
  public boolean d(int paramInt) { return this.b.hasValue(paramInt); }
  
  public int e(int paramInt1, int paramInt2) { return this.b.getDimensionPixelSize(paramInt1, paramInt2); }
  
  public int f(int paramInt1, int paramInt2) { return this.b.getLayoutDimension(paramInt1, paramInt2); }
  
  public int g(int paramInt1, int paramInt2) { return this.b.getResourceId(paramInt1, paramInt2); }
}
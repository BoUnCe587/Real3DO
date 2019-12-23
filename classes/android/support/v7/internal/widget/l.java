package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.c.a;
import android.util.TypedValue;

public class l {
  static final int[] a;
  
  static final int[] b;
  
  static final int[] c;
  
  static final int[] d;
  
  static final int[] e;
  
  static final int[] f;
  
  static final int[] g;
  
  static final int[] h;
  
  private static final ThreadLocal<TypedValue> i = new ThreadLocal();
  
  private static final int[] j;
  
  static  {
    a = new int[] { -16842910 };
    b = new int[] { 16842908 };
    c = new int[] { 16843518 };
    d = new int[] { 16842919 };
    e = new int[] { 16842912 };
    f = new int[] { 16842913 };
    g = new int[] { -16842919, -16842908 };
    h = new int[0];
    j = new int[1];
  }
  
  public static int a(Context paramContext, int paramInt) {
    j[0] = paramInt;
    typedArray = paramContext.obtainStyledAttributes(null, j);
    try {
      return typedArray.getColor(0, 0);
    } finally {
      typedArray.recycle();
    } 
  }
  
  static int a(Context paramContext, int paramInt, float paramFloat) {
    paramInt = a(paramContext, paramInt);
    return a.b(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }
  
  public static ColorStateList a(int paramInt1, int paramInt2) { return new ColorStateList(new int[][] { a, h }, new int[] { paramInt2, paramInt1 }); }
  
  private static TypedValue a() {
    TypedValue typedValue2 = (TypedValue)i.get();
    TypedValue typedValue1 = typedValue2;
    if (typedValue2 == null) {
      typedValue1 = new TypedValue();
      i.set(typedValue1);
    } 
    return typedValue1;
  }
  
  public static ColorStateList b(Context paramContext, int paramInt) {
    j[0] = paramInt;
    typedArray = paramContext.obtainStyledAttributes(null, j);
    try {
      return typedArray.getColorStateList(0);
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static int c(Context paramContext, int paramInt) {
    ColorStateList colorStateList = b(paramContext, paramInt);
    if (colorStateList != null && colorStateList.isStateful())
      return colorStateList.getColorForState(a, colorStateList.getDefaultColor()); 
    TypedValue typedValue = a();
    paramContext.getTheme().resolveAttribute(16842803, typedValue, true);
    return a(paramContext, paramInt, typedValue.getFloat());
  }
}
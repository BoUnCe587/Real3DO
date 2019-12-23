package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class k {
  public static int a(Object paramObject) { return ((OverScroller)paramObject).getFinalY(); }
  
  public static Object a(Context paramContext, Interpolator paramInterpolator) { return (paramInterpolator != null) ? new OverScroller(paramContext, paramInterpolator) : new OverScroller(paramContext); }
  
  public static void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) { ((OverScroller)paramObject).fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8); }
}
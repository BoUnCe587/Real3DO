package android.support.v4.h;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class n {
  public static int a(int paramInt1, int paramInt2, int paramInt3) { return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3); }
  
  public static int a(View paramView) { return paramView.getMeasuredState(); }
  
  static long a() { return ValueAnimator.getFrameDelay(); }
  
  public static void a(View paramView, float paramFloat) { paramView.setTranslationY(paramFloat); }
  
  public static void a(View paramView, int paramInt, Paint paramPaint) { paramView.setLayerType(paramInt, paramPaint); }
  
  public static void a(View paramView, boolean paramBoolean) { paramView.setActivated(paramBoolean); }
  
  public static float b(View paramView) { return paramView.getTranslationY(); }
  
  public static void c(View paramView) { paramView.jumpDrawablesToCurrentState(); }
}
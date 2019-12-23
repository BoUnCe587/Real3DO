package android.support.v4.h;

import android.view.View;

class o {
  public static int a(View paramView) { return paramView.getMinimumHeight(); }
  
  public static void a(View paramView, Runnable paramRunnable) { paramView.postOnAnimation(paramRunnable); }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong) { paramView.postOnAnimationDelayed(paramRunnable, paramLong); }
  
  public static void b(View paramView) { paramView.requestFitSystemWindows(); }
}

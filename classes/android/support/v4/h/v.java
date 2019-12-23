package android.support.v4.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class v {
  public static void a(View paramView) { paramView.animate().cancel(); }
  
  public static void a(View paramView, float paramFloat) { paramView.animate().translationY(paramFloat); }
  
  public static void a(View paramView, x paramx) {
    if (paramx != null) {
      paramView.animate().setListener(new AnimatorListenerAdapter(paramx, paramView) {
            public void onAnimationCancel(Animator param1Animator) { this.a.c(this.b); }
            
            public void onAnimationEnd(Animator param1Animator) { this.a.b(this.b); }
            
            public void onAnimationStart(Animator param1Animator) { this.a.a(this.b); }
          });
      return;
    } 
    paramView.animate().setListener(null);
  }
}
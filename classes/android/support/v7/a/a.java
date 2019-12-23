package android.support.v7.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
  public static class a extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, a.j.ActionBarLayout);
      this.a = typedArray.getInt(a.j.ActionBarLayout_android_layout_gravity, 0);
      typedArray.recycle();
    }
    
    public a(a param1a) {
      super(param1a);
      this.a = param1a.a;
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) { super(param1LayoutParams); }
  }
  
  public static abstract class b {
    public abstract Drawable a();
    
    public abstract CharSequence b();
    
    public abstract View c();
    
    public abstract void d();
    
    public abstract CharSequence e();
  }
}
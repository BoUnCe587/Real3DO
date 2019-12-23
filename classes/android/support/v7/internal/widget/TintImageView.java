package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TintImageView extends ImageView {
  private static final int[] a = { 16842964, 16843033 };
  
  private final o b;
  
  public TintImageView(Context paramContext) { this(paramContext, null); }
  
  public TintImageView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public TintImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    p p = p.a(getContext(), paramAttributeSet, a, paramInt, 0);
    if (p.a() > 0) {
      if (p.d(0))
        setBackgroundDrawable(p.a(0)); 
      if (p.d(1))
        setImageDrawable(p.a(1)); 
    } 
    p.b();
    this.b = p.c();
  }
  
  public void setImageResource(int paramInt) { setImageDrawable(this.b.a(paramInt)); }
}
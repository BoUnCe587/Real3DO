package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class f extends TextView {
  private e a = new e(this);
  
  public f(Context paramContext) { this(paramContext, null); }
  
  public f(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 16842884); }
  
  public f(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (this.a != null)
      this.a.a(paramContext, paramInt); 
  }
}
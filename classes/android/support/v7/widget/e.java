package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.b.a;
import android.support.v7.internal.a.a;
import android.support.v7.internal.widget.l;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class e {
  private static final int[] a = { 16842804 };
  
  private static final int[] b = { a.a.textAllCaps };
  
  private final TextView c;
  
  e(TextView paramTextView) { this.c = paramTextView; }
  
  void a(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, b);
    if (typedArray.hasValue(0))
      a(typedArray.getBoolean(0, false)); 
    typedArray.recycle();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    Context context = this.c.getContext();
    TypedArray typedArray2 = context.obtainStyledAttributes(paramAttributeSet, a, paramInt, 0);
    int i = typedArray2.getResourceId(0, -1);
    typedArray2.recycle();
    if (i != -1) {
      typedArray2 = context.obtainStyledAttributes(i, a.j.TextAppearance);
      if (typedArray2.hasValue(a.j.TextAppearance_textAllCaps))
        a(typedArray2.getBoolean(a.j.TextAppearance_textAllCaps, false)); 
      typedArray2.recycle();
    } 
    TypedArray typedArray1 = context.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    if (typedArray1.hasValue(0))
      a(typedArray1.getBoolean(0, false)); 
    typedArray1.recycle();
    ColorStateList colorStateList = this.c.getTextColors();
    if (colorStateList != null && !colorStateList.isStateful()) {
      if (Build.VERSION.SDK_INT < 21) {
        paramInt = l.c(context, 16842808);
      } else {
        paramInt = l.a(context, 16842808);
      } 
      this.c.setTextColor(l.a(colorStateList.getDefaultColor(), paramInt));
    } 
  }
  
  void a(boolean paramBoolean) {
    TransformationMethod transformationMethod;
    TextView textView = this.c;
    if (paramBoolean) {
      transformationMethod = new a(this.c.getContext());
    } else {
      transformationMethod = null;
    } 
    textView.setTransformationMethod(transformationMethod);
  }
}
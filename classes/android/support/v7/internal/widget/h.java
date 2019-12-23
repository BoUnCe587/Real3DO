package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class h extends ListView {
  private static final int[] f = { 0 };
  
  final Rect a = new Rect();
  
  int b = 0;
  
  int c = 0;
  
  int d = 0;
  
  int e = 0;
  
  private Field g;
  
  private a h;
  
  public h(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    try {
      this.g = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.g.setAccessible(true);
      return;
    } catch (NoSuchFieldException paramContext) {
      paramContext.printStackTrace();
      return;
    } 
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt2 = getListPaddingTop();
    int i = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    paramInt3 = getDividerHeight();
    Drawable drawable = getDivider();
    ListAdapter listAdapter = getAdapter();
    if (listAdapter == null)
      return paramInt2 + i; 
    paramInt2 = i + paramInt2;
    if (paramInt3 <= 0 || drawable == null)
      paramInt3 = 0; 
    int j = 0;
    drawable = null;
    int k = 0;
    int m = listAdapter.getCount();
    i = 0;
    while (i < m) {
      int n = listAdapter.getItemViewType(i);
      if (n != k) {
        drawable = null;
        k = n;
      } 
      View view = listAdapter.getView(i, drawable, this);
      ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
      if (layoutParams != null && layoutParams.height > 0) {
        n = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
      } else {
        n = View.MeasureSpec.makeMeasureSpec(0, 0);
      } 
      view.measure(paramInt1, n);
      if (i > 0)
        paramInt2 += paramInt3; 
      paramInt2 += view.getMeasuredHeight();
      if (paramInt2 >= paramInt4) {
        paramInt1 = paramInt4;
        if (paramInt5 >= 0) {
          paramInt1 = paramInt4;
          if (i > paramInt5) {
            paramInt1 = paramInt4;
            if (j) {
              paramInt1 = paramInt4;
              if (paramInt2 != paramInt4)
                return j; 
            } 
          } 
        } 
        return paramInt1;
      } 
      n = j;
      if (paramInt5 >= 0) {
        n = j;
        if (i >= paramInt5)
          n = paramInt2; 
      } 
      i++;
      j = n;
    } 
    return paramInt2;
  }
  
  protected void a() {
    Drawable drawable = getSelector();
    if (drawable != null && b())
      drawable.setState(getDrawableState()); 
  }
  
  protected void a(int paramInt, View paramView) {
    boolean bool;
    boolean bool1 = true;
    Drawable drawable = getSelector();
    if (drawable != null && paramInt != -1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      drawable.setVisible(false, false); 
    b(paramInt, paramView);
    if (bool) {
      Rect rect = this.a;
      float f1 = rect.exactCenterX();
      float f2 = rect.exactCenterY();
      if (getVisibility() != 0)
        bool1 = false; 
      drawable.setVisible(bool1, false);
      a.a(drawable, f1, f2);
    } 
  }
  
  protected void a(int paramInt, View paramView, float paramFloat1, float paramFloat2) {
    a(paramInt, paramView);
    Drawable drawable = getSelector();
    if (drawable != null && paramInt != -1)
      a.a(drawable, paramFloat1, paramFloat2); 
  }
  
  protected void a(Canvas paramCanvas) {
    if (!this.a.isEmpty()) {
      Drawable drawable = getSelector();
      if (drawable != null) {
        drawable.setBounds(this.a);
        drawable.draw(paramCanvas);
      } 
    } 
  }
  
  protected void b(int paramInt, View paramView) {
    Rect rect = this.a;
    rect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    rect.left -= this.b;
    rect.top -= this.c;
    rect.right += this.d;
    rect.bottom += this.e;
    try {
      boolean bool = this.g.getBoolean(this);
      if (paramView.isEnabled() != bool) {
        Field field = this.g;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        } 
        field.set(this, Boolean.valueOf(bool));
        if (paramInt != -1)
          refreshDrawableState(); 
      } 
      return;
    } catch (IllegalAccessException paramView) {
      paramView.printStackTrace();
      return;
    } 
  }
  
  protected boolean b() { return (c() && isPressed()); }
  
  protected boolean c() { return false; }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    a(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    setSelectorEnabled(true);
    a();
  }
  
  public void setSelector(Drawable paramDrawable) {
    if (paramDrawable != null) {
      rect = new a(paramDrawable);
    } else {
      rect = null;
    } 
    this.h = rect;
    super.setSelector(this.h);
    Rect rect = new Rect();
    if (paramDrawable != null)
      paramDrawable.getPadding(rect); 
    this.b = rect.left;
    this.c = rect.top;
    this.d = rect.right;
    this.e = rect.bottom;
  }
  
  protected void setSelectorEnabled(boolean paramBoolean) {
    if (this.h != null)
      this.h.a(paramBoolean); 
  }
  
  private static class a extends b {
    private boolean a = true;
    
    public a(Drawable param1Drawable) { super(param1Drawable); }
    
    void a(boolean param1Boolean) { this.a = param1Boolean; }
    
    public void draw(Canvas param1Canvas) {
      if (this.a)
        super.draw(param1Canvas); 
    }
    
    public void setHotspot(float param1Float1, float param1Float2) {
      if (this.a)
        super.setHotspot(param1Float1, param1Float2); 
    }
    
    public void setHotspotBounds(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (this.a)
        super.setHotspotBounds(param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public boolean setState(int[] param1ArrayOfInt) { return this.a ? super.setState(param1ArrayOfInt) : 0; }
    
    public boolean setVisible(boolean param1Boolean1, boolean param1Boolean2) { return this.a ? super.setVisible(param1Boolean1, param1Boolean2) : 0; }
  }
}
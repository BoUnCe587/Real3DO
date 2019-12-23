package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class h extends Drawable implements Drawable.Callback, g {
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  
  Drawable b;
  
  private ColorStateList c;
  
  private PorterDuff.Mode d = a;
  
  private int e;
  
  private PorterDuff.Mode f;
  
  private boolean g;
  
  h(Drawable paramDrawable) { a(paramDrawable); }
  
  private boolean a(int[] paramArrayOfInt) {
    if (this.c != null && this.d != null) {
      int i = this.c.getColorForState(paramArrayOfInt, this.c.getDefaultColor());
      PorterDuff.Mode mode = this.d;
      if (!this.g || i != this.e || mode != this.f) {
        setColorFilter(i, mode);
        this.e = i;
        this.f = mode;
        this.g = true;
        return true;
      } 
    } else {
      this.g = false;
      clearColorFilter();
    } 
    return false;
  }
  
  public void a(Drawable paramDrawable) {
    if (this.b != null)
      this.b.setCallback(null); 
    this.b = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this); 
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas) { this.b.draw(paramCanvas); }
  
  public int getChangingConfigurations() { return this.b.getChangingConfigurations(); }
  
  public Drawable getCurrent() { return this.b.getCurrent(); }
  
  public int getIntrinsicHeight() { return this.b.getIntrinsicHeight(); }
  
  public int getIntrinsicWidth() { return this.b.getIntrinsicWidth(); }
  
  public int getMinimumHeight() { return this.b.getMinimumHeight(); }
  
  public int getMinimumWidth() { return this.b.getMinimumWidth(); }
  
  public int getOpacity() { return this.b.getOpacity(); }
  
  public boolean getPadding(Rect paramRect) { return this.b.getPadding(paramRect); }
  
  public int[] getState() { return this.b.getState(); }
  
  public Region getTransparentRegion() { return this.b.getTransparentRegion(); }
  
  public void invalidateDrawable(Drawable paramDrawable) { invalidateSelf(); }
  
  public boolean isStateful() { return ((this.c != null && this.c.isStateful()) || this.b.isStateful()); }
  
  public Drawable mutate() {
    Drawable drawable1 = this.b;
    Drawable drawable2 = drawable1.mutate();
    if (drawable2 != drawable1)
      a(drawable2); 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) { this.b.setBounds(paramRect); }
  
  protected boolean onLevelChange(int paramInt) { return this.b.setLevel(paramInt); }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) { scheduleSelf(paramRunnable, paramLong); }
  
  public void setAlpha(int paramInt) { this.b.setAlpha(paramInt); }
  
  public void setChangingConfigurations(int paramInt) { this.b.setChangingConfigurations(paramInt); }
  
  public void setColorFilter(ColorFilter paramColorFilter) { this.b.setColorFilter(paramColorFilter); }
  
  public void setDither(boolean paramBoolean) { this.b.setDither(paramBoolean); }
  
  public void setFilterBitmap(boolean paramBoolean) { this.b.setFilterBitmap(paramBoolean); }
  
  public boolean setState(int[] paramArrayOfInt) {
    boolean bool = this.b.setState(paramArrayOfInt);
    return (a(paramArrayOfInt) || bool);
  }
  
  public void setTint(int paramInt) { setTintList(ColorStateList.valueOf(paramInt)); }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.c = paramColorStateList;
    a(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.d = paramMode;
    a(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) { return (super.setVisible(paramBoolean1, paramBoolean2) || this.b.setVisible(paramBoolean1, paramBoolean2)); }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) { unscheduleSelf(paramRunnable); }
}
package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

class k extends j {
  k(Drawable paramDrawable) { super(paramDrawable); }
  
  public void applyTheme(Resources.Theme paramTheme) { this.b.applyTheme(paramTheme); }
  
  public boolean canApplyTheme() { return this.b.canApplyTheme(); }
  
  public Rect getDirtyBounds() { return this.b.getDirtyBounds(); }
  
  public void getOutline(Outline paramOutline) { this.b.getOutline(paramOutline); }
  
  public void setHotspot(float paramFloat1, float paramFloat2) { this.b.setHotspot(paramFloat1, paramFloat2); }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.b.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4); }
}
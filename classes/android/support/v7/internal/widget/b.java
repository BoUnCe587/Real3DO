package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class b extends Drawable {
  final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer) { this.a = paramActionBarContainer; }
  
  public void draw(Canvas paramCanvas) {
    if (this.a.d) {
      if (this.a.c != null)
        this.a.c.draw(paramCanvas); 
      return;
    } 
    if (this.a.a != null)
      this.a.a.draw(paramCanvas); 
    if (this.a.b != null && this.a.e) {
      this.a.b.draw(paramCanvas);
      return;
    } 
  }
  
  public int getOpacity() { return 0; }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}
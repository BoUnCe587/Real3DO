package android.support.v7.internal.widget;

import android.graphics.Outline;

class c extends b {
  public c(ActionBarContainer paramActionBarContainer) { super(paramActionBarContainer); }
  
  public void getOutline(Outline paramOutline) {
    if (this.a.d) {
      if (this.a.c != null)
        this.a.c.getOutline(paramOutline); 
      return;
    } 
    if (this.a.a != null) {
      this.a.a.getOutline(paramOutline);
      return;
    } 
  }
}

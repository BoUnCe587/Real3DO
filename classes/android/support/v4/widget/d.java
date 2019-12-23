package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public class d extends a {
  private final ListView a;
  
  public d(ListView paramListView) {
    super(paramListView);
    this.a = paramListView;
  }
  
  public void a(int paramInt1, int paramInt2) {
    ListView listView = this.a;
    paramInt1 = listView.getFirstVisiblePosition();
    if (paramInt1 != -1) {
      View view = listView.getChildAt(0);
      if (view != null) {
        listView.setSelectionFromTop(paramInt1, view.getTop() - paramInt2);
        return;
      } 
    } 
  }
  
  public boolean e(int paramInt) { return false; }
  
  public boolean f(int paramInt) {
    ListView listView = this.a;
    int i = listView.getCount();
    if (i != 0) {
      int j = listView.getChildCount();
      int k = listView.getFirstVisiblePosition();
      if (paramInt > 0)
        return (k + j < i || listView.getChildAt(j - 1).getBottom() > listView.getHeight()); 
      if (paramInt < 0)
        return !(k <= 0 && listView.getChildAt(0).getTop() >= 0); 
    } 
    return false;
  }
}
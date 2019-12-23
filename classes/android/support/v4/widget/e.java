package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

public class e {
  static final f a;
  
  static  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      a = new b();
      return;
    } 
    if (i >= 21) {
      a = new a();
      return;
    } 
    if (i >= 19) {
      a = new e();
      return;
    } 
    if (i >= 9) {
      a = new d();
      return;
    } 
    a = new c();
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3) { a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3); }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean) { a.a(paramPopupWindow, paramBoolean); }
  
  static class a extends e {
    public void a(PopupWindow param1PopupWindow, boolean param1Boolean) { f.a(param1PopupWindow, param1Boolean); }
  }
  
  static class b extends a {
    public void a(PopupWindow param1PopupWindow, boolean param1Boolean) { g.a(param1PopupWindow, param1Boolean); }
  }
  
  static class c implements f {
    public void a(PopupWindow param1PopupWindow, View param1View, int param1Int1, int param1Int2, int param1Int3) { param1PopupWindow.showAsDropDown(param1View, param1Int1, param1Int2); }
    
    public void a(PopupWindow param1PopupWindow, boolean param1Boolean) {}
  }
  
  static class d extends c {}
  
  static class e extends d {
    public void a(PopupWindow param1PopupWindow, View param1View, int param1Int1, int param1Int2, int param1Int3) { h.a(param1PopupWindow, param1View, param1Int1, param1Int2, param1Int3); }
  }
  
  static interface f {
    void a(PopupWindow param1PopupWindow, View param1View, int param1Int1, int param1Int2, int param1Int3);
    
    void a(PopupWindow param1PopupWindow, boolean param1Boolean);
  }
}
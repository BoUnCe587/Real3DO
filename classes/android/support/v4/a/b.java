package android.support.v4.a;

import android.app.Activity;

class b {
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt) {
    if (paramActivity instanceof a)
      ((a)paramActivity).a(paramInt); 
    paramActivity.requestPermissions(paramArrayOfString, paramInt);
  }
  
  public static interface a {
    void a(int param1Int);
  }
}
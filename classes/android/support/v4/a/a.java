package android.support.v4.a;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.b.a;

public class a extends a {
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23) {
      b.a(paramActivity, paramArrayOfString, paramInt);
      return;
    } 
    if (paramActivity instanceof a) {
      (new Handler(Looper.getMainLooper())).post(new Runnable(paramArrayOfString, paramActivity, paramInt) {
            public void run() {
              int[] arrayOfInt = new int[this.a.length];
              PackageManager packageManager = this.b.getPackageManager();
              String str = this.b.getPackageName();
              int i = this.a.length;
              for (byte b1 = 0; b1 < i; b1++)
                arrayOfInt[b1] = packageManager.checkPermission(this.a[b1], str); 
              ((a.a)this.b).a(this.c, this.a, arrayOfInt);
            }
          });
      return;
    } 
  }
  
  public static interface a {
    void a(int param1Int, String[] param1ArrayOfString, int[] param1ArrayOfInt);
  }
}
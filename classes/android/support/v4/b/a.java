package android.support.v4.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;

public class a {
  public static int a(Context paramContext, String paramString) {
    if (paramString == null)
      throw new IllegalArgumentException("permission is null"); 
    return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
  }
  
  public static final Drawable a(Context paramContext, int paramInt) { return (Build.VERSION.SDK_INT >= 21) ? b.a(paramContext, paramInt) : paramContext.getResources().getDrawable(paramInt); }
}

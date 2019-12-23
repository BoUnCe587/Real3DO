package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.h.s;
import android.support.v7.b.a;
import android.view.ViewConfiguration;

public class a {
  private Context a;
  
  private a(Context paramContext) { this.a = paramContext; }
  
  public static a a(Context paramContext) { return new a(paramContext); }
  
  public int a() { return this.a.getResources().getInteger(a.f.abc_max_action_buttons); }
  
  public boolean b() { return !(Build.VERSION.SDK_INT < 19 && s.a(ViewConfiguration.get(this.a))); }
  
  public int c() { return (this.a.getResources().getDisplayMetrics()).widthPixels / 2; }
  
  public boolean d() { return ((this.a.getApplicationInfo()).targetSdkVersion >= 16) ? this.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs) : this.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs_pre_jb); }
  
  public int e() {
    TypedArray typedArray = this.a.obtainStyledAttributes(null, a.j.ActionBar, a.a.actionBarStyle, 0);
    int j = typedArray.getLayoutDimension(a.j.ActionBar_height, 0);
    Resources resources = this.a.getResources();
    int i = j;
    if (!d())
      i = Math.min(j, resources.getDimensionPixelSize(a.c.abc_action_bar_stacked_max_height)); 
    typedArray.recycle();
    return i;
  }
  
  public int f() { return this.a.getResources().getDimensionPixelSize(a.c.abc_action_bar_stacked_tab_max_width); }
}
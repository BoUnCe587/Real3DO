package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v4.b.a;
import android.support.v4.c.a;
import android.support.v4.c.a.a;
import android.support.v4.g.c;
import android.support.v7.b.a;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class o {
  public static final boolean a;
  
  private static final PorterDuff.Mode b;
  
  private static final WeakHashMap<Context, o> c;
  
  private static final a d;
  
  private static final int[] e;
  
  private static final int[] f;
  
  private static final int[] g;
  
  private static final int[] h;
  
  private static final int[] i;
  
  private static final int[] j;
  
  private final WeakReference<Context> k;
  
  private SparseArray<ColorStateList> l;
  
  private ColorStateList m;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
    b = PorterDuff.Mode.SRC_IN;
    c = new WeakHashMap();
    d = new a(6);
    e = new int[] { a.d.abc_textfield_search_default_mtrl_alpha, a.d.abc_textfield_default_mtrl_alpha, a.d.abc_ab_share_pack_mtrl_alpha };
    f = new int[] { 
        a.d.abc_ic_ab_back_mtrl_am_alpha, a.d.abc_ic_go_search_api_mtrl_alpha, a.d.abc_ic_search_api_mtrl_alpha, a.d.abc_ic_commit_search_api_mtrl_alpha, a.d.abc_ic_clear_mtrl_alpha, a.d.abc_ic_menu_share_mtrl_alpha, a.d.abc_ic_menu_copy_mtrl_am_alpha, a.d.abc_ic_menu_cut_mtrl_alpha, a.d.abc_ic_menu_selectall_mtrl_alpha, a.d.abc_ic_menu_paste_mtrl_am_alpha, 
        a.d.abc_ic_menu_moreoverflow_mtrl_alpha, a.d.abc_ic_voice_search_api_mtrl_alpha };
    g = new int[] { a.d.abc_textfield_activated_mtrl_alpha, a.d.abc_textfield_search_activated_mtrl_alpha, a.d.abc_cab_background_top_mtrl_alpha, a.d.abc_text_cursor_material };
    h = new int[] { a.d.abc_popup_background_mtrl_mult, a.d.abc_cab_background_internal_bg, a.d.abc_menu_hardkey_panel_mtrl_mult };
    i = new int[] { a.d.abc_edit_text_material, a.d.abc_tab_indicator_material, a.d.abc_textfield_search_material, a.d.abc_spinner_mtrl_am_alpha, a.d.abc_spinner_textfield_background_material, a.d.abc_ratingbar_full_material, a.d.abc_switch_track_mtrl_alpha, a.d.abc_switch_thumb_material, a.d.abc_btn_default_mtrl_shape, a.d.abc_btn_borderless_material };
    j = new int[] { a.d.abc_btn_check_material, a.d.abc_btn_radio_material };
  }
  
  private o(Context paramContext) { this.k = new WeakReference(paramContext); }
  
  private static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode) {
    PorterDuffColorFilter porterDuffColorFilter2 = d.a(paramInt, paramMode);
    PorterDuffColorFilter porterDuffColorFilter1 = porterDuffColorFilter2;
    if (porterDuffColorFilter2 == null) {
      porterDuffColorFilter1 = new PorterDuffColorFilter(paramInt, paramMode);
      d.a(paramInt, paramMode, porterDuffColorFilter1);
    } 
    return porterDuffColorFilter1;
  }
  
  private static PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt) { return (paramColorStateList == null || paramMode == null) ? null : a(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode); }
  
  public static Drawable a(Context paramContext, int paramInt) { return d(paramInt) ? a(paramContext).a(paramInt) : a.a(paramContext, paramInt); }
  
  public static o a(Context paramContext) {
    o o2 = (o)c.get(paramContext);
    o o1 = o2;
    if (o2 == null) {
      o1 = new o(paramContext);
      c.put(paramContext, o1);
    } 
    return o1;
  }
  
  public static void a(View paramView, n paramn) {
    Drawable drawable = paramView.getBackground();
    if (paramn.d || paramn.c) {
      ColorStateList colorStateList;
      PorterDuff.Mode mode;
      if (paramn.d) {
        colorStateList = paramn.a;
      } else {
        colorStateList = null;
      } 
      if (paramn.c) {
        mode = paramn.b;
      } else {
        mode = b;
      } 
      drawable.setColorFilter(a(colorStateList, mode, paramView.getDrawableState()));
    } else {
      drawable.clearColorFilter();
    } 
    if (Build.VERSION.SDK_INT <= 10)
      paramView.invalidate(); 
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt) {
    boolean bool = false;
    int n = paramArrayOfInt.length;
    for (byte b1 = 0;; b1++) {
      boolean bool1 = bool;
      if (b1 < n) {
        if (paramArrayOfInt[b1] == paramInt)
          return true; 
      } else {
        return bool1;
      } 
    } 
  }
  
  private ColorStateList b(Context paramContext) {
    if (this.m == null) {
      int n = l.a(paramContext, a.a.colorControlNormal);
      int i1 = l.a(paramContext, a.a.colorControlActivated);
      int[] arrayOfInt = l.a;
      int i2 = l.c(paramContext, a.a.colorControlNormal);
      this.m = new ColorStateList(new int[][] { arrayOfInt, l.b, l.c, l.d, l.e, l.f, l.h }, new int[] { i2, i1, i1, i1, i1, i1, n });
    } 
    return this.m;
  }
  
  private ColorStateList b(Context paramContext, int paramInt) {
    paramInt = l.a(paramContext, paramInt);
    int i2 = l.a(paramContext, a.a.colorControlHighlight);
    int[] arrayOfInt2 = l.a;
    int n = l.c(paramContext, a.a.colorButtonNormal);
    int[] arrayOfInt1 = l.d;
    int i1 = a.a(i2, paramInt);
    int[] arrayOfInt3 = l.b;
    i2 = a.a(i2, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt2, arrayOfInt1, arrayOfInt3, l.h }, new int[] { n, i1, i2, paramInt });
  }
  
  private ColorStateList c(Context paramContext) {
    int[] arrayOfInt1 = l.a;
    int n = l.c(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt2 = l.e;
    int i1 = l.a(paramContext, a.a.colorControlActivated);
    int[] arrayOfInt3 = l.h;
    int i2 = l.a(paramContext, a.a.colorControlNormal);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { n, i1, i2 });
  }
  
  private ColorStateList d(Context paramContext) {
    int[] arrayOfInt1 = l.a;
    int n = l.a(paramContext, 16842800, 0.1F);
    int[] arrayOfInt2 = l.e;
    int i1 = l.a(paramContext, a.a.colorControlActivated, 0.3F);
    int[] arrayOfInt3 = l.h;
    int i2 = l.a(paramContext, 16842800, 0.3F);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { n, i1, i2 });
  }
  
  private static boolean d(int paramInt) { return (a(f, paramInt) || a(e, paramInt) || a(g, paramInt) || a(i, paramInt) || a(h, paramInt) || a(j, paramInt) || paramInt == a.d.abc_cab_background_top_material); }
  
  private ColorStateList e(Context paramContext) {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList colorStateList = l.b(paramContext, a.a.colorSwitchThumbNormal);
    if (colorStateList != null && colorStateList.isStateful()) {
      arrayOfInt[0] = l.a;
      arrayOfInt1[0] = colorStateList.getColorForState(arrayOfInt[0], 0);
      arrayOfInt[1] = l.e;
      arrayOfInt1[1] = l.a(paramContext, a.a.colorControlActivated);
      arrayOfInt[2] = l.h;
      arrayOfInt1[2] = colorStateList.getDefaultColor();
      return new ColorStateList(arrayOfInt, arrayOfInt1);
    } 
    arrayOfInt[0] = l.a;
    arrayOfInt1[0] = l.c(paramContext, a.a.colorSwitchThumbNormal);
    arrayOfInt[1] = l.e;
    arrayOfInt1[1] = l.a(paramContext, a.a.colorControlActivated);
    arrayOfInt[2] = l.h;
    arrayOfInt1[2] = l.a(paramContext, a.a.colorSwitchThumbNormal);
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private ColorStateList f(Context paramContext) {
    int[] arrayOfInt1 = l.a;
    int n = l.c(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt2 = l.g;
    int i1 = l.a(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt3 = l.h;
    int i2 = l.a(paramContext, a.a.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { n, i1, i2 });
  }
  
  private ColorStateList g(Context paramContext) { return b(paramContext, a.a.colorButtonNormal); }
  
  private ColorStateList h(Context paramContext) { return b(paramContext, a.a.colorAccent); }
  
  private ColorStateList i(Context paramContext) {
    int[] arrayOfInt1 = l.a;
    int n = l.c(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt2 = l.g;
    int i1 = l.a(paramContext, a.a.colorControlNormal);
    int[] arrayOfInt3 = l.h;
    int i2 = l.a(paramContext, a.a.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { n, i1, i2 });
  }
  
  public Drawable a(int paramInt) { return a(paramInt, false); }
  
  public Drawable a(int paramInt, boolean paramBoolean) {
    Drawable drawable2;
    Context context = (Context)this.k.get();
    if (context == null)
      return null; 
    Drawable drawable3 = a.a(context, paramInt);
    Drawable drawable1 = drawable3;
    if (drawable3 != null) {
      drawable2 = drawable3;
      if (Build.VERSION.SDK_INT >= 8)
        drawable2 = drawable3.mutate(); 
      ColorStateList colorStateList = c(paramInt);
      if (colorStateList != null) {
        drawable2 = a.c(drawable2);
        a.a(drawable2, colorStateList);
        PorterDuff.Mode mode = b(paramInt);
        drawable1 = drawable2;
        if (mode != null) {
          a.a(drawable2, mode);
          drawable1 = drawable2;
        } 
        return drawable1;
      } 
    } else {
      return drawable1;
    } 
    if (paramInt == a.d.abc_cab_background_top_material)
      return new LayerDrawable(new Drawable[] { a(a.d.abc_cab_background_internal_bg), a(a.d.abc_cab_background_top_mtrl_alpha) }); 
    drawable1 = drawable2;
    if (!a(paramInt, drawable2)) {
      drawable1 = drawable2;
      if (paramBoolean)
        drawable1 = null; 
    } 
    return drawable1;
  }
  
  public final boolean a(int paramInt, Drawable paramDrawable) {
    boolean bool;
    byte b1;
    Context context = (Context)this.k.get();
    if (context == null)
      return false; 
    PorterDuff.Mode mode = b;
    if (a(e, paramInt)) {
      b1 = a.a.colorControlNormal;
      bool = true;
      paramInt = -1;
    } else if (a(g, paramInt)) {
      b1 = a.a.colorControlActivated;
      bool = true;
      paramInt = -1;
    } else if (a(h, paramInt)) {
      mode = PorterDuff.Mode.MULTIPLY;
      bool = true;
      b1 = 16842801;
      paramInt = -1;
    } else if (paramInt == a.d.abc_list_divider_mtrl_alpha) {
      b1 = 16842800;
      paramInt = Math.round(40.8F);
      bool = true;
    } else {
      paramInt = -1;
      b1 = 0;
      bool = false;
    } 
    if (bool) {
      paramDrawable.setColorFilter(a(l.a(context, b1), mode));
      if (paramInt != -1)
        paramDrawable.setAlpha(paramInt); 
      return true;
    } 
    return false;
  }
  
  final PorterDuff.Mode b(int paramInt) {
    PorterDuff.Mode mode = null;
    if (paramInt == a.d.abc_switch_thumb_material)
      mode = PorterDuff.Mode.MULTIPLY; 
    return mode;
  }
  
  public final ColorStateList c(int paramInt) {
    ColorStateList colorStateList = null;
    Context context = (Context)this.k.get();
    if (context == null)
      return null; 
    if (this.l != null)
      colorStateList = (ColorStateList)this.l.get(paramInt); 
    if (colorStateList == null) {
      if (paramInt == a.d.abc_edit_text_material) {
        colorStateList = f(context);
      } else if (paramInt == a.d.abc_switch_track_mtrl_alpha) {
        colorStateList = d(context);
      } else if (paramInt == a.d.abc_switch_thumb_material) {
        colorStateList = e(context);
      } else if (paramInt == a.d.abc_btn_default_mtrl_shape || paramInt == a.d.abc_btn_borderless_material) {
        colorStateList = g(context);
      } else if (paramInt == a.d.abc_btn_colored_material) {
        colorStateList = h(context);
      } else if (paramInt == a.d.abc_spinner_mtrl_am_alpha || paramInt == a.d.abc_spinner_textfield_background_material) {
        colorStateList = i(context);
      } else if (a(f, paramInt)) {
        colorStateList = l.b(context, a.a.colorControlNormal);
      } else if (a(i, paramInt)) {
        colorStateList = b(context);
      } else if (a(j, paramInt)) {
        colorStateList = c(context);
      } 
      ColorStateList colorStateList1 = colorStateList;
      if (colorStateList != null) {
        if (this.l == null)
          this.l = new SparseArray(); 
        this.l.append(paramInt, colorStateList);
        return colorStateList;
      } 
      return colorStateList1;
    } 
    return colorStateList;
  }
  
  private static class a extends c<Integer, PorterDuffColorFilter> {
    public a(int param1Int) { super(param1Int); }
    
    private static int b(int param1Int, PorterDuff.Mode param1Mode) { return (param1Int + 31) * 31 + param1Mode.hashCode(); }
    
    PorterDuffColorFilter a(int param1Int, PorterDuff.Mode param1Mode) { return (PorterDuffColorFilter)a(Integer.valueOf(b(param1Int, param1Mode))); }
    
    PorterDuffColorFilter a(int param1Int, PorterDuff.Mode param1Mode, PorterDuffColorFilter param1PorterDuffColorFilter) { return (PorterDuffColorFilter)a(Integer.valueOf(b(param1Int, param1Mode)), param1PorterDuffColorFilter); }
  }
}
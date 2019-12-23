package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class q implements f {
  private Toolbar a;
  
  private int b;
  
  private View c;
  
  private Drawable d;
  
  private Drawable e;
  
  private Drawable f;
  
  private boolean g;
  
  private CharSequence h;
  
  private CharSequence i;
  
  private CharSequence j;
  
  private Window.Callback k;
  
  private boolean l;
  
  private int m = 0;
  
  private final o n;
  
  private int o = 0;
  
  private Drawable p;
  
  public q(Toolbar paramToolbar, boolean paramBoolean) { this(paramToolbar, paramBoolean, a.h.abc_action_bar_up_description, a.d.abc_ic_ab_back_mtrl_am_alpha); }
  
  public q(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.a = paramToolbar;
    this.h = paramToolbar.getTitle();
    this.i = paramToolbar.getSubtitle();
    if (this.h != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = bool;
    this.f = paramToolbar.getNavigationIcon();
    if (paramBoolean) {
      p1 = p.a(paramToolbar.getContext(), null, a.j.ActionBar, a.a.actionBarStyle, 0);
      CharSequence charSequence = p1.b(a.j.ActionBar_title);
      if (!TextUtils.isEmpty(charSequence))
        b(charSequence); 
      charSequence = p1.b(a.j.ActionBar_subtitle);
      if (!TextUtils.isEmpty(charSequence))
        c(charSequence); 
      Drawable drawable = p1.a(a.j.ActionBar_logo);
      if (drawable != null)
        c(drawable); 
      drawable = p1.a(a.j.ActionBar_icon);
      if (this.f == null && drawable != null)
        a(drawable); 
      drawable = p1.a(a.j.ActionBar_homeAsUpIndicator);
      if (drawable != null)
        d(drawable); 
      d(p1.a(a.j.ActionBar_displayOptions, 0));
      int i1 = p1.g(a.j.ActionBar_customNavigationLayout, 0);
      if (i1 != 0) {
        a(LayoutInflater.from(this.a.getContext()).inflate(i1, this.a, false));
        d(this.b | 0x10);
      } 
      i1 = p1.f(a.j.ActionBar_height, 0);
      if (i1 > 0) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = i1;
        this.a.setLayoutParams(layoutParams);
      } 
      i1 = p1.d(a.j.ActionBar_contentInsetStart, -1);
      int i2 = p1.d(a.j.ActionBar_contentInsetEnd, -1);
      if (i1 >= 0 || i2 >= 0)
        this.a.a(Math.max(i1, 0), Math.max(i2, 0)); 
      i1 = p1.g(a.j.ActionBar_titleTextStyle, 0);
      if (i1 != 0)
        this.a.a(this.a.getContext(), i1); 
      i1 = p1.g(a.j.ActionBar_subtitleTextStyle, 0);
      if (i1 != 0)
        this.a.b(this.a.getContext(), i1); 
      i1 = p1.g(a.j.ActionBar_popupTheme, 0);
      if (i1 != 0)
        this.a.setPopupTheme(i1); 
      p1.b();
      this.n = p1.c();
    } else {
      this.b = c();
      this.n = o.a(p1.getContext());
    } 
    c(paramInt1);
    this.j = this.a.getNavigationContentDescription();
    b(this.n.a(paramInt2));
    this.a.setNavigationOnClickListener(new View.OnClickListener(this) {
          final a a = new a(q.a(this.b).getContext(), 0, 16908332, 0, 0, q.b(this.b));
          
          public void onClick(View param1View) {
            if (q.c(this.b) != null && q.d(this.b))
              q.c(this.b).onMenuItemSelected(0, this.a); 
          }
        });
  }
  
  private int c() {
    byte b1 = 11;
    if (this.a.getNavigationIcon() != null)
      b1 = 15; 
    return b1;
  }
  
  private void d() {
    Drawable drawable = null;
    if ((this.b & 0x2) != 0)
      if ((this.b & true) != 0) {
        if (this.e != null) {
          drawable = this.e;
        } else {
          drawable = this.d;
        } 
      } else {
        drawable = this.d;
      }  
    this.a.setLogo(drawable);
  }
  
  private void e() {
    if ((this.b & 0x4) != 0) {
      if (TextUtils.isEmpty(this.j)) {
        this.a.setNavigationContentDescription(this.o);
        return;
      } 
    } else {
      return;
    } 
    this.a.setNavigationContentDescription(this.j);
  }
  
  private void e(CharSequence paramCharSequence) {
    this.h = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setTitle(paramCharSequence); 
  }
  
  private void f() {
    if ((this.b & 0x4) != 0) {
      Drawable drawable;
      Toolbar toolbar = this.a;
      if (this.f != null) {
        drawable = this.f;
      } else {
        drawable = this.p;
      } 
      toolbar.setNavigationIcon(drawable);
    } 
  }
  
  public CharSequence a() { return this.a.getTitle(); }
  
  public void a(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = this.n.a(paramInt);
    } else {
      drawable = null;
    } 
    a(drawable);
  }
  
  public void a(Drawable paramDrawable) {
    this.d = paramDrawable;
    d();
  }
  
  public void a(View paramView) {
    if (this.c != null && (this.b & 0x10) != 0)
      this.a.removeView(this.c); 
    this.c = paramView;
    if (paramView != null && (this.b & 0x10) != 0)
      this.a.addView(this.c); 
  }
  
  public void a(Window.Callback paramCallback) { this.k = paramCallback; }
  
  public void a(CharSequence paramCharSequence) {
    if (!this.g)
      e(paramCharSequence); 
  }
  
  public Context b() { return this.a.getContext(); }
  
  public void b(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = this.n.a(paramInt);
    } else {
      drawable = null;
    } 
    c(drawable);
  }
  
  public void b(Drawable paramDrawable) {
    if (this.p != paramDrawable) {
      this.p = paramDrawable;
      f();
    } 
  }
  
  public void b(CharSequence paramCharSequence) {
    this.g = true;
    e(paramCharSequence);
  }
  
  public void c(int paramInt) {
    if (paramInt != this.o) {
      this.o = paramInt;
      if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
        e(this.o);
        return;
      } 
    } 
  }
  
  public void c(Drawable paramDrawable) {
    this.e = paramDrawable;
    d();
  }
  
  public void c(CharSequence paramCharSequence) {
    this.i = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setSubtitle(paramCharSequence); 
  }
  
  public void d(int paramInt) {
    int i1 = this.b ^ paramInt;
    this.b = paramInt;
    if (i1 != 0) {
      if ((i1 & 0x4) != 0)
        if ((paramInt & 0x4) != 0) {
          f();
          e();
        } else {
          this.a.setNavigationIcon(null);
        }  
      if ((i1 & 0x3) != 0)
        d(); 
      if ((i1 & 0x8) != 0)
        if ((paramInt & 0x8) != 0) {
          this.a.setTitle(this.h);
          this.a.setSubtitle(this.i);
        } else {
          this.a.setTitle(null);
          this.a.setSubtitle(null);
        }  
      if ((i1 & 0x10) != 0 && this.c != null) {
        if ((paramInt & 0x10) != 0) {
          this.a.addView(this.c);
          return;
        } 
      } else {
        return;
      } 
    } else {
      return;
    } 
    this.a.removeView(this.c);
  }
  
  public void d(Drawable paramDrawable) {
    this.f = paramDrawable;
    f();
  }
  
  public void d(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    e();
  }
  
  public void e(int paramInt) {
    String str;
    if (paramInt == 0) {
      str = null;
    } else {
      str = b().getString(paramInt);
    } 
    d(str);
  }
}
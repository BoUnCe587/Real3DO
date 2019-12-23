package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.h.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b implements j {
  protected Context a;
  
  protected Context b;
  
  protected e c;
  
  protected LayoutInflater d;
  
  protected LayoutInflater e;
  
  protected k f;
  
  private j.a g;
  
  private int h;
  
  private int i;
  
  public b(Context paramContext, int paramInt1, int paramInt2) {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public j.a a() { return this.g; }
  
  public k.a a(ViewGroup paramViewGroup) { return (k.a)this.d.inflate(this.i, paramViewGroup, false); }
  
  public View a(f paramf, View paramView, ViewGroup paramViewGroup) {
    if (paramView instanceof k.a) {
      k.a a2 = (k.a)paramView;
      a(paramf, a2);
      return (View)a2;
    } 
    k.a a1 = a(paramViewGroup);
    a(paramf, a1);
    return (View)a1;
  }
  
  public void a(Context paramContext, e parame) {
    this.b = paramContext;
    this.e = LayoutInflater.from(this.b);
    this.c = parame;
  }
  
  public void a(e parame, boolean paramBoolean) {
    if (this.g != null)
      this.g.a(parame, paramBoolean); 
  }
  
  public abstract void a(f paramf, k.a parama);
  
  public void a(j.a parama) { this.g = parama; }
  
  protected void a(View paramView, int paramInt) {
    ViewGroup viewGroup = (ViewGroup)paramView.getParent();
    if (viewGroup != null)
      viewGroup.removeView(paramView); 
    ((ViewGroup)this.f).addView(paramView, paramInt);
  }
  
  public boolean a(int paramInt, f paramf) { return true; }
  
  public boolean a(e parame, f paramf) { return false; }
  
  public boolean a(n paramn) { return (this.g != null) ? this.g.a(paramn) : 0; }
  
  protected boolean a(ViewGroup paramViewGroup, int paramInt) {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public void b(boolean paramBoolean) {
    ViewGroup viewGroup = (ViewGroup)this.f;
    if (viewGroup != null) {
      byte b1;
      if (this.c != null) {
        this.c.i();
        ArrayList arrayList = this.c.h();
        int m = arrayList.size();
        byte b3 = 0;
        byte b2 = 0;
        while (true) {
          b1 = b2;
          if (b3 < m) {
            f f1 = (f)arrayList.get(b3);
            if (a(b2, f1)) {
              Object object;
              View view1 = viewGroup.getChildAt(b2);
              if (view1 instanceof k.a) {
                object = ((k.a)view1).getItemData();
              } else {
                object = null;
              } 
              View view2 = a(f1, view1, viewGroup);
              if (f1 != object) {
                view2.setPressed(false);
                l.h(view2);
              } 
              if (view2 != view1)
                a(view2, b2); 
              b2++;
            } 
            b3++;
            continue;
          } 
          break;
        } 
      } else {
        b1 = 0;
      } 
      while (true) {
        if (b1 < viewGroup.getChildCount()) {
          if (!a(viewGroup, b1))
            b1++; 
          continue;
        } 
        return;
      } 
    } 
  }
  
  public boolean b() { return false; }
  
  public boolean b(e parame, f paramf) { return false; }
}
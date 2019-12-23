package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.widget.p;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {
  private static final int[] a = { 16842964, 16843049 };
  
  private e b;
  
  private int c;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 16842868); }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    p p = p.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (p.d(0))
      setBackgroundDrawable(p.a(0)); 
    if (p.d(1))
      setDivider(p.a(1)); 
    p.b();
  }
  
  public boolean a(f paramf) { return this.b.a(paramf, 0); }
  
  public int getWindowAnimations() { return this.c; }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) { a((f)getAdapter().getItem(paramInt)); }
}
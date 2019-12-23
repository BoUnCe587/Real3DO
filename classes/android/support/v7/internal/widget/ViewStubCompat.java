package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
  private int a = 0;
  
  private int b;
  
  private WeakReference<View> c;
  
  private LayoutInflater d;
  
  private a e;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ViewStubCompat, paramInt, 0);
    this.b = typedArray.getResourceId(a.j.ViewStubCompat_android_inflatedId, -1);
    this.a = typedArray.getResourceId(a.j.ViewStubCompat_android_layout, 0);
    setId(typedArray.getResourceId(a.j.ViewStubCompat_android_id, -1));
    typedArray.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public View a() {
    ViewParent viewParent = getParent();
    if (viewParent != null && viewParent instanceof ViewGroup) {
      if (this.a != 0) {
        LayoutInflater layoutInflater;
        ViewGroup viewGroup = (ViewGroup)viewParent;
        if (this.d != null) {
          layoutInflater = this.d;
        } else {
          layoutInflater = LayoutInflater.from(getContext());
        } 
        View view = layoutInflater.inflate(this.a, viewGroup, false);
        if (this.b != -1)
          view.setId(this.b); 
        int i = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
          viewGroup.addView(view, i, layoutParams);
        } else {
          viewGroup.addView(view, i);
        } 
        this.c = new WeakReference(view);
        if (this.e != null)
          this.e.a(this, view); 
        return view;
      } 
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    } 
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {}
  
  public void draw(Canvas paramCanvas) {}
  
  public int getInflatedId() { return this.b; }
  
  public LayoutInflater getLayoutInflater() { return this.d; }
  
  public int getLayoutResource() { return this.a; }
  
  protected void onMeasure(int paramInt1, int paramInt2) { setMeasuredDimension(0, 0); }
  
  public void setInflatedId(int paramInt) { this.b = paramInt; }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater) { this.d = paramLayoutInflater; }
  
  public void setLayoutResource(int paramInt) { this.a = paramInt; }
  
  public void setOnInflateListener(a parama) { this.e = parama; }
  
  public void setVisibility(int paramInt) {
    if (this.c != null) {
      View view = (View)this.c.get();
      if (view != null) {
        view.setVisibility(paramInt);
        return;
      } 
      throw new IllegalStateException("setVisibility called on un-referenced view");
    } 
    super.setVisibility(paramInt);
    if (paramInt == 0 || paramInt == 4) {
      a();
      return;
    } 
  }
  
  public static interface a {
    void a(ViewStubCompat param1ViewStubCompat, View param1View);
  }
}
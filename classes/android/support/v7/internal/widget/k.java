package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.support.v7.b.a;
import android.support.v7.internal.view.a;
import android.support.v7.widget.d;
import android.support.v7.widget.f;
import android.support.v7.widget.g;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class k extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
  private static final Interpolator j = new DecelerateInterpolator();
  
  Runnable a;
  
  int b;
  
  int c;
  
  private b d;
  
  private g e;
  
  private Spinner f;
  
  private boolean g;
  
  private int h;
  
  private int i;
  
  private c a(a.b paramb, boolean paramBoolean) {
    c c1 = new c(this, getContext(), paramb, paramBoolean);
    if (paramBoolean) {
      c1.setBackgroundDrawable(null);
      c1.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
      return c1;
    } 
    c1.setFocusable(true);
    if (this.d == null)
      this.d = new b(this, null); 
    c1.setOnClickListener(this.d);
    return c1;
  }
  
  private boolean a() { return (this.f != null && this.f.getParent() == this); }
  
  private void b() {
    if (a())
      return; 
    if (this.f == null)
      this.f = d(); 
    removeView(this.e);
    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
    if (this.f.getAdapter() == null)
      this.f.setAdapter(new a(this, null)); 
    if (this.a != null) {
      removeCallbacks(this.a);
      this.a = null;
    } 
    this.f.setSelection(this.i);
  }
  
  private boolean c() {
    if (!a())
      return false; 
    removeView(this.f);
    addView(this.e, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.f.getSelectedItemPosition());
    return false;
  }
  
  private Spinner d() {
    d d1 = new d(getContext(), null, a.a.actionDropDownStyle);
    d1.setLayoutParams(new g.a(-2, -1));
    d1.setOnItemSelectedListener(this);
    return d1;
  }
  
  public void a(int paramInt) {
    View view = this.e.getChildAt(paramInt);
    if (this.a != null)
      removeCallbacks(this.a); 
    this.a = new Runnable(this, view) {
        public void run() {
          int i = this.a.getLeft();
          int j = (this.b.getWidth() - this.a.getWidth()) / 2;
          this.b.smoothScrollTo(i - j, 0);
          this.b.a = null;
        }
      };
    post(this.a);
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.a != null)
      post(this.a); 
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration); 
    a a1 = a.a(getContext());
    setContentHeight(a1.e());
    this.c = a1.f();
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.a != null)
      removeCallbacks(this.a); 
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) { ((c)paramView).b().d(); }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    boolean bool;
    paramInt2 = 1;
    int m = View.MeasureSpec.getMode(paramInt1);
    if (m == 1073741824) {
      bool = true;
    } else {
      bool = false;
    } 
    setFillViewport(bool);
    int n = this.e.getChildCount();
    if (n > 1 && (m == 1073741824 || m == Integer.MIN_VALUE)) {
      if (n > 2) {
        this.b = (int)(View.MeasureSpec.getSize(paramInt1) * 0.4F);
      } else {
        this.b = View.MeasureSpec.getSize(paramInt1) / 2;
      } 
      this.b = Math.min(this.b, this.c);
    } else {
      this.b = -1;
    } 
    m = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
    if (bool || !this.g)
      paramInt2 = 0; 
    if (paramInt2 != 0) {
      this.e.measure(0, m);
      if (this.e.getMeasuredWidth() > View.MeasureSpec.getSize(paramInt1)) {
        b();
      } else {
        c();
      } 
    } else {
      c();
    } 
    paramInt2 = getMeasuredWidth();
    super.onMeasure(paramInt1, m);
    paramInt1 = getMeasuredWidth();
    if (bool && paramInt2 != paramInt1)
      setTabSelected(this.i); 
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean) { this.g = paramBoolean; }
  
  public void setContentHeight(int paramInt) {
    this.h = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt) {
    this.i = paramInt;
    int m = this.e.getChildCount();
    for (byte b1 = 0; b1 < m; b1++) {
      boolean bool;
      View view = this.e.getChildAt(b1);
      if (b1 == paramInt) {
        bool = true;
      } else {
        bool = false;
      } 
      view.setSelected(bool);
      if (bool)
        a(paramInt); 
    } 
    if (this.f != null && paramInt >= 0)
      this.f.setSelection(paramInt); 
  }
  
  private class a extends BaseAdapter {
    private a(k this$0) {}
    
    public int getCount() { return k.a(this.a).getChildCount(); }
    
    public Object getItem(int param1Int) { return ((k.c)k.a(this.a).getChildAt(param1Int)).b(); }
    
    public long getItemId(int param1Int) { return param1Int; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      if (param1View == null)
        return k.a(this.a, (a.b)getItem(param1Int), true); 
      ((k.c)param1View).a((a.b)getItem(param1Int));
      return param1View;
    }
  }
  
  private class b implements View.OnClickListener {
    private b(k this$0) {}
    
    public void onClick(View param1View) {
      ((k.c)param1View).b().d();
      int i = k.a(this.a).getChildCount();
      for (byte b1 = 0; b1 < i; b1++) {
        boolean bool;
        View view = k.a(this.a).getChildAt(b1);
        if (view == param1View) {
          bool = true;
        } else {
          bool = false;
        } 
        view.setSelected(bool);
      } 
    }
  }
  
  private class c extends g implements View.OnLongClickListener {
    private final int[] b = { 16842964 };
    
    private a.b c;
    
    private TextView d;
    
    private ImageView e;
    
    private View f;
    
    public c(k this$0, Context param1Context, a.b param1b, boolean param1Boolean) {
      super(param1Context, null, a.a.actionBarTabStyle);
      this.c = param1b;
      p p = p.a(param1Context, null, this.b, a.a.actionBarTabStyle, 0);
      if (p.d(0))
        setBackgroundDrawable(p.a(0)); 
      p.b();
      if (param1Boolean)
        setGravity(8388627); 
      a();
    }
    
    public void a() {
      boolean bool;
      ViewParent viewParent = this.c;
      View view = viewParent.c();
      if (view != null) {
        viewParent = view.getParent();
        if (viewParent != this) {
          if (viewParent != null)
            ((ViewGroup)viewParent).removeView(view); 
          addView(view);
        } 
        this.f = view;
        if (this.d != null)
          this.d.setVisibility(8); 
        if (this.e != null) {
          this.e.setVisibility(8);
          this.e.setImageDrawable(null);
        } 
        return;
      } 
      if (this.f != null) {
        removeView(this.f);
        this.f = null;
      } 
      Drawable drawable = viewParent.a();
      CharSequence charSequence = viewParent.b();
      if (drawable != null) {
        if (this.e == null) {
          ImageView imageView = new ImageView(getContext());
          g.a a1 = new g.a(-2, -2);
          a1.h = 16;
          imageView.setLayoutParams(a1);
          addView(imageView, 0);
          this.e = imageView;
        } 
        this.e.setImageDrawable(drawable);
        this.e.setVisibility(0);
      } else if (this.e != null) {
        this.e.setVisibility(8);
        this.e.setImageDrawable(null);
      } 
      if (!TextUtils.isEmpty(charSequence)) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (this.d == null) {
          f f1 = new f(getContext(), null, a.a.actionBarTabTextStyle);
          f1.setEllipsize(TextUtils.TruncateAt.END);
          g.a a1 = new g.a(-2, -2);
          a1.h = 16;
          f1.setLayoutParams(a1);
          addView(f1);
          this.d = f1;
        } 
        this.d.setText(charSequence);
        this.d.setVisibility(0);
      } else if (this.d != null) {
        this.d.setVisibility(8);
        this.d.setText(null);
      } 
      if (this.e != null)
        this.e.setContentDescription(viewParent.e()); 
      if (!bool && !TextUtils.isEmpty(viewParent.e())) {
        setOnLongClickListener(this);
        return;
      } 
      setOnLongClickListener(null);
      setLongClickable(false);
    }
    
    public void a(a.b param1b) {
      this.c = param1b;
      a();
    }
    
    public a.b b() { return this.c; }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent param1AccessibilityEvent) {
      super.onInitializeAccessibilityEvent(param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName(a.b.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      super.onInitializeAccessibilityNodeInfo(param1AccessibilityNodeInfo);
      if (Build.VERSION.SDK_INT >= 14)
        param1AccessibilityNodeInfo.setClassName(a.b.class.getName()); 
    }
    
    public boolean onLongClick(View param1View) {
      int[] arrayOfInt = new int[2];
      getLocationOnScreen(arrayOfInt);
      Context context = getContext();
      int i = getWidth();
      int j = getHeight();
      int m = (context.getResources().getDisplayMetrics()).widthPixels;
      Toast toast = Toast.makeText(context, this.c.e(), 0);
      toast.setGravity(49, arrayOfInt[0] + i / 2 - m / 2, j);
      toast.show();
      return true;
    }
    
    public void onMeasure(int param1Int1, int param1Int2) {
      super.onMeasure(param1Int1, param1Int2);
      if (this.a.b > 0 && getMeasuredWidth() > this.a.b)
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a.b, 1073741824), param1Int2); 
    }
    
    public void setSelected(boolean param1Boolean) {
      boolean bool;
      if (isSelected() != param1Boolean) {
        bool = true;
      } else {
        bool = false;
      } 
      super.setSelected(param1Boolean);
      if (bool && param1Boolean)
        sendAccessibilityEvent(4); 
    }
  }
}
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements k.a {
  private f a;
  
  private ImageView b;
  
  private RadioButton c;
  
  private TextView d;
  
  private CheckBox e;
  
  private TextView f;
  
  private Drawable g;
  
  private int h;
  
  private Context i;
  
  private boolean j;
  
  private int k;
  
  private Context l;
  
  private LayoutInflater m;
  
  private boolean n;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet) { this(paramContext, paramAttributeSet, 0); }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.MenuView, paramInt, 0);
    this.g = typedArray.getDrawable(a.j.MenuView_android_itemBackground);
    this.h = typedArray.getResourceId(a.j.MenuView_android_itemTextAppearance, -1);
    this.j = typedArray.getBoolean(a.j.MenuView_preserveIconSpacing, false);
    this.i = paramContext;
    typedArray.recycle();
  }
  
  private void b() {
    this.b = (ImageView)getInflater().inflate(a.g.abc_list_menu_item_icon, this, false);
    addView(this.b, 0);
  }
  
  private void c() {
    this.c = (RadioButton)getInflater().inflate(a.g.abc_list_menu_item_radio, this, false);
    addView(this.c);
  }
  
  private void d() {
    this.e = (CheckBox)getInflater().inflate(a.g.abc_list_menu_item_checkbox, this, false);
    addView(this.e);
  }
  
  private LayoutInflater getInflater() {
    if (this.m == null)
      this.m = LayoutInflater.from(this.l); 
    return this.m;
  }
  
  public void a(f paramf, int paramInt) {
    this.a = paramf;
    this.k = paramInt;
    if (paramf.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setTitle(paramf.a(this));
    setCheckable(paramf.isCheckable());
    a(paramf.f(), paramf.d());
    setIcon(paramf.getIcon());
    setEnabled(paramf.isEnabled());
  }
  
  public void a(boolean paramBoolean, char paramChar) {
    if (paramBoolean && this.a.f()) {
      paramChar = Character.MIN_VALUE;
    } else {
      paramChar = '\b';
    } 
    if (paramChar == '\000')
      this.f.setText(this.a.e()); 
    if (this.f.getVisibility() != paramChar)
      this.f.setVisibility(paramChar); 
  }
  
  public boolean a() { return false; }
  
  public f getItemData() { return this.a; }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    setBackgroundDrawable(this.g);
    this.d = (TextView)findViewById(a.e.title);
    if (this.h != -1)
      this.d.setTextAppearance(this.i, this.h); 
    this.f = (TextView)findViewById(a.e.shortcut);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.b != null && this.j) {
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if (layoutParams.height > 0 && layoutParams1.width <= 0)
        layoutParams1.width = layoutParams.height; 
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (paramBoolean || this.c != null || this.e != null) {
      RadioButton radioButton;
      CheckBox checkBox;
      if (this.a.g()) {
        if (this.c == null)
          c(); 
        checkBox = this.c;
        radioButton = this.e;
      } else {
        if (this.e == null)
          d(); 
        checkBox = this.e;
        radioButton = this.c;
      } 
      if (paramBoolean) {
        byte b1;
        checkBox.setChecked(this.a.isChecked());
        if (paramBoolean) {
          b1 = 0;
        } else {
          b1 = 8;
        } 
        if (checkBox.getVisibility() != b1)
          checkBox.setVisibility(b1); 
        if (radioButton != null && radioButton.getVisibility() != 8) {
          radioButton.setVisibility(8);
          return;
        } 
        return;
      } 
      if (this.e != null)
        this.e.setVisibility(8); 
      if (this.c != null) {
        this.c.setVisibility(8);
        return;
      } 
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    CheckBox checkBox;
    if (this.a.g()) {
      if (this.c == null)
        c(); 
      checkBox = this.c;
    } else {
      if (this.e == null)
        d(); 
      checkBox = this.e;
    } 
    checkBox.setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean) {
    this.n = paramBoolean;
    this.j = paramBoolean;
  }
  
  public void setIcon(Drawable paramDrawable) {
    boolean bool;
    if (this.a.i() || this.n) {
      bool = true;
    } else {
      bool = false;
    } 
    if ((bool || this.j) && (this.b != null || paramDrawable != null || this.j)) {
      if (this.b == null)
        b(); 
      if (paramDrawable != null || this.j) {
        ImageView imageView = this.b;
        if (!bool)
          paramDrawable = null; 
        imageView.setImageDrawable(paramDrawable);
        if (this.b.getVisibility() != 0) {
          this.b.setVisibility(0);
          return;
        } 
        return;
      } 
      this.b.setVisibility(8);
      return;
    } 
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    if (paramCharSequence != null) {
      this.d.setText(paramCharSequence);
      if (this.d.getVisibility() != 0)
        this.d.setVisibility(0); 
      return;
    } 
    if (this.d.getVisibility() != 8) {
      this.d.setVisibility(8);
      return;
    } 
  }
}
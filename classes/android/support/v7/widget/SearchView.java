package android.support.v7.widget;

import android.annotation.TargetApi;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.b;
import android.support.v7.b.a;
import android.support.v7.d.a;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends g implements a {
  static final a a;
  
  private static final boolean b;
  
  private boolean A;
  
  private boolean B;
  
  private int C;
  
  private boolean D;
  
  private CharSequence E;
  
  private boolean F;
  
  private int G;
  
  private SearchableInfo H;
  
  private Bundle I;
  
  private Runnable J;
  
  private final Runnable K;
  
  private Runnable L;
  
  private final WeakHashMap<String, Drawable.ConstantState> M;
  
  private final SearchAutoComplete c;
  
  private final View d;
  
  private final View e;
  
  private final ImageView f;
  
  private final ImageView g;
  
  private final ImageView h;
  
  private final ImageView i;
  
  private final ImageView j;
  
  private final Drawable k;
  
  private final int l;
  
  private final int m;
  
  private final Intent n;
  
  private final Intent o;
  
  private final CharSequence p;
  
  private c q;
  
  private b r;
  
  private View.OnFocusChangeListener s;
  
  private d t;
  
  private View.OnClickListener u;
  
  private boolean v;
  
  private boolean w;
  
  private b x;
  
  private boolean y;
  
  private CharSequence z;
  
  static  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 8) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
    a = new a();
  }
  
  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4) {
    Intent intent = new Intent(paramString1);
    intent.addFlags(268435456);
    if (paramUri != null)
      intent.setData(paramUri); 
    intent.putExtra("user_query", this.E);
    if (paramString3 != null)
      intent.putExtra("query", paramString3); 
    if (paramString2 != null)
      intent.putExtra("intent_extra_data_key", paramString2); 
    if (this.I != null)
      intent.putExtra("app_data", this.I); 
    if (paramInt != 0) {
      intent.putExtra("action_key", paramInt);
      intent.putExtra("action_msg", paramString4);
    } 
    if (b)
      intent.setComponent(this.H.getSearchActivity()); 
    return intent;
  }
  
  private void a(int paramInt, String paramString1, String paramString2) {
    Intent intent = a("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(intent);
  }
  
  private void a(boolean paramBoolean) {
    boolean bool;
    byte b1;
    boolean bool1 = true;
    byte b2 = 8;
    this.w = paramBoolean;
    if (paramBoolean) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    if (!TextUtils.isEmpty(this.c.getText())) {
      bool = true;
    } else {
      bool = false;
    } 
    this.f.setVisibility(b1);
    b(bool);
    View view = this.d;
    if (paramBoolean) {
      b1 = 8;
    } else {
      b1 = 0;
    } 
    view.setVisibility(b1);
    ImageView imageView = this.j;
    if (this.v) {
      b1 = b2;
    } else {
      b1 = 0;
    } 
    imageView.setVisibility(b1);
    i();
    if (!bool) {
      paramBoolean = bool1;
    } else {
      paramBoolean = false;
    } 
    c(paramBoolean);
    h();
  }
  
  static boolean a(Context paramContext) { return ((paramContext.getResources().getConfiguration()).orientation == 2); }
  
  private CharSequence b(CharSequence paramCharSequence) {
    if (!this.v || this.k == null)
      return paramCharSequence; 
    int i1 = (int)(this.c.getTextSize() * 1.25D);
    this.k.setBounds(0, 0, i1, i1);
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
    spannableStringBuilder.setSpan(new ImageSpan(this.k), 1, 2, 33);
    spannableStringBuilder.append(paramCharSequence);
    return spannableStringBuilder;
  }
  
  private void b(boolean paramBoolean) { // Byte code:
    //   0: bipush #8
    //   2: istore_3
    //   3: iload_3
    //   4: istore_2
    //   5: aload_0
    //   6: getfield y : Z
    //   9: ifeq -> 45
    //   12: iload_3
    //   13: istore_2
    //   14: aload_0
    //   15: invokespecial f : ()Z
    //   18: ifeq -> 45
    //   21: iload_3
    //   22: istore_2
    //   23: aload_0
    //   24: invokevirtual hasFocus : ()Z
    //   27: ifeq -> 45
    //   30: iload_1
    //   31: ifne -> 43
    //   34: iload_3
    //   35: istore_2
    //   36: aload_0
    //   37: getfield D : Z
    //   40: ifne -> 45
    //   43: iconst_0
    //   44: istore_2
    //   45: aload_0
    //   46: getfield g : Landroid/widget/ImageView;
    //   49: iload_2
    //   50: invokevirtual setVisibility : (I)V
    //   53: return }
  
  private void c(boolean paramBoolean) {
    byte b1;
    if (this.D && !c() && paramBoolean) {
      b1 = 0;
      this.g.setVisibility(8);
    } else {
      b1 = 8;
    } 
    this.i.setVisibility(b1);
  }
  
  @TargetApi(8)
  private boolean e() {
    byte b1 = 0;
    int i1 = b1;
    if (this.H != null) {
      i1 = b1;
      if (this.H.getVoiceSearchEnabled()) {
        Intent intent = null;
        if (this.H.getVoiceSearchLaunchWebSearch()) {
          intent = this.n;
        } else if (this.H.getVoiceSearchLaunchRecognizer()) {
          intent = this.o;
        } 
        i1 = b1;
        if (intent != null) {
          i1 = b1;
          if (getContext().getPackageManager().resolveActivity(intent, 65536) != null)
            i1 = 1; 
        } 
      } 
    } 
    return i1;
  }
  
  private boolean f() { return ((this.y || this.D) && !c()); }
  
  private int getPreferredWidth() { return getContext().getResources().getDimensionPixelSize(a.c.abc_search_view_preferred_width); }
  
  private void h() { // Byte code:
    //   0: bipush #8
    //   2: istore_2
    //   3: iload_2
    //   4: istore_1
    //   5: aload_0
    //   6: invokespecial f : ()Z
    //   9: ifeq -> 36
    //   12: aload_0
    //   13: getfield g : Landroid/widget/ImageView;
    //   16: invokevirtual getVisibility : ()I
    //   19: ifeq -> 34
    //   22: iload_2
    //   23: istore_1
    //   24: aload_0
    //   25: getfield i : Landroid/widget/ImageView;
    //   28: invokevirtual getVisibility : ()I
    //   31: ifne -> 36
    //   34: iconst_0
    //   35: istore_1
    //   36: aload_0
    //   37: getfield e : Landroid/view/View;
    //   40: iload_1
    //   41: invokevirtual setVisibility : (I)V
    //   44: return }
  
  private void i() {
    boolean bool;
    byte b3 = 1;
    byte b2 = 0;
    if (!TextUtils.isEmpty(this.c.getText())) {
      bool = true;
    } else {
      bool = false;
    } 
    byte b1 = b3;
    if (!bool)
      if (this.v && !this.F) {
        b1 = b3;
      } else {
        b1 = 0;
      }  
    ImageView imageView = this.h;
    if (b1 != 0) {
      b1 = b2;
    } else {
      b1 = 8;
    } 
    imageView.setVisibility(b1);
    Drawable drawable = this.h.getDrawable();
    if (drawable != null) {
      int[] arrayOfInt;
      if (bool) {
        arrayOfInt = ENABLED_STATE_SET;
      } else {
        arrayOfInt = EMPTY_STATE_SET;
      } 
      drawable.setState(arrayOfInt);
    } 
  }
  
  private void j() { post(this.K); }
  
  private void k() {
    CharSequence charSequence2 = getQueryHint();
    SearchAutoComplete searchAutoComplete = this.c;
    CharSequence charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = ""; 
    searchAutoComplete.setHint(b(charSequence1));
  }
  
  @TargetApi(8)
  private void l() {
    int i2 = 1;
    this.c.setThreshold(this.H.getSuggestThreshold());
    this.c.setImeOptions(this.H.getImeOptions());
    int i3 = this.H.getInputType();
    int i1 = i3;
    if ((i3 & 0xF) == 1) {
      i3 &= 0xFFFEFFFF;
      i1 = i3;
      if (this.H.getSuggestAuthority() != null)
        i1 = i3 | 0x10000 | 0x80000; 
    } 
    this.c.setInputType(i1);
    if (this.x != null)
      this.x.a(null); 
    if (this.H.getSuggestAuthority() != null) {
      this.x = new i(getContext(), this, this.H, this.M);
      this.c.setAdapter(this.x);
      i i4 = (i)this.x;
      i1 = i2;
      if (this.A)
        i1 = 2; 
      i4.a(i1);
    } 
  }
  
  private void m() {
    Editable editable = this.c.getText();
    if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (this.q == null || !this.q.a(editable.toString()))) {
      if (this.H != null)
        a(0, null, editable.toString()); 
      setImeVisibility(false);
      n();
    } 
  }
  
  private void n() { this.c.dismissDropDown(); }
  
  private void o() {
    if (TextUtils.isEmpty(this.c.getText())) {
      if (this.v && (this.r == null || !this.r.a())) {
        clearFocus();
        a(true);
      } 
      return;
    } 
    this.c.setText("");
    this.c.requestFocus();
    setImeVisibility(true);
  }
  
  private void p() {
    a(false);
    this.c.requestFocus();
    setImeVisibility(true);
    if (this.u != null)
      this.u.onClick(this); 
  }
  
  private void q() {
    a.a(this.c);
    a.b(this.c);
  }
  
  private void setImeVisibility(boolean paramBoolean) {
    if (paramBoolean) {
      post(this.J);
      return;
    } 
    removeCallbacks(this.J);
    InputMethodManager inputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    if (inputMethodManager != null) {
      inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
      return;
    } 
  }
  
  private void setQuery(CharSequence paramCharSequence) {
    int i1;
    this.c.setText(paramCharSequence);
    SearchAutoComplete searchAutoComplete = this.c;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i1 = 0;
    } else {
      i1 = paramCharSequence.length();
    } 
    searchAutoComplete.setSelection(i1);
  }
  
  public void a() {
    if (this.F)
      return; 
    this.F = true;
    this.G = this.c.getImeOptions();
    this.c.setImeOptions(this.G | 0x2000000);
    this.c.setText("");
    setIconified(false);
  }
  
  void a(CharSequence paramCharSequence) { setQuery(paramCharSequence); }
  
  public void a(CharSequence paramCharSequence, boolean paramBoolean) {
    this.c.setText(paramCharSequence);
    if (paramCharSequence != null) {
      this.c.setSelection(this.c.length());
      this.E = paramCharSequence;
    } 
    if (paramBoolean && !TextUtils.isEmpty(paramCharSequence))
      m(); 
  }
  
  public void b() {
    a("", false);
    clearFocus();
    a(true);
    this.c.setImeOptions(this.G);
    this.F = false;
  }
  
  public boolean c() { return this.w; }
  
  public void clearFocus() {
    this.B = true;
    setImeVisibility(false);
    super.clearFocus();
    this.c.clearFocus();
    this.B = false;
  }
  
  void d() {
    a(c());
    j();
    if (this.c.hasFocus())
      q(); 
  }
  
  public int getImeOptions() { return this.c.getImeOptions(); }
  
  public int getInputType() { return this.c.getInputType(); }
  
  public int getMaxWidth() { return this.C; }
  
  public CharSequence getQuery() { return this.c.getText(); }
  
  public CharSequence getQueryHint() { return (this.z != null) ? this.z : ((b && this.H != null && this.H.getHintId() != 0) ? getContext().getText(this.H.getHintId()) : this.p); }
  
  int getSuggestionCommitIconResId() { return this.m; }
  
  int getSuggestionRowLayout() { return this.l; }
  
  public b getSuggestionsAdapter() { return this.x; }
  
  protected void onDetachedFromWindow() {
    removeCallbacks(this.K);
    post(this.L);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (c()) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    switch (i2) {
      default:
        paramInt1 = i1;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
        return;
      case -2147483648:
        if (this.C > 0) {
          paramInt1 = Math.min(this.C, i1);
        } else {
          paramInt1 = Math.min(getPreferredWidth(), i1);
        } 
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
        return;
      case 1073741824:
        paramInt1 = i1;
        if (this.C > 0)
          paramInt1 = Math.min(this.C, i1); 
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
        return;
      case 0:
        break;
    } 
    if (this.C > 0) {
      paramInt1 = this.C;
    } else {
      paramInt1 = getPreferredWidth();
    } 
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    j();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect) {
    if (!this.B && isFocusable()) {
      if (!c()) {
        boolean bool = this.c.requestFocus(paramInt, paramRect);
        if (bool)
          a(false); 
        return bool;
      } 
      return super.requestFocus(paramInt, paramRect);
    } 
    return false;
  }
  
  public void setAppSearchData(Bundle paramBundle) { this.I = paramBundle; }
  
  public void setIconified(boolean paramBoolean) {
    if (paramBoolean) {
      o();
      return;
    } 
    p();
  }
  
  public void setIconifiedByDefault(boolean paramBoolean) {
    if (this.v == paramBoolean)
      return; 
    this.v = paramBoolean;
    a(paramBoolean);
    k();
  }
  
  public void setImeOptions(int paramInt) { this.c.setImeOptions(paramInt); }
  
  public void setInputType(int paramInt) { this.c.setInputType(paramInt); }
  
  public void setMaxWidth(int paramInt) {
    this.C = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(b paramb) { this.r = paramb; }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener) { this.s = paramOnFocusChangeListener; }
  
  public void setOnQueryTextListener(c paramc) { this.q = paramc; }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener) { this.u = paramOnClickListener; }
  
  public void setOnSuggestionListener(d paramd) { this.t = paramd; }
  
  public void setQueryHint(CharSequence paramCharSequence) {
    this.z = paramCharSequence;
    k();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean) {
    this.A = paramBoolean;
    if (this.x instanceof i) {
      byte b1;
      i i1 = (i)this.x;
      if (paramBoolean) {
        b1 = 2;
      } else {
        b1 = 1;
      } 
      i1.a(b1);
    } 
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo) {
    boolean bool;
    this.H = paramSearchableInfo;
    if (this.H != null) {
      if (b)
        l(); 
      k();
    } 
    if (b && e()) {
      bool = true;
    } else {
      bool = false;
    } 
    this.D = bool;
    if (this.D)
      this.c.setPrivateImeOptions("nm"); 
    a(c());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean) {
    this.y = paramBoolean;
    a(c());
  }
  
  public void setSuggestionsAdapter(b paramb) {
    this.x = paramb;
    this.c.setAdapter(this.x);
  }
  
  public static class SearchAutoComplete extends b {
    private int a = getThreshold();
    
    private SearchView b;
    
    public SearchAutoComplete(Context param1Context) { this(param1Context, null); }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet) { this(param1Context, param1AttributeSet, a.a.autoCompleteTextViewStyle); }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet, int param1Int) { super(param1Context, param1AttributeSet, param1Int); }
    
    public boolean enoughToFilter() { return (this.a <= 0 || super.enoughToFilter()); }
    
    protected void onFocusChanged(boolean param1Boolean, int param1Int, Rect param1Rect) {
      super.onFocusChanged(param1Boolean, param1Int, param1Rect);
      this.b.d();
    }
    
    public boolean onKeyPreIme(int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 4) {
        if (param1KeyEvent.getAction() == 0 && param1KeyEvent.getRepeatCount() == 0) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.startTracking(param1KeyEvent, this); 
          return true;
        } 
        if (param1KeyEvent.getAction() == 1) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.handleUpEvent(param1KeyEvent); 
          if (param1KeyEvent.isTracking() && !param1KeyEvent.isCanceled()) {
            this.b.clearFocus();
            SearchView.a(this.b, false);
            return true;
          } 
        } 
      } 
      return super.onKeyPreIme(param1Int, param1KeyEvent);
    }
    
    public void onWindowFocusChanged(boolean param1Boolean) {
      super.onWindowFocusChanged(param1Boolean);
      if (param1Boolean && this.b.hasFocus() && getVisibility() == 0) {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        if (SearchView.a(getContext()))
          SearchView.a.a(this, true); 
      } 
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence param1CharSequence) {}
    
    void setSearchView(SearchView param1SearchView) { this.b = param1SearchView; }
    
    public void setThreshold(int param1Int) {
      super.setThreshold(param1Int);
      this.a = param1Int;
    }
  }
  
  private static class a {
    private Method a;
    
    private Method b;
    
    private Method c;
    
    private Method d;
    
    a() {
      try {
        this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.a.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { boolean.class });
        this.c.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[] { int.class, android.os.ResultReceiver.class });
        this.d.setAccessible(true);
        return;
      } catch (NoSuchMethodException noSuchMethodException) {
        return;
      } 
    }
    
    void a(AutoCompleteTextView param1AutoCompleteTextView) {
      if (this.a != null)
        try {
          this.a.invoke(param1AutoCompleteTextView, new Object[0]);
          return;
        } catch (Exception param1AutoCompleteTextView) {
          return;
        }  
    }
    
    void a(AutoCompleteTextView param1AutoCompleteTextView, boolean param1Boolean) {
      if (this.c != null)
        try {
          this.c.invoke(param1AutoCompleteTextView, new Object[] { Boolean.valueOf(param1Boolean) });
          return;
        } catch (Exception param1AutoCompleteTextView) {
          return;
        }  
    }
    
    void b(AutoCompleteTextView param1AutoCompleteTextView) {
      if (this.b != null)
        try {
          this.b.invoke(param1AutoCompleteTextView, new Object[0]);
          return;
        } catch (Exception param1AutoCompleteTextView) {
          return;
        }  
    }
  }
  
  public static interface b {
    boolean a();
  }
  
  public static interface c {
    boolean a(String param1String);
  }
  
  public static interface d {}
}
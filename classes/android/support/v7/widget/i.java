package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.b.a;
import android.support.v4.widget.i;
import android.support.v7.b.a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class i extends i implements View.OnClickListener {
  private final SearchManager j = (SearchManager)this.d.getSystemService("search");
  
  private final SearchView k;
  
  private final SearchableInfo l;
  
  private final Context m;
  
  private final WeakHashMap<String, Drawable.ConstantState> n;
  
  private final int o;
  
  private boolean p = false;
  
  private int q = 1;
  
  private ColorStateList r;
  
  private int s = -1;
  
  private int t = -1;
  
  private int u = -1;
  
  private int v = -1;
  
  private int w = -1;
  
  private int x = -1;
  
  public i(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap) {
    super(paramContext, paramSearchView.getSuggestionRowLayout(), null, true);
    this.k = paramSearchView;
    this.l = paramSearchableInfo;
    this.o = paramSearchView.getSuggestionCommitIconResId();
    this.m = paramContext;
    this.n = paramWeakHashMap;
  }
  
  private Drawable a(ComponentName paramComponentName) {
    Drawable.ConstantState constantState2 = null;
    String str = paramComponentName.flattenToShortString();
    if (this.n.containsKey(str)) {
      constantState1 = (Drawable.ConstantState)this.n.get(str);
      return (constantState1 == null) ? null : constantState1.newDrawable(this.m.getResources());
    } 
    Drawable drawable = b(constantState1);
    if (drawable == null) {
      constantState1 = constantState2;
      this.n.put(str, constantState1);
      return drawable;
    } 
    Drawable.ConstantState constantState1 = drawable.getConstantState();
    this.n.put(str, constantState1);
    return drawable;
  }
  
  private Drawable a(String paramString) {
    if (paramString == null || paramString.length() == 0 || "0".equals(paramString))
      return null; 
    try {
      int i1 = Integer.parseInt(paramString);
      String str = "android.resource://" + this.m.getPackageName() + "/" + i1;
      Drawable drawable2 = b(str);
      Drawable drawable1 = drawable2;
      if (drawable2 == null) {
        drawable1 = a.a(this.m, i1);
        a(str, drawable1);
        return drawable1;
      } 
      return drawable1;
    } catch (NumberFormatException numberFormatException) {
      Drawable drawable2 = b(paramString);
      Drawable drawable1 = drawable2;
      if (drawable2 == null) {
        drawable1 = b(Uri.parse(paramString));
        a(paramString, drawable1);
        return drawable1;
      } 
      return drawable1;
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
      Log.w("SuggestionsAdapter", "Icon resource not found: " + paramString);
      return null;
    } 
  }
  
  private static String a(Cursor paramCursor, int paramInt) {
    if (paramInt == -1)
      return null; 
    try {
      return paramCursor.getString(paramInt);
    } catch (Exception paramCursor) {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", paramCursor);
      return null;
    } 
  }
  
  public static String a(Cursor paramCursor, String paramString) { return a(paramCursor, paramCursor.getColumnIndex(paramString)); }
  
  private void a(ImageView paramImageView, Drawable paramDrawable, int paramInt) {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null) {
      paramImageView.setVisibility(paramInt);
      return;
    } 
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }
  
  private void a(TextView paramTextView, CharSequence paramCharSequence) {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {
      paramTextView.setVisibility(8);
      return;
    } 
    paramTextView.setVisibility(0);
  }
  
  private void a(String paramString, Drawable paramDrawable) {
    if (paramDrawable != null)
      this.n.put(paramString, paramDrawable.getConstantState()); 
  }
  
  private Drawable b(ComponentName paramComponentName) {
    ActivityInfo activityInfo;
    int i1;
    PackageManager packageManager = this.d.getPackageManager();
    try {
      activityInfo = packageManager.getActivityInfo(paramComponentName, 128);
      i1 = activityInfo.getIconResource();
      if (i1 == 0)
        return null; 
    } catch (android.content.pm.PackageManager.NameNotFoundException paramComponentName) {
      Log.w("SuggestionsAdapter", paramComponentName.toString());
      return null;
    } 
    Drawable drawable = packageManager.getDrawable(paramComponentName.getPackageName(), i1, activityInfo.applicationInfo);
    if (drawable == null) {
      Log.w("SuggestionsAdapter", "Invalid icon resource " + i1 + " for " + paramComponentName.flattenToShortString());
      return null;
    } 
    return drawable;
  }
  
  private Drawable b(Uri paramUri) {
    try {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool)
        try {
          return a(paramUri);
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          throw new FileNotFoundException("Resource does not exist: " + paramUri);
        }  
    } catch (FileNotFoundException fileNotFoundException) {
      Log.w("SuggestionsAdapter", "Icon not found: " + paramUri + ", " + fileNotFoundException.getMessage());
      return null;
    } 
    inputStream = this.m.getContentResolver().openInputStream(paramUri);
    if (inputStream == null)
      throw new FileNotFoundException("Failed to open " + paramUri); 
    try {
      resolveInfo = Drawable.createFromStream(inputStream, null);
    } finally {
      resolveInfo = null;
    } 
    throw resolveInfo;
  }
  
  private Drawable b(String paramString) {
    Drawable.ConstantState constantState = (Drawable.ConstantState)this.n.get(paramString);
    return (constantState == null) ? null : constantState.newDrawable();
  }
  
  private CharSequence b(CharSequence paramCharSequence) {
    if (this.r == null) {
      TypedValue typedValue = new TypedValue();
      this.d.getTheme().resolveAttribute(a.a.textColorSearchUrl, typedValue, true);
      this.r = this.d.getResources().getColorStateList(typedValue.resourceId);
    } 
    SpannableString spannableString = new SpannableString(paramCharSequence);
    spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.r, null), 0, paramCharSequence.length(), 33);
    return spannableString;
  }
  
  private void d(Cursor paramCursor) {
    if (paramCursor != null) {
      Bundle bundle = paramCursor.getExtras();
    } else {
      paramCursor = null;
    } 
    if (paramCursor == null || paramCursor.getBoolean("in_progress"));
  }
  
  private Drawable e(Cursor paramCursor) {
    if (this.v == -1)
      return null; 
    Drawable drawable2 = a(paramCursor.getString(this.v));
    Drawable drawable1 = drawable2;
    return (drawable2 == null) ? g(paramCursor) : drawable1;
  }
  
  private Drawable f(Cursor paramCursor) { return (this.w == -1) ? null : a(paramCursor.getString(this.w)); }
  
  private Drawable g(Cursor paramCursor) {
    Drawable drawable = a(this.l.getSearchActivity());
    return (drawable != null) ? drawable : this.d.getPackageManager().getDefaultActivityIcon();
  }
  
  Cursor a(SearchableInfo paramSearchableInfo, String paramString, int paramInt) {
    if (paramSearchableInfo != null) {
      String str = paramSearchableInfo.getSuggestAuthority();
      if (str != null) {
        Uri.Builder builder = (new Uri.Builder()).scheme("content").authority(str).query("").fragment("");
        String str1 = paramSearchableInfo.getSuggestPath();
        if (str1 != null)
          builder.appendEncodedPath(str1); 
        builder.appendPath("search_suggest_query");
        str1 = paramSearchableInfo.getSuggestSelection();
        if (str1 != null) {
          String[] arrayOfString = new String[1];
          arrayOfString[0] = paramString;
        } else {
          builder.appendPath(paramString);
          paramSearchableInfo = null;
        } 
        if (paramInt > 0)
          builder.appendQueryParameter("limit", String.valueOf(paramInt)); 
        Uri uri = builder.build();
        return this.d.getContentResolver().query(uri, null, str1, paramSearchableInfo, null);
      } 
    } 
    return null;
  }
  
  public Cursor a(CharSequence paramCharSequence) {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    } else {
      paramCharSequence = paramCharSequence.toString();
    } 
    if (this.k.getVisibility() != 0 || this.k.getWindowVisibility() != 0)
      return null; 
    try {
      Cursor cursor = a(this.l, paramCharSequence, 50);
      if (cursor != null) {
        cursor.getCount();
        return cursor;
      } 
    } catch (RuntimeException paramCharSequence) {
      Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", paramCharSequence);
    } 
    return null;
  }
  
  Drawable a(Uri paramUri) {
    List list;
    Resources resources;
    str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str))
      throw new FileNotFoundException("No authority: " + paramUri); 
    try {
      resources = this.d.getPackageManager().getResourcesForApplication(str);
      list = paramUri.getPathSegments();
      if (list == null)
        throw new FileNotFoundException("No path: " + paramUri); 
    } catch (android.content.pm.PackageManager.NameNotFoundException str) {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    } 
    int i1 = list.size();
    if (i1 == 1) {
      try {
        i1 = Integer.parseInt((String)list.get(0));
        if (i1 == 0)
          throw new FileNotFoundException("No resource found for: " + paramUri); 
      } catch (NumberFormatException str) {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      } 
    } else {
      if (i1 == 2) {
        i1 = resources.getIdentifier((String)list.get(1), (String)list.get(0), str);
      } else {
        throw new FileNotFoundException("More than two path segments: " + paramUri);
      } 
      if (i1 == 0)
        throw new FileNotFoundException("No resource found for: " + paramUri); 
    } 
    return resources.getDrawable(i1);
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    View view = super.a(paramContext, paramCursor, paramViewGroup);
    view.setTag(new a(view));
    ((ImageView)view.findViewById(a.e.edit_query)).setImageResource(this.o);
    return view;
  }
  
  public void a(int paramInt) { this.q = paramInt; }
  
  public void a(Cursor paramCursor) {
    if (this.p) {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null)
        paramCursor.close(); 
      return;
    } 
    try {
      super.a(paramCursor);
      if (paramCursor != null) {
        this.s = paramCursor.getColumnIndex("suggest_text_1");
        this.t = paramCursor.getColumnIndex("suggest_text_2");
        this.u = paramCursor.getColumnIndex("suggest_text_2_url");
        this.v = paramCursor.getColumnIndex("suggest_icon_1");
        this.w = paramCursor.getColumnIndex("suggest_icon_2");
        this.x = paramCursor.getColumnIndex("suggest_flags");
        return;
      } 
      return;
    } catch (Exception paramCursor) {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", paramCursor);
      return;
    } 
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor) {
    boolean bool;
    a a = (a)paramView.getTag();
    if (this.x != -1) {
      bool = paramCursor.getInt(this.x);
    } else {
      bool = false;
    } 
    if (a.a != null) {
      String str = a(paramCursor, this.s);
      a(a.a, str);
    } 
    if (a.b != null) {
      String str = a(paramCursor, this.u);
      if (str != null) {
        CharSequence charSequence = b(str);
      } else {
        str = a(paramCursor, this.t);
      } 
      if (TextUtils.isEmpty(str)) {
        if (a.a != null) {
          a.a.setSingleLine(false);
          a.a.setMaxLines(2);
        } 
      } else if (a.a != null) {
        a.a.setSingleLine(true);
        a.a.setMaxLines(1);
      } 
      a(a.b, str);
    } 
    if (a.c != null)
      a(a.c, e(paramCursor), 4); 
    if (a.d != null)
      a(a.d, f(paramCursor), 8); 
    if (this.q == 2 || (this.q == 1 && bool & true)) {
      a.e.setVisibility(0);
      a.e.setTag(a.a.getText());
      a.e.setOnClickListener(this);
      return;
    } 
    a.e.setVisibility(8);
  }
  
  public CharSequence c(Cursor paramCursor) {
    if (paramCursor != null) {
      String str = a(paramCursor, "suggest_intent_query");
      if (str != null)
        return str; 
      if (this.l.shouldRewriteQueryFromData()) {
        str = a(paramCursor, "suggest_intent_data");
        if (str != null)
          return str; 
      } 
      if (this.l.shouldRewriteQueryFromText()) {
        String str1 = a(paramCursor, "suggest_text_1");
        if (str1 != null)
          return str1; 
      } 
    } 
    return null;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException paramView) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", paramView);
      View view = a(this.d, this.c, paramViewGroup);
      if (view != null)
        ((a)view.getTag()).a.setText(paramView.toString()); 
      return view;
    } 
  }
  
  public boolean hasStableIds() { return false; }
  
  public void notifyDataSetChanged() {
    super.notifyDataSetChanged();
    d(a());
  }
  
  public void notifyDataSetInvalidated() {
    super.notifyDataSetInvalidated();
    d(a());
  }
  
  public void onClick(View paramView) {
    Object object = paramView.getTag();
    if (object instanceof CharSequence)
      this.k.a((CharSequence)object); 
  }
  
  private static final class a {
    public final TextView a;
    
    public final TextView b;
    
    public final ImageView c;
    
    public final ImageView d;
    
    public final ImageView e;
    
    public a(View param1View) {
      this.a = (TextView)param1View.findViewById(16908308);
      this.b = (TextView)param1View.findViewById(16908309);
      this.c = (ImageView)param1View.findViewById(16908295);
      this.d = (ImageView)param1View.findViewById(16908296);
      this.e = (ImageView)param1View.findViewById(a.e.edit_query);
    }
  }
}
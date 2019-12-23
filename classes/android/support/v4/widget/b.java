package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class b extends BaseAdapter implements c.a, Filterable {
  protected boolean a;
  
  protected boolean b;
  
  protected Cursor c;
  
  protected Context d;
  
  protected int e;
  
  protected a f;
  
  protected DataSetObserver g;
  
  protected c h;
  
  protected FilterQueryProvider i;
  
  public b(Context paramContext, Cursor paramCursor, boolean paramBoolean) {
    if (paramBoolean) {
      b1 = 1;
    } else {
      b1 = 2;
    } 
    a(paramContext, paramCursor, b1);
  }
  
  public Cursor a() { return this.c; }
  
  public Cursor a(CharSequence paramCharSequence) { return (this.i != null) ? this.i.runQuery(paramCharSequence) : this.c; }
  
  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  void a(Context paramContext, Cursor paramCursor, int paramInt) {
    byte b1;
    boolean bool = true;
    if ((paramInt & true) == 1) {
      paramInt |= 0x2;
      this.b = true;
    } else {
      this.b = false;
    } 
    if (paramCursor == null)
      bool = false; 
    this.c = paramCursor;
    this.a = bool;
    this.d = paramContext;
    if (bool) {
      b1 = paramCursor.getColumnIndexOrThrow("_id");
    } else {
      b1 = -1;
    } 
    this.e = b1;
    if ((paramInt & 0x2) == 2) {
      this.f = new a(this);
      this.g = new b(this, null);
    } else {
      this.f = null;
      this.g = null;
    } 
    if (bool) {
      if (this.f != null)
        paramCursor.registerContentObserver(this.f); 
      if (this.g != null)
        paramCursor.registerDataSetObserver(this.g); 
    } 
  }
  
  public void a(Cursor paramCursor) {
    paramCursor = b(paramCursor);
    if (paramCursor != null)
      paramCursor.close(); 
  }
  
  public abstract void a(View paramView, Context paramContext, Cursor paramCursor);
  
  public Cursor b(Cursor paramCursor) {
    if (paramCursor == this.c)
      return null; 
    Cursor cursor = this.c;
    if (cursor != null) {
      if (this.f != null)
        cursor.unregisterContentObserver(this.f); 
      if (this.g != null)
        cursor.unregisterDataSetObserver(this.g); 
    } 
    this.c = paramCursor;
    if (paramCursor != null) {
      if (this.f != null)
        paramCursor.registerContentObserver(this.f); 
      if (this.g != null)
        paramCursor.registerDataSetObserver(this.g); 
      this.e = paramCursor.getColumnIndexOrThrow("_id");
      this.a = true;
      notifyDataSetChanged();
      return cursor;
    } 
    this.e = -1;
    this.a = false;
    notifyDataSetInvalidated();
    return cursor;
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) { return a(paramContext, paramCursor, paramViewGroup); }
  
  protected void b() {
    if (this.b && this.c != null && !this.c.isClosed())
      this.a = this.c.requery(); 
  }
  
  public CharSequence c(Cursor paramCursor) { return (paramCursor == null) ? "" : paramCursor.toString(); }
  
  public int getCount() { return (this.a && this.c != null) ? this.c.getCount() : 0; }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.a) {
      this.c.moveToPosition(paramInt);
      View view = paramView;
      if (paramView == null)
        view = b(this.d, this.c, paramViewGroup); 
      a(view, this.d, this.c);
      return view;
    } 
    return null;
  }
  
  public Filter getFilter() {
    if (this.h == null)
      this.h = new c(this); 
    return this.h;
  }
  
  public Object getItem(int paramInt) {
    if (this.a && this.c != null) {
      this.c.moveToPosition(paramInt);
      return this.c;
    } 
    return null;
  }
  
  public long getItemId(int paramInt) {
    long l2 = 0L;
    long l1 = l2;
    if (this.a) {
      l1 = l2;
      if (this.c != null) {
        l1 = l2;
        if (this.c.moveToPosition(paramInt))
          l1 = this.c.getLong(this.e); 
      } 
    } 
    return l1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (!this.a)
      throw new IllegalStateException("this should only be called when the cursor is valid"); 
    if (!this.c.moveToPosition(paramInt))
      throw new IllegalStateException("couldn't move cursor to position " + paramInt); 
    View view = paramView;
    if (paramView == null)
      view = a(this.d, this.c, paramViewGroup); 
    a(view, this.d, this.c);
    return view;
  }
  
  public boolean hasStableIds() { return true; }
  
  private class a extends ContentObserver {
    public a(b this$0) { super(new Handler()); }
    
    public boolean deliverSelfNotifications() { return true; }
    
    public void onChange(boolean param1Boolean) { this.a.b(); }
  }
  
  private class b extends DataSetObserver {
    private b(b this$0) {}
    
    public void onChanged() {
      this.a.a = true;
      this.a.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
      this.a.a = false;
      this.a.notifyDataSetInvalidated();
    }
  }
}

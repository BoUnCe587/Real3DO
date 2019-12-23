package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class d<K, V> extends Object {
  b b;
  
  c c;
  
  e d;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection) {
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!paramMap.containsKey(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject) {
    boolean bool1 = true;
    boolean bool = false;
    if (paramSet == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = (Set)paramObject;
      try {
        if (paramSet.size() == paramObject.size()) {
          bool = paramSet.containsAll(paramObject);
          if (bool)
            return bool1; 
        } 
        return false;
      } catch (NullPointerException paramSet) {
        return false;
      } catch (ClassCastException paramSet) {
        return false;
      } 
    } 
    return bool;
  }
  
  public static <K, V> boolean b(Map<K, V> paramMap, Collection<?> paramCollection) {
    int i = paramMap.size();
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext())
      paramMap.remove(iterator.next()); 
    return (i != paramMap.size());
  }
  
  public static <K, V> boolean c(Map<K, V> paramMap, Collection<?> paramCollection) {
    int i = paramMap.size();
    Iterator iterator = paramMap.keySet().iterator();
    while (iterator.hasNext()) {
      if (!paramCollection.contains(iterator.next()))
        iterator.remove(); 
    } 
    return (i != paramMap.size());
  }
  
  protected abstract int a();
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract V a(int paramInt, V paramV);
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(K paramK, V paramV);
  
  public <T> T[] a(T[] paramArrayOfT, int paramInt) {
    int i = a();
    if (paramArrayOfT.length < i)
      paramArrayOfT = (T[])(Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); 
    for (byte b1 = 0; b1 < i; b1++)
      paramArrayOfT[b1] = a(b1, paramInt); 
    if (paramArrayOfT.length > i)
      paramArrayOfT[i] = null; 
    return paramArrayOfT;
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map<K, V> b();
  
  public Object[] b(int paramInt) {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfObject[b1] = a(b1, paramInt); 
    return arrayOfObject;
  }
  
  protected abstract void c();
  
  public Set<Map.Entry<K, V>> d() {
    if (this.b == null)
      this.b = new b(this); 
    return this.b;
  }
  
  public Set<K> e() {
    if (this.c == null)
      this.c = new c(this); 
    return this.c;
  }
  
  public Collection<V> f() {
    if (this.d == null)
      this.d = new e(this); 
    return this.d;
  }
  
  final class a<T> extends Object implements Iterator<T> {
    final int a;
    
    int b;
    
    int c;
    
    boolean d = false;
    
    a(d this$0, int param1Int) {
      this.a = param1Int;
      this.b = this$0.a();
    }
    
    public boolean hasNext() { return (this.c < this.b); }
    
    public T next() {
      Object object = this.e.a(this.c, this.a);
      this.c++;
      this.d = true;
      return (T)object;
    }
    
    public void remove() {
      if (!this.d)
        throw new IllegalStateException(); 
      this.c--;
      this.b--;
      this.d = false;
      this.e.a(this.c);
    }
  }
  
  final class b extends Object implements Set<Map.Entry<K, V>> {
    b(d this$0) {}
    
    public boolean a(Map.Entry<K, V> param1Entry) { throw new UnsupportedOperationException(); }
    
    public boolean addAll(Collection<? extends Map.Entry<K, V>> param1Collection) {
      int i = this.a.a();
      for (Map.Entry entry : param1Collection)
        this.a.a(entry.getKey(), entry.getValue()); 
      return (i != this.a.a());
    }
    
    public void clear() { this.a.c(); }
    
    public boolean contains(Object param1Object) {
      if (param1Object instanceof Map.Entry) {
        param1Object = (Map.Entry)param1Object;
        int i = this.a.a(param1Object.getKey());
        if (i >= 0)
          return b.a(this.a.a(i, 1), param1Object.getValue()); 
      } 
      return false;
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean equals(Object param1Object) { return d.a(this, param1Object); }
    
    public int hashCode() {
      int j = this.a.a() - 1;
      int i;
      for (i = 0; j >= 0; i += (m ^ k)) {
        int m;
        int k;
        Object object1 = this.a.a(j, 0);
        Object object2 = this.a.a(j, 1);
        if (object1 == null) {
          k = 0;
        } else {
          k = object1.hashCode();
        } 
        if (object2 == null) {
          m = 0;
        } else {
          m = object2.hashCode();
        } 
        j--;
      } 
      return i;
    }
    
    public boolean isEmpty() { return (this.a.a() == 0); }
    
    public Iterator<Map.Entry<K, V>> iterator() { return new d.d(this.a); }
    
    public boolean remove(Object param1Object) { throw new UnsupportedOperationException(); }
    
    public boolean removeAll(Collection<?> param1Collection) { throw new UnsupportedOperationException(); }
    
    public boolean retainAll(Collection<?> param1Collection) { throw new UnsupportedOperationException(); }
    
    public int size() { return this.a.a(); }
    
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    
    public <T> T[] toArray(T[] param1ArrayOfT) { throw new UnsupportedOperationException(); }
  }
  
  final class c extends Object implements Set<K> {
    c(d this$0) {}
    
    public boolean add(K param1K) { throw new UnsupportedOperationException(); }
    
    public boolean addAll(Collection<? extends K> param1Collection) { throw new UnsupportedOperationException(); }
    
    public void clear() { this.a.c(); }
    
    public boolean contains(Object param1Object) { return (this.a.a(param1Object) >= 0); }
    
    public boolean containsAll(Collection<?> param1Collection) { return d.a(this.a.b(), param1Collection); }
    
    public boolean equals(Object param1Object) { return d.a(this, param1Object); }
    
    public int hashCode() {
      int i = this.a.a() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        Object object = this.a.a(i, 0);
        if (object == null) {
          k = 0;
        } else {
          k = object.hashCode();
        } 
        j += k;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() { return (this.a.a() == 0); }
    
    public Iterator<K> iterator() { return new d.a(this.a, 0); }
    
    public boolean remove(Object param1Object) {
      int i = this.a.a(param1Object);
      if (i >= 0) {
        this.a.a(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) { return d.b(this.a.b(), param1Collection); }
    
    public boolean retainAll(Collection<?> param1Collection) { return d.c(this.a.b(), param1Collection); }
    
    public int size() { return this.a.a(); }
    
    public Object[] toArray() { return this.a.b(0); }
    
    public <T> T[] toArray(T[] param1ArrayOfT) { return (T[])this.a.a(param1ArrayOfT, 0); }
  }
  
  final class d extends Object implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    int a;
    
    int b;
    
    boolean c = false;
    
    d(d this$0) {
      this.a = this$0.a() - 1;
      this.b = -1;
    }
    
    public Map.Entry<K, V> a() {
      this.b++;
      this.c = true;
      return this;
    }
    
    public final boolean equals(Object param1Object) {
      boolean bool = true;
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      if (!(param1Object instanceof Map.Entry))
        return false; 
      param1Object = (Map.Entry)param1Object;
      if (!b.a(param1Object.getKey(), this.d.a(this.b, 0)) || !b.a(param1Object.getValue(), this.d.a(this.b, 1)))
        bool = false; 
      return bool;
    }
    
    public K getKey() {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      return (K)this.d.a(this.b, 0);
    }
    
    public V getValue() {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      return (V)this.d.a(this.b, 1);
    }
    
    public boolean hasNext() { return (this.b < this.a); }
    
    public final int hashCode() {
      int i;
      int j = 0;
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      Object object1 = this.d.a(this.b, 0);
      Object object2 = this.d.a(this.b, 1);
      if (object1 == null) {
        i = 0;
      } else {
        i = object1.hashCode();
      } 
      if (object2 != null)
        j = object2.hashCode(); 
      return j ^ i;
    }
    
    public void remove() {
      if (!this.c)
        throw new IllegalStateException(); 
      this.d.a(this.b);
      this.b--;
      this.a--;
      this.c = false;
    }
    
    public V setValue(V param1V) {
      if (!this.c)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects"); 
      return (V)this.d.a(this.b, param1V);
    }
    
    public final String toString() { return getKey() + "=" + getValue(); }
  }
  
  final class e extends Object implements Collection<V> {
    e(d this$0) {}
    
    public boolean add(V param1V) { throw new UnsupportedOperationException(); }
    
    public boolean addAll(Collection<? extends V> param1Collection) { throw new UnsupportedOperationException(); }
    
    public void clear() { this.a.c(); }
    
    public boolean contains(Object param1Object) { return (this.a.b(param1Object) >= 0); }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean isEmpty() { return (this.a.a() == 0); }
    
    public Iterator<V> iterator() { return new d.a(this.a, 1); }
    
    public boolean remove(Object param1Object) {
      int i = this.a.b(param1Object);
      if (i >= 0) {
        this.a.a(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      byte b = 0;
      int i = this.a.a();
      boolean bool = false;
      while (b < i) {
        byte b1 = b;
        int j = i;
        if (param1Collection.contains(this.a.a(b, 1))) {
          this.a.a(b);
          b1 = b - 1;
          j = i - 1;
          bool = true;
        } 
        b = b1 + 1;
        i = j;
      } 
      return bool;
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      byte b = 0;
      int i = this.a.a();
      boolean bool = false;
      while (b < i) {
        byte b1 = b;
        int j = i;
        if (!param1Collection.contains(this.a.a(b, 1))) {
          this.a.a(b);
          b1 = b - 1;
          j = i - 1;
          bool = true;
        } 
        b = b1 + 1;
        i = j;
      } 
      return bool;
    }
    
    public int size() { return this.a.a(); }
    
    public Object[] toArray() { return this.a.b(1); }
    
    public <T> T[] toArray(T[] param1ArrayOfT) { return (T[])this.a.a(param1ArrayOfT, 1); }
  }
}

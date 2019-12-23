package android.support.v4.g;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends e<K, V> implements Map<K, V> {
  d<K, V> a;
  
  private d<K, V> b() {
    if (this.a == null)
      this.a = new d<K, V>(this) {
          protected int a() { return this.a.h; }
          
          protected int a(Object param1Object) { return this.a.a(param1Object); }
          
          protected Object a(int param1Int1, int param1Int2) { return this.a.g[(param1Int1 << 1) + param1Int2]; }
          
          protected V a(int param1Int, V param1V) { return (V)this.a.a(param1Int, param1V); }
          
          protected void a(int param1Int) { this.a.d(param1Int); }
          
          protected void a(K param1K, V param1V) { this.a.put(param1K, param1V); }
          
          protected int b(Object param1Object) { return this.a.b(param1Object); }
          
          protected Map<K, V> b() { return this.a; }
          
          protected void c() { this.a.clear(); }
        }; 
    return this.a;
  }
  
  public Set<Map.Entry<K, V>> entrySet() { return b().d(); }
  
  public Set<K> keySet() { return b().e(); }
  
  public void putAll(Map<? extends K, ? extends V> paramMap) {
    a(this.h + paramMap.size());
    for (Map.Entry entry : paramMap.entrySet())
      put(entry.getKey(), entry.getValue()); 
  }
  
  public Collection<V> values() { return b().f(); }
}

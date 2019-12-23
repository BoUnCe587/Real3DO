package android.support.v4.g;

import java.util.Map;

public class e<K, V> extends Object {
  static Object[] b;
  
  static int c;
  
  static Object[] d;
  
  static int e;
  
  int[] f = b.a;
  
  Object[] g = b.c;
  
  int h = 0;
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt) { // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 59
    //   7: ldc android/support/v4/g/a
    //   9: monitorenter
    //   10: getstatic android/support/v4/g/e.e : I
    //   13: bipush #10
    //   15: if_icmpge -> 49
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic android/support/v4/g/e.d : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iload_2
    //   29: iconst_1
    //   30: ishl
    //   31: iconst_1
    //   32: isub
    //   33: istore_2
    //   34: goto -> 117
    //   37: aload_1
    //   38: putstatic android/support/v4/g/e.d : [Ljava/lang/Object;
    //   41: getstatic android/support/v4/g/e.e : I
    //   44: iconst_1
    //   45: iadd
    //   46: putstatic android/support/v4/g/e.e : I
    //   49: ldc android/support/v4/g/a
    //   51: monitorexit
    //   52: return
    //   53: astore_0
    //   54: ldc android/support/v4/g/a
    //   56: monitorexit
    //   57: aload_0
    //   58: athrow
    //   59: aload_0
    //   60: arraylength
    //   61: iconst_4
    //   62: if_icmpne -> 133
    //   65: ldc android/support/v4/g/a
    //   67: monitorenter
    //   68: getstatic android/support/v4/g/e.c : I
    //   71: bipush #10
    //   73: if_icmpge -> 107
    //   76: aload_1
    //   77: iconst_0
    //   78: getstatic android/support/v4/g/e.b : [Ljava/lang/Object;
    //   81: aastore
    //   82: aload_1
    //   83: iconst_1
    //   84: aload_0
    //   85: aastore
    //   86: iload_2
    //   87: iconst_1
    //   88: ishl
    //   89: iconst_1
    //   90: isub
    //   91: istore_2
    //   92: goto -> 134
    //   95: aload_1
    //   96: putstatic android/support/v4/g/e.b : [Ljava/lang/Object;
    //   99: getstatic android/support/v4/g/e.c : I
    //   102: iconst_1
    //   103: iadd
    //   104: putstatic android/support/v4/g/e.c : I
    //   107: ldc android/support/v4/g/a
    //   109: monitorexit
    //   110: return
    //   111: astore_0
    //   112: ldc android/support/v4/g/a
    //   114: monitorexit
    //   115: aload_0
    //   116: athrow
    //   117: iload_2
    //   118: iconst_2
    //   119: if_icmplt -> 37
    //   122: aload_1
    //   123: iload_2
    //   124: aconst_null
    //   125: aastore
    //   126: iload_2
    //   127: iconst_1
    //   128: isub
    //   129: istore_2
    //   130: goto -> 117
    //   133: return
    //   134: iload_2
    //   135: iconst_2
    //   136: if_icmplt -> 95
    //   139: aload_1
    //   140: iload_2
    //   141: aconst_null
    //   142: aastore
    //   143: iload_2
    //   144: iconst_1
    //   145: isub
    //   146: istore_2
    //   147: goto -> 134
    // Exception table:
    //   from	to	target	type
    //   10	24	53	finally
    //   37	49	53	finally
    //   49	52	53	finally
    //   54	57	53	finally
    //   68	82	111	finally
    //   95	107	111	finally
    //   107	110	111	finally
    //   112	115	111	finally }
  
  private void e(int paramInt) { // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 96
    //   6: ldc android/support/v4/g/a
    //   8: monitorenter
    //   9: getstatic android/support/v4/g/e.d : [Ljava/lang/Object;
    //   12: ifnull -> 69
    //   15: getstatic android/support/v4/g/e.d : [Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: putfield g : [Ljava/lang/Object;
    //   24: aload_2
    //   25: iconst_0
    //   26: aaload
    //   27: checkcast [Ljava/lang/Object;
    //   30: checkcast [Ljava/lang/Object;
    //   33: putstatic android/support/v4/g/e.d : [Ljava/lang/Object;
    //   36: aload_0
    //   37: aload_2
    //   38: iconst_1
    //   39: aaload
    //   40: checkcast [I
    //   43: checkcast [I
    //   46: putfield f : [I
    //   49: aload_2
    //   50: iconst_1
    //   51: aconst_null
    //   52: aastore
    //   53: aload_2
    //   54: iconst_0
    //   55: aconst_null
    //   56: aastore
    //   57: getstatic android/support/v4/g/e.e : I
    //   60: iconst_1
    //   61: isub
    //   62: putstatic android/support/v4/g/e.e : I
    //   65: ldc android/support/v4/g/a
    //   67: monitorexit
    //   68: return
    //   69: ldc android/support/v4/g/a
    //   71: monitorexit
    //   72: aload_0
    //   73: iload_1
    //   74: newarray int
    //   76: putfield f : [I
    //   79: aload_0
    //   80: iload_1
    //   81: iconst_1
    //   82: ishl
    //   83: anewarray java/lang/Object
    //   86: putfield g : [Ljava/lang/Object;
    //   89: return
    //   90: astore_2
    //   91: ldc android/support/v4/g/a
    //   93: monitorexit
    //   94: aload_2
    //   95: athrow
    //   96: iload_1
    //   97: iconst_4
    //   98: if_icmpne -> 72
    //   101: ldc android/support/v4/g/a
    //   103: monitorenter
    //   104: getstatic android/support/v4/g/e.b : [Ljava/lang/Object;
    //   107: ifnull -> 170
    //   110: getstatic android/support/v4/g/e.b : [Ljava/lang/Object;
    //   113: astore_2
    //   114: aload_0
    //   115: aload_2
    //   116: putfield g : [Ljava/lang/Object;
    //   119: aload_2
    //   120: iconst_0
    //   121: aaload
    //   122: checkcast [Ljava/lang/Object;
    //   125: checkcast [Ljava/lang/Object;
    //   128: putstatic android/support/v4/g/e.b : [Ljava/lang/Object;
    //   131: aload_0
    //   132: aload_2
    //   133: iconst_1
    //   134: aaload
    //   135: checkcast [I
    //   138: checkcast [I
    //   141: putfield f : [I
    //   144: aload_2
    //   145: iconst_1
    //   146: aconst_null
    //   147: aastore
    //   148: aload_2
    //   149: iconst_0
    //   150: aconst_null
    //   151: aastore
    //   152: getstatic android/support/v4/g/e.c : I
    //   155: iconst_1
    //   156: isub
    //   157: putstatic android/support/v4/g/e.c : I
    //   160: ldc android/support/v4/g/a
    //   162: monitorexit
    //   163: return
    //   164: astore_2
    //   165: ldc android/support/v4/g/a
    //   167: monitorexit
    //   168: aload_2
    //   169: athrow
    //   170: ldc android/support/v4/g/a
    //   172: monitorexit
    //   173: goto -> 72
    // Exception table:
    //   from	to	target	type
    //   9	49	90	finally
    //   57	68	90	finally
    //   69	72	90	finally
    //   91	94	90	finally
    //   104	144	164	finally
    //   152	163	164	finally
    //   165	168	164	finally
    //   170	173	164	finally }
  
  int a() {
    int k = this.h;
    if (k == 0)
      return -1; 
    int j = b.a(this.f, k, 0);
    int i = j;
    if (j >= 0) {
      i = j;
      if (this.g[j << true] != null) {
        int m;
        for (m = j + 1; m < k && this.f[m] == 0; m++) {
          if (this.g[m << true] == null)
            return m; 
        } 
        while (--j >= 0 && this.f[j] == 0) {
          i = j;
          if (this.g[j << true] != null) {
            j--;
            continue;
          } 
          return i;
        } 
        return m ^ 0xFFFFFFFF;
      } 
    } 
    return i;
  }
  
  public int a(Object paramObject) { return (paramObject == null) ? a() : a(paramObject, paramObject.hashCode()); }
  
  int a(Object paramObject, int paramInt) {
    int k = this.h;
    if (k == 0)
      return -1; 
    int j = b.a(this.f, k, paramInt);
    int i = j;
    if (j >= 0) {
      i = j;
      if (!paramObject.equals(this.g[j << 1])) {
        int m;
        for (m = j + 1; m < k && this.f[m] == paramInt; m++) {
          if (paramObject.equals(this.g[m << 1]))
            return m; 
        } 
        while (--j >= 0 && this.f[j] == paramInt) {
          i = j;
          if (!paramObject.equals(this.g[j << 1])) {
            j--;
            continue;
          } 
          return i;
        } 
        return m ^ 0xFFFFFFFF;
      } 
    } 
    return i;
  }
  
  public V a(int paramInt, V paramV) {
    paramInt = (paramInt << 1) + 1;
    Object object = this.g[paramInt];
    this.g[paramInt] = paramV;
    return (V)object;
  }
  
  public void a(int paramInt) {
    if (this.f.length < paramInt) {
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      e(paramInt);
      if (this.h > 0) {
        System.arraycopy(arrayOfInt, 0, this.f, 0, this.h);
        System.arraycopy(arrayOfObject, 0, this.g, 0, this.h << 1);
      } 
      a(arrayOfInt, arrayOfObject, this.h);
    } 
  }
  
  int b(Object paramObject) {
    byte b1 = 1;
    byte b2 = 1;
    int i = this.h * 2;
    Object[] arrayOfObject = this.g;
    if (paramObject == null) {
      for (b1 = b2; b1 < i; b1 += 2) {
        if (arrayOfObject[b1] == null)
          return b1 >> 1; 
      } 
    } else {
      while (b1 < i) {
        if (paramObject.equals(arrayOfObject[b1]))
          return b1 >> 1; 
        b1 += 2;
      } 
    } 
    return -1;
  }
  
  public K b(int paramInt) { return (K)this.g[paramInt << 1]; }
  
  public V c(int paramInt) { return (V)this.g[(paramInt << 1) + 1]; }
  
  public void clear() {
    if (this.h != 0) {
      a(this.f, this.g, this.h);
      this.f = b.a;
      this.g = b.c;
      this.h = 0;
    } 
  }
  
  public boolean containsKey(Object paramObject) { return (a(paramObject) >= 0); }
  
  public boolean containsValue(Object paramObject) { return (b(paramObject) >= 0); }
  
  public V d(int paramInt) {
    int i = 8;
    Object object = this.g[(paramInt << 1) + 1];
    if (this.h <= 1) {
      a(this.f, this.g, this.h);
      this.f = b.a;
      this.g = b.c;
      this.h = 0;
      return (V)object;
    } 
    if (this.f.length > 8 && this.h < this.f.length / 3) {
      if (this.h > 8)
        i = this.h + (this.h >> 1); 
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      e(i);
      this.h--;
      if (paramInt > 0) {
        System.arraycopy(arrayOfInt, 0, this.f, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.g, 0, paramInt << 1);
      } 
      if (paramInt < this.h) {
        System.arraycopy(arrayOfInt, paramInt + 1, this.f, paramInt, this.h - paramInt);
        System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.g, paramInt << 1, this.h - paramInt << 1);
        return (V)object;
      } 
      return (V)object;
    } 
    this.h--;
    if (paramInt < this.h) {
      System.arraycopy(this.f, paramInt + 1, this.f, paramInt, this.h - paramInt);
      System.arraycopy(this.g, paramInt + 1 << 1, this.g, paramInt << 1, this.h - paramInt << 1);
    } 
    this.g[this.h << 1] = null;
    this.g[(this.h << 1) + 1] = null;
    return (V)object;
  }
  
  public boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (paramObject instanceof Map) {
        paramObject = (Map)paramObject;
        if (size() != paramObject.size())
          return false; 
        byte b1 = 0;
        try {
          while (true) {
            if (b1 < this.h) {
              Object object1 = b(b1);
              Object object2 = c(b1);
              Object object3 = paramObject.get(object1);
              if (object2 == null) {
                if (object3 != null || !paramObject.containsKey(object1))
                  break; 
              } else {
                boolean bool = object2.equals(object3);
                if (!bool)
                  return false; 
              } 
              b1++;
              continue;
            } 
            return true;
          } 
        } catch (NullPointerException paramObject) {
          return false;
        } catch (ClassCastException paramObject) {
          return false;
        } 
      } else {
        return false;
      } 
      return false;
    } 
    return true;
  }
  
  public V get(Object paramObject) {
    int i = a(paramObject);
    return (i >= 0) ? (V)this.g[(i << 1) + 1] : null;
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.f;
    Object[] arrayOfObject = this.g;
    int j = this.h;
    byte b1 = 1;
    byte b2 = 0;
    int i = 0;
    while (b2 < j) {
      int k;
      Object object = arrayOfObject[b1];
      int m = arrayOfInt[b2];
      if (object == null) {
        k = 0;
      } else {
        k = object.hashCode();
      } 
      i += (k ^ m);
      b2++;
      b1 += 2;
    } 
    return i;
  }
  
  public boolean isEmpty() { return (this.h <= 0); }
  
  public V put(K paramK, V paramV) {
    int j;
    int i;
    int k = 8;
    if (paramK == null) {
      i = a();
      j = 0;
    } else {
      j = paramK.hashCode();
      i = a(paramK, j);
    } 
    if (i >= 0) {
      i = (i << 1) + 1;
      paramK = (K)this.g[i];
      this.g[i] = paramV;
      return (V)paramK;
    } 
    int m = i ^ 0xFFFFFFFF;
    if (this.h >= this.f.length) {
      if (this.h >= 8) {
        i = this.h + (this.h >> 1);
      } else {
        i = k;
        if (this.h < 4)
          i = 4; 
      } 
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      e(i);
      if (this.f.length > 0) {
        System.arraycopy(arrayOfInt, 0, this.f, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.g, 0, arrayOfObject.length);
      } 
      a(arrayOfInt, arrayOfObject, this.h);
    } 
    if (m < this.h) {
      System.arraycopy(this.f, m, this.f, m + 1, this.h - m);
      System.arraycopy(this.g, m << 1, this.g, m + 1 << 1, this.h - m << 1);
    } 
    this.f[m] = j;
    this.g[m << 1] = paramK;
    this.g[(m << 1) + 1] = paramV;
    this.h++;
    return null;
  }
  
  public V remove(Object paramObject) {
    int i = a(paramObject);
    return (i >= 0) ? (V)d(i) : null;
  }
  
  public int size() { return this.h; }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.h * 28);
    stringBuilder.append('{');
    for (byte b1 = 0; b1 < this.h; b1++) {
      if (b1)
        stringBuilder.append(", "); 
      Object object = b(b1);
      if (object != this) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Map)");
      } 
      stringBuilder.append('=');
      object = c(b1);
      if (object != this) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}
package android.support.v4.g;

class b {
  static final int[] a = new int[0];
  
  static final long[] b = new long[0];
  
  static final Object[] c = new Object[0];
  
  static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2) {
    int i = 0;
    int j = paramInt1 - 1;
    paramInt1 = i;
    i = j;
    while (paramInt1 <= i) {
      j = paramInt1 + i >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2) {
        paramInt1 = j + 1;
        continue;
      } 
      if (k > paramInt2) {
        i = j - 1;
        continue;
      } 
      return j;
    } 
    return paramInt1 ^ 0xFFFFFFFF;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2) { return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2))); }
}

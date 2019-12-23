package com.google.android.vending.licensing.a;

public class a {
  private static final byte[] b;
  
  private static final byte[] c;
  
  private static final byte[] d;
  
  private static final byte[] e;
  
  static  {
    boolean bool;
    if (!a.class.desiredAssertionStatus()) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
    b = new byte[] { 
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47 };
    c = new byte[] { 
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95 };
    d = new byte[] { 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9 };
    e = new byte[] { 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9 };
  }
  
  private static int a(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, byte[] paramArrayOfByte3) {
    if (paramArrayOfByte1[paramInt1 + 2] == 61) {
      paramArrayOfByte2[paramInt2] = (byte)((paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[paramInt1 + 1]] << 24 >>> 12) >>> 16);
      return 1;
    } 
    if (paramArrayOfByte1[paramInt1 + 3] == 61) {
      paramInt1 = paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[paramInt1 + 1]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[paramInt1 + 2]] << 24 >>> 18;
      paramArrayOfByte2[paramInt2] = (byte)(paramInt1 >>> 16);
      paramArrayOfByte2[paramInt2 + 1] = (byte)(paramInt1 >>> 8);
      return 2;
    } 
    paramInt1 = paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[paramInt1 + 1]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[paramInt1 + 2]] << 24 >>> 18 | paramArrayOfByte3[paramArrayOfByte1[paramInt1 + 3]] << 24 >>> 24;
    paramArrayOfByte2[paramInt2] = (byte)(paramInt1 >> 16);
    paramArrayOfByte2[paramInt2 + 1] = (byte)(paramInt1 >> 8);
    paramArrayOfByte2[paramInt2 + 2] = (byte)paramInt1;
    return 3;
  }
  
  public static String a(byte[] paramArrayOfByte) { return a(paramArrayOfByte, 0, paramArrayOfByte.length, b, true); }
  
  public static String a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, boolean paramBoolean) {
    paramArrayOfByte1 = a(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, 2147483647);
    for (paramInt1 = paramArrayOfByte1.length;; paramInt1--) {
      if (paramBoolean || paramInt1 <= 0 || paramArrayOfByte1[paramInt1 - 1] != 61)
        return new String(paramArrayOfByte1, 0, paramInt1); 
    } 
  }
  
  public static byte[] a(String paramString) {
    byte[] arrayOfByte = paramString.getBytes();
    return a(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2) { return a(paramArrayOfByte, paramInt1, paramInt2, d); }
  
  public static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2) {
    byte[] arrayOfByte1 = new byte[paramInt2 * 3 / 4 + 2];
    byte[] arrayOfByte2 = new byte[4];
    int k = 0;
    int j = 0;
    int i = 0;
    while (true) {
      int m;
      if (k < paramInt2) {
        byte b1 = (byte)(paramArrayOfByte1[k + paramInt1] & 0x7F);
        byte b2 = paramArrayOfByte2[b1];
        if (b2 >= -5) {
          if (b2 >= -1) {
            if (b1 == 61) {
              int n = paramInt2 - k;
              paramInt1 = (byte)(paramArrayOfByte1[paramInt2 - 1 + paramInt1] & 0x7F);
              if (!j || j == 1)
                throw new b("invalid padding byte '=' at byte offset " + k); 
              if ((j == 3 && n > 2) || (j == 4 && n > 1))
                throw new b("padding byte '=' falsely signals end of encoded value at offset " + k); 
              if (paramInt1 != 61 && paramInt1 != 10)
                throw new b("encoded value has invalid trailing byte"); 
            } else {
              b2 = j + true;
              arrayOfByte2[j] = b1;
              if (b2 == 4) {
                j = a(arrayOfByte2, 0, arrayOfByte1, i, paramArrayOfByte2) + i;
                i = 0;
              } else {
                j = i;
                m = b2;
              } 
              int n = k + 1;
              k = j;
              j = m;
              m = k;
              k = n;
            } 
          } else {
            int n = m;
            m = j;
            j = n;
            n = k + 1;
            k = j;
            j = m;
            m = k;
            k = n;
          } 
        } else {
          throw new b("Bad Base64 input character at " + k + ": " + paramArrayOfByte1[k + paramInt1] + "(decimal)");
        } 
      } 
      paramInt1 = m;
      if (j != 0) {
        if (j == 1)
          throw new b("single trailing character at offset " + (paramInt2 - 1)); 
        arrayOfByte2[j] = 61;
        paramInt1 = m + a(arrayOfByte2, 0, arrayOfByte1, m, paramArrayOfByte2);
      } 
      paramArrayOfByte1 = new byte[paramInt1];
      System.arraycopy(arrayOfByte1, 0, paramArrayOfByte1, 0, paramInt1);
      return paramArrayOfByte1;
    } 
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3) {
    int i = (paramInt2 + 2) / 3 * 4;
    byte[] arrayOfByte = new byte[i + i / paramInt3];
    byte b1 = 0;
    i = 0;
    int j = 0;
    while (j < paramInt2 - 2) {
      byte b2 = paramArrayOfByte1[j + paramInt1] << 24 >>> 8 | paramArrayOfByte1[j + 1 + paramInt1] << 24 >>> 16 | paramArrayOfByte1[j + 2 + paramInt1] << 24 >>> 24;
      arrayOfByte[i] = paramArrayOfByte2[b2 >>> 18];
      arrayOfByte[i + 1] = paramArrayOfByte2[b2 >>> 12 & 0x3F];
      arrayOfByte[i + 2] = paramArrayOfByte2[b2 >>> 6 & 0x3F];
      arrayOfByte[i + 3] = paramArrayOfByte2[b2 & 0x3F];
      byte b3 = b1 + 4;
      b1 = b3;
      int m = i;
      if (b3 == paramInt3) {
        arrayOfByte[i + 4] = 10;
        m = i + 1;
        b1 = 0;
      } 
      j += 3;
      i = m + 4;
    } 
    int k = i;
    if (j < paramInt2) {
      a(paramArrayOfByte1, j + paramInt1, paramInt2 - j, arrayOfByte, i, paramArrayOfByte2);
      paramInt1 = i;
      if (b1 + 4 == paramInt3) {
        arrayOfByte[i + 4] = 10;
        paramInt1 = i + 1;
      } 
      k = paramInt1 + 4;
    } 
    if (!a && k != arrayOfByte.length)
      throw new AssertionError(); 
    return arrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, byte[] paramArrayOfByte3) {
    byte b2;
    byte b1;
    byte b3 = 0;
    if (paramInt2 > 0) {
      b1 = paramArrayOfByte1[paramInt1] << 24 >>> 8;
    } else {
      b1 = 0;
    } 
    if (paramInt2 > 1) {
      b2 = paramArrayOfByte1[paramInt1 + 1] << 24 >>> 16;
    } else {
      b2 = 0;
    } 
    if (paramInt2 > 2)
      b3 = paramArrayOfByte1[paramInt1 + 2] << 24 >>> 24; 
    paramInt1 = b3 | b2 | b1;
    switch (paramInt2) {
      default:
        return paramArrayOfByte2;
      case 3:
        paramArrayOfByte2[paramInt3] = paramArrayOfByte3[paramInt1 >>> 18];
        paramArrayOfByte2[paramInt3 + 1] = paramArrayOfByte3[paramInt1 >>> 12 & 0x3F];
        paramArrayOfByte2[paramInt3 + 2] = paramArrayOfByte3[paramInt1 >>> 6 & 0x3F];
        paramArrayOfByte2[paramInt3 + 3] = paramArrayOfByte3[paramInt1 & 0x3F];
        return paramArrayOfByte2;
      case 2:
        paramArrayOfByte2[paramInt3] = paramArrayOfByte3[paramInt1 >>> 18];
        paramArrayOfByte2[paramInt3 + 1] = paramArrayOfByte3[paramInt1 >>> 12 & 0x3F];
        paramArrayOfByte2[paramInt3 + 2] = paramArrayOfByte3[paramInt1 >>> 6 & 0x3F];
        paramArrayOfByte2[paramInt3 + 3] = 61;
        return paramArrayOfByte2;
      case 1:
        break;
    } 
    paramArrayOfByte2[paramInt3] = paramArrayOfByte3[paramInt1 >>> 18];
    paramArrayOfByte2[paramInt3 + 1] = paramArrayOfByte3[paramInt1 >>> 12 & 0x3F];
    paramArrayOfByte2[paramInt3 + 2] = 61;
    paramArrayOfByte2[paramInt3 + 3] = 61;
    return paramArrayOfByte2;
  }
}
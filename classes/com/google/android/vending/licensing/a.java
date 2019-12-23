package com.google.android.vending.licensing;

import com.google.android.vending.licensing.a.a;
import com.google.android.vending.licensing.a.b;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class a implements h {
  private static final byte[] a = { 
      16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 
      0, -29, 70, 65, -12, 74 };
  
  private Cipher b;
  
  private Cipher c;
  
  public a(byte[] paramArrayOfByte, String paramString1, String paramString2) {
    try {
      SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((paramString1 + paramString2).toCharArray(), paramArrayOfByte, 1024, 256)).getEncoded(), "AES");
      this.b = Cipher.getInstance("AES/CBC/PKCS5Padding");
      this.b.init(1, secretKeySpec, new IvParameterSpec(a));
      this.c = Cipher.getInstance("AES/CBC/PKCS5Padding");
      this.c.init(2, secretKeySpec, new IvParameterSpec(a));
      return;
    } catch (GeneralSecurityException paramArrayOfByte) {
      throw new RuntimeException("Invalid environment", paramArrayOfByte);
    } 
  }
  
  public String a(String paramString1, String paramString2) {
    if (paramString1 == null)
      return null; 
    try {
      return a.a(this.b.doFinal(("com.android.vending.licensing.AESObfuscator-1|" + paramString2 + paramString1).getBytes("UTF-8")));
    } catch (UnsupportedEncodingException paramString1) {
      throw new RuntimeException("Invalid environment", paramString1);
    } catch (GeneralSecurityException paramString1) {
      throw new RuntimeException("Invalid environment", paramString1);
    } 
  }
  
  public String b(String paramString1, String paramString2) {
    if (paramString1 == null)
      return null; 
    try {
      String str = new String(this.c.doFinal(a.a(paramString1)), "UTF-8");
      if (str.indexOf("com.android.vending.licensing.AESObfuscator-1|" + paramString2) != 0)
        throw new m("Header not found (invalid data or key):" + paramString1); 
      return str.substring("com.android.vending.licensing.AESObfuscator-1|".length() + paramString2.length(), str.length());
    } catch (b paramString2) {
      throw new m(paramString2.getMessage() + ":" + paramString1);
    } catch (IllegalBlockSizeException paramString2) {
      throw new m(paramString2.getMessage() + ":" + paramString1);
    } catch (BadPaddingException paramString2) {
      throw new m(paramString2.getMessage() + ":" + paramString1);
    } catch (UnsupportedEncodingException paramString1) {
      throw new RuntimeException("Invalid environment", paramString1);
    } 
  }
}
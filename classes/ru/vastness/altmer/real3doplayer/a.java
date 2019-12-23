package ru.vastness.altmer.real3doplayer;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a {
  private final boolean a;
  
  private final Cipher b;
  
  private final Cipher c;
  
  private final Cipher d;
  
  private final SharedPreferences e;
  
  public a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean) {
    try {
      this.d = (this.c = (this.b = Cipher.getInstance("AES/CBC/PKCS5Padding")).getInstance("AES/CBC/PKCS5Padding")).getInstance("AES/ECB/PKCS5Padding");
      a(paramString2);
      this.e = paramContext.getSharedPreferences(paramString1, 0);
      this.a = paramBoolean;
      return;
    } catch (GeneralSecurityException paramContext) {
      throw new a(paramContext);
    } catch (UnsupportedEncodingException paramContext) {
      throw new a(paramContext);
    } 
  }
  
  private static byte[] a(Cipher paramCipher, byte[] paramArrayOfByte) {
    try {
      return paramCipher.doFinal(paramArrayOfByte);
    } catch (Exception paramCipher) {
      throw new a(paramCipher);
    } 
  }
  
  private void b(String paramString1, String paramString2) {
    paramString2 = a(paramString2, this.b);
    this.e.edit().putString(paramString1, paramString2).commit();
  }
  
  private String h(String paramString) {
    String str = paramString;
    if (this.a)
      str = a(paramString, this.d); 
    return str;
  }
  
  protected String a(String paramString, Cipher paramCipher) {
    try {
      byte[] arrayOfByte = a(paramCipher, paramString.getBytes("UTF-8"));
      return Base64.encodeToString(arrayOfByte, 2);
    } catch (UnsupportedEncodingException paramString) {
      throw new a(paramString);
    } 
  }
  
  protected IvParameterSpec a() {
    byte[] arrayOfByte = new byte[this.b.getBlockSize()];
    System.arraycopy("fldsjfodasjifudslfjdsaofshaufihadsf".getBytes(), 0, arrayOfByte, 0, this.b.getBlockSize());
    return new IvParameterSpec(arrayOfByte);
  }
  
  protected void a(String paramString) {
    IvParameterSpec ivParameterSpec = a();
    SecretKeySpec secretKeySpec = b(paramString);
    this.b.init(1, secretKeySpec, ivParameterSpec);
    this.c.init(2, secretKeySpec, ivParameterSpec);
    this.d.init(1, secretKeySpec);
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2 == null) {
      this.e.edit().remove(h(paramString1)).commit();
      return;
    } 
    b(h(paramString1), paramString2);
  }
  
  protected SecretKeySpec b(String paramString) { return new SecretKeySpec(c(paramString), "AES/CBC/PKCS5Padding"); }
  
  public void b() { this.e.edit().clear().commit(); }
  
  protected byte[] c(String paramString) {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    messageDigest.reset();
    return messageDigest.digest(paramString.getBytes("UTF-8"));
  }
  
  public boolean d(String paramString) { return this.e.contains(h(paramString)); }
  
  public void e(String paramString) { this.e.edit().remove(h(paramString)).commit(); }
  
  public String f(String paramString) { return this.e.contains(h(paramString)) ? g(this.e.getString(h(paramString), "")) : null; }
  
  protected String g(String paramString) {
    arrayOfByte = Base64.decode(paramString, 2);
    arrayOfByte = a(this.c, arrayOfByte);
    try {
      return new String(arrayOfByte, "UTF-8");
    } catch (UnsupportedEncodingException arrayOfByte) {
      throw new a(arrayOfByte);
    } 
  }
  
  public static class a extends RuntimeException {
    public a(Throwable param1Throwable) { super(param1Throwable); }
  }
}
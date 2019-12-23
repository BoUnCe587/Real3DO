package com.google.android.vending.licensing;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.vending.licensing.a.a;
import com.google.android.vending.licensing.a.b;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

class f {
  private final i a;
  
  private final e b;
  
  private final int c;
  
  private final String d;
  
  private final String e;
  
  private final b f;
  
  f(i parami, b paramb, e parame, int paramInt, String paramString1, String paramString2) {
    this.a = parami;
    this.f = paramb;
    this.b = parame;
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
  }
  
  private void a(int paramInt) { this.b.c(paramInt); }
  
  private void a(int paramInt, k paramk) {
    this.a.a(paramInt, paramk);
    if (this.a.a()) {
      this.b.a(paramInt);
      return;
    } 
    this.b.b(paramInt);
  }
  
  private void d() { this.b.b(561); }
  
  public e a() { return this.b; }
  
  public void a(PublicKey paramPublicKey, int paramInt, String paramString1, String paramString2) {
    Signature signature1;
    Signature signature2 = null;
    if (paramString1 == null) {
      a(7);
      return;
    } 
    if (paramInt == 0 || paramInt == 1 || paramInt == 2) {
      try {
        signature2 = Signature.getInstance("SHA1withRSA");
        signature2.initVerify(paramPublicKey);
        signature2.update(paramString1.getBytes());
        signature2.verify(a.a(paramString2));
        if (!true) {
          Log.e("LicenseValidator", "Signature verification failed.");
          d();
          return;
        } 
      } catch (NoSuchAlgorithmException paramPublicKey) {
        throw new RuntimeException(paramPublicKey);
      } catch (InvalidKeyException paramPublicKey) {
        a(5);
        return;
      } catch (SignatureException paramPublicKey) {
        throw new RuntimeException(paramPublicKey);
      } catch (b paramPublicKey) {
        Log.e("LicenseValidator", "Could not Base64-decode signature.");
        d();
        return;
      } 
      try {
        signature1 = k.a(paramString1);
        if (signature1.a != paramInt) {
          Log.e("LicenseValidator", "Response codes don't match.");
          d();
          return;
        } 
      } catch (IllegalArgumentException paramPublicKey) {
        Log.e("LicenseValidator", "Could not parse response.");
        d();
        return;
      } 
      if (signature1.b != this.c) {
        Log.e("LicenseValidator", "Nonce doesn't match.");
        d();
        return;
      } 
      if (!signature1.c.equals(this.d)) {
        Log.e("LicenseValidator", "Package name doesn't match.");
        d();
        return;
      } 
      if (!signature1.d.equals(this.e)) {
        Log.e("LicenseValidator", "Version codes don't match.");
        d();
        return;
      } 
      paramString2 = signature1.e;
      String str = paramString2;
      if (TextUtils.isEmpty(paramString2)) {
        Log.e("LicenseValidator", "User identifier is empty.");
        d();
        return;
      } 
    } else {
      paramPublicKey = null;
      signature1 = signature2;
    } 
    switch (paramInt) {
      default:
        Log.e("LicenseValidator", "Unknown response code for license check.");
        d();
        return;
      case 0:
      case 1:
        a(this.f.a(paramPublicKey), signature1);
        return;
      case 2:
        a(561, signature1);
        return;
      case 257:
        Log.w("LicenseValidator", "Error contacting licensing server.");
        a(291, signature1);
        return;
      case 4:
        Log.w("LicenseValidator", "An error has occurred on the licensing server.");
        a(291, signature1);
        return;
      case 5:
        Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
        a(291, signature1);
        return;
      case 258:
        a(1);
        return;
      case 259:
        a(2);
        return;
      case 3:
        break;
    } 
    a(3);
  }
  
  public int b() { return this.c; }
  
  public String c() { return this.d; }
}
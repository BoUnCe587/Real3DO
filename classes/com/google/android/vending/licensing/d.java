package com.google.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.vending.licensing.a.a;
import com.google.android.vending.licensing.a.b;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class d implements ServiceConnection {
  private static final SecureRandom a = new SecureRandom();
  
  private ILicensingService b;
  
  private PublicKey c;
  
  private final Context d;
  
  private final i e;
  
  private Handler f;
  
  private final String g;
  
  private final String h;
  
  private final Set<f> i = new HashSet();
  
  private final Queue<f> j = new LinkedList();
  
  public d(Context paramContext, i parami, String paramString) {
    this.d = paramContext;
    this.e = parami;
    this.c = a(paramString);
    this.g = this.d.getPackageName();
    this.h = a(paramContext, this.g);
    HandlerThread handlerThread = new HandlerThread("background thread");
    handlerThread.start();
    this.f = new Handler(handlerThread.getLooper());
  }
  
  private static String a(Context paramContext, String paramString) {
    try {
      int k = (paramContext.getPackageManager().getPackageInfo(paramString, 0)).versionCode;
      return String.valueOf(k);
    } catch (android.content.pm.PackageManager.NameNotFoundException paramContext) {
      Log.e("LicenseChecker", "Package not found. could not get version code.");
      return "";
    } 
  }
  
  private static PublicKey a(String paramString) {
    try {
      byte[] arrayOfByte = a.a(paramString);
      return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arrayOfByte));
    } catch (NoSuchAlgorithmException paramString) {
      throw new RuntimeException(paramString);
    } catch (b paramString) {
      Log.e("LicenseChecker", "Could not decode from Base64.");
      throw new IllegalArgumentException(paramString);
    } catch (InvalidKeySpecException paramString) {
      Log.e("LicenseChecker", "Invalid key specification.");
      throw new IllegalArgumentException(paramString);
    } 
  }
  
  private void a(f paramf) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Ljava/util/Set;
    //   6: aload_1
    //   7: invokeinterface remove : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: getfield i : Ljava/util/Set;
    //   17: invokeinterface isEmpty : ()Z
    //   22: ifeq -> 29
    //   25: aload_0
    //   26: invokespecial c : ()V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	32	finally }
  
  private void b() {
    while (true) {
      f f1 = (f)this.j.poll();
      if (f1 != null)
        try {
          Log.i("LicenseChecker", "Calling checkLicense on service for " + f1.c());
          this.b.a(f1.b(), f1.c(), new a(this, f1));
          this.i.add(f1);
          continue;
        } catch (RemoteException remoteException) {
          Log.w("LicenseChecker", "RemoteException in checkLicense call.", remoteException);
          b(f1);
          continue;
        }  
      break;
    } 
  }
  
  private void b(f paramf) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Lcom/google/android/vending/licensing/i;
    //   6: sipush #291
    //   9: aconst_null
    //   10: invokeinterface a : (ILcom/google/android/vending/licensing/k;)V
    //   15: aload_0
    //   16: getfield e : Lcom/google/android/vending/licensing/i;
    //   19: invokeinterface a : ()Z
    //   24: ifeq -> 42
    //   27: aload_1
    //   28: invokevirtual a : ()Lcom/google/android/vending/licensing/e;
    //   31: sipush #291
    //   34: invokeinterface a : (I)V
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: aload_1
    //   43: invokevirtual a : ()Lcom/google/android/vending/licensing/e;
    //   46: sipush #291
    //   49: invokeinterface b : (I)V
    //   54: goto -> 39
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Exception table:
    //   from	to	target	type
    //   2	39	57	finally
    //   42	54	57	finally }
  
  private void c() {
    if (this.b != null) {
      try {
        this.d.unbindService(this);
      } catch (IllegalArgumentException illegalArgumentException) {
        Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
      } 
      this.b = null;
    } 
  }
  
  private int d() { return a.nextInt(); }
  
  public void a() { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial c : ()V
    //   6: aload_0
    //   7: getfield f : Landroid/os/Handler;
    //   10: invokevirtual getLooper : ()Landroid/os/Looper;
    //   13: invokevirtual quit : ()V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally }
  
  public void a(e parame) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Lcom/google/android/vending/licensing/i;
    //   6: invokeinterface a : ()Z
    //   11: ifeq -> 35
    //   14: ldc 'LicenseChecker'
    //   16: ldc_w 'Using cached license response'
    //   19: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   22: pop
    //   23: aload_1
    //   24: sipush #256
    //   27: invokeinterface a : (I)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: new com/google/android/vending/licensing/f
    //   38: dup
    //   39: aload_0
    //   40: getfield e : Lcom/google/android/vending/licensing/i;
    //   43: new com/google/android/vending/licensing/g
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: aload_1
    //   51: aload_0
    //   52: invokespecial d : ()I
    //   55: aload_0
    //   56: getfield g : Ljava/lang/String;
    //   59: aload_0
    //   60: getfield h : Ljava/lang/String;
    //   63: invokespecial <init> : (Lcom/google/android/vending/licensing/i;Lcom/google/android/vending/licensing/b;Lcom/google/android/vending/licensing/e;ILjava/lang/String;Ljava/lang/String;)V
    //   66: astore_2
    //   67: aload_0
    //   68: getfield b : Lcom/google/android/vending/licensing/ILicensingService;
    //   71: ifnonnull -> 177
    //   74: ldc 'LicenseChecker'
    //   76: ldc_w 'Binding to licensing service.'
    //   79: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   82: pop
    //   83: aload_0
    //   84: getfield d : Landroid/content/Context;
    //   87: new android/content/Intent
    //   90: dup
    //   91: new java/lang/String
    //   94: dup
    //   95: ldc_w 'Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U='
    //   98: invokestatic a : (Ljava/lang/String;)[B
    //   101: invokespecial <init> : ([B)V
    //   104: invokespecial <init> : (Ljava/lang/String;)V
    //   107: ldc_w 'com.android.vending'
    //   110: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   113: aload_0
    //   114: iconst_1
    //   115: invokevirtual bindService : (Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   118: ifeq -> 152
    //   121: aload_0
    //   122: getfield j : Ljava/util/Queue;
    //   125: aload_2
    //   126: invokeinterface offer : (Ljava/lang/Object;)Z
    //   131: pop
    //   132: goto -> 32
    //   135: astore_2
    //   136: aload_1
    //   137: bipush #6
    //   139: invokeinterface c : (I)V
    //   144: goto -> 32
    //   147: astore_1
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_1
    //   151: athrow
    //   152: ldc 'LicenseChecker'
    //   154: ldc_w 'Could not bind to service.'
    //   157: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   160: pop
    //   161: aload_0
    //   162: aload_2
    //   163: invokespecial b : (Lcom/google/android/vending/licensing/f;)V
    //   166: goto -> 32
    //   169: astore_1
    //   170: aload_1
    //   171: invokevirtual printStackTrace : ()V
    //   174: goto -> 32
    //   177: aload_0
    //   178: getfield j : Ljava/util/Queue;
    //   181: aload_2
    //   182: invokeinterface offer : (Ljava/lang/Object;)Z
    //   187: pop
    //   188: aload_0
    //   189: invokespecial b : ()V
    //   192: goto -> 32
    // Exception table:
    //   from	to	target	type
    //   2	32	147	finally
    //   35	83	147	finally
    //   83	132	135	java/lang/SecurityException
    //   83	132	169	com/google/android/vending/licensing/a/b
    //   83	132	147	finally
    //   136	144	147	finally
    //   152	166	135	java/lang/SecurityException
    //   152	166	169	com/google/android/vending/licensing/a/b
    //   152	166	147	finally
    //   170	174	147	finally
    //   177	192	147	finally }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokestatic a : (Landroid/os/IBinder;)Lcom/google/android/vending/licensing/ILicensingService;
    //   7: putfield b : Lcom/google/android/vending/licensing/ILicensingService;
    //   10: aload_0
    //   11: invokespecial b : ()V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally }
  
  public void onServiceDisconnected(ComponentName paramComponentName) { // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'LicenseChecker'
    //   4: ldc_w 'Service unexpectedly disconnected.'
    //   7: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   10: pop
    //   11: aload_0
    //   12: aconst_null
    //   13: putfield b : Lcom/google/android/vending/licensing/ILicensingService;
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally }
  
  private class a extends c.a {
    private final f b;
    
    private Runnable c;
    
    public a(d this$0, f param1f) {
      this.b = param1f;
      this.c = new Runnable(this, this$0) {
          public void run() {
            Log.i("LicenseChecker", "Check timed out.");
            d.a(this.b.a, d.a.a(this.b));
            d.b(this.b.a, d.a.a(this.b));
          }
        };
      a();
    }
    
    private void a() {
      Log.i("LicenseChecker", "Start monitoring timeout.");
      d.c(this.a).postDelayed(this.c, 10000L);
    }
    
    private void b() {
      Log.i("LicenseChecker", "Clearing timeout.");
      d.c(this.a).removeCallbacks(this.c);
    }
    
    public void a(int param1Int, String param1String1, String param1String2) { d.c(this.a).post(new Runnable(this, param1Int, param1String1, param1String2) {
            public void run() {
              Log.i("LicenseChecker", "Received response.");
              if (d.a(this.d.a).contains(d.a.a(this.d))) {
                d.a.b(this.d);
                d.a.a(this.d).a(d.b(this.d.a), this.a, this.b, this.c);
                d.b(this.d.a, d.a.a(this.d));
              } 
            }
          }); }
  }
  
  class null implements Runnable {
    null(d this$0, d param1d) {}
    
    public void run() {
      Log.i("LicenseChecker", "Check timed out.");
      d.a(this.b.a, d.a.a(this.b));
      d.b(this.b.a, d.a.a(this.b));
    }
  }
  
  class null implements Runnable {
    null(d this$0, int param1Int, String param1String1, String param1String2) {}
    
    public void run() {
      Log.i("LicenseChecker", "Received response.");
      if (d.a(this.d.a).contains(d.a.a(this.d))) {
        d.a.b(this.d);
        d.a.a(this.d).a(d.b(this.d.a), this.a, this.b, this.c);
        d.b(this.d.a, d.a.a(this.d));
      } 
    }
  }
}
package ru.vastness.altmer.real3doplayer;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.a.a;
import android.support.v4.b.a;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.vending.licensing.a;
import com.google.android.vending.licensing.d;
import com.google.android.vending.licensing.e;
import com.google.android.vending.licensing.l;
import java.io.File;
import java.io.FileFilter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class MainActivity extends Activity {
  private static final byte[] a = { 
      -36, 15, 49, -19, -100, -125, 119, -32, 43, 77, 
      -9, -5, 61, -101, -36, -97, -81, -12, 75, 21 };
  
  private final Pattern b = Pattern.compile("/");
  
  private b c;
  
  private ListView d;
  
  private boolean e = false;
  
  private String f = null;
  
  private String g = null;
  
  private String h = null;
  
  private a i;
  
  private e j;
  
  private d k;
  
  private boolean l = false;
  
  private Handler m;
  
  private String n;
  
  private String o;
  
  private View a(int paramInt) {
    View view = LayoutInflater.from(this).inflate(2130968616, null);
    ((ImageView)view.findViewById(2131558521)).setImageResource(paramInt);
    return view;
  }
  
  private void a(int paramInt, String paramString) {
    try {
      Bitmap bitmap = BitmapFactory.decodeStream(getResources().openRawResource(paramInt));
      if (bitmap == null)
        return; 
      paramInt = bitmap.getWidth();
      int i1 = bitmap.getHeight();
      int[] arrayOfInt = new int[paramInt * i1];
      bitmap.getPixels(arrayOfInt, 0, paramInt, 0, 0, paramInt, i1);
      NativeCore.setImageRes(paramString, arrayOfInt, paramInt, i1);
      return;
    } catch (Exception paramString) {
      c("can't load resource");
      return;
    } 
  }
  
  private void b(int paramInt) { this.m.post(new Runnable(this, paramInt) {
          public void run() { this.b.showDialog(this.a); }
        }); }
  
  private void c(String paramString) {}
  
  private void f() {
    a(2131099648, "a0");
    a(2131099649, "b0");
    a(2131099650, "c0");
    a(2131099652, "cr");
    a(2131099655, "l0");
    a(2131099657, "r0");
    a(2131099659, "x0");
    a(2131099656, "p0");
    a(2131099651, "ccfg");
  }
  
  private void g() {
    setProgressBarIndeterminateVisibility(true);
    this.k.a(this.j);
  }
  
  private int h() { return (Build.VERSION.SDK_INT >= 17) ? Runtime.getRuntime().availableProcessors() : i(); }
  
  private int i() {
    try {
      return (new File("/sys/devices/system/cpu/")).listFiles(new a(this)).length;
    } catch (Exception exception) {
      return 1;
    } 
  }
  
  public String a(String paramString) {
    try {
      File file = new File(paramString);
      if (file.exists() && file.isDirectory()) {
        String[] arrayOfString = file.list();
        for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
          if (arrayOfString[b1].toLowerCase().compareTo("3do") == 0) {
            new File(paramString + "/" + arrayOfString[b1]);
            if (file.exists() && file.isDirectory())
              return paramString + "/" + arrayOfString[b1]; 
          } 
        } 
      } 
    } catch (Exception paramString) {
      c("can't open path");
    } 
    return null;
  }
  
  public Set<String> a() {
    byte b1 = 1;
    byte b2 = 0;
    HashSet hashSet = new HashSet();
    try {
      String str1 = System.getenv("EXTERNAL_STORAGE");
      String str2 = System.getenv("SECONDARY_STORAGE");
      String str3 = System.getenv("EMULATED_STORAGE_TARGET");
      if (TextUtils.isEmpty(str3)) {
        if (TextUtils.isEmpty(str1)) {
          hashSet.add("/storage/sdcard0");
        } else {
          hashSet.add(str1);
        } 
      } else {
        String str;
        if (Build.VERSION.SDK_INT < 17) {
          str1 = "";
        } else {
          str1 = Environment.getExternalStorageDirectory().getAbsolutePath();
          String[] arrayOfString = this.b.split(str1);
          str = arrayOfString[arrayOfString.length - 1];
          try {
            Integer.valueOf(str);
          } catch (NumberFormatException numberFormatException) {
            b1 = 0;
          } 
          if (!b1)
            str = ""; 
        } 
        if (TextUtils.isEmpty(str)) {
          hashSet.add(str3);
        } else {
          hashSet.add(str3 + File.separator + str);
        } 
      } 
      if (!TextUtils.isEmpty(str2))
        Collections.addAll(hashSet, str2.split(File.pathSeparator)); 
    } catch (Exception exception) {}
    try {
      File file = new File("/mnt/");
      if (file.isDirectory()) {
        String[] arrayOfString = file.list();
        List list = Arrays.asList(new String[] { "external_sd", "ext_sd", "external", "extSdCard" });
        int i1 = arrayOfString.length;
        for (b1 = b2; b1 < i1; b1++) {
          String str = arrayOfString[b1];
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
            if (str.contains((String)iterator.next())) {
              hashSet.add("/mnt/" + str);
              break;
            } 
          } 
        } 
      } 
    } catch (Exception exception) {}
    return hashSet;
  }
  
  public String b(String paramString) {
    try {
      byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
      StringBuffer stringBuffer = new StringBuffer();
      for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
        stringBuffer.append(Integer.toHexString(arrayOfByte[b1] & 0xFF | 0x100).substring(1, 3)); 
      return stringBuffer.toString();
    } catch (NoSuchAlgorithmException paramString) {
      return null;
    } 
  }
  
  public Set<String> b() { // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: new java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #6
    //   18: new java/lang/ProcessBuilder
    //   21: dup
    //   22: iconst_0
    //   23: anewarray java/lang/String
    //   26: invokespecial <init> : ([Ljava/lang/String;)V
    //   29: iconst_1
    //   30: anewarray java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: ldc_w 'mount'
    //   38: aastore
    //   39: invokevirtual command : ([Ljava/lang/String;)Ljava/lang/ProcessBuilder;
    //   42: iconst_1
    //   43: invokevirtual redirectErrorStream : (Z)Ljava/lang/ProcessBuilder;
    //   46: invokevirtual start : ()Ljava/lang/Process;
    //   49: astore #7
    //   51: aload #7
    //   53: invokevirtual waitFor : ()I
    //   56: pop
    //   57: aload #7
    //   59: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   62: astore #7
    //   64: sipush #1024
    //   67: newarray byte
    //   69: astore #8
    //   71: aload #7
    //   73: aload #8
    //   75: invokevirtual read : ([B)I
    //   78: iconst_m1
    //   79: if_icmpeq -> 232
    //   82: aload #6
    //   84: new java/lang/String
    //   87: dup
    //   88: aload #8
    //   90: invokespecial <init> : ([B)V
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: goto -> 71
    //   100: astore #7
    //   102: aload #7
    //   104: invokevirtual printStackTrace : ()V
    //   107: aload #6
    //   109: invokevirtual toString : ()Ljava/lang/String;
    //   112: ldc_w '\\n'
    //   115: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   118: astore #6
    //   120: aload #6
    //   122: arraylength
    //   123: istore_3
    //   124: iconst_0
    //   125: istore_1
    //   126: iload_1
    //   127: iload_3
    //   128: if_icmpge -> 249
    //   131: aload #6
    //   133: iload_1
    //   134: aaload
    //   135: astore #7
    //   137: aload #7
    //   139: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   142: ldc_w 'asec'
    //   145: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   148: ifne -> 240
    //   151: aload #7
    //   153: ldc_w '.*vold.*(vfat|ntfs|exfat|fat32|ext3|ext4).*rw.*'
    //   156: invokevirtual matches : (Ljava/lang/String;)Z
    //   159: ifeq -> 240
    //   162: aload #7
    //   164: ldc_w ' '
    //   167: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   170: astore #7
    //   172: aload #7
    //   174: arraylength
    //   175: istore #4
    //   177: iconst_0
    //   178: istore_2
    //   179: iload_2
    //   180: iload #4
    //   182: if_icmpge -> 240
    //   185: aload #7
    //   187: iload_2
    //   188: aaload
    //   189: astore #8
    //   191: aload #8
    //   193: ldc '/'
    //   195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   198: ifeq -> 225
    //   201: aload #8
    //   203: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   206: ldc_w 'vold'
    //   209: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   212: ifne -> 225
    //   215: aload #5
    //   217: aload #8
    //   219: invokeinterface add : (Ljava/lang/Object;)Z
    //   224: pop
    //   225: iload_2
    //   226: iconst_1
    //   227: iadd
    //   228: istore_2
    //   229: goto -> 179
    //   232: aload #7
    //   234: invokevirtual close : ()V
    //   237: goto -> 107
    //   240: iload_1
    //   241: iconst_1
    //   242: iadd
    //   243: istore_1
    //   244: goto -> 126
    //   247: astore #6
    //   249: aload #5
    //   251: areturn
    // Exception table:
    //   from	to	target	type
    //   9	18	247	java/lang/Exception
    //   18	71	100	java/lang/Exception
    //   71	97	100	java/lang/Exception
    //   102	107	247	java/lang/Exception
    //   107	124	247	java/lang/Exception
    //   137	177	247	java/lang/Exception
    //   191	225	247	java/lang/Exception
    //   232	237	100	java/lang/Exception }
  
  public String c() {
    Set set = a();
    set.addAll(b());
    Iterator iterator = set.iterator();
    while (iterator.hasNext()) {
      String str = a((String)iterator.next());
      if (str != null)
        return str; 
    } 
    return Environment.getExternalStorageDirectory().getAbsolutePath();
  }
  
  public String d() {
    String str2 = getApplicationContext().getFilesDir().getAbsolutePath();
    String str1 = str2;
    if (this.i.d("saves")) {
      str1 = str2;
      if (!this.i.f("saves").isEmpty())
        str1 = this.i.f("saves"); 
    } 
    return str1;
  }
  
  public void e() {
    Intent intent = new Intent(getApplicationContext(), EmulatorActivity.class);
    try {
      if (this.i.d("lockOri"))
        intent.putExtra("lockOrient", Boolean.valueOf(this.i.f("lockOri"))); 
      if (this.i.d("keepAspect"))
        NativeCore.setConfig("keepAspect", this.i.f("keepAspect")); 
      if (this.i.d("dspMT"))
        NativeCore.setConfig("dspMT", this.i.f("dspMT")); 
      if (this.i.d("celMT"))
        NativeCore.setConfig("celMT", this.i.f("celMT")); 
    } catch (Exception exception) {}
    if (((UiModeManager)getSystemService("uimode")).getCurrentModeType() == 4)
      intent.putExtra("lockOrient", false); 
    if (this.f != null)
      NativeCore.setConfig("ext-rom", this.f); 
    if (this.g != null)
      NativeCore.setConfig("ext-font", this.g); 
    if (this.h != null)
      NativeCore.setConfig("ext-cd", this.h); 
    intent.putExtra("lunchMode", 0);
    startActivityForResult(intent, 3);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (paramInt1 == 3) {
      if (this.e)
        finish(); 
      return;
    } 
    if (paramInt1 == 1) {
      String str = NativeCore.getResult("dialogResult");
      if (str != null && !str.isEmpty()) {
        this.c.a(str);
        this.c.notifyDataSetChanged();
        ((TabHost)findViewById(2131558482)).setCurrentTab(0);
        this.i.a("dumps", str);
        str = getResources().getString(2131165211) + " " + str;
        ((TextView)findViewById(2131558488)).setText(str);
        return;
      } 
      return;
    } 
    if (paramInt1 == 2) {
      String str = NativeCore.getResult("dialogResult");
      if (str != null && !str.isEmpty()) {
        this.i.a("saves", str);
        b(4);
      } 
      NativeCore.setConfig("userStorage", d());
      str = getResources().getString(2131165217) + " " + d();
      ((TextView)findViewById(2131558490)).setText(str);
      return;
    } 
  }
  
  public void onCfgControls(View paramView) {
    Intent intent = new Intent(getApplicationContext(), EmulatorActivity.class);
    intent.putExtra("lockOrient", false);
    intent.putExtra("lunchMode", 1);
    startActivity(intent);
  }
  
  public void onCleanNVRAM(View paramView) { b(3); }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    requestWindowFeature(5);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    Intent intent = getIntent();
    this.f = intent.getStringExtra("rom");
    this.h = intent.getStringExtra("cd");
    this.g = intent.getStringExtra("font");
    if (this.h != null || this.f != null) {
      this.e = true;
      setContentView(2130968601);
    } else {
      setContentView(2130968603);
      TabHost tabHost = (TabHost)findViewById(2131558482);
      tabHost.setup();
      TabHost.TabSpec tabSpec = tabHost.newTabSpec("tag1");
      tabSpec.setIndicator(a(2130837571));
      tabSpec.setContent(2131558483);
      tabHost.addTab(tabSpec);
      tabSpec = tabHost.newTabSpec("tag2");
      tabSpec.setIndicator(a(2130837575));
      tabSpec.setContent(2131558485);
      tabHost.addTab(tabSpec);
      tabSpec = tabHost.newTabSpec("tag3");
      tabSpec.setIndicator(a(2130837568));
      tabSpec.setContent(2131558501);
      tabHost.addTab(tabSpec);
    } 
    if (Build.VERSION.SDK_INT >= 23 && (a.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || a.a(this, "android.permission.READ_EXTERNAL_STORAGE") != 0))
      a.a(this, new String[] { "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE" }, 1); 
    NativeCore.nativeOnMainCreate();
    str1 = Build.BOARD + Build.BRAND + Build.CPU_ABI + Build.DEVICE + Build.DISPLAY + Build.HOST + Build.ID + Build.MANUFACTURER + Build.MODEL + Build.PRODUCT + Build.TAGS + Build.TYPE + Build.USER;
    String str2 = Settings.Secure.getString(getContentResolver(), "android_id");
    str2 = b(str1 + str2);
    if (str2.isEmpty())
      finish(); 
    this.i = new a(getApplicationContext(), "Real3DOPalyer-preferences", str2 + "JustPlay", true);
    if (!this.e) {
      try {
        if (this.i.d("lockOri"))
          ((Switch)findViewById(2131558495)).setChecked(Boolean.valueOf(this.i.f("lockOri")).booleanValue()); 
        if (this.i.d("keepAspect"))
          ((Switch)findViewById(2131558496)).setChecked(Boolean.valueOf(this.i.f("keepAspect")).booleanValue()); 
        if (this.i.d("dspMT"))
          ((Switch)findViewById(2131558497)).setChecked(Boolean.valueOf(this.i.f("dspMT")).booleanValue()); 
        if (this.i.d("celMT"))
          ((Switch)findViewById(2131558498)).setChecked(Boolean.valueOf(this.i.f("celMT")).booleanValue()); 
      } catch (Exception str1) {}
      if (((UiModeManager)getSystemService("uimode")).getCurrentModeType() == 4)
        ((Switch)findViewById(2131558495)).setEnabled(false); 
      str1 = c();
      if (this.i.d("dumps"))
        str1 = this.i.f("dumps"); 
      str = getResources().getString(2131165211) + " " + str1;
      ((TextView)findViewById(2131558488)).setText(str);
      int i2 = -1;
      int i1 = i2;
      try {
        if (this.i.d("selectedIndex"))
          i1 = Integer.valueOf(this.i.f("selectedIndex")).intValue(); 
      } catch (Exception str) {
        i1 = i2;
      } 
      this.c = new b(this, this, str1, i1);
      this.d = (ListView)findViewById(2131558484);
      this.d.setAdapter(this.c);
      this.d.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
            public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
              MainActivity.b(this.a).a("listSelection", Integer.toString(MainActivity.a(this.a).getFirstVisiblePosition()));
              MainActivity.b(this.a).a("selectedIndex", Integer.toString(param1Int));
              (MainActivity.c(this.a)).a = param1Int;
              MainActivity.c(this.a).notifyDataSetChanged();
              if (!NativeCore.nameOfBios().isEmpty() && MainActivity.d(this.a)) {
                NativeCore.selectGame(param1Int - 1);
                MainActivity.a(this.a, "onLunch " + (param1Int - 1));
                NativeCore.setConfig("keepAspect", Boolean.toString(((Switch)this.a.findViewById(2131558496)).isChecked()));
                NativeCore.setConfig("dspMT", Boolean.toString(((Switch)this.a.findViewById(2131558497)).isChecked()));
                NativeCore.setConfig("celMT", Boolean.toString(((Switch)this.a.findViewById(2131558498)).isChecked()));
                Intent intent = new Intent(param1View.getContext(), EmulatorActivity.class);
                intent.putExtra("lockOrient", ((Switch)this.a.findViewById(2131558495)).isChecked());
                intent.putExtra("lunchMode", 0);
                param1View.getContext().startActivity(intent);
                return;
              } 
              if (NativeCore.nameOfBios().isEmpty()) {
                Toast.makeText(param1View.getContext(), 2131165206, 0).show();
                return;
              } 
            }
          });
      try {
        if (this.i.d("listSelection")) {
          int i3 = Integer.valueOf(this.i.f("selectedIndex")).intValue();
          i2 = Integer.valueOf(this.i.f("listSelection")).intValue();
          i1 = i2;
          if (i3 > i2)
            i1 = i2 + 1; 
          this.d.setSelection(i1);
        } 
      } catch (Exception str1) {}
    } else {
      NativeCore.setConfig("userStorage", d());
      str1 = c();
      if (this.i.d("dumps"))
        str1 = this.i.f("dumps"); 
      NativeCore.countGames(str1);
    } 
    this.m = new Handler();
    this.j = new c(this, null);
    this.k = new d(this, new l(this, new a(a, getPackageName(), str2)), "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnGH6Mr50ugKqMhJzlOKyBLa3pwrYOmVqVYCMycP5g2tTZB0jw//SYmntvg4FUJ2S8pj98kizRTB7EsbrOQNAFLukrEevLixHuytIkWUjHcGCXcF3rqm5Oi1TVdFcVa7rqqKAIZjyrjt6rubpegE0icRn9nHWqSn9tSrN39N4BLOMcg7NVH9F/NNaNXldT27KPpzbYgu2boD7bMo/bH668SPXJMIdci635A+SlG2sozLaOQmTQ5IlOL+IlGe1x6DcDRZCnfT3Plz9VeEMFSAx+m4/hV8dbChgaEs6i/TyYshNhxxFXiqGoEzBCrlVJq6bOruqbZpQE++LzXVV4wpX0wIDAQAB");
    NativeCore.setConfig("cores", String.valueOf(h()));
    NativeCore.setStoragePath(getApplicationContext().getFilesDir().getAbsolutePath());
    NativeCore.setConfig("userStorage", d());
    str1 = NativeCore.getResult("checkUserStorage");
    if (str1 == null || str1.compareTo("Ok") != 0) {
      if (this.i.d("saves"))
        this.i.e("saves"); 
      NativeCore.setConfig("userStorage", d());
    } 
    if (!this.e) {
      if (NativeCore.nameOfBios().isEmpty())
        Toast.makeText(this, 2131165216, 0).show(); 
      str1 = getResources().getString(2131165217) + " " + d();
      ((TextView)findViewById(2131558490)).setText(str1);
      str1 = "<b>" + getResources().getString(2131165204) + "</b> " + "1.0.32" + " - " + getResources().getString(2131165203) + " " + NativeCore.stringFromJNI() + ".";
      ((TextView)findViewById(2131558504)).setText("\n\t");
      ((TextView)findViewById(2131558504)).append(Html.fromHtml(str1));
    } 
    f();
    a(2131099653, "dir");
    a(2131099654, "file");
    a(2131099658, "remove");
    c("onCreate() " + NativeCore.stringFromJNI());
    g();
  }
  
  protected Dialog onCreateDialog(int paramInt) {
    boolean bool = true;
    if (paramInt == 6)
      return (new AlertDialog.Builder(this)).setTitle("Reset ALL settings").setMessage("Are you sure?\nAll settings will be removed!\nApplication will shut down.").setNegativeButton("No", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
          }).setPositiveButton("Yes", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {
              NativeCore.execCommand("clearSettings", "all");
              MainActivity.b(this.a).b();
              ((Switch)this.a.findViewById(2131558495)).setChecked(false);
              ((Switch)this.a.findViewById(2131558496)).setChecked(false);
              ((Switch)this.a.findViewById(2131558497)).setChecked(false);
              ((Switch)this.a.findViewById(2131558498)).setChecked(false);
              this.a.finish();
            }
          }).create(); 
    if (paramInt == 5)
      return (new AlertDialog.Builder(this)).setTitle("Sync default storage directory").setMessage("Do you want to copy saves to private directory?\nFiles will be overwritten!").setNegativeButton("No", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
          }).setPositiveButton("Yes", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) { NativeCore.execCommand("synkToPrivate", MainActivity.e(this.a)); }
          }).create(); 
    if (paramInt == 4)
      return (new AlertDialog.Builder(this)).setTitle("Sync new storage directory").setMessage("Do you want to copy saves to selected directory?\nFiles will be overwritten!").setNegativeButton("No", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
          }).setPositiveButton("Yes", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) { NativeCore.execCommand("synkToUser", this.a.d()); }
          }).create(); 
    if (paramInt == 3)
      return (new AlertDialog.Builder(this)).setTitle("Clean private storage").setMessage("Are you sure?\nAll private saves will be removed!").setNegativeButton("No", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
          }).setPositiveButton("Yes", new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) { NativeCore.execCommand("clearPrivate", "all"); }
          }).create(); 
    if (paramInt == 2)
      return (new AlertDialog.Builder(this)).setTitle(2131165213).setMessage(this.o).setNegativeButton(2131165214, new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) { this.a.finish(); }
          }).create(); 
    if (paramInt != 1)
      bool = false; 
    AlertDialog.Builder builder = (new AlertDialog.Builder(this)).setTitle(2131165221);
    if (bool) {
      paramInt = 2131165220;
    } else {
      paramInt = 2131165219;
    } 
    builder = builder.setMessage(paramInt);
    if (bool) {
      paramInt = 2131165215;
      return builder.setPositiveButton(paramInt, new DialogInterface.OnClickListener(this, bool) {
            boolean a = this.b;
            
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {
              if (this.a) {
                MainActivity.f(this.c);
                return;
              } 
              Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.c.getPackageName()));
              this.c.startActivity(intent);
            }
          }).setNegativeButton(2131165214, new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) { this.a.finish(); }
          }).create();
    } 
    paramInt = 2131165207;
    return builder.setPositiveButton(paramInt, new DialogInterface.OnClickListener(this, bool) {
          boolean a = this.b;
          
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {
            if (this.a) {
              MainActivity.f(this.c);
              return;
            } 
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.c.getPackageName()));
            this.c.startActivity(intent);
          }
        }).setNegativeButton(2131165214, new DialogInterface.OnClickListener(this) {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) { this.a.finish(); }
        }).create();
  }
  
  public void onDefSaveDirSelect(View paramView) {
    if (this.i.d("saves")) {
      this.n = this.i.f("saves");
      if (!this.n.isEmpty())
        b(5); 
      this.i.e("saves");
    } 
    NativeCore.setConfig("userStorage", d());
    String str = getResources().getString(2131165217) + " " + d();
    ((TextView)findViewById(2131558490)).setText(str);
  }
  
  protected void onDestroy() {
    NativeCore.nativeOnMainDestroy();
    if (!this.e) {
      this.i.a("lockOri", Boolean.toString(((Switch)findViewById(2131558495)).isChecked()));
      this.i.a("keepAspect", Boolean.toString(((Switch)findViewById(2131558496)).isChecked()));
      this.i.a("dspMT", Boolean.toString(((Switch)findViewById(2131558497)).isChecked()));
      this.i.a("celMT", Boolean.toString(((Switch)findViewById(2131558498)).isChecked()));
    } 
    this.k.a();
    super.onDestroy();
    c("onDestroy()");
  }
  
  public void onDirSelect(View paramView) { // Byte code:
    //   0: new android/content/Intent
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   8: ldc_w ru/vastness/altmer/real3doplayer/EmulatorActivity
    //   11: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   14: astore_3
    //   15: aload_3
    //   16: ldc_w 'lockOrient'
    //   19: iconst_0
    //   20: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   23: pop
    //   24: aload_3
    //   25: ldc_w 'lunchMode'
    //   28: iconst_2
    //   29: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   32: pop
    //   33: ldc_w 'writeTest'
    //   36: iconst_0
    //   37: invokestatic toString : (Z)Ljava/lang/String;
    //   40: invokestatic setConfig : (Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_0
    //   44: invokevirtual c : ()Ljava/lang/String;
    //   47: astore_1
    //   48: aload_0
    //   49: getfield i : Lru/vastness/altmer/real3doplayer/a;
    //   52: ldc_w 'dumps'
    //   55: invokevirtual d : (Ljava/lang/String;)Z
    //   58: ifeq -> 72
    //   61: aload_0
    //   62: getfield i : Lru/vastness/altmer/real3doplayer/a;
    //   65: ldc_w 'dumps'
    //   68: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
    //   71: astore_1
    //   72: aload_1
    //   73: ifnull -> 85
    //   76: aload_1
    //   77: astore_2
    //   78: aload_1
    //   79: invokevirtual isEmpty : ()Z
    //   82: ifeq -> 88
    //   85: ldc '/'
    //   87: astore_2
    //   88: ldc_w 'path'
    //   91: aload_2
    //   92: invokestatic setConfig : (Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload_0
    //   96: aload_3
    //   97: iconst_1
    //   98: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   101: return }
  
  public void onResetAll(View paramView) { b(6); }
  
  public void onSaveDirSelect(View paramView) { // Byte code:
    //   0: new android/content/Intent
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   8: ldc_w ru/vastness/altmer/real3doplayer/EmulatorActivity
    //   11: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   14: astore_3
    //   15: aload_3
    //   16: ldc_w 'lockOrient'
    //   19: iconst_0
    //   20: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   23: pop
    //   24: aload_3
    //   25: ldc_w 'lunchMode'
    //   28: iconst_2
    //   29: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   32: pop
    //   33: ldc_w 'writeTest'
    //   36: iconst_1
    //   37: invokestatic toString : (Z)Ljava/lang/String;
    //   40: invokestatic setConfig : (Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_0
    //   44: invokevirtual c : ()Ljava/lang/String;
    //   47: astore_1
    //   48: aload_0
    //   49: getfield i : Lru/vastness/altmer/real3doplayer/a;
    //   52: ldc_w 'saves'
    //   55: invokevirtual d : (Ljava/lang/String;)Z
    //   58: ifeq -> 72
    //   61: aload_0
    //   62: getfield i : Lru/vastness/altmer/real3doplayer/a;
    //   65: ldc_w 'saves'
    //   68: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
    //   71: astore_1
    //   72: aload_1
    //   73: ifnull -> 85
    //   76: aload_1
    //   77: astore_2
    //   78: aload_1
    //   79: invokevirtual isEmpty : ()Z
    //   82: ifeq -> 88
    //   85: ldc '/'
    //   87: astore_2
    //   88: ldc_w 'path'
    //   91: aload_2
    //   92: invokestatic setConfig : (Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload_0
    //   96: aload_3
    //   97: iconst_2
    //   98: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   101: return }
  
  @TargetApi(19)
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
      getWindow().getDecorView().setSystemUiVisibility(5894); 
  }
  
  class a implements FileFilter {
    a(MainActivity this$0) {}
    
    public boolean accept(File param1File) { return Pattern.matches("cpu[0-9]+", param1File.getName()); }
  }
  
  public class b extends BaseAdapter {
    public int a;
    
    private ArrayList<String> c;
    
    private String d;
    
    private Context e;
    
    public b(MainActivity this$0, Context param1Context, String param1String, int param1Int) {
      this.a = param1Int;
      a(param1String);
      this.e = param1Context;
    }
    
    public String a(int param1Int) { return !this.d.isEmpty() ? ((param1Int != 0) ? (String)this.c.get(param1Int - 1) : this.d) : (String)this.c.get(param1Int); }
    
    public void a(String param1String) {
      this.c = new ArrayList();
      this.d = "";
      if (param1String != null) {
        int i = NativeCore.countGames(param1String);
        this.d = NativeCore.nameOfBios();
        for (byte b1 = 0; b1 < i; b1++)
          this.c.add(NativeCore.nameOfGame(b1)); 
      } 
    }
    
    public int getCount() { return !this.d.isEmpty() ? (this.c.size() + 1) : this.c.size(); }
    
    public long getItemId(int param1Int) { return (!this.d.isEmpty() && param1Int == 0) ? 1L : 0L; }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      View view = param1View;
      if (param1View == null) {
        new View(this.e);
        view = this.b.getLayoutInflater().inflate(2130968602, param1ViewGroup, false);
      } 
      ImageView imageView = (ImageView)view.findViewById(2131558480);
      TextView textView = (TextView)view.findViewById(2131558481);
      if (param1Int == this.a) {
        textView.setTypeface(null, 1);
      } else {
        textView.setTypeface(null, 0);
      } 
      if (!this.d.isEmpty()) {
        if (param1Int == 0) {
          imageView.setImageResource(2130837574);
          textView.setText(this.d);
          return view;
        } 
        imageView.setImageResource(2130837567);
        textView.setText((CharSequence)this.c.get(param1Int - 1));
        return view;
      } 
      imageView.setImageResource(2130837567);
      textView.setText((CharSequence)this.c.get(param1Int));
      return view;
    }
  }
  
  private class c implements e {
    private c(MainActivity this$0) {}
    
    public void a(int param1Int) {
      if (!this.a.isFinishing()) {
        MainActivity.a(this.a, true);
        MainActivity.b(this.a).a("license", "1.0.32");
        if (MainActivity.g(this.a)) {
          this.a.e();
          return;
        } 
      } 
    }
    
    public void b(int param1Int) {
      int i = 1;
      if (!this.a.isFinishing()) {
        try {
          if (MainActivity.b(this.a).d("license"))
            if (param1Int == 561) {
              MainActivity.b(this.a).e("license");
            } else {
              if (MainActivity.b(this.a).f("license").compareTo("1.0.32") == 0) {
                MainActivity.a(this.a, true);
                if (MainActivity.g(this.a)) {
                  this.a.e();
                  return;
                } 
                return;
              } 
              MainActivity.b(this.a).e("license");
            }  
        } catch (NumberFormatException numberFormatException) {}
        MainActivity mainActivity = this.a;
        if (param1Int == 291) {
          param1Int = i;
        } else {
          param1Int = 0;
        } 
        MainActivity.a(mainActivity, param1Int);
        return;
      } 
    }
    
    public void c(int param1Int) { // Byte code:
      //   0: aload_0
      //   1: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   4: invokevirtual isFinishing : ()Z
      //   7: ifeq -> 11
      //   10: return
      //   11: aload_0
      //   12: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   15: invokestatic b : (Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;
      //   18: ldc 'license'
      //   20: invokevirtual d : (Ljava/lang/String;)Z
      //   23: ifeq -> 74
      //   26: aload_0
      //   27: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   30: invokestatic b : (Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;
      //   33: ldc 'license'
      //   35: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
      //   38: ldc '1.0.32'
      //   40: invokevirtual compareTo : (Ljava/lang/String;)I
      //   43: ifne -> 114
      //   46: aload_0
      //   47: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   50: iconst_1
      //   51: invokestatic a : (Lru/vastness/altmer/real3doplayer/MainActivity;Z)Z
      //   54: pop
      //   55: aload_0
      //   56: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   59: invokestatic g : (Lru/vastness/altmer/real3doplayer/MainActivity;)Z
      //   62: ifeq -> 10
      //   65: aload_0
      //   66: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   69: invokevirtual e : ()V
      //   72: return
      //   73: astore_2
      //   74: aload_0
      //   75: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   78: aload_0
      //   79: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   82: ldc 2131165205
      //   84: invokevirtual getString : (I)Ljava/lang/String;
      //   87: iconst_1
      //   88: anewarray java/lang/Object
      //   91: dup
      //   92: iconst_0
      //   93: iload_1
      //   94: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   97: aastore
      //   98: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   101: invokestatic b : (Lru/vastness/altmer/real3doplayer/MainActivity;Ljava/lang/String;)Ljava/lang/String;
      //   104: pop
      //   105: aload_0
      //   106: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   109: iconst_2
      //   110: invokestatic a : (Lru/vastness/altmer/real3doplayer/MainActivity;I)V
      //   113: return
      //   114: aload_0
      //   115: getfield a : Lru/vastness/altmer/real3doplayer/MainActivity;
      //   118: invokestatic b : (Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;
      //   121: ldc 'license'
      //   123: invokevirtual e : (Ljava/lang/String;)V
      //   126: goto -> 74
      // Exception table:
      //   from	to	target	type
      //   11	72	73	java/lang/NumberFormatException
      //   114	126	73	java/lang/NumberFormatException }
  }
}
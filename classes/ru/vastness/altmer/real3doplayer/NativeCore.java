package ru.vastness.altmer.real3doplayer;

import android.view.Surface;

public class NativeCore {
  static  {
    System.loadLibrary("phoenixcore");
  }
  
  public static native int countGames(String paramString);
  
  public static native void execCommand(String paramString1, String paramString2);
  
  public static native String getResult(String paramString);
  
  public static native String nameOfBios();
  
  public static native String nameOfGame(int paramInt);
  
  public static native void nativeOnCreate(int paramInt);
  
  public static native void nativeOnDestroy();
  
  public static native void nativeOnMainCreate();
  
  public static native void nativeOnMainDestroy();
  
  public static native void nativeOnPause();
  
  public static native void nativeOnResume();
  
  public static native void nativeOnStart();
  
  public static native void nativeOnStop();
  
  public static native void nativeSetSurface(Surface paramSurface, float paramFloat);
  
  public static native int onKeyEvent(int paramInt1, int paramInt2, int paramInt3);
  
  public static native int onTouchEvent(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void selectGame(int paramInt);
  
  public static native void setConfig(String paramString1, String paramString2);
  
  public static native void setImageRes(String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2);
  
  public static native void setStoragePath(String paramString);
  
  public static native String stringFromJNI();
}
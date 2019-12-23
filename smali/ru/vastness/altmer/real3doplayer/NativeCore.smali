.class public Lru/vastness/altmer/real3doplayer/NativeCore;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "phoenixcore"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public static native countGames(Ljava/lang/String;)I
.end method

.method public static native execCommand(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native getResult(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nameOfBios()Ljava/lang/String;
.end method

.method public static native nameOfGame(I)Ljava/lang/String;
.end method

.method public static native nativeOnCreate(I)V
.end method

.method public static native nativeOnDestroy()V
.end method

.method public static native nativeOnMainCreate()V
.end method

.method public static native nativeOnMainDestroy()V
.end method

.method public static native nativeOnPause()V
.end method

.method public static native nativeOnResume()V
.end method

.method public static native nativeOnStart()V
.end method

.method public static native nativeOnStop()V
.end method

.method public static native nativeSetSurface(Landroid/view/Surface;F)V
.end method

.method public static native onKeyEvent(III)I
.end method

.method public static native onTouchEvent(IIII)I
.end method

.method public static native selectGame(I)V
.end method

.method public static native setConfig(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native setImageRes(Ljava/lang/String;[III)V
.end method

.method public static native setStoragePath(Ljava/lang/String;)V
.end method

.method public static native stringFromJNI()Ljava/lang/String;
.end method

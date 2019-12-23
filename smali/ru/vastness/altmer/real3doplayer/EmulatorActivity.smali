.class public Lru/vastness/altmer/real3doplayer/EmulatorActivity;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    const/16 v5, 0x400

    const/16 v3, 0x9

    const/16 v2, 0x8

    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0, v4}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->requestWindowFeature(I)Z

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v5, v5}, Landroid/view/Window;->setFlags(II)V

    const v0, 0x7f040018

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->setContentView(I)V

    const v0, 0x7f0d004d

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v5

    invoke-interface {v5, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {v0, p0}, Landroid/view/SurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    const-string v0, "lunchMode"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a:I

    iget v0, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a:I

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnCreate(I)V

    const-string v0, "uimode"

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/UiModeManager;

    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v0

    const/4 v6, 0x4

    if-ne v0, v6, :cond_1

    const-string v0, "Running on a TV Device"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    iput v1, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    return-void

    :cond_1
    const-string v0, "Running on a non-TV Device"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v6

    new-instance v7, Landroid/graphics/Point;

    invoke-direct {v7}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v7}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    if-eqz v6, :cond_2

    const/4 v0, 0x2

    if-ne v6, v0, :cond_6

    :cond_2
    iget v0, v7, Landroid/graphics/Point;->x:I

    iget v7, v7, Landroid/graphics/Point;->y:I

    if-le v0, v7, :cond_4

    if-nez v6, :cond_3

    move v0, v1

    :goto_1
    const-string v2, "lockOrient"

    invoke-virtual {v5, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a:I

    if-nez v2, :cond_0

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    if-nez v6, :cond_5

    move v0, v4

    goto :goto_1

    :cond_5
    move v0, v3

    goto :goto_1

    :cond_6
    iget v0, v7, Landroid/graphics/Point;->x:I

    iget v7, v7, Landroid/graphics/Point;->y:I

    if-le v0, v7, :cond_8

    if-ne v6, v4, :cond_7

    move v0, v1

    goto :goto_1

    :cond_7
    move v0, v2

    goto :goto_1

    :cond_8
    if-ne v6, v4, :cond_9

    move v0, v3

    goto :goto_1

    :cond_9
    move v0, v4

    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 1

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnDestroy()V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    const-string v0, "emu onDestroy()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    const/4 v3, 0x2

    const/4 v2, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    iget v1, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    iget v1, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    if-ge v1, v3, :cond_3

    iget v1, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a:I

    if-eqz v1, :cond_0

    const-string v1, "Once more..."

    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v1

    invoke-static {p1, v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->onKeyEvent(III)I

    move-result v1

    if-eqz v1, :cond_3

    if-ne v1, v0, :cond_2

    iput v2, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    goto :goto_0

    :cond_2
    if-ne v1, v3, :cond_0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->finish()V

    goto :goto_0

    :cond_3
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 4

    const/4 v3, 0x2

    const/4 v0, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v1

    invoke-static {p1, v2, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->onKeyEvent(III)I

    move-result v1

    if-eqz v1, :cond_3

    if-ne v1, v0, :cond_1

    iput v2, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-ne v1, v3, :cond_0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->finish()V

    goto :goto_0

    :cond_2
    iget v1, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    if-ge v1, v3, :cond_3

    invoke-static {v2, v3, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->onKeyEvent(III)I

    goto :goto_0

    :cond_3
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnPause()V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const-string v0, "onPause()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnResume()V

    const-string v0, "onResume()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnStart()V

    const-string v0, "onStart()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnStop()V

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const-string v0, "onStop()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v5, 0x2

    const/4 v7, 0x1

    const/4 v2, 0x0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return v7

    :pswitch_1
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    const/16 v4, 0x201

    invoke-static {v1, v3, v0, v4}, Lru/vastness/altmer/real3doplayer/NativeCore;->onTouchEvent(IIII)I

    move-result v0

    if-ne v0, v7, :cond_1

    iput v2, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    goto :goto_0

    :cond_1
    if-ne v0, v5, :cond_0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->finish()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    const/16 v4, 0x200

    invoke-static {v1, v3, v0, v4}, Lru/vastness/altmer/real3doplayer/NativeCore;->onTouchEvent(IIII)I

    move-result v0

    if-ne v0, v7, :cond_2

    iput v2, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    goto :goto_0

    :cond_2
    if-ne v0, v5, :cond_0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->finish()V

    goto :goto_0

    :pswitch_3
    move v1, v2

    :goto_1
    if-ge v1, v3, :cond_0

    const/16 v0, 0x1001

    if-nez v1, :cond_3

    const/16 v0, 0x1101

    :cond_3
    add-int/lit8 v4, v3, -0x1

    if-ne v1, v4, :cond_4

    or-int/lit16 v0, v0, 0x200

    :cond_4
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    float-to-int v6, v6

    invoke-static {v4, v5, v6, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->onTouchEvent(IIII)I

    move-result v0

    if-ne v0, v7, :cond_5

    iput v2, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1706

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 2

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-static {v1, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeSetSurface(Landroid/view/Surface;F)V

    const/4 v0, 0x0

    iput v0, p0, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->b:I

    const-string v0, "emu surfaceChanged()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-static {v1, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeSetSurface(Landroid/view/Surface;F)V

    const-string v0, "emu surfaceCreated()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeSetSurface(Landroid/view/Surface;F)V

    const-string v0, "emu surfaceDestroyed()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/EmulatorActivity;->a(Ljava/lang/String;)V

    return-void
.end method

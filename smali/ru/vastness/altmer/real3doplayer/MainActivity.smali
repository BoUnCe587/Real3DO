.class public Lru/vastness/altmer/real3doplayer/MainActivity;
.super Landroid/app/Activity;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lru/vastness/altmer/real3doplayer/MainActivity$c;,
        Lru/vastness/altmer/real3doplayer/MainActivity$b;
    }
.end annotation


# static fields
.field private static final a:[B


# instance fields
.field private final b:Ljava/util/regex/Pattern;

.field private c:Lru/vastness/altmer/real3doplayer/MainActivity$b;

.field private d:Landroid/widget/ListView;

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lru/vastness/altmer/real3doplayer/a;

.field private j:Lcom/google/android/vending/licensing/e;

.field private k:Lcom/google/android/vending/licensing/d;

.field private l:Z

.field private m:Landroid/os/Handler;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x14

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lru/vastness/altmer/real3doplayer/MainActivity;->a:[B

    return-void

    :array_0
    .array-data 1
        -0x24t
        0xft
        0x31t
        -0x13t
        -0x64t
        -0x7dt
        0x77t
        -0x20t
        0x2bt
        0x4dt
        -0x9t
        -0x5t
        0x3dt
        -0x65t
        -0x24t
        -0x61t
        -0x51t
        -0xct
        0x4bt
        0x15t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const-string v0, "/"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->b:Ljava/util/regex/Pattern;

    iput-boolean v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->e:Z

    iput-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->f:Ljava/lang/String;

    iput-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->g:Ljava/lang/String;

    iput-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->h:Ljava/lang/String;

    iput-boolean v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->l:Z

    return-void
.end method

.method private a(I)Landroid/view/View;
    .locals 3

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f040028

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0d0079

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-object v1
.end method

.method static synthetic a(Lru/vastness/altmer/real3doplayer/MainActivity;)Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->d:Landroid/widget/ListView;

    return-object v0
.end method

.method private a(ILjava/lang/String;)V
    .locals 8

    :try_start_0
    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int v1, v3, v7

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, v3

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    invoke-static {p2, v1, v3, v7}, Lru/vastness/altmer/real3doplayer/NativeCore;->setImageRes(Ljava/lang/String;[III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "can\'t load resource"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lru/vastness/altmer/real3doplayer/MainActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(I)V

    return-void
.end method

.method static synthetic a(Lru/vastness/altmer/real3doplayer/MainActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/MainActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lru/vastness/altmer/real3doplayer/MainActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->l:Z

    return p1
.end method

.method static synthetic b(Lru/vastness/altmer/real3doplayer/MainActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->o:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;
    .locals 1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    return-object v0
.end method

.method private b(I)V
    .locals 2

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->m:Landroid/os/Handler;

    new-instance v1, Lru/vastness/altmer/real3doplayer/MainActivity$5;

    invoke-direct {v1, p0, p1}, Lru/vastness/altmer/real3doplayer/MainActivity$5;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic c(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/MainActivity$b;
    .locals 1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->c:Lru/vastness/altmer/real3doplayer/MainActivity$b;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method static synthetic d(Lru/vastness/altmer/real3doplayer/MainActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->l:Z

    return v0
.end method

.method static synthetic e(Lru/vastness/altmer/real3doplayer/MainActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->n:Ljava/lang/String;

    return-object v0
.end method

.method private f()V
    .locals 2

    const/high16 v0, 0x7f060000

    const-string v1, "a0"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060001

    const-string v1, "b0"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060002

    const-string v1, "c0"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060004

    const-string v1, "cr"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060007

    const-string v1, "l0"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060009

    const-string v1, "r0"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f06000b

    const-string v1, "x0"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060008

    const-string v1, "p0"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060003

    const-string v1, "ccfg"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic f(Lru/vastness/altmer/real3doplayer/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->g()V

    return-void
.end method

.method private g()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->setProgressBarIndeterminateVisibility(Z)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->k:Lcom/google/android/vending/licensing/d;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->j:Lcom/google/android/vending/licensing/e;

    invoke-virtual {v0, v1}, Lcom/google/android/vending/licensing/d;->a(Lcom/google/android/vending/licensing/e;)V

    return-void
.end method

.method static synthetic g(Lru/vastness/altmer/real3doplayer/MainActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->e:Z

    return v0
.end method

.method private h()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->i()I

    move-result v0

    goto :goto_0
.end method

.method private i()I
    .locals 2

    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v1, "/sys/devices/system/cpu/"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Lru/vastness/altmer/real3doplayer/MainActivity$a;

    invoke-direct {v1, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$a;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    array-length v0, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_1

    aget-object v3, v2, v0

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v4, "3do"

    invoke-virtual {v3, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    aget-object v5, v2, v0

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v0, v2, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "can\'t open path"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a()Ljava/util/Set;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x1

    const/4 v1, 0x0

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    :try_start_0
    const-string v0, "EXTERNAL_STORAGE"

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "SECONDARY_STORAGE"

    invoke-static {v4}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "EMULATED_STORAGE_TARGET"

    invoke-static {v5}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v0, "/storage/sdcard0"

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    :try_start_1
    new-instance v0, Ljava/io/File;

    const-string v2, "/mnt/"

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "external_sd"

    aput-object v5, v0, v4

    const/4 v4, 0x1

    const-string v5, "ext_sd"

    aput-object v5, v0, v4

    const/4 v4, 0x2

    const-string v5, "external"

    aput-object v5, v0, v4

    const/4 v4, 0x3

    const-string v5, "extSdCard"

    aput-object v5, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    array-length v5, v2

    :goto_2
    if-ge v1, v5, :cond_8

    aget-object v6, v2, v1

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "/mnt/"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_3
    :try_start_2
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x11

    if-ge v0, v6, :cond_6

    const-string v0, ""

    :cond_5
    :goto_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    array-length v6, v0

    add-int/lit8 v6, v6, -0x1

    aget-object v0, v0, v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :goto_4
    if-nez v2, :cond_5

    :try_start_4
    const-string v0, ""

    goto :goto_3

    :catch_1
    move-exception v2

    move v2, v1

    goto :goto_4

    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    :catch_2
    move-exception v0

    :cond_8
    return-object v3
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    :try_start_0
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v0, 0x0

    :goto_0
    array-length v3, v1

    if-ge v0, v3, :cond_0

    aget-byte v3, v1, v0

    and-int/lit16 v3, v3, 0xff

    or-int/lit16 v3, v3, 0x100

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x3

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1
.end method

.method public b()Ljava/util/Set;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    :try_start_0
    const-string v4, ".*vold.*(vfat|ntfs|exfat|fat32|ext3|ext4).*rw.*"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v0, Ljava/lang/ProcessBuilder;

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    const-string v7, "mount"

    aput-object v7, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/ProcessBuilder;->command([Ljava/lang/String;)Ljava/lang/ProcessBuilder;

    move-result-object v0

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const/16 v5, 0x400

    new-array v5, v5, [B

    :goto_0
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_1

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v5}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    move v2, v1

    :goto_2
    if-ge v2, v6, :cond_3

    aget-object v0, v5, v2

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const-string v8, "asec"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v0, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, " "

    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    array-length v8, v7

    move v0, v1

    :goto_3
    if-ge v0, v8, :cond_2

    aget-object v9, v7, v0

    const-string v10, "/"

    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    const-string v11, "vold"

    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_0

    invoke-interface {v3, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :catch_1
    move-exception v0

    :cond_3
    return-object v3
.end method

.method public c()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->a()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "saves"

    invoke-virtual {v1, v2}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "saves"

    invoke-virtual {v1, v2}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "saves"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public e()V
    .locals 5

    const/4 v4, 0x0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v2, Lru/vastness/altmer/real3doplayer/EmulatorActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :try_start_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "lockOri"

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "lockOrient"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "lockOri"

    invoke-virtual {v2, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "keepAspect"

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "keepAspect"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "keepAspect"

    invoke-virtual {v2, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "dspMT"

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "dspMT"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "dspMT"

    invoke-virtual {v2, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "celMT"

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "celMT"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "celMT"

    invoke-virtual {v2, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    const-string v0, "uimode"

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/UiModeManager;

    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_4

    const-string v0, "lockOrient"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_4
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->f:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v0, "ext-rom"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->f:Ljava/lang/String;

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->g:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, "ext-font"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->h:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v0, "ext-cd"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    const-string v0, "lunchMode"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, 0x3

    invoke-virtual {p0, v1, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->finish()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    const-string v0, "dialogResult"

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->getResult(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->c:Lru/vastness/altmer/real3doplayer/MainActivity$b;

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity$b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->c:Lru/vastness/altmer/real3doplayer/MainActivity$b;

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity$b;->notifyDataSetChanged()V

    const v0, 0x7f0d0052

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TabHost;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/TabHost;->setCurrentTab(I)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "dumps"

    invoke-virtual {v0, v2, v1}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07001b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v0, 0x7f0d0058

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string v0, "dialogResult"

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->getResult(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "saves"

    invoke-virtual {v1, v2, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(I)V

    :cond_3
    const-string v0, "userStorage"

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070021

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v0, 0x7f0d005a

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method

.method public onCfgControls(Landroid/view/View;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lru/vastness/altmer/real3doplayer/EmulatorActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "lockOrient"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "lunchMode"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onCleanNVRAM(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(I)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    const v9, 0x7f0d0068

    const v8, 0x7f0d005f

    const/16 v1, 0x400

    const/4 v7, 0x0

    const/4 v6, 0x1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->requestWindowFeature(I)Z

    invoke-virtual {p0, v6}, Lru/vastness/altmer/real3doplayer/MainActivity;->requestWindowFeature(I)Z

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "rom"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->f:Ljava/lang/String;

    const-string v1, "cd"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->h:Ljava/lang/String;

    const-string v1, "font"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->g:Ljava/lang/String;

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->f:Ljava/lang/String;

    if-eqz v0, :cond_11

    :cond_0
    iput-boolean v6, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->e:Z

    const v0, 0x7f040019

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->setContentView(I)V

    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Landroid/support/v4/b/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Landroid/support/v4/b/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    aput-object v1, v0, v7

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    aput-object v1, v0, v6

    invoke-static {p0, v0, v6}, Landroid/support/v4/a/a;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_2
    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnMainCreate()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->HOST:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->TAGS:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->USER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->finish()V

    :cond_3
    new-instance v0, Lru/vastness/altmer/real3doplayer/a;

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "Real3DOPalyer-preferences"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "JustPlay"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v3, v4, v6}, Lru/vastness/altmer/real3doplayer/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->e:Z

    if-nez v0, :cond_12

    :try_start_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "lockOri"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x7f0d005f

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "lockOri"

    invoke-virtual {v1, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    :cond_4
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "keepAspect"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const v0, 0x7f0d0060

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "keepAspect"

    invoke-virtual {v1, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    :cond_5
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "dspMT"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x7f0d0061

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "dspMT"

    invoke-virtual {v1, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    :cond_6
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "celMT"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const v0, 0x7f0d0062

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "celMT"

    invoke-virtual {v1, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :cond_7
    :goto_1
    const-string v0, "uimode"

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/UiModeManager;

    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    invoke-virtual {p0, v8}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0, v7}, Landroid/widget/Switch;->setEnabled(Z)V

    :cond_8
    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "dumps"

    invoke-virtual {v1, v3}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "dumps"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07001b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f0d0058

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, -0x1

    :try_start_1
    iget-object v3, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v4, "selectedIndex"

    invoke-virtual {v3, v4}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v3, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v4, "selectedIndex"

    invoke-virtual {v3, v4}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    :cond_9
    :goto_3
    new-instance v3, Lru/vastness/altmer/real3doplayer/MainActivity$b;

    invoke-direct {v3, p0, p0, v1, v0}, Lru/vastness/altmer/real3doplayer/MainActivity$b;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;Landroid/content/Context;Ljava/lang/String;I)V

    iput-object v3, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->c:Lru/vastness/altmer/real3doplayer/MainActivity$b;

    const v0, 0x7f0d0054

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->d:Landroid/widget/ListView;

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->d:Landroid/widget/ListView;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->c:Lru/vastness/altmer/real3doplayer/MainActivity$b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->d:Landroid/widget/ListView;

    new-instance v1, Lru/vastness/altmer/real3doplayer/MainActivity$1;

    invoke-direct {v1, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$1;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :try_start_2
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "listSelection"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "selectedIndex"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "listSelection"

    invoke-virtual {v0, v3}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v1, v0, :cond_a

    add-int/lit8 v0, v0, 0x1

    :cond_a
    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->d:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setSelection(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_b
    :goto_4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->m:Landroid/os/Handler;

    new-instance v0, Lru/vastness/altmer/real3doplayer/MainActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity$c;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;Lru/vastness/altmer/real3doplayer/MainActivity$1;)V

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->j:Lcom/google/android/vending/licensing/e;

    new-instance v0, Lcom/google/android/vending/licensing/d;

    new-instance v1, Lcom/google/android/vending/licensing/l;

    new-instance v3, Lcom/google/android/vending/licensing/a;

    sget-object v4, Lru/vastness/altmer/real3doplayer/MainActivity;->a:[B

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5, v2}, Lcom/google/android/vending/licensing/a;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, p0, v3}, Lcom/google/android/vending/licensing/l;-><init>(Landroid/content/Context;Lcom/google/android/vending/licensing/h;)V

    const-string v2, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnGH6Mr50ugKqMhJzlOKyBLa3pwrYOmVqVYCMycP5g2tTZB0jw//SYmntvg4FUJ2S8pj98kizRTB7EsbrOQNAFLukrEevLixHuytIkWUjHcGCXcF3rqm5Oi1TVdFcVa7rqqKAIZjyrjt6rubpegE0icRn9nHWqSn9tSrN39N4BLOMcg7NVH9F/NNaNXldT27KPpzbYgu2boD7bMo/bH668SPXJMIdci635A+SlG2sozLaOQmTQ5IlOL+IlGe1x6DcDRZCnfT3Plz9VeEMFSAx+m4/hV8dbChgaEs6i/TyYshNhxxFXiqGoEzBCrlVJq6bOruqbZpQE++LzXVV4wpX0wIDAQAB"

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/vending/licensing/d;-><init>(Landroid/content/Context;Lcom/google/android/vending/licensing/i;Ljava/lang/String;)V

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->k:Lcom/google/android/vending/licensing/d;

    const-string v0, "cores"

    invoke-direct {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->setStoragePath(Ljava/lang/String;)V

    const-string v0, "userStorage"

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "checkUserStorage"

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->getResult(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    const-string v1, "Ok"

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_e

    :cond_c
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "saves"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "saves"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->e(Ljava/lang/String;)V

    :cond_d
    const-string v0, "userStorage"

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->e:Z

    if-nez v0, :cond_10

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nameOfBios()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    const v0, 0x7f070020

    invoke-static {p0, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070021

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v0, 0x7f0d005a

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</b> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "1.0.32"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070013

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->stringFromJNI()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v9}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v2, "\n\t"

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v9}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    :cond_10
    invoke-direct {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->f()V

    const v0, 0x7f060005

    const-string v1, "dir"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f060006

    const-string v1, "file"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    const v0, 0x7f06000a

    const-string v1, "remove"

    invoke-direct {p0, v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCreate() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->stringFromJNI()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c(Ljava/lang/String;)V

    invoke-direct {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->g()V

    return-void

    :cond_11
    const v0, 0x7f04001b

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->setContentView(I)V

    const v0, 0x7f0d0052

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TabHost;

    invoke-virtual {v0}, Landroid/widget/TabHost;->setup()V

    const-string v1, "tag1"

    invoke-virtual {v0, v1}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v1

    const v2, 0x7f020043

    invoke-direct {p0, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TabHost$TabSpec;->setIndicator(Landroid/view/View;)Landroid/widget/TabHost$TabSpec;

    const v2, 0x7f0d0053

    invoke-virtual {v1, v2}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;

    invoke-virtual {v0, v1}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    const-string v1, "tag2"

    invoke-virtual {v0, v1}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v1

    const v2, 0x7f020047

    invoke-direct {p0, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TabHost$TabSpec;->setIndicator(Landroid/view/View;)Landroid/widget/TabHost$TabSpec;

    const v2, 0x7f0d0055

    invoke-virtual {v1, v2}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;

    invoke-virtual {v0, v1}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    const-string v1, "tag3"

    invoke-virtual {v0, v1}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v1

    const v2, 0x7f020040

    invoke-direct {p0, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TabHost$TabSpec;->setIndicator(Landroid/view/View;)Landroid/widget/TabHost$TabSpec;

    const v2, 0x7f0d0065

    invoke-virtual {v1, v2}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;

    invoke-virtual {v0, v1}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    goto/16 :goto_0

    :cond_12
    const-string v0, "userStorage"

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "dumps"

    invoke-virtual {v1, v3}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "dumps"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_13
    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->countGames(Ljava/lang/String;)I

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :catch_1
    move-exception v3

    goto/16 :goto_3

    :catch_2
    move-exception v0

    goto/16 :goto_1

    :cond_14
    move-object v1, v0

    goto/16 :goto_2
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 5

    const v4, 0x7f07001e

    const/4 v0, 0x1

    const/4 v1, 0x6

    if-ne p1, v1, :cond_0

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "Reset ALL settings"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Are you sure?\nAll settings will be removed!\nApplication will shut down."

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "No"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$7;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$7;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Yes"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$6;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$6;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v1, 0x5

    if-ne p1, v1, :cond_1

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "Sync default storage directory"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Do you want to copy saves to private directory?\nFiles will be overwritten!"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "No"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$9;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$9;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Yes"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$8;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$8;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    if-ne p1, v1, :cond_2

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "Sync new storage directory"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Do you want to copy saves to selected directory?\nFiles will be overwritten!"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "No"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$11;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$11;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Yes"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$10;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$10;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    if-ne p1, v1, :cond_3

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "Clean private storage"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Are you sure?\nAll private saves will be removed!"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "No"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$13;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$13;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Yes"

    new-instance v2, Lru/vastness/altmer/real3doplayer/MainActivity$12;

    invoke-direct {v2, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$12;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    const/4 v1, 0x2

    if-ne p1, v1, :cond_4

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f07001d

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lru/vastness/altmer/real3doplayer/MainActivity$2;

    invoke-direct {v1, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$2;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    if-ne p1, v0, :cond_5

    :goto_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f070025

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    if-eqz v0, :cond_6

    const v1, 0x7f070024

    :goto_2
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    if-eqz v0, :cond_7

    const v1, 0x7f07001f

    :goto_3
    new-instance v3, Lru/vastness/altmer/real3doplayer/MainActivity$4;

    invoke-direct {v3, p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity$4;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;Z)V

    invoke-virtual {v2, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lru/vastness/altmer/real3doplayer/MainActivity$3;

    invoke-direct {v1, p0}, Lru/vastness/altmer/real3doplayer/MainActivity$3;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x0

    goto :goto_1

    :cond_6
    const v1, 0x7f070023

    goto :goto_2

    :cond_7
    const v1, 0x7f070017

    goto :goto_3
.end method

.method public onDefSaveDirSelect(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "saves"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "saves"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->n:Ljava/lang/String;

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(I)V

    :cond_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v1, "saves"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->e(Ljava/lang/String;)V

    :cond_1
    const-string v0, "userStorage"

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070021

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v0, 0x7f0d005a

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 3

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nativeOnMainDestroy()V

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->e:Z

    if-nez v0, :cond_0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "lockOri"

    const v0, 0x7f0d005f

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "keepAspect"

    const v0, 0x7f0d0060

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "dspMT"

    const v0, 0x7f0d0061

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "celMT"

    const v0, 0x7f0d0062

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->k:Lcom/google/android/vending/licensing/d;

    invoke-virtual {v0}, Lcom/google/android/vending/licensing/d;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    const-string v0, "onDestroy()"

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onDirSelect(Landroid/view/View;)V
    .locals 4

    const/4 v3, 0x0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v2, Lru/vastness/altmer/real3doplayer/EmulatorActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "lockOrient"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "lunchMode"

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "writeTest"

    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "dumps"

    invoke-virtual {v2, v3}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "dumps"

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const-string v0, "/"

    :cond_2
    const-string v2, "path"

    invoke-static {v2, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v1, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onResetAll(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(I)V

    return-void
.end method

.method public onSaveDirSelect(Landroid/view/View;)V
    .locals 5

    const/4 v4, 0x2

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v2, Lru/vastness/altmer/real3doplayer/EmulatorActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "lockOrient"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "lunchMode"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "writeTest"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v3, "saves"

    invoke-virtual {v2, v3}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity;->i:Lru/vastness/altmer/real3doplayer/a;

    const-string v2, "saves"

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const-string v0, "/"

    :cond_2
    const-string v2, "path"

    invoke-static {v2, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v4}, Lru/vastness/altmer/real3doplayer/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1706

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method

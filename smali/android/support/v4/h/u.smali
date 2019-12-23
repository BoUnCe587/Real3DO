.class public Landroid/support/v4/h/u;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/h/u$1;,
        Landroid/support/v4/h/u$f;,
        Landroid/support/v4/h/u$e;,
        Landroid/support/v4/h/u$c;,
        Landroid/support/v4/h/u$d;,
        Landroid/support/v4/h/u$b;,
        Landroid/support/v4/h/u$a;,
        Landroid/support/v4/h/u$g;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/h/u$g;


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Runnable;

.field private d:Ljava/lang/Runnable;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/h/u$f;

    invoke-direct {v0}, Landroid/support/v4/h/u$f;-><init>()V

    sput-object v0, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    :goto_0
    return-void

    :cond_0
    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/h/u$e;

    invoke-direct {v0}, Landroid/support/v4/h/u$e;-><init>()V

    sput-object v0, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    goto :goto_0

    :cond_1
    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/h/u$c;

    invoke-direct {v0}, Landroid/support/v4/h/u$c;-><init>()V

    sput-object v0, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    goto :goto_0

    :cond_2
    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    new-instance v0, Landroid/support/v4/h/u$d;

    invoke-direct {v0}, Landroid/support/v4/h/u$d;-><init>()V

    sput-object v0, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    goto :goto_0

    :cond_3
    const/16 v1, 0xe

    if-lt v0, v1, :cond_4

    new-instance v0, Landroid/support/v4/h/u$b;

    invoke-direct {v0}, Landroid/support/v4/h/u$b;-><init>()V

    sput-object v0, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    goto :goto_0

    :cond_4
    new-instance v0, Landroid/support/v4/h/u$a;

    invoke-direct {v0}, Landroid/support/v4/h/u$a;-><init>()V

    sput-object v0, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    goto :goto_0
.end method

.method constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroid/support/v4/h/u;->c:Ljava/lang/Runnable;

    iput-object v0, p0, Landroid/support/v4/h/u;->d:Ljava/lang/Runnable;

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/h/u;->e:I

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/h/u;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic a(Landroid/support/v4/h/u;I)I
    .locals 0

    iput p1, p0, Landroid/support/v4/h/u;->e:I

    return p1
.end method

.method static synthetic a(Landroid/support/v4/h/u;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/h/u;->c:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v4/h/u;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/h/u;->d:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic c(Landroid/support/v4/h/u;)I
    .locals 1

    iget v0, p0, Landroid/support/v4/h/u;->e:I

    return v0
.end method


# virtual methods
.method public a(F)Landroid/support/v4/h/u;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/h/u;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    sget-object v1, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/h/u$g;->a(Landroid/support/v4/h/u;Landroid/view/View;F)V

    :cond_0
    return-object p0
.end method

.method public a(Landroid/support/v4/h/x;)Landroid/support/v4/h/u;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/h/u;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    sget-object v1, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/h/u$g;->a(Landroid/support/v4/h/u;Landroid/view/View;Landroid/support/v4/h/x;)V

    :cond_0
    return-object p0
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/h/u;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    sget-object v1, Landroid/support/v4/h/u;->a:Landroid/support/v4/h/u$g;

    invoke-interface {v1, p0, v0}, Landroid/support/v4/h/u$g;->a(Landroid/support/v4/h/u;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.class public Landroid/support/v4/h/s;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/h/s$d;,
        Landroid/support/v4/h/s$c;,
        Landroid/support/v4/h/s$b;,
        Landroid/support/v4/h/s$a;,
        Landroid/support/v4/h/s$e;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/h/s$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/h/s$d;

    invoke-direct {v0}, Landroid/support/v4/h/s$d;-><init>()V

    sput-object v0, Landroid/support/v4/h/s;->a:Landroid/support/v4/h/s$e;

    :goto_0
    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/h/s$c;

    invoke-direct {v0}, Landroid/support/v4/h/s$c;-><init>()V

    sput-object v0, Landroid/support/v4/h/s;->a:Landroid/support/v4/h/s$e;

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/h/s$b;

    invoke-direct {v0}, Landroid/support/v4/h/s$b;-><init>()V

    sput-object v0, Landroid/support/v4/h/s;->a:Landroid/support/v4/h/s$e;

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/support/v4/h/s$a;

    invoke-direct {v0}, Landroid/support/v4/h/s$a;-><init>()V

    sput-object v0, Landroid/support/v4/h/s;->a:Landroid/support/v4/h/s$e;

    goto :goto_0
.end method

.method public static a(Landroid/view/ViewConfiguration;)Z
    .locals 1

    sget-object v0, Landroid/support/v4/h/s;->a:Landroid/support/v4/h/s$e;

    invoke-interface {v0, p0}, Landroid/support/v4/h/s$e;->a(Landroid/view/ViewConfiguration;)Z

    move-result v0

    return v0
.end method

.class public Landroid/support/v4/h/l;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/h/l$j;,
        Landroid/support/v4/h/l$i;,
        Landroid/support/v4/h/l$h;,
        Landroid/support/v4/h/l$g;,
        Landroid/support/v4/h/l$f;,
        Landroid/support/v4/h/l$e;,
        Landroid/support/v4/h/l$d;,
        Landroid/support/v4/h/l$c;,
        Landroid/support/v4/h/l$b;,
        Landroid/support/v4/h/l$a;,
        Landroid/support/v4/h/l$k;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/h/l$k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/h/l$j;

    invoke-direct {v0}, Landroid/support/v4/h/l$j;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    :goto_0
    return-void

    :cond_0
    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/h/l$i;

    invoke-direct {v0}, Landroid/support/v4/h/l$i;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0

    :cond_1
    const/16 v1, 0x11

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/h/l$g;

    invoke-direct {v0}, Landroid/support/v4/h/l$g;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0

    :cond_2
    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    new-instance v0, Landroid/support/v4/h/l$f;

    invoke-direct {v0}, Landroid/support/v4/h/l$f;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0

    :cond_3
    const/16 v1, 0xe

    if-lt v0, v1, :cond_4

    new-instance v0, Landroid/support/v4/h/l$e;

    invoke-direct {v0}, Landroid/support/v4/h/l$e;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0

    :cond_4
    const/16 v1, 0xb

    if-lt v0, v1, :cond_5

    new-instance v0, Landroid/support/v4/h/l$d;

    invoke-direct {v0}, Landroid/support/v4/h/l$d;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0

    :cond_5
    const/16 v1, 0x9

    if-lt v0, v1, :cond_6

    new-instance v0, Landroid/support/v4/h/l$c;

    invoke-direct {v0}, Landroid/support/v4/h/l$c;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0

    :cond_6
    const/4 v1, 0x7

    if-lt v0, v1, :cond_7

    new-instance v0, Landroid/support/v4/h/l$b;

    invoke-direct {v0}, Landroid/support/v4/h/l$b;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0

    :cond_7
    new-instance v0, Landroid/support/v4/h/l$a;

    invoke-direct {v0}, Landroid/support/v4/h/l$a;-><init>()V

    sput-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    goto :goto_0
.end method

.method public static a(III)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/h/l$k;->a(III)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;F)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;F)V

    return-void
.end method

.method public static a(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;ILandroid/graphics/Paint;)V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/content/res/ColorStateList;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 2

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1, p2, p3}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static a(Landroid/view/View;Z)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/h/l$k;->a(Landroid/view/View;Z)V

    return-void
.end method

.method public static b(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->b(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static c(Landroid/view/View;)F
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->c(Landroid/view/View;)F

    move-result v0

    return v0
.end method

.method public static d(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->d(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static e(Landroid/view/View;)Landroid/support/v4/h/u;
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->e(Landroid/view/View;)Landroid/support/v4/h/u;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->f(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static g(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->g(Landroid/view/View;)V

    return-void
.end method

.method public static h(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->h(Landroid/view/View;)V

    return-void
.end method

.method public static i(Landroid/view/View;)Z
    .locals 1

    sget-object v0, Landroid/support/v4/h/l;->a:Landroid/support/v4/h/l$k;

    invoke-interface {v0, p0}, Landroid/support/v4/h/l$k;->i(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

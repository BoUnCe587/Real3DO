.class Lcom/google/android/vending/licensing/d$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/vending/licensing/d$a;-><init>(Lcom/google/android/vending/licensing/d;Lcom/google/android/vending/licensing/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/vending/licensing/d;

.field final synthetic b:Lcom/google/android/vending/licensing/d$a;


# direct methods
.method constructor <init>(Lcom/google/android/vending/licensing/d$a;Lcom/google/android/vending/licensing/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/vending/licensing/d$a$1;->b:Lcom/google/android/vending/licensing/d$a;

    iput-object p2, p0, Lcom/google/android/vending/licensing/d$a$1;->a:Lcom/google/android/vending/licensing/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "LicenseChecker"

    const-string v1, "Check timed out."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/vending/licensing/d$a$1;->b:Lcom/google/android/vending/licensing/d$a;

    iget-object v0, v0, Lcom/google/android/vending/licensing/d$a;->a:Lcom/google/android/vending/licensing/d;

    iget-object v1, p0, Lcom/google/android/vending/licensing/d$a$1;->b:Lcom/google/android/vending/licensing/d$a;

    invoke-static {v1}, Lcom/google/android/vending/licensing/d$a;->a(Lcom/google/android/vending/licensing/d$a;)Lcom/google/android/vending/licensing/f;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/vending/licensing/d;->a(Lcom/google/android/vending/licensing/d;Lcom/google/android/vending/licensing/f;)V

    iget-object v0, p0, Lcom/google/android/vending/licensing/d$a$1;->b:Lcom/google/android/vending/licensing/d$a;

    iget-object v0, v0, Lcom/google/android/vending/licensing/d$a;->a:Lcom/google/android/vending/licensing/d;

    iget-object v1, p0, Lcom/google/android/vending/licensing/d$a$1;->b:Lcom/google/android/vending/licensing/d$a;

    invoke-static {v1}, Lcom/google/android/vending/licensing/d$a;->a(Lcom/google/android/vending/licensing/d$a;)Lcom/google/android/vending/licensing/f;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/vending/licensing/d;->b(Lcom/google/android/vending/licensing/d;Lcom/google/android/vending/licensing/f;)V

    return-void
.end method

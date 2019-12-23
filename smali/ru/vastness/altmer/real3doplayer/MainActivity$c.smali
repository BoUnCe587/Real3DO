.class Lru/vastness/altmer/real3doplayer/MainActivity$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/vending/licensing/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lru/vastness/altmer/real3doplayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lru/vastness/altmer/real3doplayer/MainActivity;


# direct methods
.method private constructor <init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lru/vastness/altmer/real3doplayer/MainActivity;Lru/vastness/altmer/real3doplayer/MainActivity$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/MainActivity$c;-><init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Lru/vastness/altmer/real3doplayer/MainActivity;Z)Z

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v0

    const-string v1, "license"

    const-string v2, "1.0.32"

    invoke-virtual {v0, v1, v2}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->g(Lru/vastness/altmer/real3doplayer/MainActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->e()V

    goto :goto_0
.end method

.method public b(I)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v1

    const-string v2, "license"

    invoke-virtual {v1, v2}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x231

    if-ne p1, v1, :cond_3

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v1

    const-string v2, "license"

    invoke-virtual {v1, v2}, Lru/vastness/altmer/real3doplayer/a;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const/16 v2, 0x123

    if-ne p1, v2, :cond_5

    :goto_2
    invoke-static {v1, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Lru/vastness/altmer/real3doplayer/MainActivity;I)V

    goto :goto_0

    :cond_3
    :try_start_1
    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v1

    const-string v2, "license"

    invoke-virtual {v1, v2}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "1.0.32"

    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Lru/vastness/altmer/real3doplayer/MainActivity;Z)Z

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->g(Lru/vastness/altmer/real3doplayer/MainActivity;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->e()V

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v1

    const-string v2, "license"

    invoke-virtual {v1, v2}, Lru/vastness/altmer/real3doplayer/a;->e(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public c(I)V
    .locals 5

    const/4 v3, 0x1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v0

    const-string v1, "license"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v0

    const-string v1, "license"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1.0.32"

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Lru/vastness/altmer/real3doplayer/MainActivity;Z)Z

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->g(Lru/vastness/altmer/real3doplayer/MainActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->e()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v2, 0x7f070015

    invoke-virtual {v1, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Lru/vastness/altmer/real3doplayer/MainActivity;I)V

    goto :goto_0

    :cond_3
    :try_start_1
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$c;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v0

    const-string v1, "license"

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/a;->e(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

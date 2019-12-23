.class Lru/vastness/altmer/real3doplayer/MainActivity$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lru/vastness/altmer/real3doplayer/MainActivity;->onCreateDialog(I)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Z

.field final synthetic c:Lru/vastness/altmer/real3doplayer/MainActivity;


# direct methods
.method constructor <init>(Lru/vastness/altmer/real3doplayer/MainActivity;Z)V
    .locals 1

    iput-object p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->c:Lru/vastness/altmer/real3doplayer/MainActivity;

    iput-boolean p2, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->b:Z

    iput-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->a:Z

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->c:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->f(Lru/vastness/altmer/real3doplayer/MainActivity;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "market://details?id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->c:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v3}, Lru/vastness/altmer/real3doplayer/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$4;->c:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v1, v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

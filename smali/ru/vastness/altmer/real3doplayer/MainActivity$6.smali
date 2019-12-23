.class Lru/vastness/altmer/real3doplayer/MainActivity$6;
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
.field final synthetic a:Lru/vastness/altmer/real3doplayer/MainActivity;


# direct methods
.method constructor <init>(Lru/vastness/altmer/real3doplayer/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$6;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const/4 v2, 0x0

    const-string v0, "clearSettings"

    const-string v1, "all"

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->execCommand(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$6;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v0

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/a;->b()V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$6;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v1, 0x7f0d005f

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0, v2}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$6;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v1, 0x7f0d0060

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0, v2}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$6;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v1, 0x7f0d0061

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0, v2}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$6;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v1, 0x7f0d0062

    invoke-virtual {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0, v2}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$6;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->finish()V

    return-void
.end method

.class Lru/vastness/altmer/real3doplayer/MainActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lru/vastness/altmer/real3doplayer/MainActivity;->onCreate(Landroid/os/Bundle;)V
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

    iput-object p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/4 v4, 0x0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v0

    const-string v1, "listSelection"

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Lru/vastness/altmer/real3doplayer/MainActivity;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->b(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/a;

    move-result-object v0

    const-string v1, "selectedIndex"

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/MainActivity$b;

    move-result-object v0

    iput p3, v0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->a:I

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->c(Lru/vastness/altmer/real3doplayer/MainActivity;)Lru/vastness/altmer/real3doplayer/MainActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity$b;->notifyDataSetChanged()V

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nameOfBios()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->d(Lru/vastness/altmer/real3doplayer/MainActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v0, p3, -0x1

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->selectGame(I)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onLunch "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->a(Lru/vastness/altmer/real3doplayer/MainActivity;Ljava/lang/String;)V

    const-string v1, "keepAspect"

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v2, 0x7f0d0060

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "dspMT"

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v2, 0x7f0d0061

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "celMT"

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v2, 0x7f0d0062

    invoke-virtual {v0, v2}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->setConfig(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v2, Lru/vastness/altmer/real3doplayer/EmulatorActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "lockOrient"

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$1;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    const v3, 0x7f0d005f

    invoke-virtual {v0, v3}, Lru/vastness/altmer/real3doplayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "lunchMode"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nameOfBios()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f070016

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

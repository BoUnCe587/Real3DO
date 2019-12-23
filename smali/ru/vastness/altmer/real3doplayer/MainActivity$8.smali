.class Lru/vastness/altmer/real3doplayer/MainActivity$8;
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

    iput-object p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$8;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    const-string v0, "synkToPrivate"

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$8;->a:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-static {v1}, Lru/vastness/altmer/real3doplayer/MainActivity;->e(Lru/vastness/altmer/real3doplayer/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lru/vastness/altmer/real3doplayer/NativeCore;->execCommand(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

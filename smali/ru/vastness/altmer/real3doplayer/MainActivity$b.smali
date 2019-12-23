.class public Lru/vastness/altmer/real3doplayer/MainActivity$b;
.super Landroid/widget/BaseAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lru/vastness/altmer/real3doplayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:I

.field final synthetic b:Lru/vastness/altmer/real3doplayer/MainActivity;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lru/vastness/altmer/real3doplayer/MainActivity;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->b:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput p4, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->a:I

    invoke-virtual {p0, p3}, Lru/vastness/altmer/real3doplayer/MainActivity$b;->a(Ljava/lang/String;)V

    iput-object p2, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    const-string v0, ""

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lru/vastness/altmer/real3doplayer/NativeCore;->countGames(Ljava/lang/String;)I

    move-result v1

    invoke-static {}, Lru/vastness/altmer/real3doplayer/NativeCore;->nameOfBios()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Lru/vastness/altmer/real3doplayer/NativeCore;->nameOfGame(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lru/vastness/altmer/real3doplayer/MainActivity$b;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    const/4 v5, 0x0

    const v4, 0x7f02003f

    const/4 v3, 0x0

    if-nez p2, :cond_0

    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->b:Lru/vastness/altmer/real3doplayer/MainActivity;

    invoke-virtual {v0}, Lru/vastness/altmer/real3doplayer/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f04001a

    invoke-virtual {v0, v1, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    const v0, 0x7f0d0050

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f0d0051

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->a:I

    if-ne p1, v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v5, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :goto_0
    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    if-nez p1, :cond_2

    const v2, 0x7f020046

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-object p2

    :cond_1
    invoke-virtual {v1, v5, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    add-int/lit8 v2, p1, -0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/MainActivity$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method

.class Lcom/google/android/vending/licensing/f;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/vending/licensing/i;

.field private final b:Lcom/google/android/vending/licensing/e;

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/google/android/vending/licensing/b;


# direct methods
.method constructor <init>(Lcom/google/android/vending/licensing/i;Lcom/google/android/vending/licensing/b;Lcom/google/android/vending/licensing/e;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/vending/licensing/f;->a:Lcom/google/android/vending/licensing/i;

    iput-object p2, p0, Lcom/google/android/vending/licensing/f;->f:Lcom/google/android/vending/licensing/b;

    iput-object p3, p0, Lcom/google/android/vending/licensing/f;->b:Lcom/google/android/vending/licensing/e;

    iput p4, p0, Lcom/google/android/vending/licensing/f;->c:I

    iput-object p5, p0, Lcom/google/android/vending/licensing/f;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/vending/licensing/f;->e:Ljava/lang/String;

    return-void
.end method

.method private a(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->b:Lcom/google/android/vending/licensing/e;

    invoke-interface {v0, p1}, Lcom/google/android/vending/licensing/e;->c(I)V

    return-void
.end method

.method private a(ILcom/google/android/vending/licensing/k;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->a:Lcom/google/android/vending/licensing/i;

    invoke-interface {v0, p1, p2}, Lcom/google/android/vending/licensing/i;->a(ILcom/google/android/vending/licensing/k;)V

    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->a:Lcom/google/android/vending/licensing/i;

    invoke-interface {v0}, Lcom/google/android/vending/licensing/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->b:Lcom/google/android/vending/licensing/e;

    invoke-interface {v0, p1}, Lcom/google/android/vending/licensing/e;->a(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->b:Lcom/google/android/vending/licensing/e;

    invoke-interface {v0, p1}, Lcom/google/android/vending/licensing/e;->b(I)V

    goto :goto_0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->b:Lcom/google/android/vending/licensing/e;

    const/16 v1, 0x231

    invoke-interface {v0, v1}, Lcom/google/android/vending/licensing/e;->b(I)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/vending/licensing/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->b:Lcom/google/android/vending/licensing/e;

    return-object v0
.end method

.method public a(Ljava/security/PublicKey;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/16 v3, 0x123

    if-nez p3, :cond_0

    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lcom/google/android/vending/licensing/f;->a(I)V

    :goto_0
    return-void

    :cond_0
    if-eqz p2, :cond_1

    if-eq p2, v4, :cond_1

    if-ne p2, v5, :cond_7

    :cond_1
    :try_start_0
    const-string v0, "SHA1withRSA"

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V

    invoke-static {p4}, Lcom/google/android/vending/licensing/a/a;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z

    const/4 v0, 0x1

    if-nez v0, :cond_2

    const-string v0, "LicenseValidator"

    const-string v1, "Signature verification failed."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/vending/licensing/a/b; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/vending/licensing/f;->a(I)V

    goto :goto_0

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    const-string v0, "LicenseValidator"

    const-string v1, "Could not Base64-decode signature."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto :goto_0

    :cond_2
    :try_start_1
    invoke-static {p3}, Lcom/google/android/vending/licensing/k;->a(Ljava/lang/String;)Lcom/google/android/vending/licensing/k;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    iget v1, v0, Lcom/google/android/vending/licensing/k;->a:I

    if-eq v1, p2, :cond_3

    const-string v0, "LicenseValidator"

    const-string v1, "Response codes don\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto :goto_0

    :catch_4
    move-exception v0

    const-string v0, "LicenseValidator"

    const-string v1, "Could not parse response."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto :goto_0

    :cond_3
    iget v1, v0, Lcom/google/android/vending/licensing/k;->b:I

    iget v2, p0, Lcom/google/android/vending/licensing/f;->c:I

    if-eq v1, v2, :cond_4

    const-string v0, "LicenseValidator"

    const-string v1, "Nonce doesn\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto :goto_0

    :cond_4
    iget-object v1, v0, Lcom/google/android/vending/licensing/k;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/vending/licensing/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v0, "LicenseValidator"

    const-string v1, "Package name doesn\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto/16 :goto_0

    :cond_5
    iget-object v1, v0, Lcom/google/android/vending/licensing/k;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/vending/licensing/f;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v0, "LicenseValidator"

    const-string v1, "Version codes don\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto/16 :goto_0

    :cond_6
    iget-object v1, v0, Lcom/google/android/vending/licensing/k;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v0, "LicenseValidator"

    const-string v1, "User identifier is empty."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto/16 :goto_0

    :cond_7
    move-object v1, v0

    :cond_8
    sparse-switch p2, :sswitch_data_0

    const-string v0, "LicenseValidator"

    const-string v1, "Unknown response code for license check."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/vending/licensing/f;->d()V

    goto/16 :goto_0

    :sswitch_0
    iget-object v2, p0, Lcom/google/android/vending/licensing/f;->f:Lcom/google/android/vending/licensing/b;

    invoke-interface {v2, v1}, Lcom/google/android/vending/licensing/b;->a(Ljava/lang/String;)I

    move-result v1

    invoke-direct {p0, v1, v0}, Lcom/google/android/vending/licensing/f;->a(ILcom/google/android/vending/licensing/k;)V

    goto/16 :goto_0

    :sswitch_1
    const/16 v1, 0x231

    invoke-direct {p0, v1, v0}, Lcom/google/android/vending/licensing/f;->a(ILcom/google/android/vending/licensing/k;)V

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "LicenseValidator"

    const-string v2, "Error contacting licensing server."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v3, v0}, Lcom/google/android/vending/licensing/f;->a(ILcom/google/android/vending/licensing/k;)V

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "LicenseValidator"

    const-string v2, "An error has occurred on the licensing server."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v3, v0}, Lcom/google/android/vending/licensing/f;->a(ILcom/google/android/vending/licensing/k;)V

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "LicenseValidator"

    const-string v2, "Licensing server is refusing to talk to this device, over quota."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v3, v0}, Lcom/google/android/vending/licensing/f;->a(ILcom/google/android/vending/licensing/k;)V

    goto/16 :goto_0

    :sswitch_5
    invoke-direct {p0, v4}, Lcom/google/android/vending/licensing/f;->a(I)V

    goto/16 :goto_0

    :sswitch_6
    invoke-direct {p0, v5}, Lcom/google/android/vending/licensing/f;->a(I)V

    goto/16 :goto_0

    :sswitch_7
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/vending/licensing/f;->a(I)V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_7
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x101 -> :sswitch_2
        0x102 -> :sswitch_5
        0x103 -> :sswitch_6
    .end sparse-switch
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/vending/licensing/f;->c:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/vending/licensing/f;->d:Ljava/lang/String;

    return-object v0
.end method

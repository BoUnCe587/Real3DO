.class public Lru/vastness/altmer/real3doplayer/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lru/vastness/altmer/real3doplayer/a$a;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ljavax/crypto/Cipher;

.field private final c:Ljavax/crypto/Cipher;

.field private final d:Ljavax/crypto/Cipher;

.field private final e:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->b:Ljavax/crypto/Cipher;

    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->c:Ljavax/crypto/Cipher;

    const-string v0, "AES/ECB/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->d:Ljavax/crypto/Cipher;

    invoke-virtual {p0, p3}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    iput-boolean p4, p0, Lru/vastness/altmer/real3doplayer/a;->a:Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lru/vastness/altmer/real3doplayer/a$a;

    invoke-direct {v1, v0}, Lru/vastness/altmer/real3doplayer/a$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lru/vastness/altmer/real3doplayer/a$a;

    invoke-direct {v1, v0}, Lru/vastness/altmer/real3doplayer/a$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static a(Ljavax/crypto/Cipher;[B)[B
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lru/vastness/altmer/real3doplayer/a$a;

    invoke-direct {v1, v0}, Lru/vastness/altmer/real3doplayer/a$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->b:Ljavax/crypto/Cipher;

    invoke-virtual {p0, p2, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lru/vastness/altmer/real3doplayer/a;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->d:Ljavax/crypto/Cipher;

    invoke-virtual {p0, p1, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljavax/crypto/Cipher;)Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p2, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljavax/crypto/Cipher;[B)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lru/vastness/altmer/real3doplayer/a$a;

    invoke-direct {v1, v0}, Lru/vastness/altmer/real3doplayer/a$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected a()Ljavax/crypto/spec/IvParameterSpec;
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->b:Ljavax/crypto/Cipher;

    invoke-virtual {v0}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    const-string v1, "fldsjfodasjifudslfjdsaofshaufihadsf"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/a;->b:Ljavax/crypto/Cipher;

    invoke-virtual {v2}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    return-object v1
.end method

.method protected a(Ljava/lang/String;)V
    .locals 5

    const/4 v4, 0x1

    invoke-virtual {p0}, Lru/vastness/altmer/real3doplayer/a;->a()Ljavax/crypto/spec/IvParameterSpec;

    move-result-object v0

    invoke-virtual {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->b(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v1

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/a;->b:Ljavax/crypto/Cipher;

    invoke-virtual {v2, v4, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object v2, p0, Lru/vastness/altmer/real3doplayer/a;->c:Ljavax/crypto/Cipher;

    const/4 v3, 0x2

    invoke-virtual {v2, v3, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->d:Ljavax/crypto/Cipher;

    invoke-virtual {v0, v4, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p2, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lru/vastness/altmer/real3doplayer/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected b(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;
    .locals 3

    invoke-virtual {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->c(Ljava/lang/String;)[B

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "AES/CBC/PKCS5Padding"

    invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method protected c(Ljava/lang/String;)[B
    .locals 2

    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public f(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/vastness/altmer/real3doplayer/a;->e:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lru/vastness/altmer/real3doplayer/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lru/vastness/altmer/real3doplayer/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    iget-object v1, p0, Lru/vastness/altmer/real3doplayer/a;->c:Ljavax/crypto/Cipher;

    invoke-static {v1, v0}, Lru/vastness/altmer/real3doplayer/a;->a(Ljavax/crypto/Cipher;[B)[B

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Lru/vastness/altmer/real3doplayer/a$a;

    invoke-direct {v1, v0}, Lru/vastness/altmer/real3doplayer/a$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

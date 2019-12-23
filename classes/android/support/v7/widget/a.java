package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v4.h.a;
import android.support.v7.b.a;
import android.support.v7.internal.b.a;
import android.support.v7.internal.view.a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.b;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.widget.TintImageView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class a extends b implements a.a {
  private b A;
  
  final f g = new f(this, null);
  
  int h;
  
  private d i;
  
  private Drawable j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private boolean q;
  
  private boolean r;
  
  private boolean s;
  
  private boolean t;
  
  private int u;
  
  private final SparseBooleanArray v = new SparseBooleanArray();
  
  private View w;
  
  private e x;
  
  private a y;
  
  private c z;
  
  public a(Context paramContext) { super(paramContext, a.g.abc_action_menu_layout, a.g.abc_action_menu_item_layout); }
  
  private View a(MenuItem paramMenuItem) {
    ViewGroup viewGroup = (ViewGroup)this.f;
    if (viewGroup == null)
      return null; 
    int i1 = viewGroup.getChildCount();
    for (byte b1 = 0; b1 < i1; b1++) {
      View view = viewGroup.getChildAt(b1);
      if (view instanceof k.a) {
        View view1 = view;
        if (((k.a)view).getItemData() != paramMenuItem)
          continue; 
        return view1;
      } 
      continue;
    } 
    return null;
  }
  
  public View a(f paramf, View paramView, ViewGroup paramViewGroup) {
    byte b1;
    View view = paramf.getActionView();
    if (view == null || paramf.n())
      view = super.a(paramf, paramView, paramViewGroup); 
    if (paramf.isActionViewExpanded()) {
      b1 = 8;
    } else {
      b1 = 0;
    } 
    view.setVisibility(b1);
    ActionMenuView actionMenuView = (ActionMenuView)paramViewGroup;
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (!actionMenuView.checkLayoutParams(layoutParams))
      view.setLayoutParams(actionMenuView.a(layoutParams)); 
    return view;
  }
  
  public void a(Context paramContext, e parame) {
    super.a(paramContext, parame);
    Resources resources = paramContext.getResources();
    a a1 = a.a(paramContext);
    if (!this.m)
      this.l = a1.b(); 
    if (!this.s)
      this.n = a1.c(); 
    if (!this.q)
      this.p = a1.a(); 
    int i1 = this.n;
    if (this.l) {
      if (this.i == null) {
        this.i = new d(this, this.a);
        if (this.k) {
          this.i.setImageDrawable(this.j);
          this.j = null;
          this.k = false;
        } 
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.i.measure(i2, i2);
      } 
      i1 -= this.i.getMeasuredWidth();
    } else {
      this.i = null;
    } 
    this.o = i1;
    this.u = (int)(56.0F * (resources.getDisplayMetrics()).density);
    this.w = null;
  }
  
  public void a(Configuration paramConfiguration) {
    if (!this.q)
      this.p = this.b.getResources().getInteger(a.f.abc_max_action_buttons); 
    if (this.c != null)
      this.c.b(true); 
  }
  
  public void a(Drawable paramDrawable) {
    if (this.i != null) {
      this.i.setImageDrawable(paramDrawable);
      return;
    } 
    this.k = true;
    this.j = paramDrawable;
  }
  
  public void a(e parame, boolean paramBoolean) {
    f();
    super.a(parame, paramBoolean);
  }
  
  public void a(f paramf, k.a parama) {
    parama.a(paramf, 0);
    ActionMenuView actionMenuView = (ActionMenuView)this.f;
    ActionMenuItemView actionMenuItemView = (ActionMenuItemView)parama;
    actionMenuItemView.setItemInvoker(actionMenuView);
    if (this.A == null)
      this.A = new b(this, null); 
    actionMenuItemView.setPopupCallback(this.A);
  }
  
  public void a(ActionMenuView paramActionMenuView) {
    this.f = paramActionMenuView;
    paramActionMenuView.a(this.c);
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      super.a(null);
      return;
    } 
    this.c.a(false);
  }
  
  public boolean a(int paramInt, f paramf) { return paramf.j(); }
  
  public boolean a(n paramn) {
    if (!paramn.hasVisibleItems())
      return false; 
    n n1;
    for (n1 = paramn; n1.o() != this.c; n1 = (n)n1.o());
    View view = a(n1.getItem());
    d d1 = view;
    if (view == null) {
      if (this.i == null)
        return false; 
      d1 = this.i;
    } 
    this.h = paramn.getItem().getItemId();
    this.y = new a(this, this.b, paramn);
    this.y.a(d1);
    this.y.a();
    super.a(paramn);
    return true;
  }
  
  public boolean a(ViewGroup paramViewGroup, int paramInt) { return (paramViewGroup.getChildAt(paramInt) == this.i) ? false : super.a(paramViewGroup, paramInt); }
  
  public void b(boolean paramBoolean) {
    int i2 = 1;
    byte b1 = 0;
    ViewGroup viewGroup = (ViewGroup)((View)this.f).getParent();
    if (viewGroup != null)
      a.a(viewGroup); 
    super.b(paramBoolean);
    ((View)this.f).requestLayout();
    if (this.c != null) {
      ArrayList arrayList = this.c.j();
      int i3 = arrayList.size();
      for (byte b2 = 0; b2 < i3; b2++) {
        a a1 = ((f)arrayList.get(b2)).a();
        if (a1 != null)
          a1.a(this); 
      } 
    } 
    if (this.c != null) {
      ArrayList arrayList = this.c.k();
    } else {
      viewGroup = null;
    } 
    int i1 = b1;
    if (this.l) {
      i1 = b1;
      if (viewGroup != null) {
        i1 = viewGroup.size();
        if (i1 == 1) {
          if (!((f)viewGroup.get(0)).isActionViewExpanded()) {
            i1 = 1;
          } else {
            i1 = 0;
          } 
        } else if (i1 > 0) {
          i1 = i2;
        } else {
          i1 = 0;
        } 
      } 
    } 
    if (i1 != 0) {
      if (this.i == null)
        this.i = new d(this, this.a); 
      viewGroup = (ViewGroup)this.i.getParent();
      if (viewGroup != this.f) {
        if (viewGroup != null)
          viewGroup.removeView(this.i); 
        viewGroup = (ActionMenuView)this.f;
        viewGroup.addView(this.i, viewGroup.b());
      } 
    } else if (this.i != null && this.i.getParent() == this.f) {
      ((ViewGroup)this.f).removeView(this.i);
    } 
    ((ActionMenuView)this.f).setOverflowReserved(this.l);
  }
  
  public boolean b() { // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/support/v7/internal/view/menu/e;
    //   4: invokevirtual h : ()Ljava/util/ArrayList;
    //   7: astore #14
    //   9: aload #14
    //   11: invokevirtual size : ()I
    //   14: istore #9
    //   16: aload_0
    //   17: getfield p : I
    //   20: istore_1
    //   21: aload_0
    //   22: getfield o : I
    //   25: istore #8
    //   27: iconst_0
    //   28: iconst_0
    //   29: invokestatic makeMeasureSpec : (II)I
    //   32: istore #10
    //   34: aload_0
    //   35: getfield f : Landroid/support/v7/internal/view/menu/k;
    //   38: checkcast android/view/ViewGroup
    //   41: astore #15
    //   43: iconst_0
    //   44: istore_3
    //   45: iconst_0
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iconst_0
    //   52: istore_2
    //   53: iload_2
    //   54: iload #9
    //   56: if_icmpge -> 129
    //   59: aload #14
    //   61: iload_2
    //   62: invokevirtual get : (I)Ljava/lang/Object;
    //   65: checkcast android/support/v7/internal/view/menu/f
    //   68: astore #16
    //   70: aload #16
    //   72: invokevirtual l : ()Z
    //   75: ifeq -> 106
    //   78: iload_3
    //   79: iconst_1
    //   80: iadd
    //   81: istore_3
    //   82: aload_0
    //   83: getfield t : Z
    //   86: ifeq -> 820
    //   89: aload #16
    //   91: invokevirtual isActionViewExpanded : ()Z
    //   94: ifeq -> 820
    //   97: iconst_0
    //   98: istore_1
    //   99: iload_2
    //   100: iconst_1
    //   101: iadd
    //   102: istore_2
    //   103: goto -> 53
    //   106: aload #16
    //   108: invokevirtual k : ()Z
    //   111: ifeq -> 123
    //   114: iload #4
    //   116: iconst_1
    //   117: iadd
    //   118: istore #4
    //   120: goto -> 82
    //   123: iconst_1
    //   124: istore #5
    //   126: goto -> 82
    //   129: iload_1
    //   130: istore_2
    //   131: aload_0
    //   132: getfield l : Z
    //   135: ifeq -> 157
    //   138: iload #5
    //   140: ifne -> 153
    //   143: iload_1
    //   144: istore_2
    //   145: iload_3
    //   146: iload #4
    //   148: iadd
    //   149: iload_1
    //   150: if_icmple -> 157
    //   153: iload_1
    //   154: iconst_1
    //   155: isub
    //   156: istore_2
    //   157: iload_2
    //   158: iload_3
    //   159: isub
    //   160: istore_2
    //   161: aload_0
    //   162: getfield v : Landroid/util/SparseBooleanArray;
    //   165: astore #16
    //   167: aload #16
    //   169: invokevirtual clear : ()V
    //   172: iconst_0
    //   173: istore_1
    //   174: aload_0
    //   175: getfield r : Z
    //   178: ifeq -> 814
    //   181: iload #8
    //   183: aload_0
    //   184: getfield u : I
    //   187: idiv
    //   188: istore_1
    //   189: aload_0
    //   190: getfield u : I
    //   193: istore_3
    //   194: aload_0
    //   195: getfield u : I
    //   198: istore #4
    //   200: iload #8
    //   202: iload_3
    //   203: irem
    //   204: iload_1
    //   205: idiv
    //   206: iload #4
    //   208: iadd
    //   209: istore #6
    //   211: iconst_0
    //   212: istore #7
    //   214: iconst_0
    //   215: istore #5
    //   217: iload_1
    //   218: istore_3
    //   219: iload_2
    //   220: istore_1
    //   221: iload #8
    //   223: istore #4
    //   225: iload #5
    //   227: istore_2
    //   228: iload #7
    //   230: iload #9
    //   232: if_icmpge -> 789
    //   235: aload #14
    //   237: iload #7
    //   239: invokevirtual get : (I)Ljava/lang/Object;
    //   242: checkcast android/support/v7/internal/view/menu/f
    //   245: astore #17
    //   247: aload #17
    //   249: invokevirtual l : ()Z
    //   252: ifeq -> 393
    //   255: aload_0
    //   256: aload #17
    //   258: aload_0
    //   259: getfield w : Landroid/view/View;
    //   262: aload #15
    //   264: invokevirtual a : (Landroid/support/v7/internal/view/menu/f;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   267: astore #18
    //   269: aload_0
    //   270: getfield w : Landroid/view/View;
    //   273: ifnonnull -> 282
    //   276: aload_0
    //   277: aload #18
    //   279: putfield w : Landroid/view/View;
    //   282: aload_0
    //   283: getfield r : Z
    //   286: ifeq -> 378
    //   289: iload_3
    //   290: aload #18
    //   292: iload #6
    //   294: iload_3
    //   295: iload #10
    //   297: iconst_0
    //   298: invokestatic a : (Landroid/view/View;IIII)I
    //   301: isub
    //   302: istore #5
    //   304: aload #18
    //   306: invokevirtual getMeasuredWidth : ()I
    //   309: istore_3
    //   310: iload_2
    //   311: ifne -> 811
    //   314: iload_3
    //   315: istore_2
    //   316: aload #17
    //   318: invokevirtual getGroupId : ()I
    //   321: istore #8
    //   323: iload #8
    //   325: ifeq -> 336
    //   328: aload #16
    //   330: iload #8
    //   332: iconst_1
    //   333: invokevirtual put : (IZ)V
    //   336: aload #17
    //   338: iconst_1
    //   339: invokevirtual d : (Z)V
    //   342: iload #4
    //   344: iload_3
    //   345: isub
    //   346: istore #4
    //   348: iload_1
    //   349: istore_3
    //   350: iload #4
    //   352: istore_1
    //   353: iload #7
    //   355: iconst_1
    //   356: iadd
    //   357: istore #8
    //   359: iload_3
    //   360: istore #7
    //   362: iload #5
    //   364: istore_3
    //   365: iload_1
    //   366: istore #4
    //   368: iload #7
    //   370: istore_1
    //   371: iload #8
    //   373: istore #7
    //   375: goto -> 228
    //   378: aload #18
    //   380: iload #10
    //   382: iload #10
    //   384: invokevirtual measure : (II)V
    //   387: iload_3
    //   388: istore #5
    //   390: goto -> 304
    //   393: aload #17
    //   395: invokevirtual k : ()Z
    //   398: ifeq -> 764
    //   401: aload #17
    //   403: invokevirtual getGroupId : ()I
    //   406: istore #11
    //   408: aload #16
    //   410: iload #11
    //   412: invokevirtual get : (I)Z
    //   415: istore #13
    //   417: iload_1
    //   418: ifgt -> 426
    //   421: iload #13
    //   423: ifeq -> 626
    //   426: iload #4
    //   428: ifle -> 626
    //   431: aload_0
    //   432: getfield r : Z
    //   435: ifeq -> 442
    //   438: iload_3
    //   439: ifle -> 626
    //   442: iconst_1
    //   443: istore #12
    //   445: iload #12
    //   447: ifeq -> 800
    //   450: aload_0
    //   451: aload #17
    //   453: aload_0
    //   454: getfield w : Landroid/view/View;
    //   457: aload #15
    //   459: invokevirtual a : (Landroid/support/v7/internal/view/menu/f;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   462: astore #18
    //   464: aload_0
    //   465: getfield w : Landroid/view/View;
    //   468: ifnonnull -> 477
    //   471: aload_0
    //   472: aload #18
    //   474: putfield w : Landroid/view/View;
    //   477: aload_0
    //   478: getfield r : Z
    //   481: ifeq -> 632
    //   484: aload #18
    //   486: iload #6
    //   488: iload_3
    //   489: iload #10
    //   491: iconst_0
    //   492: invokestatic a : (Landroid/view/View;IIII)I
    //   495: istore #5
    //   497: iload #5
    //   499: ifne -> 797
    //   502: iconst_0
    //   503: istore #12
    //   505: iload_3
    //   506: iload #5
    //   508: isub
    //   509: istore_3
    //   510: aload #18
    //   512: invokevirtual getMeasuredWidth : ()I
    //   515: istore #5
    //   517: iload #4
    //   519: iload #5
    //   521: isub
    //   522: istore #8
    //   524: iload_2
    //   525: istore #4
    //   527: iload_2
    //   528: ifne -> 535
    //   531: iload #5
    //   533: istore #4
    //   535: aload_0
    //   536: getfield r : Z
    //   539: ifeq -> 649
    //   542: iload #8
    //   544: iflt -> 644
    //   547: iconst_1
    //   548: istore_2
    //   549: iload #12
    //   551: iload_2
    //   552: iand
    //   553: istore #12
    //   555: iload #4
    //   557: istore_2
    //   558: iload_3
    //   559: istore #5
    //   561: iload #8
    //   563: istore #4
    //   565: iload_2
    //   566: istore_3
    //   567: iload #5
    //   569: istore_2
    //   570: iload #12
    //   572: ifeq -> 682
    //   575: iload #11
    //   577: ifeq -> 682
    //   580: aload #16
    //   582: iload #11
    //   584: iconst_1
    //   585: invokevirtual put : (IZ)V
    //   588: iload_1
    //   589: istore #5
    //   591: iload #12
    //   593: ifeq -> 601
    //   596: iload_1
    //   597: iconst_1
    //   598: isub
    //   599: istore #5
    //   601: aload #17
    //   603: iload #12
    //   605: invokevirtual d : (Z)V
    //   608: iload #4
    //   610: istore_1
    //   611: iload #5
    //   613: istore #4
    //   615: iload_2
    //   616: istore #5
    //   618: iload_3
    //   619: istore_2
    //   620: iload #4
    //   622: istore_3
    //   623: goto -> 353
    //   626: iconst_0
    //   627: istore #12
    //   629: goto -> 445
    //   632: aload #18
    //   634: iload #10
    //   636: iload #10
    //   638: invokevirtual measure : (II)V
    //   641: goto -> 510
    //   644: iconst_0
    //   645: istore_2
    //   646: goto -> 549
    //   649: iload #8
    //   651: iload #4
    //   653: iadd
    //   654: ifle -> 677
    //   657: iconst_1
    //   658: istore_2
    //   659: iload #12
    //   661: iload_2
    //   662: iand
    //   663: istore #12
    //   665: iload_3
    //   666: istore_2
    //   667: iload #4
    //   669: istore_3
    //   670: iload #8
    //   672: istore #4
    //   674: goto -> 570
    //   677: iconst_0
    //   678: istore_2
    //   679: goto -> 659
    //   682: iload #13
    //   684: ifeq -> 794
    //   687: aload #16
    //   689: iload #11
    //   691: iconst_0
    //   692: invokevirtual put : (IZ)V
    //   695: iconst_0
    //   696: istore #8
    //   698: iload #8
    //   700: iload #7
    //   702: if_icmpge -> 791
    //   705: aload #14
    //   707: iload #8
    //   709: invokevirtual get : (I)Ljava/lang/Object;
    //   712: checkcast android/support/v7/internal/view/menu/f
    //   715: astore #18
    //   717: iload_1
    //   718: istore #5
    //   720: aload #18
    //   722: invokevirtual getGroupId : ()I
    //   725: iload #11
    //   727: if_icmpne -> 752
    //   730: iload_1
    //   731: istore #5
    //   733: aload #18
    //   735: invokevirtual j : ()Z
    //   738: ifeq -> 746
    //   741: iload_1
    //   742: iconst_1
    //   743: iadd
    //   744: istore #5
    //   746: aload #18
    //   748: iconst_0
    //   749: invokevirtual d : (Z)V
    //   752: iload #8
    //   754: iconst_1
    //   755: iadd
    //   756: istore #8
    //   758: iload #5
    //   760: istore_1
    //   761: goto -> 698
    //   764: aload #17
    //   766: iconst_0
    //   767: invokevirtual d : (Z)V
    //   770: iload #4
    //   772: istore #5
    //   774: iload_1
    //   775: istore #4
    //   777: iload #5
    //   779: istore_1
    //   780: iload_3
    //   781: istore #5
    //   783: iload #4
    //   785: istore_3
    //   786: goto -> 353
    //   789: iconst_1
    //   790: ireturn
    //   791: goto -> 588
    //   794: goto -> 588
    //   797: goto -> 505
    //   800: iload_2
    //   801: istore #5
    //   803: iload_3
    //   804: istore_2
    //   805: iload #5
    //   807: istore_3
    //   808: goto -> 570
    //   811: goto -> 316
    //   814: iconst_0
    //   815: istore #6
    //   817: goto -> 211
    //   820: goto -> 99 }
  
  public Drawable c() { return (this.i != null) ? this.i.getDrawable() : (this.k ? this.j : null); }
  
  public void c(boolean paramBoolean) {
    this.l = paramBoolean;
    this.m = true;
  }
  
  public void d(boolean paramBoolean) { this.t = paramBoolean; }
  
  public boolean d() {
    if (this.l && !h() && this.c != null && this.f != null && this.z == null && !this.c.k().isEmpty()) {
      this.z = new c(this, new e(this, this.b, this.c, this.i, true));
      ((View)this.f).post(this.z);
      super.a(null);
      return true;
    } 
    return false;
  }
  
  public boolean e() {
    if (this.z != null && this.f != null) {
      ((View)this.f).removeCallbacks(this.z);
      this.z = null;
      return true;
    } 
    e e1 = this.x;
    if (e1 != null) {
      e1.e();
      return true;
    } 
    return false;
  }
  
  public boolean f() { return e() | g(); }
  
  public boolean g() {
    if (this.y != null) {
      this.y.e();
      return true;
    } 
    return false;
  }
  
  public boolean h() { return (this.x != null && this.x.f()); }
  
  private class a extends i {
    private n d;
    
    public a(a this$0, Context param1Context, n param1n) {
      super(param1Context, param1n, null, false, a.a.actionOverflowMenuStyle);
      this.d = param1n;
      if (!((f)param1n.getItem()).j()) {
        a.d d1;
        if (a.d(this$0) == null) {
          d1 = (View)a.e(this$0);
        } else {
          d1 = a.d(this$0);
        } 
        a(d1);
      } 
      a(this$0.g);
      int j = param1n.size();
      byte b = 0;
      while (true) {
        boolean bool1 = bool;
        if (b < j) {
          MenuItem menuItem = param1n.getItem(b);
          if (menuItem.isVisible() && menuItem.getIcon() != null) {
            bool1 = true;
          } else {
            b++;
            continue;
          } 
        } 
        a(bool1);
        return;
      } 
    }
    
    public void onDismiss() {
      super.onDismiss();
      a.a(this.c, null);
      this.c.h = 0;
    }
  }
  
  private class b extends ActionMenuItemView.b {
    private b(a this$0) {}
    
    public h a() { return (a.h(this.a) != null) ? a.h(this.a).c() : null; }
  }
  
  private class c implements Runnable {
    private a.e b;
    
    public c(a this$0, a.e param1e) { this.b = param1e; }
    
    public void run() {
      a.f(this.a).e();
      View view = (View)a.g(this.a);
      if (view != null && view.getWindowToken() != null && this.b.d())
        a.a(this.a, this.b); 
      a.a(this.a, null);
    }
  }
  
  private class d extends TintImageView implements ActionMenuView.a {
    private final float[] b = new float[2];
    
    public d(a this$0, Context param1Context) {
      super(param1Context, null, a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      setOnTouchListener(new h.b(this, this, this$0) {
            public h a() { return (a.a(this.b.a) == null) ? null : a.a(this.b.a).c(); }
            
            public boolean b() {
              this.b.a.d();
              return true;
            }
            
            public boolean c() {
              if (a.b(this.b.a) != null)
                return false; 
              this.b.a.e();
              return true;
            }
          });
    }
    
    public boolean c() { return false; }
    
    public boolean d() { return false; }
    
    public boolean performClick() {
      if (super.performClick())
        return true; 
      playSoundEffect(0);
      this.a.d();
      return true;
    }
    
    protected boolean setFrame(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      boolean bool = super.setFrame(param1Int1, param1Int2, param1Int3, param1Int4);
      Drawable drawable1 = getDrawable();
      Drawable drawable2 = getBackground();
      if (drawable1 != null && drawable2 != null) {
        int i = getWidth();
        param1Int2 = getHeight();
        param1Int1 = Math.max(i, param1Int2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        param1Int3 = getPaddingTop();
        param1Int4 = getPaddingBottom();
        i = (i + j - k) / 2;
        param1Int2 = (param1Int2 + param1Int3 - param1Int4) / 2;
        a.a(drawable2, i - param1Int1, param1Int2 - param1Int1, i + param1Int1, param1Int2 + param1Int1);
      } 
      return bool;
    }
  }
  
  class null extends h.b {
    null(a this$0, View param1View, a param1a) { super(param1View); }
    
    public h a() { return (a.a(this.b.a) == null) ? null : a.a(this.b.a).c(); }
    
    public boolean b() {
      this.b.a.d();
      return true;
    }
    
    public boolean c() {
      if (a.b(this.b.a) != null)
        return false; 
      this.b.a.e();
      return true;
    }
  }
  
  private class e extends i {
    public e(a this$0, Context param1Context, e param1e, View param1View, boolean param1Boolean) {
      super(param1Context, param1e, param1View, param1Boolean, a.a.actionOverflowMenuStyle);
      a(8388613);
      a(this$0.g);
    }
    
    public void onDismiss() {
      super.onDismiss();
      a.c(this.c).close();
      a.a(this.c, null);
    }
  }
  
  private class f implements j.a {
    private f(a this$0) {}
    
    public void a(e param1e, boolean param1Boolean) {
      if (param1e instanceof n)
        ((n)param1e).l().a(false); 
      j.a a1 = this.a.a();
      if (a1 != null)
        a1.a(param1e, param1Boolean); 
    }
    
    public boolean a(e param1e) {
      if (param1e == null)
        return false; 
      this.a.h = ((n)param1e).getItem().getItemId();
      j.a a1 = this.a.a();
      return (a1 != null) ? a1.a(param1e) : 0;
    }
  }
}
package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface c extends IInterface {
  void a(int paramInt, String paramString1, String paramString2);
  
  public static abstract class a extends Binder implements c {
    public a() { attachInterface(this, "com.android.vending.licensing.ILicenseResultListener"); }
    
    public static c a(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
      return (iInterface != null && iInterface instanceof c) ? (c)iInterface : new a(param1IBinder);
    }
    
    public IBinder asBinder() { return this; }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      switch (param1Int1) {
        default:
          return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2);
        case 1598968902:
          param1Parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
          return true;
        case 1:
          break;
      } 
      param1Parcel1.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
      a(param1Parcel1.readInt(), param1Parcel1.readString(), param1Parcel1.readString());
      return true;
    }
    
    private static class a implements c {
      private IBinder a;
      
      a(IBinder param2IBinder) { this.a = param2IBinder; }
      
      public void a(int param2Int, String param2String1, String param2String2) {
        parcel = Parcel.obtain();
        try {
          parcel.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
          parcel.writeInt(param2Int);
          parcel.writeString(param2String1);
          parcel.writeString(param2String2);
          this.a.transact(1, parcel, null, 1);
          return;
        } finally {
          parcel.recycle();
        } 
      }
      
      public IBinder asBinder() { return this.a; }
    }
  }
  
  private static class a implements c {
    private IBinder a;
    
    a(IBinder param1IBinder) { this.a = param1IBinder; }
    
    public void a(int param1Int, String param1String1, String param1String2) {
      parcel = Parcel.obtain();
      try {
        parcel.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
        parcel.writeInt(param1Int);
        parcel.writeString(param1String1);
        parcel.writeString(param1String2);
        this.a.transact(1, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    }
    
    public IBinder asBinder() { return this.a; }
  }
}
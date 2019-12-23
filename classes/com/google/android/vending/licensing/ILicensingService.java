package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ILicensingService extends IInterface {
  void a(long paramLong, String paramString, c paramc);
  
  public static abstract class a extends Binder implements ILicensingService {
    public static ILicensingService a(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
      return (iInterface != null && iInterface instanceof ILicensingService) ? (ILicensingService)iInterface : new a(param1IBinder);
    }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      switch (param1Int1) {
        default:
          return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2);
        case 1598968902:
          param1Parcel2.writeString("com.android.vending.licensing.ILicensingService");
          return true;
        case 1:
          break;
      } 
      param1Parcel1.enforceInterface("com.android.vending.licensing.ILicensingService");
      a(param1Parcel1.readLong(), param1Parcel1.readString(), c.a.a(param1Parcel1.readStrongBinder()));
      return true;
    }
    
    private static class a implements ILicensingService {
      private IBinder a;
      
      a(IBinder param2IBinder) { this.a = param2IBinder; }
      
      public void a(long param2Long, String param2String, c param2c) {
        String str = null;
        parcel = Parcel.obtain();
        try {
          IBinder iBinder;
          parcel.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
          parcel.writeLong(param2Long);
          parcel.writeString(param2String);
          param2String = str;
          if (param2c != null)
            iBinder = param2c.asBinder(); 
          parcel.writeStrongBinder(iBinder);
          this.a.transact(1, parcel, null, 1);
          return;
        } finally {
          parcel.recycle();
        } 
      }
      
      public IBinder asBinder() { return this.a; }
    }
  }
  
  private static class a implements ILicensingService {
    private IBinder a;
    
    a(IBinder param1IBinder) { this.a = param1IBinder; }
    
    public void a(long param1Long, String param1String, c param1c) {
      String str = null;
      parcel = Parcel.obtain();
      try {
        IBinder iBinder;
        parcel.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
        parcel.writeLong(param1Long);
        parcel.writeString(param1String);
        param1String = str;
        if (param1c != null)
          iBinder = param1c.asBinder(); 
        parcel.writeStrongBinder(iBinder);
        this.a.transact(1, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    }
    
    public IBinder asBinder() { return this.a; }
  }
}
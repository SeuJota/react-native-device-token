package com.devicetoken;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNDeviceTokenModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDeviceTokenModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void getToken(Callback cb){
    try{
      String token = "TOKEN";
      cb.invoke(token);
    }catch (Exception e){
      cb.invoke("err");
    }
  }

  @Override
  public String getName() {
    return "RNDeviceToken";
  }
}

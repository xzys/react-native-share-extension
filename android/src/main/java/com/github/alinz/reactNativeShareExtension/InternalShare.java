package com.github.alinz.reactNativeShareExtension;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;

public class InternalShare extends ReactContextBaseJavaModule {
    public InternalShare(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ReactNativeShareExtension";
    }

    @ReactMethod
    public void close() {
        ((ShareExActivity) getCurrentActivity()).closeShareModal();
    }

    @ReactMethod
    public void data(Promise promise) {
        promise.resolve(((ShareExActivity) getCurrentActivity()).processIntent());
    }
}


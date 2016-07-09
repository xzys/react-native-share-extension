package com.github.alinz.reactNativeShareExtension;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.ReactMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class ShareExActivity extends ReactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        // Remove the activity when its off the screen
        closeShareModal();
    }

    protected void closeShareModal() {
        finish();
    }
}

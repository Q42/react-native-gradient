package com.q42.rngradient

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext

class RNQ42GradientPackage : ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext?) = emptyList<NativeModule>()
  override fun createViewManagers(reactContext: ReactApplicationContext?) = arrayListOf(RNQ42GradientManager())
}
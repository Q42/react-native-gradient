# react-native-gradient

Gradient component for React Native.

# iOS

```
pod 'react-native-gradient', :path => 'node_modules/react-native-gradient/ios'
```

# Android
1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.q42.rngradient.GradientPackage;` to the imports at the top of the file
  - Add `new GradientPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-gradient'
  	project(':react-native-gradient').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-gradient/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-gradient')
  	```

# JS

```
import Gradient from 'react-native-gradient';
<Gradient.Linear colors={['red', 'blue']} />
<Gradient.Radial colors={['red', 'blue']} radius={200} />
```

# TODO

- Documentation
- Tests
- Angle support
- TypeScript definitions
- Check installation without CocoaPods
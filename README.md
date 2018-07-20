
# react-native-gradient

## Getting started

`$ npm install react-native-gradient --save`

### Mostly automatic installation

`$ react-native link react-native-gradient`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-gradient` and add `Q42RNGradient.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libQ42RNGradient.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.Q42RNGradientPackage;` to the imports at the top of the file
  - Add `new Q42RNGradientPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-gradient'
  	project(':react-native-gradient').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-gradient/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-gradient')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `Q42RNGradient.sln` in `node_modules/react-native-gradient/windows/Q42RNGradient.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Gradient.Q42RNGradient;` to the usings at the top of the file
  - Add `new Q42RNGradientPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import Q42RNGradient from 'react-native-gradient';

// TODO: What to do with the module?
Q42RNGradient;
```
  
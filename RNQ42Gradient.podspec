require 'json'
version = JSON.parse(File.read('package.json'))["version"]

Pod::Spec.new do |s|

  s.name            = "RNQ42Gradient"
  s.version         = version
  s.homepage        = "https://github.com/brentvatne/react-native-linear-gradient"
  s.summary         = "A <LinearGradient /> component for react-native"
  s.license         = "MIT"
  s.author          = { "Brent Vatne" => "brentvatne@gmail.com" }
  s.ios.deployment_target = '7.0'
  s.tvos.deployment_target = '9.0'
  s.source          = { :git => "https://github.com/brentvatne/react-native-linear-gradient.git", :tag => "#{s.version}" }
  s.source_files    = 'ios/RNQ42Gradient/*.{h,m,swift}'
  s.preserve_paths  = "**/*.js"

  s.dependency 'React'

end
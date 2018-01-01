[![Build Status](https://travis-ci.org/ashwanthkumar/gocd-proxy-module.svg?branch=master)](https://travis-ci.org/ashwanthkumar/gocd-proxy-module)
# gocd-proxy-module

Contains specific gocd-modules that are needed for some addons, extensions or other purposes but they're not yet published on Maven Central to be consumed from outside. 

All these modules are meant for compiling your code only and not meant to be packaged along. Always use "provided" scope when using these modules.

## Development

To publish the updated version of the build to sonatype

```bash
./gradlew uploadArchives
```

## LICENSE
https://www.apache.org/licenses/LICENSE-2.0


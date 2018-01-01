[![Build Status](https://travis-ci.org/ashwanthkumar/gocd-proxy-module.svg?branch=master)](https://travis-ci.org/ashwanthkumar/gocd-proxy-module)
# gocd-proxy-module

Contains specific gocd-modules that are needed for some addons, extensions or other purposes but they're not yet published on Maven Central to be consumed from outside. 

All these modules are meant for compiling your code only and not meant to be packaged along. Always use "provided" scope when using these modules.

## Components

1. `gocd-proxy-module-database` - Contains the `:addon-api:database` from gocd/gocd. Used if you're building a Database Addon for GoCD.
2. `gocd-proxy-module-system-environment` - Contains the `SystemEnvironment` class and related dependencies from `:base` module of gocd/gocd. `SystemEnvironment` gives you access to all the system properties of the server - again used along with database addon.

## Development

To publish the updated version of the build to sonatype

```bash
./gradlew uploadArchives
```

If you would like to publish a specific module, 

```bash
./gradlew :gocd-proxy-module-<name>:uploadArchives
```

Replace `<name>` with the actual name of the component you want to publish.

## LICENSE
https://www.apache.org/licenses/LICENSE-2.0


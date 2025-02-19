# A Scala2 App template 
![ci](https://github.com/reminia/scala-app.g8/actions/workflows/ci.yml/badge.svg)

This is a [Giter8](https://www.foundweekends.org/giter8/) template. Try it with:

```bash
sbt new reminia/scala-app.g8
```

## Features

1. release zip with sbt-native-packager, try it with `sbt universal:packageBin`
2. publish to github package registry, try `sbt publish`.
3. support scalafmt, try `sbt scalafmt`.
4. ci pipeline, see [scala.yml](src/main/g8/.github/workflows/scala.yml).
5. release pipeline, auto create release with packages when tag created, see [release.yml](src/main/g8/.github/workflows/release.yml).
6. sbt common dependencies and utilities are placed under [project/Build.scala](src/main/g8/project/Build.scala).

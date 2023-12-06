# A Scala2 App template

This is a [Giter8](https://www.foundweekends.org/giter8/) template. Try it with:

```bash
sbt new reminia/scala-app.g8
```

## Features

1. release zip with sbt-native-packager, try it with `sbt universal:packageBin`
2. publish to github repository with maven style, try `sbt publish`.
3. support scalafmt, try `sbt scalafmt`.
4. scala ci, see [scala.yml](src/main/g8/.github/workflows/scala.yml).
5. auto release packages when tag created, see [release.yml](src/main/g8/.github/workflows/release.yml).
6. sbt common dependencies and utilities are placed under [project/Build.scala](src/main/g8/project/Build.scala).

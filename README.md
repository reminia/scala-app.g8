# A Scala2 App template

This is a [Giter8](https://www.foundweekends.org/giter8/) template. Try it with:

```bash
sbt new reminia/scala-app.g8
```

## Features

1. package zip with sbt-native-packager, try it with `sbt universal:packageBin`
2. publish to github repository with maven style, try `sbt publish`.
3. support scalafmt, try `sbt scalafmt`.
4. including scala ci, check [scala.yml](src/main/g8/.github/workflows/scala.yml).
5. Sbt common deps and utilities are placed under [project/Build.scala](src/main/g8/project/Build.scala).

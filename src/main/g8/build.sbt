version := "0.1.0-SNAPSHOT"
scalaVersion := "2.13.12"
organization := "com.exmaple"
maintainer := "$email$"
val javeVersion = "11"

javacOptions ++= Seq("-source", javaVersion, "-target", javaVersion)
scalacOptions ++= Seq("-Xsource:3")

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++=(
    )
  )

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.10.4" % "provided",
  "org.scalamacros" %% "quasiquotes" % "2.0.1",
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

scalaVersion := "2.10.4"

ScalariformSupport.formatSettings

Revolver.settings

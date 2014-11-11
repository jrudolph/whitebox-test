libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.11.4" % "provided",
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)

scalaVersion := "2.11.4"

ScalariformSupport.formatSettings

Revolver.settings

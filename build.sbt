
val scala = "2.13.10"

lazy val commonSettings = Seq(
  organization := "xuyinyin",
  name         := "scala-reference",
  version      := "0.1.0-SNAPSHOT",
  scalaVersion := scala,
)


lazy val root = (project in file("."))
  .settings(commonSettings)
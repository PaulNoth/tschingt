name := "Tschingt"

version := "0.8.1"

scalaVersion := "2.12.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
crossScalaVersions := Seq("2.11.12", "2.12.4")
crossVersion := CrossVersion.binary

organization := "com.pidanic"

sonatypeProfileName := "com.pidanic"

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))

homepage := Some(url("http://pidanic.com"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/PaulNoth/tschingt"),
    "scm:git@github.com:PaulNoth/tschingt.git"
  )
)

developers := List(
  Developer(
    id    = "paulp",
    name  = "Pavol Pidanič",
    email = "paulp@hotmail.sk",
    url   = url("http://pidanic.com")
  )
)

publishMavenStyle := true
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false
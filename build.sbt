name := "Tschingt"

version := "0.0.1"

scalaVersion := "2.12.4"

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"

//useGpg := true

organization := "com.pidanic"

sonatypeProfileName := "(com.pidanic)"

//pgpPublicRing := file("/Users/pavol.pidanic/.sbt/gpg/pubring.asc")
//pgpSecretRing := file("/Users/pavol.pidanic/.sbt/gpg/secring.asc")

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
name := "Tester"

organization := "org.bizzle"

version := "1.0"

scalaVersion := "2.10.1"

licenses += ("BSD", url("http://choosealicense.com/licenses/bsd-3-clause/"))

seq(bintrayPublishSettings: _*)

bintray.Keys.repository in bintray.Keys.bintray := "Tester"

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("thebizzle")

scalaSource in Compile <<= baseDirectory(_ / "src" / "main")

scalaSource in Test <<= baseDirectory(_ / "src" / "test")

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "1.9.1"
)

mainClass in Compile := None

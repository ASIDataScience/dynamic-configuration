name := "dynamic-configuration-simple-example"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.14",
  "com.amazonaws" % "aws-java-sdk" % "1.11.66",
  "com.asidatascience" %% "dynamic-configuration" % "0.3.0-SNAPSHOT",
  "org.json4s" %% "json4s-native" % "3.5.0"
)

scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import")

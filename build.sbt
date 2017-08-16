name := """play-scala-slick-example"""

version := "2.6.x"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies += guice
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.42"
libraryDependencies += "com.typesafe.play" %% "play-slick" %  "3.0.0"
libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "3.0.0"

libraryDependencies += specs2 % Test
  


import sbt._
import sbt.Keys._

name := "dbHelper"

lazy val commonSettings = Seq(
  organization := "com.me",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.5",
  resolvers ++= Sensitive.resolvers
)

lazy val dbHelper = (project in file(".")).
  settings(commonSettings: _*)

val h2 = "com.h2database" % "h2" % "1.2.127"
val mysqlDriver = "mysql" % "mysql-connector-java" % "5.1.10"
val posgresDriver = "postgresql" % "postgresql" % "8.4-701.jdbc4"
val msSqlDriver = "net.sourceforge.jtds" % "jtds" % "1.2.4"
val derbyDriver = "org.apache.derby" % "derby" % "10.7.1.1"

libraryDependencies ++= Seq(
  "org.squeryl" %% "squeryl" % "0.9.6-RC3",
  posgresDriver,
  //"com.ocado" %% "cqrs-entity-domain" % "1.0.1-SNAPSHOT",
  // Logging
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "com.typesafe.scala-logging" % "scala-logging-slf4j_2.11" % "2.1.2"
)

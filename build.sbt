name := "dbHelper"

lazy val commonSettings = Seq(
  organization := "com.me",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.6"
)

lazy val dbHelper = (project in file(".")).
  settings(commonSettings: _*)

val h2 = "com.h2database" % "h2" % "1.2.127"
val mysqlDriver = "mysql" % "mysql-connector-java" % "5.1.10"
val posgresDriver = "postgresql" % "postgresql" % "8.4-701.jdbc4"
val msSqlDriver = "net.sourceforge.jtds" % "jtds" % "1.2.4"
val derbyDriver = "org.apache.derby" % "derby" % "10.7.1.1"

libraryDependencies ++= Seq(
  "org.squeryl" %% "squeryl" % "0.9.5-6",
  posgresDriver
)

name := "replicate-slick-issue"
     
version := "1.0"

scalaVersion := "2.10.3"
 
seq(Revolver.settings: _*)

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Sonatype Releases" at  "http://oss.sonatype.org/content/repositories/releases"

resolvers += "CDH4" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

resolvers += "glassfish" at "https://repository.jboss.org/nexus/content/repositories/glassfish"

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "anormcypher" at "http://repo.anormcypher.org/"

libraryDependencies +="com.typesafe.akka" %% "akka-actor" % "2.2.0"

libraryDependencies +="com.typesafe.akka" %% "akka-testkit" % "2.2.0"

libraryDependencies +="com.typesafe.akka" %% "akka-transactor" % "2.2.0"

libraryDependencies += "io.spray" % "spray-can" % "1.2-RC2"

libraryDependencies += "io.spray" % "spray-routing" % "1.2-RC2"

libraryDependencies += "io.spray" % "spray-testkit" % "1.2-RC2"

libraryDependencies += "io.spray" %%  "spray-json" % "1.2.3"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.2"

libraryDependencies += "org.anormcypher" %% "anormcypher" % "0.4.4"

libraryDependencies += "com.typesafe.slick" %% "slick" % "1.0.1"

libraryDependencies += "com.h2database" % "h2" % "1.3.173"

libraryDependencies += "org.postgresql" % "postgresql" % "9.2-1002-jdbc4"



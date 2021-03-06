// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
//resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers ++= Seq("Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
					Classpaths.sbtPluginReleases)

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.3")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "0.99.7.1")
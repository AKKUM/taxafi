name := "Taxafi"

version := "1.0-SNAPSHOT"



libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings

instrumentSettings

ScoverageKeys.excludedPackages in ScoverageCompile := "<empty>;Reverse.*;.*AuthService.*;models/.data/..*;view.*"

ScoverageKeys.minimumCoverage := 80

ScoverageKeys.failOnMinimumCoverage := false

ScoverageKeys.highlighting := true

parallelExecution in ScoverageTest := false
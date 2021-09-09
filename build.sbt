version := "0.1"

scalaVersion := "2.12.8"

lazy val ibclient = RootProject(file("external/ibclient"))

// Use the official API directly
// Compile/unmanagedSources := Seq( baseDirectory.value / "external/twsapi/IBJts/source/JavaClient")
// Compile/unmanagedJars += baseDirectory.value / "external/twsapi/IBJts/source/JavaClient/TwsApi.jar"

lazy val tradingdata2 = (project in file ("."))
  .settings(
    libraryDependencies := Seq("org.apache.spark" %% "spark-sql" % "3.1.2"),
  )
  .dependsOn(ibclient)

Compile/mainClass := Some("org.watkins.trading.Main")

idePackagePrefix := Some("org.watkins.trading")

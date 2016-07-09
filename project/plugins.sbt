resolvers += Classpaths.sbtPluginReleases

resolvers += Resolver.sonatypeRepo("releases")

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("org.brianmckenna" % "sbt-wartremover" % "0.14")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
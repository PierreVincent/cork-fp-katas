name := "fp-cork-kata-1"

version := "1.0"

scalaVersion := "2.11.8"

wartremoverErrors in (Compile, compile) ++= Warts.all

libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
  )
}

coverageMinimum := 100
coverageFailOnMinimum := true
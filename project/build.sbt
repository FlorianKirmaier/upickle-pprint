resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.13")
addSbtPlugin("com.lihaoyi" % "scalatex-sbt-plugin" % "0.3.5")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

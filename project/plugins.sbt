val sbtcrossProjectVersion = "1.3.2"

addSbtPlugin("org.scalameta"      % "sbt-scalafmt"                  % "2.5.2")
addSbtPlugin("com.github.sbt"     % "sbt-ci-release"                % "1.5.12")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.14.0")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.16")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % sbtcrossProjectVersion)
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % sbtcrossProjectVersion)
addSbtPlugin("pl.project13.scala" % "sbt-jmh"                       % "0.4.6")
addSbtPlugin("com.thesamet"       % "sbt-protoc"                    % "1.0.6")
addSbtPlugin("com.eed3si9n"       % "sbt-buildinfo"                 % "0.11.0")
addSbtPlugin("org.scalameta"      % "sbt-mdoc"                      % "2.5.1")
addSbtPlugin("com.typesafe"       % "sbt-mima-plugin"               % "1.1.3")

addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings" % "1.1.2")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.14"
addDependencyTreePlugin

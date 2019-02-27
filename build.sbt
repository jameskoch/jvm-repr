libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

Test / parallelExecution := false // Tests mutate global state

inThisBuild(List(
  organization := "org.jameskoch",
  homepage := Some(url("https://github.com/jameskoch/jvm-repr")),
  licenses := List("BSD 3-Clause License" -> url("https://raw.githubusercontent.com/jameskoch/jvm-repr/master/LICENSE")),
  developers := List(
    Developer(
      "jameskoch",
      "James Koch",
      "jameskoch@gmail.com",
      url("https://jupyter.org")
    )
  )
))

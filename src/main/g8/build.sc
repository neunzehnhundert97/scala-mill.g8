import mill._, scalalib._

// For using metals explicitly
//import \$ivy.`com.lihaoyi::mill-contrib-bloop:0.9.12`

object $name;format="Camel"$ extends ScalaModule
{
    def scalaVersion = "3.1.0"

    def scalacOptions = T {
      Seq("-explain", "-explain-types", "-no-indent", "-deprecation")
    }

    // Overwrite source location
    //def millSourcePath = os.pwd / "..."
      
    // Compiler plugins
    //def scalacPluginIvyDeps = Agg()

    // Libraries, use withDottyCompat(scalaVersion()) for using scala 2.13 in scala 3
    //def ivyDeps = Agg()

    // Dependency on other modules
    // def moduleDeps = Seq(...)
    
    // Arguments for java
    //def forkArgs = Seq()
    
    // Main class tu run if ambigous
    //def mainClass = Some("")
}

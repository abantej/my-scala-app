// scala singleton class
object LoggerS {
  def log(level: String, string: String): Unit = {
    printf("%s %s%n", level, string)
  }
}

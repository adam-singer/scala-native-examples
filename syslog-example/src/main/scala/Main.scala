import scalanative.native._, stdlib._, stdio._
import scalanative.posix.syslog._

object Main {

  def main(args: Array[String]): Unit = {
    openlog(c"scala-native-syslog", LOG_PID, LOG_USER)
    syslog(LOG_ERR, c"scala-native-syslog 1: %s %s", c"arg1", c"arg2")

    setlogmask(LOG_UPTO(LOG_DEBUG))
    syslog(LOG_NOTICE, c"scala-native-syslog 2: %s %s", c"arg1", c"arg2")

    setlogmask(LOG_UPTO(LOG_ERR))
    syslog(LOG_EMERG, c"scala-native-syslog 3: %s %s", c"arg1", c"arg2")

    closelog()
    printf(c"hello world\n")
  }
}
import scalanative.native._, stdlib._, stdio._
import scalanative.posix.cpio._

object Main {

  def main(args: Array[String]): Unit = {
//    val i = C_IWGRP
    val i: CUnsignedShort = C_IWGRP
    printf(c"hello world\n")
  }
}
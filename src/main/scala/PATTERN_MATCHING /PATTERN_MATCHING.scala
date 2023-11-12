package PATTERN_MATCHING

import scala.util.Random

/**
 * https://docs.scala-lang.org/tour/pattern-matching.html
 *
 * @author : XuJiaWei
 * @since : 2023-11-12 11:35
*/
object PATTERN_MATCHING{

  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(10)

    val math_x = x match {
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
    /**
     * output:
     * x: 0, math_x: zero
     */
    print(s"x: $x, math_x: $math_x")
  }

}

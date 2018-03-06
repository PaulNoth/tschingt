package com.pidanic.tchingt

import com.pidanic.tchingt.Five._

object Main extends App {
  //`5` + 5
  println(Five() + 5)
  println(5 + Five())
  println(Five)
  println(Five())
  println(Five() + Five())
  println(Five() + "5")
  val five = Five()
  val five2 = Five()
  five + 1
  five + 1.toByte
  println(five.high)
  println(1 + five)
  println(5 == Five())
  println(5 == Five)
  //println(1.high)

  //println(five == five2)
  //println(five eq five2)
  //println(five equals five2)
}

package com.pidanic.tchingt

object Main extends App {
  println(Five() + 5)
  println(Five() + Five())
  println(Five() + "5")
  val five = Five()
  val five2 = Five()
  println(five.high)

  println(five == five2)
  //println(five eq five2)
  println(five equals five2)
}

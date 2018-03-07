package com.pidanic.tchingt

import Five._


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
  println(five())
  println(1 + five)
  println(5 == Five())
  println(5 == Five)
  println(5 >= Five())
  println(Five() >= 5)
  //println(Five == 5)
  //println(1.high)

  val six = new Five
  six + 10

  println(new Five)
  println(new Five() + 10)
  println(new Five().high)
  println(six.high)
  println(Five.apply())
  println(Five())
  println(Five() + Five())
  println(six + Five())
  println(Five().getClass.getTypeName)
  println(10 + six)
  val a = 10 + six


  //println(five == five2)
  //println(five eq five2)
  //println(five equals five2)
}

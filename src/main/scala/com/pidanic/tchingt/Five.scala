package com.pidanic.tchingt

final class Five(private val value: Int = 5) extends Function0[Int] {

  private val five = value

  override def apply(): Int = five

  override def toString(): String = five.toString

  def + (value: Int): Int = five + value
  def + (value: Byte): Int = five + value
  def + (value: Short): Int = five + value
  def + (value: Char): Int = five + value
  def + (value: Long): Long = five + value
  def + (value: Float): Float = five + value
  def + (value: Double): Double = five + value
  def + (value: Five): Int = five + value.five

  def - (value: Int): Int = ???
  def - (value: Byte): Int = ???
  def - (value: Short): Int = ???
  def - (value: Char): Int = ???
  def - (value: Long): Long = ???
  def - (value: Float): Float = ???
  def - (value: Double): Double = ???
  def - (value: Five): Int = five - value.five

  def * (value: Int): Int = ???
  def * (value: Byte): Int = ???
  def * (value: Short): Int = ???
  def * (value: Char): Int = ???
  def * (value: Long): Long = ???
  def * (value: Float): Float = ???
  def * (value: Double): Double = ???
  def * (value: Five): Int = five * value.five

  def / (value: Int): Int = ???
  def / (value: Byte): Int = ???
  def / (value: Short): Int = ???
  def / (value: Char): Int = ???
  def / (value: Long): Long = ???
  def / (value: Float): Float = ???
  def / (value: Double): Double = ???
  def / (value: Five): Int = five / value.five

  def % (value: Int): Int = ???
  def % (value: Byte): Int = ???
  def % (value: Short): Int = ???
  def % (value: Char): Int = ???
  def % (value: Long): Long = ???
  def % (value: Float): Float = ???
  def % (value: Double): Double = ???
  def % (value: Five): Int = five % value.five

  def & (value: Int): Int = ???
  def & (value: Byte): Int = ???
  def & (value: Short): Int = ???
  def & (value: Char): Int = ???
  def & (value: Long): Long = ???
  def & (value: Five): Int = ???

  def | (value: Int): Int = ???
  def | (value: Byte): Int = ???
  def | (value: Short): Int = ???
  def | (value: Char): Int = ???
  def | (value: Long): Long = ???
  def | (value: Five): Int = ???

  def ^ (value: Int): Int = ???
  def ^ (value: Byte): Int = ???
  def ^ (value: Short): Int = ???
  def ^ (value: Char): Int = ???
  def ^ (value: Long): Long = ???
  def ^ (value: Five): Int = ???

  def >> (value: Int): Int = ???
  def >> (value: Byte): Int = ???
  def >> (value: Short): Int = ???
  def >> (value: Char): Int = ???
  def >> (value: Long): Long = ???
  def >> (value: Five): Int = ???

  def >>> (value: Int): Int = ???
  def >>> (value: Byte): Int = ???
  def >>> (value: Short): Int = ???
  def >>> (value: Char): Int = ???
  def >>> (value: Long): Long = ???
  def >>> (value: Five): Int = ???

  def << (value: Int): Int = ???
  def << (value: Byte): Int = ???
  def << (value: Short): Int = ???
  def << (value: Char): Int = ???
  def << (value: Long): Int = ???
  def << (value: Five): Int = ???

  def > (value: Int): Boolean = ???
  def > (value: Byte): Boolean = ???
  def > (value: Short): Boolean = ???
  def > (value: Char): Boolean = ???
  def > (value: Long): Boolean = ???
  def > (value: Float): Boolean = ???
  def > (value: Double): Boolean = ???
  def > (value: Five): Boolean = ???

  def >= (value: Int): Boolean = ???
  def >= (value: Byte): Boolean = ???
  def >= (value: Short): Boolean = ???
  def >= (value: Char): Boolean = ???
  def >= (value: Long): Boolean = ???
  def >= (value: Float): Boolean = ???
  def >= (value: Double): Boolean = ???
  def >= (value: Five): Boolean = ???

  def < (value: Int): Boolean = ???
  def < (value: Byte): Boolean = ???
  def < (value: Short): Boolean = ???
  def < (value: Char): Boolean = ???
  def < (value: Long): Boolean = ???
  def < (value: Float): Boolean = ???
  def < (value: Double): Boolean = ???
  def < (value: Five): Boolean = ???

  def <= (value: Int): Boolean = ???
  def <= (value: Byte): Boolean = ???
  def <= (value: Short): Boolean = ???
  def <= (value: Char): Boolean = ???
  def <= (value: Long): Boolean = ???
  def <= (value: Float): Boolean = ???
  def <= (value: Double): Boolean = ???
  def <= (value: Five): Boolean = ???

  def == (value: Int): Boolean = ???
  def == (value: Byte): Boolean = ???
  def == (value: Short): Boolean = ???
  def == (value: Char): Boolean = ???
  def == (value: Long): Boolean = ???
  def == (value: Float): Boolean = ???
  def == (value: Double): Boolean = ???
  def == (value: Five): Boolean = ???

  def != (value: Int): Boolean = ???
  def != (value: Byte): Boolean = ???
  def != (value: Short): Boolean = ???
  def != (value: Char): Boolean = ???
  def != (value: Long): Boolean = ???
  def != (value: Float): Boolean = ???
  def != (value: Double): Boolean = ???
  def != (value: Five): Boolean = ???

  def high: String = "o/"

  def law: String = ???

  def convertTo(that: Any): Any = ???

  def roman: String = ???

  def upHigh: String = ???

  def downLow: String = ???

  def arabic: String = ???
  def azerbaijani: String = ???
  def basque: String = ???
  def belarusian: String = ???
  def bosnian: String = ???
  def bulgarian: String = ???
  def catalan: String = ???
  def chinese(typ: String = "chinese"): String = ???
  def choctaw: String = ???
  def croatian: String = ???
  def czech: String = ???
  def dothraki: String = ???
  def dovah: String = ???
  def dutch: String = ???
  def elvish(typ: String = "elvish"): String = ???
  def english: String = ???
  def esperanto: String = ???
  def estonian: String = ???
  def finnish: String = ???
  def french: String = ???
  def german: String = ???
  def greek: String = ???
  def hebrew: String = ???
  def hindi: String = ???
  def hungarian: String = ???
  def icelandic: String = ???
  def indonesian: String = ???
  def irish: String = ???
  def italian: String = ???
  def japanese: String = ???
  def kannada: String = ???
  def klingon: String = ???
  def korean: String = ???
  def latin: String = ???
  def latvian: String = ???
  def lithuanian: String = ???
  def maltese: String = ???
  def mongolian: String = ???
  def nepali: String = ???
  def norwegian: String = ???
  def persian: String = ???
  def piglatin: String = ???
  def polish: String = ???
  def portuguese: String = ???
  def punjabi: String = ???
  def romanian: String = ???
  def romansh: String = ???
  def russian: String = ???
  def serbian: String = ???
  def sinhala: String = ???
  def slovak: String = ???
  def slovenian: String = ???
  def spanish: String = ???
  def swedish: String = ???
  def tamil: String = ???
  def telugu: String = ???
  def turkish: String = ???
  def thai: String = ???
  def ukrainian: String = ???
  def welsh: String = ???

  def morseCode: String = ???

  def base(i: Int): String = ???

  def binary: String = ???

  def octal: String = ???

  def hex: String = ???

  def mdFive: String = ???

  def golden: Double = ???

  def negative: Int = ???

  def loud(str: String = "english"): String = ???

  def smooth: String = ???

  def oclock: String = ???

  def oclockSomewhere: String = ???

  def guys: String = ???

  def bucks: String = ???

  def euro: String = ???

  def r: String = ???

  def dollar: String = ???

  def tooSlow: Int = ???

  def jackson: List[String] = ???

  def fab: List[String] = ???

  def members: List[String] = ???

  def discography: List[String] = ???

  def singles: List[String] = ???

  def furious: List[String] = ???

  def famous: List[String] = ???

  def fiveFiveFive: String = ???

  def luniz: String = ???

  def funk: List[String] = ???

  def isFive(num: Int): Boolean = ???

  def filter(ints: List[Int]): List[Int] = ???

  def map(ints: List[Int]): List[Int] = ???

  def reduce(ints: List[Int]): Int = ???

  def rot(ints: List[Int]): List[Int] = ???

  def rot(str: String): String = ???

  def factorial: Int = ???

}

object Five {
  private val five = new Five

  def apply(): Five = five

  implicit def toFive(value: Int): Five = new Five(value)
  //implicit def toLong(value: Five): Long = value.value.toLong
  //implicit def toInt(value: Five): Int = value.value
}

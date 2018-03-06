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

  def high: String = "o/"
}

object Five {
  private val five = new Five

  def apply(): Five = five

  implicit def toFive(value: Int): Five = new Five(value)
  implicit def toLong(value: Five): Long = value.value.toLong
}

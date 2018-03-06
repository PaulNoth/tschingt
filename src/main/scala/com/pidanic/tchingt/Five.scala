package com.pidanic.tchingt

final class Five private (val value: Int = 5) extends AnyVal {
  def + (otherVal: Double): Double = value + otherVal
  def + (otherVal: Long): Long = value + otherVal
  def + (otherVal: Float): Float = value + otherVal

  // TODO is it ok?
  //def + (otherVal: Char): String = value.toString + otherVal
  def + (otherVal: String): String = value.toString + otherVal

  def + (otherVal: Five): Int = value + otherVal.value

  def high: String = "o/"

  override def toString: String = "5"
}

object Five {
  //implicit def toFive(value: Int) = new Five(value)
  implicit def toInt(value: Five): Int = value.value

  private val five = new Five()

  def apply(): Five = five
}


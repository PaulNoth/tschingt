package com.pidanic.tchingt

import java.math.BigInteger
import java.util.Date
import java.util.concurrent.TimeUnit

import scala.collection.GenTraversable
import scala.concurrent.{Await, Future}
import scala.util.Try
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

final class Five(private val five: Int = 5) extends Function0[Int] {

  override def apply(): Int = five

  override def toString(): String = five.toString

  /**
    * Returns the sum of this value and that.
    */
  def + (that: Int): Int = five + that
  /**
    * Returns the sum of this value and that.
    */
  def + (that: Byte): Int = five + that
  /**
    * Returns the sum of this value and that.
    */
  def + (that: Short): Int = five + that
  /**
    * Returns the sum of this value and that.
    */
  def + (that: Char): Int = five + that
  /**
    * Returns the sum of this value and that.
    */
  def + (that: Long): Long = five + that
  /**
    * Returns the sum of this value and that.
    */
  def + (that: Float): Float = five + that
  /**
    * Returns the sum of this value and that.
    */
  def + (that: Double): Double = five + that
  /**
    * Returns the sum of this value and that.
    */
  def + (that: Five): Int = five + that.five

  /**
    * Returns the difference of this value and that.
    */
  def - (that: Int): Int = five - that
  /**
    * Returns the difference of this value and that.
    */
  def - (that: Byte): Int = five - that
  /**
    * Returns the difference of this value and that.
    */
  def - (that: Short): Int = five - that
  /**
    * Returns the difference of this value and that.
    */
  def - (that: Char): Int = five - that
  /**
    * Returns the difference of this value and that.
    */
  def - (that: Long): Long = five - that
  /**
    * Returns the difference of this value and that.
    */
  def - (that: Float): Float = five - that
  /**
    * Returns the difference of this value and that.
    */
  def - (that: Double): Double = five - that
  /**
    * Returns the difference of this value and that.
    */
  def - (that: Five): Int = five - that.five

  /**
    * Returns the product of this value and that.
    */
  def * (that: Int): Int = five * that
  /**
    * Returns the product of this value and that.
    */
  def * (that: Byte): Int = five * that
  /**
    * Returns the product of this value and that.
    */
  def * (that: Short): Int = five * that
  /**
    * Returns the product of this value and that.
    */
  def * (that: Char): Int = five * that
  /**
    * Returns the product of this value and that.
    */
  def * (that: Long): Long = five * that
  /**
    * Returns the product of this value and that.
    */
  def * (that: Float): Float = five * that
  /**
    * Returns the product of this value and that.
    */
  def * (that: Double): Double = five * that
  /**
    * Returns the product of this value and that.
    */
  def * (that: Five): Int = five * that.five

  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Int): Int = five / that
  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Byte): Int = five / that
  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Short): Int = five / that
  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Char): Int = five / that
  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Long): Long = five / that
  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Float): Float = five / that
  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Double): Double = five / that
  /**
    * Returns the quotient of this value and that.
    */
  def / (that: Five): Int = five / that.five

  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Int): Int = five % that
  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Byte): Int = five % that
  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Short): Int = five % that
  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Char): Int = five % that
  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Long): Long = five % that
  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Float): Float = five % that
  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Double): Double = five % that
  /**
    * Returns the remainder of the division of this value by `that`.
    */
  def % (that: Five): Int = five % that.five

  /**
    * Returns the bitwise AND of this value and `that`.
    * @example {{{
    * (0xf0 & 0xaa) == 0xa0
    * // in binary:   11110000
    * //            & 10101010
    * //              --------
    * //              10100000
    * }}}
    */
  def & (that: Int): Int = five & that
  /**
    * Returns the bitwise AND of this value and `that`.
    * @example {{{
    * (0xf0 & 0xaa) == 0xa0
    * // in binary:   11110000
    * //            & 10101010
    * //              --------
    * //              10100000
    * }}}
    */
  def & (that: Byte): Int = five & that
  /**
    * Returns the bitwise AND of this value and `that`.
    * @example {{{
    * (0xf0 & 0xaa) == 0xa0
    * // in binary:   11110000
    * //            & 10101010
    * //              --------
    * //              10100000
    * }}}
    */
  def & (that: Short): Int = five & that
  /**
    * Returns the bitwise AND of this value and `that`.
    * @example {{{
    * (0xf0 & 0xaa) == 0xa0
    * // in binary:   11110000
    * //            & 10101010
    * //              --------
    * //              10100000
    * }}}
    */
  def & (that: Char): Int = five & that
  /**
    * Returns the bitwise AND of this value and `that`.
    * @example {{{
    * (0xf0 & 0xaa) == 0xa0
    * // in binary:   11110000
    * //            & 10101010
    * //              --------
    * //              10100000
    * }}}
    */
  def & (that: Long): Long = five & that
  /**
    * Returns the bitwise AND of this value and `that`.
    * @example {{{
    * (0xf0 & 0xaa) == 0xa0
    * // in binary:   11110000
    * //            & 10101010
    * //              --------
    * //              10100000
    * }}}
    */
  def & (that: Five): Int = five & that.five

  /**
    * Returns the bitwise OR of this value and `that`.
    * @example {{{
    * (0xf0 | 0xaa) == 0xfa
    * // in binary:   11110000
    * //            | 10101010
    * //              --------
    * //              11111010
    * }}}
    */
  def | (that: Int): Int = five | that
  /**
    * Returns the bitwise OR of this value and `that`.
    * @example {{{
    * (0xf0 | 0xaa) == 0xfa
    * // in binary:   11110000
    * //            | 10101010
    * //              --------
    * //              11111010
    * }}}
    */
  def | (that: Byte): Int = five | that
  /**
    * Returns the bitwise OR of this value and `that`.
    * @example {{{
    * (0xf0 | 0xaa) == 0xfa
    * // in binary:   11110000
    * //            | 10101010
    * //              --------
    * //              11111010
    * }}}
    */
  def | (that: Short): Int = five | that
  /**
    * Returns the bitwise OR of this value and `that`.
    * @example {{{
    * (0xf0 | 0xaa) == 0xfa
    * // in binary:   11110000
    * //            | 10101010
    * //              --------
    * //              11111010
    * }}}
    */
  def | (that: Char): Int = five | that
  /**
    * Returns the bitwise OR of this value and `that`.
    * @example {{{
    * (0xf0 | 0xaa) == 0xfa
    * // in binary:   11110000
    * //            | 10101010
    * //              --------
    * //              11111010
    * }}}
    */
  def | (that: Long): Long = five | that
  /**
    * Returns the bitwise OR of this value and `that`.
    * @example {{{
    * (0xf0 | 0xaa) == 0xfa
    * // in binary:   11110000
    * //            | 10101010
    * //              --------
    * //              11111010
    * }}}
    */
  def | (that: Five): Int = five | that.five

  /**
    * Returns the bitwise XOR of this value and `that`.
    * @example {{{
    * (0xf0 ^ 0xaa) == 0x5a
    * // in binary:   11110000
    * //            ^ 10101010
    * //              --------
    * //              01011010
    * }}}
    */
  def ^ (that: Int): Int = five ^ that
  /**
    * Returns the bitwise XOR of this value and `that`.
    * @example {{{
    * (0xf0 ^ 0xaa) == 0x5a
    * // in binary:   11110000
    * //            ^ 10101010
    * //              --------
    * //              01011010
    * }}}
    */
  def ^ (that: Byte): Int = five ^ that
  /**
    * Returns the bitwise XOR of this value and `that`.
    * @example {{{
    * (0xf0 ^ 0xaa) == 0x5a
    * // in binary:   11110000
    * //            ^ 10101010
    * //              --------
    * //              01011010
    * }}}
    */
  def ^ (that: Short): Int = five ^ that
  /**
    * Returns the bitwise XOR of this value and `that`.
    * @example {{{
    * (0xf0 ^ 0xaa) == 0x5a
    * // in binary:   11110000
    * //            ^ 10101010
    * //              --------
    * //              01011010
    * }}}
    */
  def ^ (that: Char): Int = five ^ that
  /**
    * Returns the bitwise XOR of this value and `that`.
    * @example {{{
    * (0xf0 ^ 0xaa) == 0x5a
    * // in binary:   11110000
    * //            ^ 10101010
    * //              --------
    * //              01011010
    * }}}
    */
  def ^ (that: Long): Long = five ^ that
  /**
    * Returns the bitwise XOR of this value and `that`.
    * @example {{{
    * (0xf0 ^ 0xaa) == 0x5a
    * // in binary:   11110000
    * //            ^ 10101010
    * //              --------
    * //              01011010
    * }}}
    */
  def ^ (that: Five): Int = five ^ that.five

  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling in the left bits with the same value as the left-most bit of this.
    *         The effect of this is to retain the sign of the value.
    * @example {{{
    * -21 >> 3 == -3
    * // in binary: 11111111 11111111 11111111 11101011 >> 3 ==
    * //            11111111 11111111 11111111 11111101
    * }}}
    */
  def >> (that: Int): Int = five >> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling in the left bits with the same value as the left-most bit of this.
    *         The effect of this is to retain the sign of the value.
    * @example {{{
    * -21 >> 3 == -3
    * // in binary: 11111111 11111111 11111111 11101011 >> 3 ==
    * //            11111111 11111111 11111111 11111101
    * }}}
    */
  def >> (that: Byte): Int = five >> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling in the left bits with the same value as the left-most bit of this.
    *         The effect of this is to retain the sign of the value.
    * @example {{{
    * -21 >> 3 == -3
    * // in binary: 11111111 11111111 11111111 11101011 >> 3 ==
    * //            11111111 11111111 11111111 11111101
    * }}}
    */
  def >> (that: Short): Int = five >> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling in the left bits with the same value as the left-most bit of this.
    *         The effect of this is to retain the sign of the value.
    * @example {{{
    * -21 >> 3 == -3
    * // in binary: 11111111 11111111 11111111 11101011 >> 3 ==
    * //            11111111 11111111 11111111 11111101
    * }}}
    */
  def >> (that: Char): Int = five >> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling in the left bits with the same value as the left-most bit of this.
    *         The effect of this is to retain the sign of the value.
    * @example {{{
    * -21 >> 3 == -3
    * // in binary: 11111111 11111111 11111111 11101011 >> 3 ==
    * //            11111111 11111111 11111111 11111101
    * }}}
    */
  def >> (that: Long): Long = five >> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling in the left bits with the same value as the left-most bit of this.
    *         The effect of this is to retain the sign of the value.
    * @example {{{
    * -21 >> 3 == -3
    * // in binary: 11111111 11111111 11111111 11101011 >> 3 ==
    * //            11111111 11111111 11111111 11111101
    * }}}
    */
  def >> (that: Five): Int = five >> that.five

  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling the new left bits with zeroes.
    * @example {{{ 21 >>> 3 == 2 // in binary: 010101 >>> 3 == 010 }}}
    * @example {{{
    * -21 >>> 3 == 536870909
    * // in binary: 11111111 11111111 11111111 11101011 >>> 3 ==
    * //            00011111 11111111 11111111 11111101
    * }}}
    */
  def >>> (that: Int): Int = five >>> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling the new left bits with zeroes.
    * @example {{{ 21 >>> 3 == 2 // in binary: 010101 >>> 3 == 010 }}}
    * @example {{{
    * -21 >>> 3 == 536870909
    * // in binary: 11111111 11111111 11111111 11101011 >>> 3 ==
    * //            00011111 11111111 11111111 11111101
    * }}}
    */
  def >>> (that: Byte): Int = five >>> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling the new left bits with zeroes.
    * @example {{{ 21 >>> 3 == 2 // in binary: 010101 >>> 3 == 010 }}}
    * @example {{{
    * -21 >>> 3 == 536870909
    * // in binary: 11111111 11111111 11111111 11101011 >>> 3 ==
    * //            00011111 11111111 11111111 11111101
    * }}}
    */
  def >>> (that: Short): Int = five >>> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling the new left bits with zeroes.
    * @example {{{ 21 >>> 3 == 2 // in binary: 010101 >>> 3 == 010 }}}
    * @example {{{
    * -21 >>> 3 == 536870909
    * // in binary: 11111111 11111111 11111111 11101011 >>> 3 ==
    * //            00011111 11111111 11111111 11111101
    * }}}
    */
  def >>> (that: Char): Int = five >>> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling the new left bits with zeroes.
    * @example {{{ 21 >>> 3 == 2 // in binary: 010101 >>> 3 == 010 }}}
    * @example {{{
    * -21 >>> 3 == 536870909
    * // in binary: 11111111 11111111 11111111 11101011 >>> 3 ==
    * //            00011111 11111111 11111111 11111101
    * }}}
    */
  def >>> (that: Long): Long = five >>> that
  /**
    * Returns this value bit-shifted right by the specified number of bits,
    *         filling the new left bits with zeroes.
    * @example {{{ 21 >>> 3 == 2 // in binary: 010101 >>> 3 == 010 }}}
    * @example {{{
    * -21 >>> 3 == 536870909
    * // in binary: 11111111 11111111 11111111 11101011 >>> 3 ==
    * //            00011111 11111111 11111111 11111101
    * }}}
    */
  def >>> (that: Five): Int = five >>> that.five

  /**
    * Returns this value bit-shifted left by the specified number of bits,
    *         filling in the new right bits with zeroes.
    * @example {{{ 6 << 3 == 48 // in binary: 0110 << 3 == 0110000 }}}
    */
  def << (that: Int): Int = five << that
  /**
    * Returns this value bit-shifted left by the specified number of bits,
    *         filling in the new right bits with zeroes.
    * @example {{{ 6 << 3 == 48 // in binary: 0110 << 3 == 0110000 }}}
    */
  def << (that: Byte): Int = five << that
  /**
    * Returns this value bit-shifted left by the specified number of bits,
    *         filling in the new right bits with zeroes.
    * @example {{{ 6 << 3 == 48 // in binary: 0110 << 3 == 0110000 }}}
    */
  def << (that: Short): Int = five << that
  /**
    * Returns this value bit-shifted left by the specified number of bits,
    *         filling in the new right bits with zeroes.
    * @example {{{ 6 << 3 == 48 // in binary: 0110 << 3 == 0110000 }}}
    */
  def << (that: Char): Int = five << that
  /**
    * Returns this value bit-shifted left by the specified number of bits,
    *         filling in the new right bits with zeroes.
    * @example {{{ 6 << 3 == 48 // in binary: 0110 << 3 == 0110000 }}}
    */
  def << (that: Long): Int = five << that
  /**
    * Returns this value bit-shifted left by the specified number of bits,
    *         filling in the new right bits with zeroes.
    * @example {{{ 6 << 3 == 48 // in binary: 0110 << 3 == 0110000 }}}
    */
  def << (that: Five): Int = five << that.five

  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Int): Boolean = five > that
  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Byte): Boolean = five > that
  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Short): Boolean = five > that
  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Char): Boolean = five > that
  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Long): Boolean = five > that
  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Float): Boolean = five > that
  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Double): Boolean = five > that
  /**
    * Returns `true` if this value is greater than `that`, `false` otherwise.
    */
  def > (that: Five): Boolean = five > that.five

  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Int): Boolean = five >= that
  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Byte): Boolean = five >= that
  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Short): Boolean = five >= that
  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Char): Boolean = five >= that
  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Long): Boolean = five >= that
  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Float): Boolean = five >= that
  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Double): Boolean = five >= that
  /**
    * Returns `true` if this value is greater than or equal to `that`, `false` otherwise.
    */
  def >= (that: Five): Boolean = five >= that.five

  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Int): Boolean = five < that
  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Byte): Boolean = five < that
  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Short): Boolean = five < that
  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Char): Boolean = five < that
  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Long): Boolean = five < that
  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Float): Boolean = five < that
  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Double): Boolean = five < that
  /**
    * Returns `true` if this value is less than `that`, `false` otherwise.
    */
  def < (that: Five): Boolean = five < that.five

  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Int): Boolean = five <= that
  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Byte): Boolean = five <= that
  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Short): Boolean = five <= that
  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Char): Boolean = five <= that
  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Long): Boolean = five <= that
  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Float): Boolean = five <= that
  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Double): Boolean = five <= that
  /**
    * Returns `true` if this value is less than or equal to `that`, `false` otherwise.
    */
  def <= (that: Five): Boolean = five <= that.five

  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Int): Boolean = five == that
  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Byte): Boolean = five == that
  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Short): Boolean = five == that
  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Char): Boolean = five == that
  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Long): Boolean = five == that
  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Float): Boolean = five == that
  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Double): Boolean = five == that
  /**
    * Returns `true` if this value is equal to `that`, `false` otherwise.
    */
  def == (that: Five): Boolean = five == that.five

  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Int): Boolean = five != that
  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Byte): Boolean = five != that
  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Short): Boolean = five != that
  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Char): Boolean = five != that
  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Long): Boolean = five != that
  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Float): Boolean = five != that
  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Double): Boolean = five != that
  /**
    * Returns true if this value is not equal to that, false otherwise.
    */
  def != (that: Five): Boolean = five != that.five

  def high: String = "o/"

  def law: String = "The Law of Fives states simply that: All things happen in fives, or are divisible by or are multiples of five, or are somehow directly or indirectly appropriate to 5. The Law of Fives is never wrong."

  def convertTo[T](that: T): T = that

  def roman: String = "V"

  def upHigh: String = "⁵"

  def downLow: String = "₅"

  def arabic: String = "خمسة"
  def azerbaijani: String = "beş"
  def basque: String = "bost"
  def belarusian: String = "пяць"
  def bosnian: String = "pet"
  def bulgarian: String = "пет"
  def catalan: String = "cinc"
  def chinese(`type`: String = "chinese"): String = `type` match {
    case "pinyin" => "wǔ"
    case "financial" => "伍"
    case _ => "五"
  }
  def choctaw: String = "tahlapi"
  def croatian: String = "pet"
  def czech: String = "pět"
  def dothraki: String = "mek"
  def dovah: String = "hen"
  def dutch: String = "vijf"
  def elvish(`type`: String = "elvish"): String = `type` match {
    case "quenya" => "lempë"
    case "sindarin" => "leben"
    case _ => "lempë"
  }
  def english: String = "five"
  def esperanto: String = "kvin"
  def estonian: String = "viis"
  def finnish: String = "viisi"
  def french: String = "cinq"
  def german: String = "fünf"
  def greek: String = "πέντε"
  def hebrew: String = "חמש"
  def hindi: String = "पांच"
  def hungarian: String = "öt"
  def icelandic: String = "fimm"
  def indonesian: String = "lima"
  def irish: String = "cúig"
  def italian: String = "cinque"
  def japanese: String = "五"
  def kannada: String = "ಐದು"
  def klingon: String = "vagh"
  def korean: String = "오"
  def latin: String = "quinque"
  def latvian: String = "pieci"
  def lithuanian: String = "penki"
  def maltese: String = "ħamsa"
  def mongolian: String = "таван"
  def nepali: String = "पाँच"
  def norwegian: String = "fem"
  def persian: String = "پنج"
  def piglatin: String = "ivefay"
  def polish: String = "pięć"
  def portuguese: String = "cinco"
  def punjabi: String = "ਪੰਜ"
  def romanian: String = "cinci"
  def romansh: String = "tchingt"
  def russian: String = "пять"
  def serbian: String = "pet"
  def sinhala: String = "පහ"
  def slovak: String = "päť"
  def slovenian: String = "pet"
  def spanish: String = "cinco"
  def swedish: String = "fem"
  def tamil: String = "ஐந்து"
  def telugu: String = "ఐదు"
  def turkish: String = "beş"
  def thai: String = "ห้า"
  def ukrainian: String = "п’ять"
  def welsh: String = "pump"

  def morseCode: String = "....."

  def base(i: Int): String = BigInteger.valueOf(five).toString(i)

  def binary: String = five.toBinaryString

  def octal: String = five.toOctalString

  def hex: String = five.toHexString

  def mdFive: String = "30056e1cab7a61d256fc8edd970d14f5"

  def golden: Double = {
    val pointFive = five.toDouble / (five + five)
    Math.pow(five.toDouble, pointFive) * pointFive + pointFive
  }

  def negative: Int = -five

  def loud(lang: String = "english"): String = {
    val method = try {
      Option(this.getClass.getMethod(lang))
    } catch {
      case ex: NoSuchMethodException => None
      case e: Throwable => throw e
    }
    if (method.isDefined)
      method.get.invoke(this).asInstanceOf[String].toUpperCase
    else
      english.toUpperCase

  }

  def smooth: String = "S"

  def oclock: String = "🕔"

  def oclockSomewhere: String = "🍺"

  def guys: String = "🍔"

  def bucks: String = "$" + five + ".00"

  def euro: String = "5€"

  def r: String = "£5"

  def dollar: String = "$5"

  def tooSlow: Int = {
    val returnIn = new Date().getTime + 555

    do {} while(new Date().getTime < returnIn)

    five
  }

  def jackson: List[String] = List("Jackie", "Tito", "Jermaine", "Marlon", "Michael")

  def fab: List[String] = List("Juwan Howard", "Ray Jackson", "Jimmy King", "Jalen Rose", "Chris Webber")

  def members: List[String] = List("Sean Conlon", "Ritchie Neville", "Scott Robinson", "Jason 'J' Brown", "Abz Love")

  def discography: List[String] = List("5ive", "Invincible", "Kingsize")

  def singles: List[String] = List("Slam Dunk (Da Funk)", "When the Lights Go Out", "Got the Feelin'",
    "Everybody Get Up", "It's the Things You Do", "Until the Time Is Through", "If Ya Gettin' Down", "Keep On Movin'",
    "Don't Wanna Let You Go", "We Will Rock You", "Let's Dance", "Closer to Me", "Rock the Party", "I Wish It Could Be Christmas Everyday")

  def furious: List[String] = List("Tigress", "Viper", "Crane", "Monkey", "Mantis")

  def famous: List[String] = List("Julian", "Dick", "George", "Anne", "Timmy")

  def fiveFiveFive: String = "Interstella 5555: The 5tory of the 5ecret 5tar 5ystem"

  def luniz: String = s"I Got $five on It"

  def funk: String = s"$five bad boys with the power to rock you"

  def isFive(num: Int): Boolean = num == five

  def filter(ints: GenTraversable[Int]): GenTraversable[Int] = ints.filter(_ == five)

  def map(ints: GenTraversable[Int]): GenTraversable[Int] = ints.map(_ => five)

  def reduce(ints: GenTraversable[Int]): Int = five

  def rot(str: String): String = {
    if(str.matches("[\\da-zA-Z]+") && str.length > five) {
      str.substring(five) + str.substring(0, five)
    }
    else
      str
  }

  def factorial: Int = 120

  def async(callback: Try[Int] => Unit): Unit = {
    Await.result(Future {
      Thread.sleep(five * 1000)
      callback(Try(five))
    }, Duration(6, TimeUnit.SECONDS))
  }
}

object Five {
  private val five = new Five

  def apply(): Five = five

  implicit def toFive(value: Int): Five = new Five(value)
  implicit def toInt(value: Five): Int = value.five
}

package com.pidanic.tchingt

import java.math.BigInteger
import java.util.Date
import java.util.concurrent.TimeUnit

import scala.collection.GenTraversable
import scala.concurrent.{Await, Future}
import scala.util.Try
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

/**
  * Class to overcomplicate `5`.
  */
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

  /**
    * Returns a value, when it "gives you five".
    */
  def high: String = "o/"

  /**
    * Returns a quote of ''Malaclypse the Younger, Principia Discordia, Page 00016''.
    */
  def law: String = "The Law of Fives states simply that: All things happen in fives, or are divisible by or are multiples of five, or are somehow directly or indirectly appropriate to 5. The Law of Fives is never wrong."

  /**
    * Returns `5` converted to `that` value.
    */
  def convertTo[T](that: T): T = that

  /**
    * Returns `5` as Roman number.
    */
  def roman: String = "V"

  /**
    * Returns `5` formatted in superscript.
    */
  def upHigh: String = "⁵"

  /**
    * Returns `5` formatted in subscript.
    */
  def downLow: String = "₅"

  /**
    * Returns `5` in Arabic language.
    */
  def arabic: String = "خمسة"
  /**
    * Returns `5` in Azerbaijani language.
    */
  def azerbaijani: String = "beş"
  /**
    * Returns `5` in Basque language.
    */
  def basque: String = "bost"
  /**
    * Returns `5` in Belarusian language.
    */
  def belarusian: String = "пяць"
  /**
    * Returns `5` in Bosnian language.
    */
  def bosnian: String = "pet"
  /**
    * Returns `5` in Bulgarian language.
    */
  def bulgarian: String = "пет"
  /**
    * Returns `5` in Catalan language.
    */
  def catalan: String = "cinc"

  /**
    * @param variety - `financial`, `pinyin` or empty parameter as general Chinese.
    * Returns `5` in `variety` of Chinese languages.
    */
  def chinese(variety: String = "chinese"): String = variety match {
    case "pinyin" => "wǔ"
    case "financial" => "伍"
    case _ => "五"
  }
  /**
    * Returns `5` in Choctaw language.
    */
  def choctaw: String = "tahlapi"
  /**
    * Returns `5` in Croatian language.
    */
  def croatian: String = "pet"
  /**
    * Returns `5` in Czech language.
    */
  def czech: String = "pět"
  /**
    * Returns `5` in Dothraki language.
    */
  def dothraki: String = "mek"
  /**
    * Returns `5` in Dovah language.
    */
  def dovah: String = "hen"
  /**
    * Returns `5` in Dutch language.
    */
  def dutch: String = "vijf"
  /**
    * @param variety - `quenya`, `sindarin` or empty parameter as general Elvish.
    * Returns `5` in `variety` of Elvish languages.
    */
  def elvish(variety: String = "elvish"): String = variety match {
    case "quenya" => "lempë"
    case "sindarin" => "leben"
    case _ => "lempë"
  }
  /**
    * Returns `5` in English language.
    */
  def english: String = "five"
  /**
    * Returns `5` in Esperanto language.
    */
  def esperanto: String = "kvin"
  /**
    * Returns `5` in Estonian language.
    */
  def estonian: String = "viis"
  /**
    * Returns `5` in Finnish language.
    */
  def finnish: String = "viisi"
  /**
    * Returns `5` in French language.
    */
  def french: String = "cinq"
  /**
    * Returns `5` in German language.
    */
  def german: String = "fünf"
  /**
    * Returns `5` in Greek language.
    */
  def greek: String = "πέντε"
  /**
    * Returns `5` in Hebrew language.
    */
  def hebrew: String = "חמש"
  /**
    * Returns `5` in Hindi language.
    */
  def hindi: String = "पांच"
  /**
    * Returns `5` in Hungarian language.
    */
  def hungarian: String = "öt"
  /**
    * Returns `5` in Icelandic language.
    */
  def icelandic: String = "fimm"
  /**
    * Returns `5` in Indonesian language.
    */
  def indonesian: String = "lima"
  /**
    * Returns `5` in Irish language.
    */
  def irish: String = "cúig"
  /**
    * Returns `5` in Italian language.
    */
  def italian: String = "cinque"
  /**
    * Returns `5` in Japanese language.
    */
  def japanese: String = "五"
  /**
    * Returns `5` in Kannada language.
    */
  def kannada: String = "ಐದು"
  /**
    * Returns `5` in Klingon language.
    */
  def klingon: String = "vagh"
  /**
    * Returns `5` in Korean language.
    */
  def korean: String = "오"
  /**
    * Returns `5` in Latin language.
    */
  def latin: String = "quinque"
  /**
    * Returns `5` in Latvian language.
    */
  def latvian: String = "pieci"
  /**
    * Returns `5` in Lithuanian language.
    */
  def lithuanian: String = "penki"
  /**
    * Returns `5` in Maltese language.
    */
  def maltese: String = "ħamsa"
  /**
    * Returns `5` in Mongolian language.
    */
  def mongolian: String = "таван"
  /**
    * Returns `5` in Nepali language.
    */
  def nepali: String = "पाँच"
  /**
    * Returns `5` in Norwegian language.
    */
  def norwegian: String = "fem"
  /**
    * Returns `5` in Persian language.
    */
  def persian: String = "پنج"
  /**
    * Returns `5` in Piglatin language.
    */
  def piglatin: String = "ivefay"
  /**
    * Returns `5` in Polish language.
    */
  def polish: String = "pięć"
  /**
    * Returns `5` in Portuguese language.
    */
  def portuguese: String = "cinco"
  /**
    * Returns `5` in Punjabi language.
    */
  def punjabi: String = "ਪੰਜ"
  /**
    * Returns `5` in Romanian language.
    */
  def romanian: String = "cinci"
  /**
    * Returns `5` in Romansh language.
    */
  def romansh: String = "tchingt"
  /**
    * Returns `5` in Russian language.
    */
  def russian: String = "пять"
  /**
    * Returns `5` in Serbian language.
    */
  def serbian: String = "pet"
  /**
    * Returns `5` in Sinhala language.
    */
  def sinhala: String = "පහ"
  /**
    * Returns `5` in Slovak language.
    */
  def slovak: String = "päť"
  /**
    * Returns `5` in Slovenian language.
    */
  def slovenian: String = "pet"
  /**
    * Returns `5` in Spanish language.
    */
  def spanish: String = "cinco"
  /**
    * Returns `5` in Swedish language.
    */
  def swedish: String = "fem"
  /**
    * Returns `5` in Tamil language.
    */
  def tamil: String = "ஐந்து"
  /**
    * Returns `5` in Telugu language.
    */
  def telugu: String = "ఐదు"
  /**
    * Returns `5` in Turkish language.
    */
  def turkish: String = "beş"
  /**
    * Returns `5` in Thai language.
    */
  def thai: String = "ห้า"
  /**
    * Returns `5` in Ukrainian language.
    */
  def ukrainian: String = "п’ять"
  /**
    * Returns `5` in Welsh language.
    */
  def welsh: String = "pump"

  /**
    * Returns `5` in Morse code.
    */
  def morseCode: String = "....."

  /**
    * Returns `5` in different number bases.
    * @param i - base
    */
  def base(i: Int): String = BigInteger.valueOf(five).toString(i)

  /**
    * Returns `5` in binary format.
    */
  def binary: String = five.toBinaryString

  /**
    * Returns `5` in octal format.
    */
  def octal: String = five.toOctalString

  /**
    * Returns `5` in hexadecimal format.
    */
  def hex: String = five.toHexString

  /**
    * Returns `5` in ''md5'' hash.
    */
  def mdFive: String = "30056e1cab7a61d256fc8edd970d14f5"

  /**
    * Returns `5` as ''golden ratio''.
    */
  def golden: Double = {
    val pointFive = five.toDouble / (five + five)
    Math.pow(five.toDouble, pointFive) * pointFive + pointFive
  }

  /**
    * Returns negative `5`.
    */
  def negative: Int = -five

  /**
    * @param lang - language string representing language methods in Five
    * Returns `5` '''loudly''' in different languages.
    */
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

  /**
    * Returns a smooth `5`.
    */
  def smooth: String = "S"

  /**
    * Returns a unicode symbol for five o'clock.
    */
  def oclock: String = "🕔"

  /**
    * Returns a unicode symbol for "It's five o'clock somewhere".
    */
  def oclockSomewhere: String = "🍺"

  /**
    * Returns a unicode symbol for five guys.
    */
  def guys: String = "🍔"

  /**
    * Returns `5` in USD.
    */
  def bucks: String = "$" + five + ".00"

  /**
    * Returns `5` in EUR.
    */
  def euro: String = "5€"

  /**
    * Returns `5` in GBP.
    */
  def r: String = "£5"

  /**
    * Returns `5` in USD.
    */
  def dollar: String = "$5"

  /**
    * Returns `5` slower.
    */
  def tooSlow: Int = {
    val returnIn = new Date().getTime + 555

    do {} while(new Date().getTime < returnIn)

    five
  }

  /**
    * Returns five members of the 70's pop family group the ''Jackson 5''.
    */
  def jackson: List[String] = List("Jackie", "Tito", "Jermaine", "Marlon", "Michael")

  /**
    * Returns ''1991-1993 Michigan Mens Basketball Team''.
    */
  def fab: List[String] = List("Juwan Howard", "Ray Jackson", "Jimmy King", "Jalen Rose", "Chris Webber")

  /**
    * Returns 90's boy band ''5ive'' members.
    */
  def members: List[String] = List("Sean Conlon", "Ritchie Neville", "Scott Robinson", "Jason 'J' Brown", "Abz Love")

  /**
    * Returns studio albums released by the 90's boy band ''5ive''.
    */
  def discography: List[String] = List("5ive", "Invincible", "Kingsize")

  /**
    * Returns singles released by the 90\'s boy band 5ive.
    */
  def singles: List[String] = List("Slam Dunk (Da Funk)", "When the Lights Go Out", "Got the Feelin'",
    "Everybody Get Up", "It's the Things You Do", "Until the Time Is Through", "If Ya Gettin' Down", "Keep On Movin'",
    "Don't Wanna Let You Go", "We Will Rock You", "Let's Dance", "Closer to Me", "Rock the Party", "I Wish It Could Be Christmas Everyday")

  /**
    * Returns five fictional members of the ninja group Furious Five from the movie ''Kung-Fu Panda''.
    */
  def furious: List[String] = List("Tigress", "Viper", "Crane", "Monkey", "Mantis")

  /**
    * Returns central characters of the series of ''Enid Blighton novels''.
    */
  def famous: List[String] = List("Julian", "Dick", "George", "Anne", "Timmy")

  /**
    * Returns ''Interstella 5555''.
    */
  def fiveFiveFive: String = "Interstella 5555: The 5tory of the 5ecret 5tar 5ystem"

  /**
    * Returns the song title of 'Luniz' most famous hit.
    */
  def luniz: String = s"I Got $five on It"

  /**
    * Returns group of bad boys with the power to rock you.
    */
  def funk: String = s"$five bad boys with the power to rock you"

  /**
    * Checks if given number is equal to `5`.
    * @param num - a number to validate.
    */
  def isFive(num: Int): Boolean = num == five

  /**
    *
    * @param ints a collection of numbers.
    * @tparam T
    * @return a filtered collection with elements equal to `5`.
    */
  def filter[T <: GenTraversable[Int]](ints: T): T = ints.filter(_ == five).asInstanceOf[T]

  /**
    *
    * @param ints a collection of numbers.
    * @tparam T
    * @return  a new collection by applying a function to all elements to `5`.
    */
  def map[T <: GenTraversable[Int]](ints: T): T = ints.map(_ => five).asInstanceOf[T]

  /**
    *
    * @param ints a collection of numbers.
    * @return A result of applying a mysterious binary operation of`5` to all elements.
    */
  def reduce(ints: GenTraversable[Int]): Int = five

  /**
    * Returns new string when rotated by five places.
    */
  def rot(str: String): String = {
    if(str.matches("[\\da-zA-Z]+") && str.length > five) {
      str.substring(five) + str.substring(0, five)
    }
    else
      str
  }

  /**
    * Returns the factorial optimized at 500% normal factorial runtime.
    */
  def factorial: Int = 120

  /**
    * @param callback - asynchronously access `5` with possible error check.
    */
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

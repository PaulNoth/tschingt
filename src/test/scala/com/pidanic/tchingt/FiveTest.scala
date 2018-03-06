package com.pidanic.tchingt

import org.scalatest.{FlatSpec, Matchers}

class FiveTest extends FlatSpec with Matchers {
  it should "be 5" in {
    Five() should equal(5)
  }

  it should "add itself with a number" in {
    val result = Five() + 5
    result should equal(10)
  }

  it should "add itself with an other Five" in {
    val result = Five() + Five()
    result should equal(10)
  }
}

package com.pidanic.tchingt

import java.util.Date

import org.scalatest.{FlatSpec, Matchers}

class FiveTest extends FlatSpec with Matchers {
  "Five" should "be 5" in {
    Five() should be equals 5
  }

  it should "instance be 5" in {
    val five = Five()
    five should be equals 5
  }

  it should "instance be 5 (2)" in {
    val five = Five()
    five() should be equals 5
  }

  it should "not be 6" in {
    Five() should not be 6
  }

  it should "be equal with another Five " in {
    Five() should equal(Five())
  }

  "+" should "add itself with an int" in {
    val result = Five() + 5
    result should equal(10)
  }

  it should "instance add itself with an int" in {
    val five = Five()
    val result = five + 5
    val result2 = five() + 5
    result should equal(10)
    result2 should equal(10)
  }

  it should "add itself with a char" in {
    val result = Five() + 'A'
    result should equal(70)
  }

  it should "add itself with a byte" in {
    val result = Five() + 5.toByte
    result should equal(10)
  }

  it should "add itself with a short" in {
    val result = Five() + 5.toShort
    result should equal(10)
  }

  it should "add itself with a long" in {
    val result = Five() + 5L
    result should equal(10L)
  }

  it should "be possible an addition of an Int with a Five" in {
    val result = 5 + Five()
    result should equal(10)
  }

  it should "be possible an addition of a Byte with a Five" in {
    val result = 5.toByte + Five()
    result should equal(10)
  }

  it should "be possible an addition of a Long with a Five" in {
    val result = 5L + Five()
    result should equal(10L)
  }

  it should "be possible an addition of a Char with a Five" in {
    val result = 'A' + Five()
    result should equal(70)
  }

  it should "add itself with a float" in {
    val result = Five() + 5.0.toFloat
    result should equal(10.0)
  }

  it should "add itself with a double" in {
    val result = Five() + 5.0
    result should equal(10.0)
  }

  it should "be possible an addition of a Float with a Five" in {
    val result = 5.0.toFloat + Five()
    result should equal(10.0)
  }

  it should "be possible an addition of a Double with a Five" in {
    val result = 5.0 + Five()
    result should equal(10.0)
  }

  it should "add itself with an other Five" in {
    val result = Five() + Five()
    result should equal(10)
  }

  it should "concat a Five with a string" in {
    val result = Five() + "5"
    result should equal("55")
  }

  it should "concat a string with a Five" in {
    val result = "5" + Five()
    result should equal("55")
  }


  "-" should "substract itself with an int" in {
    val result = Five() - 5
    result should equal(0)
  }

  it should "substract itself with a char" in {
    val result = Five() - 'A'
    result should equal(-60)
  }

  it should "substract itself with a byte" in {
    val result = Five() - 5.toByte
    result should equal(0)
  }

  it should "substract itself with a short" in {
    val result = Five() - 5.toShort
    result should equal(0)
  }

  it should "substract itself with a long" in {
    val result = Five() - 5L
    result should equal(0L)
  }

  it should "be possible a substraction of an Int with a Five" in {
    val result = 5 - Five()
    result should equal(0)
  }

  it should "be possible a substration of a Byte with a Five" in {
    val result = 5.toByte - Five()
    result should equal(0)
  }

  it should "be possible a substraction of a Long with a Five" in {
    val result = 5L - Five()
    result should equal(0L)
  }

  it should "be possible a substraction of a Char with a Five" in {
    val result = 'A' - Five()
    result should equal(60)
  }

  it should "substract itself with an other Five" in {
    val result = Five() - Five()
    result should equal(0)
  }

  it should "substract itself with a float" in {
    val result = Five() - 5.0.toFloat
    result should equal(0.0)
  }

  it should "substract itself with a double" in {
    val result = Five() - 5.0
    result should equal(0.0)
  }

  it should "be possible a substraction of a Float with a Five" in {
    val result = 5.0.toFloat - Five()
    result should equal(0.0)
  }

  it should "be possible a substraction of a Double with a Five" in {
    val result = 5.0 - Five()
    result should equal(0.0)
  }


  "*" should "multiply itself with an int" in {
    val result = Five() * 5
    result should equal(25)
  }

  it should "multiply itself with a char" in {
    val result = Five() * 'A'
    result should equal(325)
  }

  it should "multiply itself with a byte" in {
    val result = Five() * 5.toByte
    result should equal(25)
  }

  it should "multiply itself with a short" in {
    val result = Five() * 5.toShort
    result should equal(25)
  }

  it should "multiply itself with a long" in {
    val result = Five() * 5L
    result should equal(25L)
  }

  it should "be possible a multiplication of an Int with a Five" in {
    val result = 5 * Five()
    result should equal(25)
  }

  it should "be possible a multiplication of a Byte with a Five" in {
    val result = 5.toByte * Five()
    result should equal(25)
  }

  it should "be possible a multiplication of a Long with a Five" in {
    val result = 5L * Five()
    result should equal(25L)
  }

  it should "be possible a multiplication of a Char with a Five" in {
    val result = 'A' * Five()
    result should equal(325)
  }

  it should "multiply itself with an other Five" in {
    val result = Five() * Five()
    result should equal(25)
  }

  it should "multiply itself with a float" in {
    val result = Five() * 5.0.toFloat
    result should equal(25.0)
  }

  it should "multiply itself with a double" in {
    val result = Five() * 5.0
    result should equal(25.0)
  }

  it should "be possible a multiplication of a Float with a Five" in {
    val result = 5.0.toFloat * Five()
    result should equal(25.0)
  }

  it should "be possible a multiplication of a Double with a Five" in {
    val result = 5.0 * Five()
    result should equal(25.0)
  }


  "/" should "divide itself with an int" in {
    val result = Five() / 5
    result should equal(1)
  }

  it should "divide itself with a char" in {
    val result = Five() / 'A'
    result should equal(0)
  }

  it should "divide itself with a byte" in {
    val result = Five() / 5.toByte
    result should equal(1)
  }

  it should "divide itself with a short" in {
    val result = Five() / 5.toShort
    result should equal(1)
  }

  it should "divide itself with a long" in {
    val result = Five() / 5L
    result should equal(1L)
  }

  it should "be possible a division of an Int with a Five" in {
    val result = 5 / Five()
    result should equal(1)
  }

  it should "be possible a division of a Byte with a Five" in {
    val result = 5.toByte / Five()
    result should equal(1)
  }

  it should "be possible a division of a Long with a Five" in {
    val result = 5L / Five()
    result should equal(1L)
  }

  it should "be possible a division of a Char with a Five" in {
    val result = 'A' / Five()
    result should equal(13)
  }

  it should "divide itself with an other Five" in {
    val result = Five() / Five()
    result should equal(1)
  }

  it should "divide itself with a float" in {
    val result = Five() / 5.0.toFloat
    result should equal(1.0)
  }

  it should "divide itself with a double" in {
    val result = Five() / 5.0
    result should equal(1.0)
  }

  it should "be possible a division of a Float with a Five" in {
    val result = 5.0.toFloat / Five()
    result should equal(1.0)
  }

  it should "be possible a division of a Double with a Five" in {
    val result = 5.0 / Five()
    result should equal(1.0)
  }


  "%" should "modulo itself with an int" in {
    val result = Five() % 5
    result should equal(0)
  }

  it should "modulo itself with a char" in {
    val result = Five() % 'A'
    result should equal(5)
  }

  it should "modulo itself with a byte" in {
    val result = Five() % 5.toByte
    result should equal(0)
  }

  it should "modulo itself with a short" in {
    val result = Five() % 5.toShort
    result should equal(0)
  }

  it should "modulo itself with a long" in {
    val result = Five() % 5L
    result should equal(0L)
  }

  it should "be possible a modulo of an Int with a Five" in {
    val result = 5 % Five()
    result should equal(0)
  }

  it should "be possible a modulo of a Byte with a Five" in {
    val result = 5.toByte % Five()
    result should equal(0)
  }

  it should "be possible a modulo of a Long with a Five" in {
    val result = 5L % Five()
    result should equal(0L)
  }

  it should "be possible a modulo of a Char with a Five" in {
    val result = 'A' % Five()
    result should equal(0)
  }

  it should "modulo itself with an other Five" in {
    val result = Five() % Five()
    result should equal(0)
  }

  it should "modulo itself with a float" in {
    val result = Five() % 5.0.toFloat
    result should equal(0.0)
  }

  it should "modulo itself with a double" in {
    val result = Five() % 5.0
    result should equal(0.0)
  }

  it should "be possible a modulo of a Float with a Five" in {
    val result = 5.0.toFloat % Five()
    result should equal(0.0)
  }

  it should "be possible a modulo of a Double with a Five" in {
    val result = 5.0 % Five()
    result should equal(0.0)
  }

  "&" should "give correct result" in {
    val five = Five()

    val result1 = five & 2
    val result2 = five() & 2
    val result3 = Five() & 2
    val result4 = 2 & five
    val result5 = 2 & five()
    val result6 = 2 & Five()

    result1 should equal(0)
    result2 should equal(0)
    result3 should equal(0)
    result4 should equal(0)
    result5 should equal(0)
    result6 should equal(0)
  }

  "|" should "give correct result" in {
    val five = Five()

    val result1 = five | 2
    val result2 = five() | 2
    val result3 = Five() | 2
    val result4 = 2 | five
    val result5 = 2 | five()
    val result6 = 2 | Five()

    result1 should equal(7)
    result2 should equal(7)
    result3 should equal(7)
    result4 should equal(7)
    result5 should equal(7)
    result6 should equal(7)
  }

  "^" should "give correct result" in {
    val five = Five()

    val result1 = five ^ 2
    val result2 = five() ^ 2
    val result3 = Five() ^ 2
    val result4 = 2 ^ five
    val result5 = 2 ^ five()
    val result6 = 2 ^ Five()

    result1 should equal(7)
    result2 should equal(7)
    result3 should equal(7)
    result4 should equal(7)
    result5 should equal(7)
    result6 should equal(7)
  }

  "<<" should "give correct result" in {
    val five = Five()

    val result1 = five << 2
    val result2 = five() << 2
    val result3 = Five() << 2

    result1 should equal(12)
    result2 should equal(12)
    result3 should equal(12)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result4 = 2 << five
    val result5 = 2 << five()
    val result6 = 2 << Five()

    result4 should equal(64)
    result5 should equal(64)
    result6 should equal(64)
  }

  ">>>" should "give correct result" in {
    val five = Five()

    val result1 = five >>> 2
    val result2 = five() >>> 2
    val result3 = Five() >>> 2

    result1 should equal(0)
    result2 should equal(0)
    result3 should equal(0)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 >>> five
    val result2 = 2 >>> five()
    val result3 = 2 >>> Five()

    result1 should equal(0)
    result2 should equal(0)
    result3 should equal(0)
  }

  ">" should "give correct result" in {
    val five = Five()

    val result1 = five > 2
    val result2 = five() > 2
    val result3 = Five() > 2

    result1 should equal(true)
    result2 should equal(true)
    result3 should equal(true)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 > five
    val result2 = 2 > five()
    val result3 = 2 > Five()

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
  }

  "<" should "give correct result" in {
    val five = Five()

    val result1 = five < 2
    val result2 = five() < 2
    val result3 = Five() < 2

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 < five
    val result2 = 2 < five()
    val result3 = 2 < Five()

    result1 should equal(true)
    result2 should equal(true)
    result3 should equal(true)
  }

  "<=" should "give correct result" in {
    val five = Five()

    val result1 = five <= 2
    val result2 = five() <= 2
    val result3 = Five() <= 2

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 <= five
    val result2 = 2 <= five()
    val result3 = 2 <= Five()

    result1 should equal(true)
    result2 should equal(true)
    result3 should equal(true)
  }

  ">=" should "give correct result" in {
    val five = Five()

    val result1 = five >= 2
    val result2 = five() >= 2
    val result3 = Five() >= 2

    result1 should equal(true)
    result2 should equal(true)
    result3 should equal(true)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 >= five
    val result2 = 2 >= five()
    val result3 = 2 >= Five()

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
  }

  "==" should "give correct result" in {
    val five = Five()

    val result1 = five == 2
    val result2 = five() == 2
    val result3 = Five() == 2
    val result4 = Five() == Five()
    val result5 = Five() == five
    val result6 = Five() == five()
    val result7 = Five() == 5

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
    result4 should equal(true)
    result5 should equal(true)
    result6 should equal(true)
    result7 should equal(true)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 == five
    val result2 = 2 == five()
    val result3 = 2 == Five()
    val result4 = 5 == Five()
    val result5 = 5 == five()
    val result6 = 5 == five

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
    result4 should equal(true)
    result5 should equal(true)
    result6 should equal(true)
  }

  "==" should "give correct result" in {
    val five = Five()

    val result1 = five == 2
    val result2 = five() == 2
    val result3 = Five() == 2
    val result4 = Five() == Five()
    val result5 = Five() == five
    val result6 = Five() == five()
    val result7 = Five() == 5

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
    result4 should equal(true)
    result5 should equal(true)
    result6 should equal(true)
    result7 should equal(true)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 == five
    val result2 = 2 == five()
    val result3 = 2 == Five()
    val result4 = 5 == Five()
    val result5 = 5 == five()
    val result6 = 5 == five

    result1 should equal(false)
    result2 should equal(false)
    result3 should equal(false)
    result4 should equal(true)
    result5 should equal(true)
    result6 should equal(true)
  }

  "!=" should "give correct result" in {
    val five = Five()

    val result1 = five != 2
    val result2 = five() != 2
    val result3 = Five() != 2
    val result4 = Five() != Five()
    val result5 = Five() != five
    val result6 = Five() != five()
    val result7 = Five() != 5

    result1 should equal(true)
    result2 should equal(true)
    result3 should equal(true)
    result4 should equal(false)
    result5 should equal(false)
    result6 should equal(false)
    result7 should equal(false)
  }

  it should "give correct result (2)" in {
    val five = Five()

    val result1 = 2 != five
    val result2 = 2 != five()
    val result3 = 2 != Five()
    val result4 = 5 != Five()
    val result5 = 5 != five()
    val result6 = 5 != five

    result1 should equal(true)
    result2 should equal(true)
    result3 should equal(true)
    result4 should equal(false)
    result5 should equal(false)
    result6 should equal(false)
  }

  "The Law of Fives" should "never be wrong" in {
    val five = Five()
    five.law should equal("The Law of Fives states simply that: All things happen in fives, or are divisible by or are multiples of five, or are somehow directly or indirectly appropriate to 5. The Law of Fives is never wrong.")
  }

  "convertTo" should "give correct result" in {
    val five = Five()
    five.convertTo(3) should equal(3)
    five.convertTo(5) should equal(5)
    five.convertTo(665456) should equal(665456)
  }

  "upHigh" should "be superscripted 5" in {
    val five = Five()
    five.upHigh should equal("⁵")
  }

  "downLow" should "be superscripted 5" in {
    val five = Five()
    five.downLow should equal("₅")
  }

  "roman" should "be 'V'" in {
    val five = Five()
    five.roman should equal("V")
  }
  
  "arabic" should "be 'خمسة'" in {
    val five = Five()
    five.arabic should equal("خمسة")
  }

  "azerbaijani" should "be 'beş'" in {
    val five = Five()
    five.azerbaijani should equal("beş")
  }
  
  "basque" should "be a 'bost'" in {
    val five = Five()
    five.basque should equal("bost")
  }

  "belarusian" should "be 'пяць'" in {
    val five = Five()
    five.belarusian should equal("пяць")
  }

  "bosnian" should "be 'pet'" in {
    val five = Five()
    five.bosnian should equal("pet")
  }

  "bulgarian" should "be 'пет'" in {
    val five = Five()
    five.bulgarian should equal("пет")
  }

  "catalan" should "be 'cinc'" in {
    val five = Five()
    five.catalan should equal("cinc")
  }

  "chinese" should "be '五'" in {
    val five = Five()
    five.chinese() should equal("五")
  }

  it should "be 'wǔ' in Pīnyīn chinese" in {
    val five = Five()
    five.chinese("pinyin") should equal("wǔ")
  }

  it should "be '伍' in financial chinese" in {
    val five = Five()
    five.chinese("financial") should equal("伍")
  }

  "choctaw" should "be 'tahlapi'" in {
    val five = Five()
    five.choctaw should equal("tahlapi")
  }

  "croatian" should "be 'pet'" in {
    val five = Five()
    five.croatian should equal("pet")
  }

  "czech" should "be 'pět'" in {
    val five = Five()
    five.czech should equal("pět")
  }

  "dothraki" should "be 'mek'" in {
    val five = Five()
    five.dothraki should equal("mek")
  }

  "dovah" should "be 'hen'" in {
    val five = Five()
    five.dovah should equal("hen")
  }

  "dutch" should "be 'vijf'" in {
    val five = Five()
    five.dutch should equal("vijf")
  }

  "elvish" should "be 'lempë'" in {
    val five = Five()
    five.elvish() should equal("lempë")
  }

  it should "be 'lempë' in Quenya elvish" in {
    val five = Five()
    five.elvish("quenya") should equal("lempë")
  }

  it should "be 'leben' in Sindarin elvish" in {
    val five = Five()
    five.elvish("sindarin") should equal("leben")
  }

  "english" should "be 'five'" in {
    val five = Five()
    five.english should equal("five")
  }

  "esperanto" should "be 'kvin'" in {
    val five = Five()
    five.esperanto should equal("kvin")
  }

  "estonian" should "be 'viis'" in {
    val five = Five()
    five.estonian should equal("viis")
  }

  "finnish" should "be 'viisi'" in {
    val five = Five()
    five.finnish should equal("viisi")
  }

  "french" should "be 'cinq'" in {
    val five = Five()
    five.french should equal("cinq")
  }

  "german" should "be 'fünf'" in {
    val five = Five()
    five.german should equal("fünf")
  }

  "greek" should "be 'πέντε'" in {
    val five = Five()
    five.greek should equal("πέντε")
  }

  "hebrew" should "be 'חמש'" in {
    val five = Five()
    five.hebrew should equal("חמש")
  }

  "hindi" should "be 'पांच'" in {
    val five = Five()
    five.hindi should equal("पांच")
  }

  "hungarian" should "be 'öt'" in {
    val five = Five()
    five.hungarian should equal("öt")
  }

  "icelandic" should "be 'fimm'" in {
    val five = Five()
    five.icelandic should equal("fimm")
  }

  "indonesian" should "be 'lima'" in {
    val five = Five()
    five.indonesian should equal("lima")
  }

  "irish" should "be 'cúig'" in {
    val five = Five()
    five.irish should equal("cúig")
  }

  "italian" should "be 'cinque'" in {
    val five = Five()
    five.italian should equal("cinque")
  }

  "japanese" should "be '五'" in {
    val five = Five()
    five.japanese should equal("五")
  }

  "kannada" should "be 'ಐದು'" in {
    val five = Five()
    five.kannada should equal("ಐದು")
  }

  "klingon" should "be 'vagh'" in {
    val five = Five()
    five.klingon should equal("vagh")
  }

  "korean" should "be '오'" in {
    val five = Five()
    five.korean should equal("오")
  }

  "latin" should "be 'quinque'" in {
    val five = Five()
    five.latin should equal("quinque")
  }

  "latvian" should "be 'pieci'" in {
    val five = Five()
    five.latvian should equal("pieci")
  }

  "lithuanian" should "be 'penki'" in {
    val five = Five()
    five.lithuanian should equal("penki")
  }

  "maltese" should "be 'ħamsa'" in {
    val five = Five()
    five.maltese should equal("ħamsa")
  }

  "mongolian" should "be 'таван'" in {
    val five = Five()
    five.mongolian should equal("таван")
  }

  "nepali" should "be 'पाँच'" in {
    val five = Five()
    five.nepali should equal("पाँच")
  }

  "norwegian" should "be 'fem'" in {
    val five = Five()
    five.norwegian should equal("fem")
  }

  "persian" should "be 'پنج'" in {
    val five = Five()
    five.persian should equal("پنج")
  }

  "piglatin" should "be 'ivefay'" in {
    val five = Five()
    five.piglatin should equal("ivefay")
  }

  "polish" should "be 'pięć'" in {
    val five = Five()
    five.polish should equal("pięć")
  }

  "portuguese" should "be 'cinco'" in {
    val five = Five()
    five.portuguese should equal("cinco")
  }

  "punjabi" should "be 'ਪੰਜ'" in {
    val five = Five()
    five.punjabi should equal("ਪੰਜ")
  }

  "romanian" should "be 'cinci'" in {
    val five = Five()
    five.romanian should equal("cinci")
  }

  "romansh" should "be 'tchingt'" in {
    val five = Five()
    five.romansh should equal("tchings")
  }

  "russian" should "be 'пять'" in {
    val five = Five()
    five.russian should equal("пять")
  }

  "serbian" should "be 'pet'" in {
    val five = Five()
    five.serbian should equal("pet")
  }

  "sinhala" should "be 'පහ'" in {
    val five = Five()
    five.sinhala should equal("පහ")
  }

  "slovak" should "be 'päť'" in {
    val five = Five()
    five.slovak should equal("päť")
  }

  "slovenian" should "be 'pet'" in {
    val five = Five()
    five.slovenian should equal("pet")
  }

  "spanish" should "be 'cinco'" in {
    val five = Five()
    five.spanish should equal("cinco")
  }

  "swedish" should "be 'fem'" in {
    val five = Five()
    five.swedish should equal("fem")
  }

  "tamil" should "be 'ஐந்து'" in {
    val five = Five()
    five.tamil should equal("ஐந்து")
  }

  "telugu" should "be 'ఐదు'" in {
    val five = Five()
    five.telugu should equal("ఐదు")
  }

  "thai" should "be 'ห้า'" in {
    val five = Five()
    five.thai should equal("ห้า")
  }

  "turkish" should "be 'beş'" in {
    val five = Five()
    five.turkish should equal("beş")
  }

  "ukrainian" should "be 'п’ять'" in {
    val five = Five()
    five.ukrainian should equal("п’ять")
  }

  "morseCode" should "be '.....'" in {
    val five = Five()
    five.morseCode should equal(".....")
  }

  "quinary" should "be '10'" in {
    val five = Five()
    five.base(5) should equal("10")
  }

  "quaternary" should "be '11'" in {
    val five = Five()
    five.base(4) should equal("11")
  }

  "binary" should "be '101'" in {
    val five = Five()
    five.binary should equal("101")
  }

  "octal" should "be '5'" in {
    val five = Five()
    five.octal should equal("5")
  }

  "hexadecimal" should "be '5'" in {
    val five = Five()
    five.hex should equal("5")
  }

  "mdFive" should "be '30056e1cab7a61d256fc8edd970d14f5'" in {
    val five = Five()
    five.mdFive should equal("30056e1cab7a61d256fc8edd970d14f5")
  }

  "golden" should "be 1.618033988749895" in {
    val five = Five()
    five.golden should equal(1.618033988749895)
  }

  "negative" should "be -5" in {
    val five = Five()
    five.negative should equal(-5)
  }

  "loud" should "be 'FIVE' in english" in {
    val five = Five()
    five.loud() should equal("FIVE")
  }

  it should "be 'IVEFAY' in piglatin" in {
    val five = Five()
    five.loud("piglatin") should equal("IVEFAY")
  }

  it should "be '' in russian" in {
    val five = Five()
    five.loud("russian") should equal("ПЯТЬ")
  }

  "smooth" should "be 'S'" in {
    val five = Five()
    five.smooth should equal("S")
  }

  "oclock" should "be '\uD83D\uDD54'" in {
    val five = Five()
    five.oclock should equal("\uD83D\uDD54")
  }

  "oclockSomewhere" should "be '\uD83C\uDF7A'" in {
    val five = Five()
    five.oclockSomewhere should equal("\uD83C\uDF7A")
  }

  "guys" should "be '\uD83C\uDF54'" in {
    val five = Five()
    five.guys should equal("\uD83C\uDF54")
  }

  "bucks" should "be '$5.00'" in {
    val five = Five()
    five.bucks should equal("$5.00")
  }

  "euro" should "be 5€" in {
    val five = Five()
    five.euro should equal("5,00 €")
  }

  "r" should "be £5" in {
    val five = Five()
    five.r should equal("£5")
  }

  "dollar" should " be $5" in {
    val five = Five()
    five.dollar should equal("$5")
  }

  "high" should "be 'o/'" in {
    val five = Five()
    five.high should equal("o/")
  }

  "tooSlow" should "still be five" in {
    val five = Five()
    five.tooSlow should equal(5)
  }

  it should "take longer than 500 milliseconds to be returned" in {
    val five = Five()
    val now = new Date().getTime
    val slowFive = five.tooSlow
    val finishes = new Date().getTime
    val diff = finishes - now

    diff should be > 5L
  }

  "jackson" should "be the five members of the 70's pop family group the Jackson 5" in {
    val five = Five()
    five.jackson should equal(List("Jackie", "Tito", "Jermaine", "Marlon", "Michael"))
  }

  "fab" should "be the 1991-1993 Michigan Mens Basketball Team" in {
    val five = Five()
    five.fab should equal(List("Juwan Howard", "Ray Jackson", "Jimmy King", "Jalen Rose", "Chris Webber"))
  }

  "members" should "be the 90's boy band 5ive" in {
    val five = Five()
    five.members should equal(List("Sean Conlon", "Ritchie Neville", "Scott Robinson", "Jason 'J' Brown", "Abz Love"))
  }

  "discography" should "be the studio albums released by the 90's boy band 5ive" in {
    val five = Five()
    five.discography should equal(List("5ive", "Invincible", "Kingsize"))
  }

  "singles" should "be the singles released by the 90's boy band 5ive" in {
    val five = Five()
    five.singles should equal(List("Slam Dunk (Da Funk)", "When the Lights Go Out", "Got the Feelin'", "Everybody Get Up", "It's the Things You Do", "Until the Time Is Through", "If Ya Gettin' Down", "Keep On Movin'", "Don't Wanna Let You Go", "We Will Rock You", "Let's Dance", "Closer to Me", "Rock the Party", "I Wish It Could Be Christmas Everyday"))
  }

  "furious" should "be the five fictional members of the ninja group Furious Five from the movie Kung-Fu Panda" in {
    val five = Five()
    five.furious should equal(List("Tigress", "Viper", "Crane", "Monkey", "Mantis"))
  }

  "famous" should "be the five central characters of the series of Enid Blighton novels" in {
    val five = Five()
    five.famous should equal(List("Julian", "Dick", "George", "Anne", "Timmy"))
  }

  "fiveFiveFive" should "be Interstella 5555: The 5tory of the 5ecret 5tar 5ystem" in {
    val five = Five()
    five.fiveFiveFive should equal("Interstella 5555: The 5tory of the 5ecret 5tar 5ystem")
  }

  "luniz" should "be the song title of their most famous hit" in {
    val five = Five()
    five.luniz should equal("I Got 5 on It")
  }

  "funk" should "be a group of bad boys with the power to rock you" in {
    val five = Five()
    five.funk should equal("5 bad boys with the power to rock you")
  }

  "isFive" should "still be true for 5" in {
    val five = Five()
    five.isFive(5) should equal(true)
  }

  it should "still be false if nonequal to 5" in {
    val five = Five()
    five.isFive(6) should equal(false)
  }

  "filter" should "filter 5s" in {
    val five = Five()
    five.filter(List(5, 4, 5)) should contain allElementsOf List(5, 5)
  }

  "map" should "replace all elements with 5" in {
    val five = Five()
    five.map(List(1, 2, 3)) should contain allElementsOf List(5, 5, 5)
  }

  "reduce" should "give 5" in {
    val five = Five()
    five.reduce(List(1, 2, 3)) should equal(5)
  }

  "rot" should "rotate strings" in {
    val five = Five()
    five.rot("0123456789") should equal("5678901234")
  }

  it should "rotate lists" in {
    val five = Five()
    five.rot(List(1, 2, 3, 4, 5, 6)) should equal(List(6, 1, 2, 3, 4, 5))
  }

  it should "not rotate emoticons still be five" in {
    val five = Five()
    five.rot("$_$ -,- @.@?") should equal("$_$ -,- @.@?")
  }

  "factorial" should "be 120" in {
    val five = Five()
    five.factorial should equal(120)
  }

//  var fiveEmitter = five.emitter();
//  var emitterTested = false;
//
//  fiveEmitter.on('five', function(e) {
//    assert.equal(5, e, 'Five event emitter should only emit 5');
//    emitterTested = true;
//  });
//
//  setTimeout(function() {
//    if(!emitterTested) {
//      console.error('The five event emitter did something unexpected! I hope you\'re not using this feature in production');
//      process.exit(1);
//    }
//    process.exit(0);
//  }, 100);
//
//  var asyncTests = 1;
//  five.async(function(err, five) {
//    assert.equal(err, null, 'Async should not result in an error.');
//    assert.equal(five, 5, 'Async should pass 5 to callback.');
//    asyncTests--;
//  });
//
//  setInterval(function() {
//    if (!asyncTests) {
//      process.exit(0);
//    }
//  }, 100);
}

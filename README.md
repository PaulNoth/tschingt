# Tschingt
A library to overcomplicate `5`.
Inspired with [five.js](https://github.com/jackdclark/five) and reimplemented from Javascript to Scala.

*Tschingt* means 5 (five) in [romansh](https://en.wikipedia.org/wiki/Romansh_language).

The differences against the javascript are:

- `slovakian` method renamed to `slovak`

- added `romansh` because library name

--------

### Usage
##### Build.sbt
```sbtshell
libraryDependencies += "com.pidanic" % "tschingt_2.12" % "0.8.1"
```
##### Import the module
```scala
import com.pidanic.tschingt.Five
```

##### Basic 5
```scala
Five() // 5

val five = Five()
five    // 5
five() // 5
```

## The Law of Fives
```scala
five.law // The Law of Fives states simply that: All things happen in fives, or are divisible by or are multiples of five, or are somehow directly or indirectly appropriate to 5. The Law of Fives is never wrong.
```

##### Addition
```scala
five() + five() // 10
```

##### Multiplication
```scala
five() * five() // 25
```

##### Division
```scala
five() / five() // 1
```
##### Combinatorics
```scala
five.factorial // 120
```

##### Different sorts of 5
```scala
five.upHigh // ⁵
five.downLow // ₅
five.tooSlow // 5, with a ~500 millisecond delay
five.roman // V
five.morseCode // .....
five.negative // -5
five.loud() // FIVE
five.loud("piglatin") // IVEFAY
five.smooth // S
five.bucks // $5.00
```

##### Cryptography
```scala
five.mdFive // 30056e1cab7a61d256fc8edd970d14f5
five.golden // 1.618033988749895
```

##### 5 goes multilingual
```scala
five.arabic // خمسة
five.azerbaijani // beş
five.basque // bost
five.belarusian // пяць
five.bosnian // pet
five.bulgarian // пет
five.catalan // cinc
five.chinese() // 五
five.chinese("pinyin") // wǔ
five.chinese("financial") // 伍
five.choctaw // tahlapi
five.croatian // pet
five.czech // pět
five.dothraki // mek
five.dovah // hen
five.dutch // vijf
five.elvish() // lempë
five.elvish("quenya") // lempë
five.elvish("sindarin") // leben
five.english // five
five.esperanto // kvin
five.estonian // viis
five.finnish // viisi
five.french // cinq
five.german // fünf
five.greek // πέντε
five.hebrew // חמש
five.hindi // पांच
five.hungarian // öt
five.icelandic // fimm
five.indonesian // lima
five.irish // cúig
five.italian // cinque
five.japanese // 五
five.kannada // ಐದು
five.klingon // vagh
five.korean // 오
five.latin // quinque
five.latvian // pieci
five.lithuanian // penki
five.maltese // ħamsa
five.mongolian // таван
five.nepali // पाँच
five.norwegian // fem
five.persian // پنج
five.piglatin // ivefay
five.polish // pięć
five.portuguese // cinco
five.punjabi // ਪੰਜ
five.romanian // cinci
five.romansh // tschingt
five.russian // пять
five.serbian // pet
five.sinhala // පහ
five.slovak // päť
five.slovenian // pet
five.spanish // cinco
five.swedish // fem
five.tamil // ஐந்து
five.telugu // ఐదు
five.thai // ห้า
five.turkish // beş
five.ukrainian // п’ять
five.welsh // pump
```

##### Different radices
```scala
five.binary // 101
five.octal // 5
five.hex // 5
five.base(4) // 11
five.base(3) // 12
```

##### Assertion
```scala
five.isFive(10) // false
```

##### Filter, Map and Reduce
```scala
five.filter(List(5, 1, 5)) // List(5, 5)
five.map(List(1, 2, 3)) // List(5, 5, 5)
five.reduce(List(1, 2, 3)) // 5
```

##### Novelty
```scala
five.fab // List("Juwan Howard", "Ray Jackson", "Jimmy King", "Jalen Rose", "Chris Webber")
five.jackson // List("Jackie", "Tito", "Jermaine", "Marlon", "Michael")
five.furious // List("Tigress", "Viper", "Crane", "Monkey", "Mantis")
five.luniz // "I Got 5 on It"
five.r // "£5"
five.funk // "5 bad boys with the power to rock you"
five.high // "o/"
five.members // List("Sean Conlon", "Ritchie Neville", "Scott Robinson", "Jason 'J' Brown", "Abz Love")
five.discography // List("5ive", "Invincible", "Kingsize")
five.singles // List("Slam Dunk (Da Funk)", "When the Lights Go Out", "Got the Feelin'", "Everybody Get Up", "It's the Things You Do", "Until the Time Is Through", "If Ya Gettin'" Down", "Keep On Movin'", "Don't Wanna Let You Go", "We Will Rock You", "Let's Dance", "Closer to Me", "Rock the Party", "I Wish It Could Be Christmas Everyday")
five.famous // List("Julian", "Dick", "George", "Anne", "Timmy")
five.fiveFiveFive // "Interstella 5555: The 5tory of the 5ecret 5tar 5ystem"
```

##### Rotation
```scala
five.rot("five.js") //"knaj.ox"
```

##### Asynchronous Usage
```scala
five.async(five => {
    // five.isSuccess
	// five == 5
})
```

##### Unicode
```scala
five.oclock // "🕔"

five.oclockSomewhere // "🍺"

five.guys // "🍔"
```

##### Money
```scala
five.euro // "5€"
five.dollar // "$5"
```


### Development
##### The code
All of the logic & heavy lifting is achieved in one self-contained file:
```
Five.scala
```

##### Tests
```
sbt test
```
### License
MIT

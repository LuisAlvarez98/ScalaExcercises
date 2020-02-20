package lectures.part1basics

object ValuesVariablesTypes extends App {
  //val x: Int = 42 compiler can infer types
  val x = 42
  println(x)
  // VALS ARE IMMUTABLE
  val aString: String = "Hello"
  //; used to seperate expresions

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4617
  val aLong: Long = 4909890809L
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.0

  var aVariable: Int = 4
  aVariable = 2 //side effects

  //Functional programming not working with variables



}

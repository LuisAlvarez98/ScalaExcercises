package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 //Expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  // == != > >= < <=
  var aVariable = 2
  aVariable +=3
  // Instructions(Do) vs Expressions (Value)

  // IF expr
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //If Expression
  println(aConditionedValue)
  println( if(aCondition) 5 else 3 )

  var i = 0
  while ( i < 10){
    println(i)
    i+=1
  }

  //Avoid loops
  //Everything in Scala is an Expression

  val aWeirdValue = (aVariable = 3) //Unit == void

  //side effects: println(), whiles, reassigning

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "Goodbye" //Value of the codeblock
    //can have definition of variable
  }

}

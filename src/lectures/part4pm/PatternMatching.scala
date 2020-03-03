package lectures.part4pm

import scala.util.Random

object PatternMatching extends App{

  val random =  new Random
  val x = random.nextInt(10)

  val description = x match {
     case 1 => "the ONE"
     case 2 => "double or nothing"
     case 3 => "third time"
     case _ => "Something else" // _= Wildcard
  }

  println(x)
  println(description)

  // 1. Decompose values
  case class Person(name: String, age:Int)
  val bob = Person("Bob", 20)

  val greeting = bob match{
      case Person(n, a)  if a < 21 => s"Hi, my name is $n and I am $a years old."
      case Person(n, a) => s"Hi, my name is $n and I am $a years old."
      case _ => "I don't know who I am"
  }
  println(greeting)

  /*
    1. Cases are matched in order
    2. What if no cases match? Match error
    3. type of the PM expression? unified type of all the types in all the cases
   */
  // PM on sealed hierarchies

}

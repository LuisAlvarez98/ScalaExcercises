package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

    def factorial(n: Int): Int={
      if(n <=1) 1
      else n * factorial(n-1)
    }

  def anotherFactorial(n: Int):BigInt ={
    @tailrec
    def factHelpter(x: Int, accumulator:BigInt): BigInt={
      if(x<=1) accumulator
      else factHelpter(x-1, x * accumulator) // TAIL RECURSIVE = use recursive call as the last expression
    }
    factHelpter(n,1)
  }

  def concat(aString: String, n: BigInt, acc: String): String={
    if(n <= 0) acc
    else concat(aString, n-1, aString + acc)
  }
  println(concat("h",2000,""))

}
//Recursive depth is too big (Stackoverflow Error)
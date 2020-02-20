package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String ={
    a + " " + b
  }

  println(aFunction("hello",3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  //Functional Programming -> Recursion

 def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int) = {
    def aSmallerFunction(a: Int, b: Int) : Int = a + b

    aSmallerFunction(n, n-1)
  }

  //Greeting function
  def greetingFunction(name: String, age: Int) = {
    "Hi, my name is " + name + "and I am " + age + "years old."
  }
  //Factorial function
  def factorialFunction(n: Int): Int ={
    if(n <= 0) 1
    else n * factorialFunction(n-1)
  }
  //Fib number
  def fib(n: Int): Int ={
    if(n <= 2) 1
    else fib(n -1) + fib(n-2)
  }
  println(fib(8))
  //Study
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean=
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
}

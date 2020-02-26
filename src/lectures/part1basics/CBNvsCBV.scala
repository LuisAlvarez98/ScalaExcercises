package lectures.part1basics

object CBNvsCBV extends App {
  //Gets the value and then computes the function
  //- value is computed before call
  //- same value used everywhere
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }
  //Calls the System.nanoTime -> is evaluated two times
  // Lazy evaluation
  //- expression  is passed literally
  //- expression is evaluated at every use within
  def calledByName(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}

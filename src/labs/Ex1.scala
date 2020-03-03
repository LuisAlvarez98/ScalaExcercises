package labs

import definitions.de._

object Ex1 extends App {
  def parallel[A, B](a: => A, b: => B): (A, B) = {
    var resultA: A = 1.asInstanceOf[A]
    var resultB: B = 1.asInstanceOf[B]
    println(a)
    println(resultB)
    val threadA = thread {
      a
    }
    println(threadA)
    val threadB = thread {
      b
    }
    println(threadB)
    (resultA, resultB)
  }
  val task1 = {3+4}
  val task2 = {3*1}
  println (parallel (task1, task2))
  log ("FIN")

}

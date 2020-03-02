package lectures.part1basics

object DefaultArgs extends App {
  def func(n: Int, acc: Int = 1): Int = {
    acc
  }

  val t = func(n = 10, acc = 10)
  println(t)
}

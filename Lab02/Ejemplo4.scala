

object Ejemplo4 extends App {
  def removeNegativeNumbers (a: Array[Int]) : Array[Int]={
    a.filter(num => num >= 0)
  }
  val b = Array(2, -1, 3, 4, -5)
  val res = removeNegativeNumbers(b)
  res.foreach(println _)
}


object Ejemplo3 extends App {
  def potencia (x: Double, n: Int): Double = n match {
    case n if n % 2 == 0 && n > 0 => scala.math.pow(x,n/2) * scala.math.pow(x,n/2)
    case n if n == 0 => 1
    case n if !(n % 2 == 0) && n > 0 => x * scala.math.pow(x,n-1)
    case n if n < 0 => 1/(scala.math.pow(x,-n))
    case _=> 0
  }
  println (" 4 elevado a -1: ", potencia (4, -1))
  println (" 4 elevado a 0: ", potencia (4, 0))
  println (" 4 elevado a 3: ", potencia (4, 3))
  println (" 4 elevado a 2: ", potencia (4, 2))
}
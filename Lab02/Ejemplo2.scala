

object Ejemplo2 extends App {
 def obtenerSuma(args: Int *) : Int = {
      (0/:args) (_+_)
}

 println ("Suma obtenida " + obtenerSuma(1,2,3,4,5,6))
}


object helloScala {
  def max(x: Int, y: Int): Int = {
    if(x > y) x
    else y
  }
  
  def main(args: Array[String]){
    // for in scala
     for( a <- 10 to 0 by -1){
         println( "Value of a: " + a );
      }
    //You can create three instances of a string by just * by 3
    println("string" * 3)
  }
}
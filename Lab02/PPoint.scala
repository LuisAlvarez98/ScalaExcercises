
 class Point(x:Int, y:Int){
   val iX= x;
   val iY = y;
   def +(newpt:Point)=new Point(iX+newpt.iX,iY+newpt.iY)
   def -(newpt:Point)=new Point(iX-newpt.iX,y-newpt.iY)
   //override def toString="Point("+x+","+y+")" 
}
object PPoint {
   def main(args: Array[String]){
     val p1 = new Point(3,4)
     val p2 = new Point(7,2)
     val p3 = new Point(-2,2)
     val p4 = p1+p2-p3
     println(p4)
  }
}
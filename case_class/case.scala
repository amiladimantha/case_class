import scala.math.{sqrt,pow}

object case extends App{

    case class Point(a:Int, b:Int){
        def x: Int = a
        def y: Int = b
        def +(p : Point) = new Point(this.x + p.x,this.y + p.y)
        def move(c: Int, d: Int) = new Point(this.x + c,this.y + d)
        def distance(next: Point): Double = sqrt(pow(x - next.x, 2) + pow(y - next.y, 2))
        def Invert() = new Point(this.y,this.x)
        def Print : String = x.toString + " " + y.toString
    }
    
    def dis(a : Point, b : Point) : Double = sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2))

    val A = new Point(2,2)
    val B = new Point(7,9)
    println((A+B).Print)
    println(A.Print)
    println(B.Print)
    
    println(A.move(1,1).Print)
    val C = A.move(1,1)
    println(C.Print)
    println(A.distance(B))
    println(dis(A,B))
    val D = A.Invert()
}

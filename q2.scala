def main(args : Array[String]): Unit ={
    val a=2
    val b=3
    val c=4
    val d=5
    val k=4.3f
    val g=5

    b-= 1
    val A = b * a + c * d
    d-=1
    
    val B = a
    a+=1
    
    val C = (-2 * (g-k) + c)
    val D = c
    c+=1

    c+=1
    val E = c * a
    a+=1

    println(s"$A")
    println(s"$B")
    println(s"$C")
    println(s"$D")
    println(s"$E")
}

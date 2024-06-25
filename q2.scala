def main(args : Array[String]): Unit ={
    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f
    var g=5

    b-= 1
    var A = b * a + c * d
    d-=1
    
    var B = a
    a+=1
    
    var C = (-2 * (g-k) + c)
    var D = c
    c+=1

    c+=1
    var E = c * a
    a+=1

    println(s"$A")
    println(s"$B")
    println(s"$C")
    println(s"$D")
    println(s"$E")
}

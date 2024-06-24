object TakeHomeSalary{
    def grossPay(hrs : Double, ot : Double) : Double = {
        250*hrs + 85*ot
    }

    def tax(income : Double) : Double = {
        income * 12/100
    }

    def netPay(hrs : Double, ot: Double): Double = {
        grossPay(hrs, ot) - tax(grossPay(hrs, ot))
    }

    def main(args : Array[String]): Unit = {
        val takeHomeSal = netPay(40, 30)
        println(s"Take home salary is : $takeHomeSal")
    }
}
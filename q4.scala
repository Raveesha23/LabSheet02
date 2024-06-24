object TicketPriceCalculator{
    def attendees(price : Double) : Double = {
        150 + (15-price) / 5*20
    }

    def revenue(price : Double) : Double = {
        attendees(price) * price
    }

    def cost(price : Double) : Double = {
        500 + 3* attendees(price)
    }

    def profit(price : Double) = {
        revenue(price) - cost(price)
    }

    def main(args : Array[String]): Unit = {
        val opt1 = profit(20)
        val opt2 = profit(25)
        val opt3 = profit(30)
        val opt4 = profit(35)

        println(s"Profit for Rs.20 : $opt1")
        println(s"Profit for Rs.25 : $opt2")
        println(s"Profit for Rs.30 : $opt3")
        println(s"Profit for Rs.35 : $opt4")

        println(s"Highest profit is for the ticket price : 30")
    }

}
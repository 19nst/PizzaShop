class PizzaMSK(cheesePrice:Double, margaritaPrice:Double, hawaiianPrice:Double):
    PizzaShop(cheesePrice, margaritaPrice, hawaiianPrice) {


    override fun makeCheese() {

        cheeseCount++

        println("Thank you for ordering Cheese pizza. Come back to us in Moscow")
    }


    override fun makeMargarita() {

        margaritaCount++

        println("Thank you for ordering Margherita pizza. Come back to us in Moscow")
    }


    override fun makeHawaiian() {

        hawaiianCount++

        println("Thank you for ordering Hawaiian pizza. Come back to us in Moscow")
    }
}

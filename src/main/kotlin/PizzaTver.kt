class PizzaTver(cheesePrice:Double, margaritaPrice:Double, hawaiianPrice:Double):
    PizzaShop(cheesePrice, margaritaPrice, hawaiianPrice) {


    override fun makeCheese() {

        cheeseCount++

        println("Thank you for ordering Cheese Pizza. Come back to us in Tver")
    }


    override fun makeMargarita() {

        margaritaCount++

        println("Thank you for ordering Margherita Pizza. Come back to us in Tver")
    }


    override fun makeHawaiian() {

        hawaiianCount++

        println("Thank you for ordering Hawaiian Pizza. Come back to us in Tver")
    }
}

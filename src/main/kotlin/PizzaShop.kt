abstract  class PizzaShop(val cheesePrice:Double, val margaritaPrice:Double, val hawaiianPrice:Double) {


    var cheeseCount = 0
    var margaritaCount = 0
    var hawaiianCount = 0


    abstract fun makeCheese()
    abstract fun makeMargarita()
    abstract fun makeHawaiian()

    fun PizzaStatistics(){

        println("Cheese Pizza sold $cheeseCount")
        println("Margarita Pizza sold $margaritaCount")
        println("Hawaiian Pizza sold $hawaiianCount")


        val income = cheeseCount * cheesePrice + margaritaCount * margaritaPrice + hawaiianCount * hawaiianPrice
        println("Income: $income")
    }
}

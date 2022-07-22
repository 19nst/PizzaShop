abstract  class PizzaShop(val cheesePrice:Double, val margaritaPrice:Double, val hawaiianPrice:Double) {


    var cheeseCount = 0
    var margaritaCount = 0
    var hawaiianCount = 0


    abstract fun makeCheese()
    abstract fun makeMargarita()
    abstract fun makeHawaiian()
}

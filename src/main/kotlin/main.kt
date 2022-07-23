import kotlin.system.exitProcess

fun main() {


    val TverPizzaShop = PizzaTver(500.0, 550.0, 540.0)
    val MoscowPizzaShop = PizzaMSK(700.0, 780.0, 800.0)
    var CurrentPizzeria: PizzaShop


    while (true) {
        println("Hello. Choose a city:\n1.Tver\n2.Moscow\n\n0.Exit")


        when (readLine()) {
            "1" -> CurrentPizzeria = TverPizzaShop
            "2" -> CurrentPizzeria = MoscowPizzaShop
            "0" -> break

            else -> {
                println("You entered incorrect data")
                continue
            }
        }


        whatPizza(TverPizzaShop, CurrentPizzeria)
    }
}

private fun whatPizza(TverPizzaShop: PizzaTver, CurrentPizzeria: PizzaShop) {
    println(
        "Welcome to Pizzeria\nWhat kind of pizza do you want?\n" +
                "1.Cheesy\n2.Margarita\n3.Hawaiian\n0.Statistics Pizza"
    )


    when (readLine()) {
        "1" -> {
            TverPizzaShop.makeCheese()
            questionAboutDrink(CurrentPizzeria)
        }
        "2" -> {
            TverPizzaShop.makeMargarita()
            questionAboutDrink(CurrentPizzeria)
        }
        "3" -> {
            TverPizzaShop.makeHawaiian()
            questionAboutDrink(CurrentPizzeria)
        }
        "0" -> TverPizzaShop.PizzaStatistics()
        else -> {
            println("You entered incorrect data")
            exitProcess(0)
        }
    }
}

private fun questionAboutDrink(CurrentPizzeria:PizzaShop){
    if (CurrentPizzeria is Drink) {
        println("Would you like to order a drink?\n1.Yes\n2.No")

        val beverage = readLine()
        if (beverage == "1") {

            CurrentPizzeria.sellDrink()

        } else
            println("Here you go(")
    }
}
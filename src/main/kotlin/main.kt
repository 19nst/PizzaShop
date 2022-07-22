import kotlin.system.exitProcess

fun main() {


    val TverPizzaShop = PizzaTver(500.0,550.0,540.0)
    val MoscowPizzaShop = PizzaMSK(700.0,780.0,800.0)
    var CurrentPizzeria:PizzaShop


    println("Hello. Choose a city:\n1.Tver\n2.Moscow")


    when (readLine()) {
        "1" ->  CurrentPizzeria = TverPizzaShop
        "2" -> CurrentPizzeria = MoscowPizzaShop
        else -> {
            println("You entered incorrect data")
            exitProcess(0)
        }
    }


    println("Welcome to Pizzeria\nWhat kind of pizza do you want?\n" +
            "1.Cheesy\n2.Margarita\n3.Hawaiian")

    
    when (readLine()) {
        "1" -> TverPizzaShop.makeCheese()
        "2" ->  TverPizzaShop.makeMargarita()
        "3" ->  TverPizzaShop.makeHawaiian()
        else -> {
            println("You entered incorrect data")
            exitProcess(0)
        }
    }
}
import kotlin.random.Random
import kotlin.test.fail

fun main (){
    var repeat = true

    while (repeat) {
        DisplayWelcomeMessage()
        val userChoice: Int = readLine()?.toIntOrNull() ?: 0
        val aiChoice = Random.nextInt(1, 3)
        playGame(userChoice, aiChoice)
        repeat = playAgain()
    }

}

fun playGame(userChoice: Int, aiChoice: Int){
    println("You chose ${userChoice} and the AI chose ${aiChoice}.")
    val result = when (userChoice){
        aiChoice -> "You tied!"
        1 -> if (aiChoice == 2) "You lose!!" else "You Won!!"
        2 -> if (aiChoice == 3) "You lose!!" else "You Won!!"
        3 -> if (aiChoice == 1) "You lose!!" else "You Won!!"
        else -> "ERROR - INVALID ENTRY"
    }
    println(result)
}

fun playAgain(): Boolean {
    println("Play Again?")
    println("Y/N (Capital)")
    val userChoice: String = readLine() ?: ""

    return when (userChoice) {
        "Y" -> true
        else -> false
    }
    }





private fun DisplayWelcomeMessage() {
    println("Welcome to Rock Paper Scissors")
    println("Enter one of the following numbers")
    println("1 - Rock")
    println("2 - Paper")
    println("3 - Scissors")
    println("Enter your selection")
}

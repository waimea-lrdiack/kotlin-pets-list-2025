fun main() {
    val pets = mutableListOf<String>()

    // add some data

    pets.add("Dog")
    pets.add("Cat")
    pets.add("Fish")
    pets.add("Hamster")

    while (true) {
        // show current pets
        show(pets)

        // get user action
        val action = menu()
        // act upon it
        when (action) {
            'Q' -> break
            'A' -> getNewPet(pets)
            // 'D' -> deletePet()

        }

    }
}

/**
 * Show a menu and get the users choice
 * Return this as a char
 */

fun menu(): Char {
    println("[A]dd a new")
    println("[D]elete a pet")
    println("[Q]uit")

    val validChoices = "ADQ"

    while (true) {
        println("Choice: ")
        val input = readln()
        // typed nothing? try again
        if (input.isBlank()) continue
        // grab the first letter
        val choice = input.uppercase().first()

        // check for a valid option
        if (validChoices.contains(choice)) return choice
    }
}


/**
 * show a given list with numbered
 * entries (From 1 upwards)
 */

fun show(list: List<Any>) {
    for ((i, item)in list.withIndex()) {
        println("$i: ${list[i]}")
    }
}

/**
 * get a pet name from the user
 * add to the given list of pets
 */
fun getNewPet(pets: MutableList<String>) {
    val newPet = getString("New pet: ")
    pets.add(newPet)

}

/**
 * Function to get a string from the user
 * parameters:
 * - prompt - text to show the user
 * returns:
 * - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}
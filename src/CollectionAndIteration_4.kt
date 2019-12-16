//Kotlin is like most programing language
//he has collection like array, list and maps and it can use to group values
// together and then operate them later time

fun main() {
    val interstingThings = arrayOf("C","C++","Java","Flutter","Kotlin")
    println(interstingThings.size)
    println(interstingThings[4]) // get the value of array by indexes
    println(interstingThings.get(0))//get value of array by indexes
    println()
    // use basic for loop to get all data on array
    for (newThings in interstingThings){
       println(newThings)
    }
    println()
    // use foreach to get all data
    interstingThings.forEach {
        //it is a default variable that we use to get element when using foreach
        println("new $it")
    }
    println()
    // using lambda to replace the default variable
    interstingThings.forEach { newVariable ->
        println("lambda $newVariable")
    }
}
// here we will study how to use parameter on kotlin
fun sayHello(itemToGreet: String){
//    val msg = "Helo "+ itemToGreet
    // here we can see that the kotlin suggest use to change that String into template
    // so lets learn how to do it
    val msg ="Hello $itemToGreet"
    // and we will found that the out put same with before :)
    println(msg)
    // u can modify it like any type function do you want
}

fun greeting(greet: String, itemToGreet: String) = println("$greet $itemToGreet")
// to remember that if your function have much parameter
//then your parameter is doing to much so do it wisely
fun main() {
    sayHello("Kotlin")
    sayHello("World! ")
    greeting("Hey", "Kotlin")
}
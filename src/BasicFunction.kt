// use fun to assign that we want define a new function
fun getGreeting(): String = "Hello Kotlin" // single expression function
fun getGreeting1():String {
    return "Hello my Kotlin"
}
// unit on kotlin is essentially the absence of any useful type
// it similar that te return nothing useful
// the reason we use this because we don't want return anything
fun sayHello(): Unit{
    println(getGreeting())
    println(getGreeting1())
}

fun main() {
    println("Hello World!")
//  and to call those method it similar to java
    println(getGreeting())// and this method will return type to string
    sayHello() // so in here we can see the Unit in sayHello function
                // say that the unit is redundant return type
                // this is happen because the function that sayHello call is needed return type
                // and on sayHello with using unit it means that the function nothing return type useful so that's why it redundant
}
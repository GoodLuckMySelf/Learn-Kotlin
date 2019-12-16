// variable on Kotlin can be divide into 2
// 1. var
//      var is type variable on kotlin that can reassign on multiple
// 2. val
//      val is type variable on kotlin that can only once to be assign and read only variables
// and on kotlin variable can we declaration on outside of a function/method
// and here we don't need semicolon. bye bye semicolon :v

    var greeting: String? = null // this variable is a top level variable
// top level variable will work like a local variable

// the difference kotlin and java is, the type in kotlin are a non null by default
//so if we have a some variable that contain null value so we have add a question mark on that variable
// so what it is look like? lets check it out
    var nick: String? = null
// and on kotlin it can detect what type of variable it is, like this example
    val num = 1.4
// so if we want to add null value for variable with unknown type we must declaration null value first
    var varnum = null
fun main() {
    nick="azizi"
// creating if else statement
    if(nick != null){
        println(nick)
    }else{
        println("Hi!")
    }

//    control flow
//    on kotlin there is a some control flow that we call is "when" where this control flow similar with switch case on java
//    so lets check it out
    when(nick){
        null -> println("Nick is null")
        else -> println("nick has value "+nick)
    }

//    using if and when statement on a different action on kotlin
//    if and when can also we used as expression to assign a value to a local variable
//    this the example when we use if statement
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
//    this when we use when statement
    greeting = "Hello World!. Lets Learn Kotlin Language"
    val greetingToPrint1 = when(greeting){
        null -> "value is null"
        else -> greeting
    }
    println(greetingToPrint1)




}
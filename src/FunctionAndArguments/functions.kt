package FunctionAndArguments

fun main()
{
//    val result = add(4,5)
//    println(result)
//    evenOrOdd(14)
    printMessage(3) //argument
    printMessage()
}

fun add(num1:Int, num2:Int): Int
{
    val sum = num1 + num2
    return sum
}
fun evenOrOdd(num1:Int)
{
    val result = if(num1%2 == 0) "Even" else "Odd"
    println(result)
}
fun printMessage(count : Int = 2) //count -> parameter
{
    for (i in 1..count){
        println("Hello $i")
    }
}
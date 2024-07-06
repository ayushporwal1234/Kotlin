package FunctionAndArguments

import kotlin.math.pow

//function overloading --> same name differ parameters,
// either number of parameters is different
//or type is different

fun main()
{
    var fn = ::add1
   // println(fn(4.0, 5.0))
//    println(add1(1,2))
//    println(add1(1.3,2.4))
    fn = ::power
    println(fn(256.08,68.0))
}

//fun  add1(a: Int, b: Int) : Int
//{
//    return a+b
//}
fun  add1(a: Double, b: Double) : Double
{
    return a+b

}fun  power(a: Double, b: Double) : Double
{
    return a.pow(b)

}


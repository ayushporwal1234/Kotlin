package whenStatement

fun main()
{
//    val number = 5
//    //val result = number in 1..5  // upper bound included --> true
//    val result = number in 1 until 5 // upper bound excluded --> false
//        println(result)

            val number  = 15
          //when as expression
           val result = when(number) {
              11 -> "Eleven"
              12 -> "Twelve"
               in 13..19 -> "Teen"
               else -> " Human error"
           }
//            when(animal){
//                "Horse" -> println("It's Horse")
//                "Dog" -> println("It's Dog")
//                "Cat" -> println("It's Cat")
//               else -> println("It's Human")
//            }
            println(result)

   //for loop --> for(i in 10 downTo/step 2/until5)
}
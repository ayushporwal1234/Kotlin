package classAndObjects

fun main()
{
        val mustang = car("mustang","petrol",100)
        val posche = car("posche","petrol",400)
             mustang.drivecar()
              posche.brakecar()
}


class car ( val name : String, val type :String, var kmRun : Int )
{
    fun drivecar()
    {
        println("$name  is drive ")
    }
    fun brakecar()
    {
        println("$name  is braked")
    }
}
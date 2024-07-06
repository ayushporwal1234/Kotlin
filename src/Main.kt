//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Logical Operator
    val above70 = false;
    val knowsProgram = true;
    //&&(And :- both condition are true then it will true)
    var calledForInterview = above70 && knowsProgram
    println(calledForInterview)
    //||(OR :- any one condition are true then it will true)
    calledForInterview = above70 || knowsProgram
    println(calledForInterview)
    // false ! --> true
    val answer = false
    println(!answer)

    // short-circuiting

    var i = 10
    var j = 11
    var result = i == 10 || j++ == 11
    //Logic:- here or operator check the first condition which is "i" and then directly it will produce answer without check second condition
    println(i)
    println(j)

}
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
}
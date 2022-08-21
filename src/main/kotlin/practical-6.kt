fun main(args: Array<String>){
    sum()
    sub()
    mul()
    div()
}
fun sum(){
    var num1 =111
    var num2 = 2222
    var num3 = -222

    println("Addition of $num1 , $num2,$num3 is "+(num1+num2+num3))
}

fun sub(){
    var num1 =111
    var num2 = 2222
    var num3 = -222

    println("Subtraction of $num1 , $num2,$num3 is "+(num1-num2-num3))
}

fun mul(){
    var num1 =111
    var num2 = 2222
    var num3 = -222

    println("Multiplication of $num1 , $num2,$num3 is "+(num1*num2*num3))
}

fun div(){
    var num1 =2222
    var num2 = 111

    println("Division of $num1 , $num2 is "+(num1/num2))
}
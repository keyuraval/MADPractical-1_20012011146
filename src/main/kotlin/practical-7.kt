fun main(args: Array<String>) {
    print("Enter number to find factorial:")
    var number= readLine()!!.toInt()

    val factorial = fact(number)
    val factorial1=fact1(number)
    println("Factorial of $number=$factorial1")
    println("By Using Telrec Keyword,Factorial of $number = $factorial")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}

fun fact1(num: Int): Int {
    return if(num == 1){
        num
    }
    else{
        //function fact() calling itself
        num*fact(num-1)
    }
}
import java.math.BigInteger

fun factorail(num : Int): Int{
    if(num == 0){
        return 1
    }
    else{
        return (num * factorail(num-1))
    }
}

tailrec fun factorialWithTailrec(n: Int, run: Int = 1): Long{
    return if (n == 1) run.toLong() else factorialWithTailrec(n-1, run*n)
}

fun main(){
    print("Enter the Number to find Factorial: ")
    var number = readLine()!!.toInt()

    var fact = factorail(number)
    var facttrailrec = factorialWithTailrec(number)

    println("The Factorail of $number is $fact")
    println("By Tailrec Keyword, Factorial of $number is $facttrailrec")
}
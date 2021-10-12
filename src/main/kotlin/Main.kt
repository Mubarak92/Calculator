fun main() {

    println("Enter your first number: ")
    val number1 = readLine()!!.toInt()
    println("Enter your second  number: ")
    val number2= readLine()!!.toInt()
    var num:Int = 0

    println("Enter your Operator:")
    val ope = readLine()


   if (ope == "+"){
       num = number1 + number2
   }
    else if (ope == "-"){
       num = number1 - number2
   }
   else if (ope == "*"){
       num = number1 * number2
   }
   else if (ope == "/"){
       num = number1 / number2
   }
   else if (ope == "%"){
       num = number1 % number2
   }
    else {
        println("Error!")
   }

    println("the result is : $num")

}
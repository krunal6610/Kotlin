import java.util.Scanner

// Kotlin Program to Check Whether a Number is Even or Odd

fun main() {

    var scanner = Scanner(System.`in`)

    print("Enter Number: ")
    var num = scanner.nextInt()

    if (num%2==0){

        println("$num is even number")

    }else{

        println("$num is Odd number")
    }

}

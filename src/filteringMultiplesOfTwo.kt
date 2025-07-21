fun main() {
    val a = readln().toIntOrNull()?: 0
    val b = { c: Int -> c % 2 == 0 }
    println("${b}") //This prints the memory of the lambda value
    if(b(a)) {
        println("The entered value ${a} is divided by 2.")
        println("${b(a)}")//This prints the boolean value of the lambda value. If the number if even, prints as "true". Else "false".
    }
    else{
        println("The entered value ${a} is not divided by 2.")
    }
}
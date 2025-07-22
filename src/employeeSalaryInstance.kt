import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

// Write your code here
class RandomEmployeeGenerator(var minSalary:Int, var maxSalary:Int)
{
    val names = listOf("Nirmalrajaa", "Rohan", "Guru", "Sow_bro")
    fun generateEmployee() =
        Employee(names.random(),Random.nextInt(from = minSalary, until = maxSalary))

}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!")
    val names : MutableSet<String> = mutableSetOf("Nirmalrajaa", "Kathirvel")

    println(names)
    println(names::class)
    println("Enter elements separated by spaces:")

    val input = readLine() ?: ""
    val inputSet: MutableSet<String> = input.split(",").map { it.trim() }.toMutableSet()

    println(inputSet::class)

    println("You entered: $inputSet")


    for (elements in inputSet) {
        println("The length of input set is ${inputSet.count()}")
        println(elements)
    }
}
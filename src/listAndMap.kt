fun main() {
    println("Enter list items (comma-separated):")

    // Gets input using readline
    // Splits the input by delimiters using split function
    // Maps into the list datatype using map keyword and listOf() function
    val listInput = readLine()?.split(",")?.map { it.trim() } ?: listOf()

    // Maps the list created to another variable
    val immutableList = listInput // List<String> (immutable)

    println("Enter number of map entries:")

    // Gets the input using readline and checks it whether int or null
    // If null, then it assigns the value to n as 0
    val n = readLine()?.toIntOrNull() ?: 0

    // Immutabe map is generated using for loop from 1 to n
    // each and every time the system prompts a text to enter the key value
    val immutableMap = (1..n).map {
        println("${it}")

        // lamda is "it"
        println("type of it ${it::class}")
        println("Enter key for entry $it:")
        val name = readLine() ?: ""
        println("Enter value for entry $it:")
        val value = readLine() ?: ""
        name to value
    }.toMap() // Map<String, String> (immutable)

    println("Immutable List: $immutableList")
    println("Immutable Map: $immutableMap")
}

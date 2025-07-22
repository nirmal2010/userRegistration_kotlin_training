data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)

    // Creates an exact copy of user
    println(user.copy())
    // User(name=Alex, id=1)

    // Creates a copy of user with name: "Nirmalrajaa"
    println(user.copy("Nirmalrajaa"))
    // User(name=Nirmalrajaa, id=1)

    println(user.copy("Nirmalrajaa", id=23))
    // User(name=Nirmalrajaa, id=23)

    // Creates a copy of user with id: 3
    println(user.copy(id = 3))
    // User(name=Alex, id=3)

}
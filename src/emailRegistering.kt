import java.util.Locale.getDefault

fun registerUser(newUser:String, listUser: MutableCollection<String>): Boolean
{
    return if(listUser.contains(newUser))
    {
        println("Sorry the user $newUser has been already registered. Please use another email for registration.")
        false
    }
    else{
        println("A new user found. Proceeding to register the user")
        true
    }
}


fun main() {
    // List initialised with pre-filled email Id's
    val exeUsers: MutableList<String> = mutableListOf("nirmalrajaa20@gmail.com","nirmalrajaa2010@gmail.com")

    //gets new input from the user till the user hits Enter
    var newUser = readln() ?: ""

    newUser = newUser.lowercase(getDefault())

    //converts the input into list by separating input based on comma(,)
    val newUserSet : MutableList<String> = newUser.split(",").map{it.trim()}.toMutableList()
    // iterating the list of input and checking the user is in the existing list
    for (users in newUserSet) {

        //Calls another function to check the registration can be proceeded or not
        if(registerUser(users, exeUsers)) {

            exeUsers.add(users)
            println("$users has been added to the user list. Please check your mail to reset the password")
            println("The current user list is ${exeUsers}")
        }
    }
}
fun main(args: Array<String>) {
    println("Enter your name")
    var name = readLine()!!.toString()
    println("Enter your age")
    var age = readLine()!!.toInt()
    if (age >= 18) {
        println("Welcome to the Club" + name)
    } else{
        println("Cannot admit underage users")
    }
}
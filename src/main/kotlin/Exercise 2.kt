fun main(args: Array<String>) {
    println("Enter your age")
    var age = readLine()!!.toInt()
    var yearborn = 2023 - age
    println("You were born in the year" + +  yearborn)
}
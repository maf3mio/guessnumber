import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    println("Welcome in 'guess numbers'!(from 1 to 50)")
    val randomnum = (1..50).random()
    var count: Int = 0

    while (true) {
        println("Input number:")
        var inputnum: Int = reader.nextInt()

        if (inputnum == randomnum) {
            println("You guess!")
            count += 1
            println("You took $count guesses")
            break
        } else if (inputnum > randomnum) {
            println("Your number is too large!")
        } else {
            println("Your number is too small!")
        }
        count += 1
        println("Guess count: $count")
    }
}

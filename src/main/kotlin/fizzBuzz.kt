fun fizzBuzz() {
    for (num in 1..100) {
        var status = false
        if (num % 3 == 0) {
            print("Fizz")
            status = true
        }
        if (num % 5 == 0) {
            print("Buzz")
            status = true
        }
        if (!status)
            println(num)
        else println("")
    }
}

fun fizzBuzzRec(start: Int, end : Int) {
    if (start <= end) {
        val mod3 = (start % 3) == 0
        val mod5 = (start % 5) == 0
        if (mod3 && mod5) println("FizzBuzz")
        else if (mod3) println("Fizz")
        else if (mod5) println("Buzz")
        else println(start)
        fizzBuzzRec(start+1,end)
    }
}

fun main() {
   // fizzBuzz()
    fizzBuzzRec(1, 100)
}

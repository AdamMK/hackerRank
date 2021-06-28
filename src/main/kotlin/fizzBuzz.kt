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
        if (status == false)
            println(num)
        else println("")
    }
}

fun main() {
    fizzBuzz()
}

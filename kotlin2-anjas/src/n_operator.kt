fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    maybeNumber = null
    if (maybeNumber != null) {
        println(maybeNumber * 2)
    }

    var s1 = "Hello"
    var s2: String? = "World"
    println(s1.length)
    if (s2 != null) {
        println(s2.length)
    }
}
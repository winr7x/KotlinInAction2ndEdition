fun main() {
    val name = readln()
    // You can include arbitrary expressions inside string templates
    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}
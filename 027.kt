fun main() {
    val name = readln()
    if (name.isNotBlank()) {
        // ${} syntax. 'length' property of the 'name' variable
        println("Hello, ${name.length}-letter person!")
    }
}
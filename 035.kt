class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main() {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare) // Invokation of a property
    // false
}
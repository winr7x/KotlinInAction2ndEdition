package geometry.shapes; // Package declaration

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createUnitRectangle() : Rectangle {
    return Rectangle(1, 1)
}

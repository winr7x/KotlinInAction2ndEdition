class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // Property getter declaration
            return width == height
        }
}
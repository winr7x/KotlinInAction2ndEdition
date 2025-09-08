class Rectangle(val height: Int, val width: Int) {
    val isRectangle: Boolean
        get() { // Property getter declaration
            return width == height
        }
}
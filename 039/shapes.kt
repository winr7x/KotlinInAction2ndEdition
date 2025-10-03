// In Kotlin, you can put multiple classes in the
// same file and choose any name for that file
// You can place this file in the geometry folder
// without creating a separate shapes folder

package geometry.shapes

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createUnitSquare() : Rectangle {
    return Rectangle(1, 1)
}
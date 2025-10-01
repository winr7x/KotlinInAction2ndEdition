package geometry.example

import geometry.shapes.Rectangle         // Using import keyword
import geometry.shapes.createUnitSquare

// Using *:
// import geometry.shapes.*

fun main() {
    println(Rectangle(3, 4).isSquare)
    // false
    println(createUnitSquare().isSquare)
    // true
}

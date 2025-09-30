package geometry.example

import geometry.shapes.Rectangle         // Using import keyword036
import geometry.shapes.createUnitSquare

fun main() {
    println(Rectangle(3, 4).isSquare)
    // false
    println(createUnitSquare().isSquare)
    // true
}

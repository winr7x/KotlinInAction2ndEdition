import ch02.colors.Color.* // Imports the constants (RED, ORANGE, etc.)

fun measureColor() = ORANGE

fun getWarmthFromSensor(): String {
    // Captures the subject of the when expression in a variable
    // called color, whose scope is restricted to the when body
    return when (val color = measureColor()) {
        RED, ORANGE, YELLOW -> "warm (red = ${color.r})"
        GREEN -> "neutral (green = ${color.g})"
        BLUE, INDIGO, VIOLET -> "cold (blue = ${color.b}"
    }
}

fun main() {
    println(getWarmthFromSensor())
    // warm (red = 255)
}
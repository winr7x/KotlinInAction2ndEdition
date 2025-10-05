enum class Color(
    val r: Int,        // Property r
    val g: Int,        // Property g
    val b: Int         // Property b
) {
    RED(255, 0, 0),        // Constant RED with specified property values
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);
    val rgb = (r * 256 + g) * 256 + b // A widely adopted method of packing RGB values
                                      // into a 24-bit integer
                                      // Equivalent: (r shl 16) or (g shl 8) or b:
                                      // RED(0xFF0000),
                                      // GREEN(0x00FF00),
                                      // BLUE(0x0000FF)
    fun printColor() = println("$this is $rgb")
}

fun getMnemonic(color: Color) =
    // Multiline expression body
    when (color) {                // when syntax
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun measureColor() = Color.ORANGE

fun getWarmthFromSensor() : String {
    val color = measureColor()
    return when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm (red = ${color.r})"
        Color.GREEN -> "neutral (green = ${color.g})"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold (blue = ${color.b})"
    }
}

fun main() {
    println(Color.BLUE.rgb)
    // 256

    Color.GREEN.printColor()
    // GREEN is 65280

    println(getMnemonic(Color.BLUE))
    // Battle

    println(getWarmthFromSensor())
    // warm (red = 255)
}
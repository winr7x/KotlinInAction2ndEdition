enum class Color(
    r: Int,        // Property r
    g: Int,        // Property g
    b: Int         // Property b
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

fun main() {
    println(Color.BLUE.rgb)
    // 256

    Color.GREEN.printColor()
    // GREEN is 65280
}
val x = if (myBoolean) 2 else 5         // if-block is expression
val direction = when (inputString) {    // when-block is expression
    "u" -> UP
    "d" -> DOWN
    else -> UNKNOWN
}
val number = try {                      // try-block is expression
    inputString.toInt()
} catch (nfe: NumberFormatException) {
    -1
}
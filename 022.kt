fun canPerformOperation(): Boolean {
    return true
}

fun main() {
    val result: String // A val variable must be initialized
                       // exactly once during the execution
                       // of the block where it’s defined
    if (canPerformOperation()) {
        result = "Success" // <-----
    } else {
        result = "Can't perform operation"
    }
}

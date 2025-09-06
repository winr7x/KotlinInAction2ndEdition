fun main() {
    // languages reference is itselft read only and cant be changed
    val languages = mutableListOf("Java")
    // The object it points to may be mutable
    languages.add("Kotlin")
}
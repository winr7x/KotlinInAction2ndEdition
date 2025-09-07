// In Java property is [field + accessors (getter + setter)]
// In Kotlin, properties are a first-class language feature

class Person(
    val name: String,       // Generates a field, getter             // Read-only property
    var isStudent: Boolean  // Generates a field, getter, and setter // Writable property
)
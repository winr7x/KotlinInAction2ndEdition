fun main() {
    val person = Person("Bob", true) // without new keyword
    println(person.name)             // direct access, but getter is invoked
    // Bob
    println(person.isStudent)        // direct access, but getter is invoked
    // true
    person.isStudent = false // Graduation! direct access, but setter is invoked
    println(person.isStudent)
    // false
}
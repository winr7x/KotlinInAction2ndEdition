// Function has expression body. Type inference for return type
fun max (a: Int, b: Int) = if (a > b) a else b

/* For functions with a block body that return a value,
you must specify the return type and write the return statements
explicitly */
// fun max2 (a: Int, b: Int) {    // no return type
//     return if (a > b) a else b // error: type mismatch: inferred type is Int but Unit was expected
// }
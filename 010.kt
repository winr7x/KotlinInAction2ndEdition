fun modify(value: Any) {
    if (value is String) {
        println(value.uppercase())
    }
}

/* Once you’ve checked the type, you can refer to members of
that type without any additional casts, redeclarations, or checks */
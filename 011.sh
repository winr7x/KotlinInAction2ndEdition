kotlinc example.kt -include-runtime -d example.jar
java -jar example.jar

kotlinc example-dir -include-runtime -d example.jar # There is file example-dir/001.kt
java -jar example.jar

# -include-runtime. Kotlin Runtime library contains the
# definitions of Kotlin’s basic classes, like Int and String,
# and some extensions Kotlin adds to the standard Java APIs

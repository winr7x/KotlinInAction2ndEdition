kotlinc example.kt -include-runtime -d example.jar
java -jar example.jar

kotlinc example-dir -include-runtime -d example.jar # There is file example-dir/001.kt
java -jar example.jar

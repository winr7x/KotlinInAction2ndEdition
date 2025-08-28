@SpringBootApplication
class DemoApplication

fun main(args: Array<String>){
    runApplication<DemoApplication>(*args) // '*' converts Array into vararg String parameter
}

@RestController
class GreetingResource {
    @GetMapping
    fun index(): List<Greeting> = listOf(
        Greeting(1, "Hello!"),
        Greeting(2, "Bonjour!"),
        Greeting(3, "Guten Tag!"),
    )
}

data class Greeting(val id: Int, val text: String)

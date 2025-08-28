fun main() {
    embeddedServer(Netty, port = 8000) {
        routing {
            get("/world") {
                call.respondText("Hello, world!")
            }
            route("/greet") {
                get { /* ... */ }
                post("/{entityId}") { /* ... */ }
            }
        }
    }.start(wait = true)
}

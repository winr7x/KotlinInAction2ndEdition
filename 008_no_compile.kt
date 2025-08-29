@Composable
fun MessageCard(modifier: Modifier, message: Message) {
    var isExpanded by remember { mutableStateOf(false) }
    Column(modifier.clickable { isExpanded = !isExpanded }) {
        Text(message.body)
        if (isExpanded) {
            MessageDetails(message)
        }
    }
}

@Composable
fun MessageDetails(message: Message) { /* ... */ }

/* All of MessageCard, Column, Text, and MessageDetails
elements are composable functions:
  -- They are annotated with @Composable
  -- they participate in the declarative UI model of Jetpack Compose:
     the UI is described declaratively as a function of
     its input data
  -- MessageCard, MessageDetails are user-defined */


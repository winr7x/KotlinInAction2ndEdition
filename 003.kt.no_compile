messages
  .filter { it.body.isNotBlank(), !it.isRead }
  .map(Message::Sender)
  .destinct()
  .sortedBy(Sender::Name)


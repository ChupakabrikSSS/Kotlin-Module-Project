class Note(val name: String, val text: String)

class Archive(
    val name: String,
    val notes: MutableList<Note> = mutableListOf()
)
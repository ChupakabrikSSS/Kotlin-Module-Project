class CreateNoteScreen(private val archive: Archive) {
    fun show() {
        val name = readNonEmpty(
            "Введите название заметки:",
            "Название заметки не может быть пустым. Попробуйте ещё раз."
        )
        val text = readNonEmpty(
            "Введите текст заметки:",
            "Текст заметки не может быть пустым. Попробуйте ещё раз."
        )
        archive.notes.add(Note(name, text))
        println("Заметка «$name» создана.")
    }
}
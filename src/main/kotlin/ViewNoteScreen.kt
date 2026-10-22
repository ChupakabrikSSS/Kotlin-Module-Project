class ViewNoteScreen(private val note: Note) {
    fun show() {
        MenuScreen("Заметка «${note.name}»:\n${note.text}", exitLabel = "Назад") {
            emptyList()
        }.show()
    }
}
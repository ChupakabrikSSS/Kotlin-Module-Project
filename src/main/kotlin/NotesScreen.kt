class NotesScreen(private val archive: Archive) {
    fun show() {
        MenuScreen("Архив «${archive.name}». Список заметок:", exitLabel = "Назад") {
            val items = mutableListOf<MenuItem>()
            items.add(MenuItem("Создать заметку") {
                CreateNoteScreen(archive).show()
            })
            archive.notes.forEach { note ->
                items.add(MenuItem(note.name) {
                    ViewNoteScreen(note).show()
                })
            }
            items
        }.show()
    }
}
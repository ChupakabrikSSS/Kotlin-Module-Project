class ArchiveScreen(private val archives: MutableList<Archive>) {
    fun show() {
        MenuScreen("Список архивов:") {
            val items = mutableListOf<MenuItem>()
            items.add(MenuItem("Создать архив") {
                CreateArchiveScreen(archives).show()
            })
            archives.forEach { archive ->
                items.add(MenuItem(archive.name) {
                    NotesScreen(archive).show()
                })
            }
            items
        }.show()
    }
}
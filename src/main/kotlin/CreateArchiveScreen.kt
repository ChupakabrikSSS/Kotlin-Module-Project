class CreateArchiveScreen(private val archives: MutableList<Archive>) {
    fun show() {
        val name = readNonEmpty(
            "Введите название архива:",
            "Название архива не может быть пустым. Попробуйте ещё раз."
        )
        archives.add(Archive(name))
        println("Архив «$name» создан.")
    }
}
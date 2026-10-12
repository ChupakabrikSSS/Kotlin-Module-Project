import java.util.Scanner
private val scanner = Scanner(System.`in`)
fun readInput(): String = scanner.nextLine()

fun readNonEmpty(prompt: String, errorMessage: String): String {
    while (true) {
        println(prompt)
        val value = readInput().trim()
        if (value.isNotEmpty()) return value
        println(errorMessage)
    }
}
class MenuItem(val name: String, val action: () -> Unit)
class MenuScreen(
    private val title: String,
    private val exitLabel: String = "Выход",
    private val itemsProvider: () -> List<MenuItem>
) {
    fun show() {
        while (true) {
            val items = itemsProvider()
            println("\n$title")
            items.forEachIndexed { index, item -> println("$index. ${item.name}") }
            println("${items.size}. $exitLabel")

            val choice = readInput().trim().toIntOrNull()
            when {
                choice == null ->
                    println("Нужно вводить цифру. Попробуйте ещё раз.")
                choice == items.size ->
                    return
                choice !in items.indices ->
                    println("Такой цифры нет. Введите номер из списка.")
                else ->
                    items[choice].action()
            }
        }
    }
}
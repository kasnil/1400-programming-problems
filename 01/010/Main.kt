fun main() {
    solve()
}

/**
 * Составить программу, которая запрашивает имя человека и повторяет его на экране.
 */
fun solve() {
    print("Введите ваше имя: ")
    val name = readLine()?.trim()
    println(name)
}

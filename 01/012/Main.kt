fun main() {
    solve()
}

/**
 * Напишите программу, в которую вводится имя человека и выводится на экран
 * приветствие в виле слова «Привет», после которого должна стоять запятая,
 * введенное имя и восклицательный знак. После запятой должен стоять пробел,
 * а перед восклицательным знаком пробела быть не должно.
 */
fun solve() {
    print("Введите ваше имя: ")
    val name = readLine()?.trim()
    println("Привет, $name!")
}

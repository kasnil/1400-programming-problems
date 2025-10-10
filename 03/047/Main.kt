fun main() {
    solve()
}

/**
 * Даны целые числа h, m, s (0 \lt h \le 23, 0 \le m \le 59, 0 \le h \le 59),
 * указывающие момент времени: «h часов, m минут, s секунд». Определить угол
 * (в градусах) между положением часовой стрелки в начале суток и в указанный
 * момент времени.
 */
fun solve() {
    print("Введите значение часов: ")
    val h = readLine()?.trim()?.toIntOrNull() ?: 1
    print("Введите значение минут: ")
    val m = readLine()?.trim()?.toIntOrNull() ?: 1
    print("Введите значение секунд»: ")
    val s = readLine()?.trim()?.toIntOrNull() ?: 1
    val angle = (h % 12).toDouble() * 30.0 + 0.5 * m.toDouble() + 0.5 / 60.0 * s.toDouble()
    println("Угол: $angle")
}

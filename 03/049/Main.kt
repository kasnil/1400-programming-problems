import kotlin.math.PI

fun main() {
    solve()
}

/**
 * Часовая стрелка образует угол y с лучом, проходящим через центр и через точку,
 * соответствующую 12 часам на циферблате, 0 \le y \lt 2 \pi. Определить значение
 * угла для минутной стрелки, а также количество полных часов и полных минут.
 */
fun solve() {
    print("Введите угол часовой стрелки: ")
    val y = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val h = (6.0 * y / PI).toInt()
    val m = ((y - h.toDouble() * PI / 6.0) / ((PI / 6.0) / 60.0)).toInt()
    val angleM = (y - h.toDouble() * PI / 6.0) * 12.0
    println("Полных часов: $h, полных минут: $m")
    println("Угл минутной стрелки: $angleM")
}

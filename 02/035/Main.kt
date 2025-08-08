import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Два автомобиля едут друг за другом с постоянными скоростями V_{1} и V_{2} км/ч (V_{1} > V_{2}).
 * Определить, какое расстояние будет между ними через 30 мин после того,
 * как первый автомобиль опередил второй на S км.
 */
fun solve() {
    val v2 = Random.nextDouble()
    val v1 = v2 + Random.nextDouble(from = 1.0, until = 10.0)
    val d = Random.nextDouble()
    val s = 0.5 * (v1 - v2) + d
    println("Расстояние: $s")
}

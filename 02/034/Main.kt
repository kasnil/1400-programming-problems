import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Два автомобиля едут навстречу друг другу с постоянными скоростями V_{1} и V_{2} км/ч.
 * Определить, через какое время автомобили встретятся, если расстояние между ними было S км.
 */
fun solve() {
    val v1 = Random.nextDouble()
    val v2 = Random.nextDouble()
    val v = v1 + v2
    val t = 5.0 / v
    println("Автомобили встретятся через $t ч.")
}

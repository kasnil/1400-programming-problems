import kotlin.math.abs

fun main() {
    solve()
}

/**
 * Возраст Тани – X лет, а возраст Мити – Y лет. Найти их средний возраст,
 * а также определить, на сколько отличается возраст каждого ребенка от среднего значения.
 */
fun solve() {
    print("Введите возраст Тани: ")
    val yearTanya = readLine()?.trim()?.toIntOrNull() ?: 0
    print("Введите возраст Мити: ")
    val yearMitya = readLine()?.trim()?.toIntOrNull() ?: 0
    val middleYear = (yearTanya + yearMitya) / 2
    println("Средний возраст: $middleYear лет")
    println("Возраст Тани от среднего отличается на ${abs(yearTanya - middleYear)} лет")
    println("Возраст Мити от среднего отличается на ${abs(yearMitya - middleYear)} лет")
}

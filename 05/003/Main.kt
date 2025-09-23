fun main() {
    solve()
}

/**
 * Напечатать «столбиком»:
 * а) все целые числа от 20 до 35;
 * б) квадраты всех целых чисел от a до 50 (значение a вводится с клавиатуры; а \le 50);
 * в) кубы всех целых чисел от 10 до b (значение b вводится с клавиатуры; b \ge 10);
 * г) все целые числа от a до b (значение a и b вводится с клавиатуры; b \ge a);
 */
fun solve() {
    println("Все целые числа от 20 до 35")
    (20..35).forEach { println(it) }
    print("Введите число a: ")
    val a = readLine()?.trim()?.toIntOrNull() ?: 0
    println("Квадраты всех целых чисел от $a до 50")
    (a..50).forEach { println(it * it) }
    print("Введите число b: ")
    val b = readLine()?.trim()?.toIntOrNull() ?: 0
    println("Кубы всех целых чисел от 10 до $b")
    (10..b).forEach { println(it * it * it) }
    println("Все целые числа от $a до $b")
    (a..b).forEach { println(it) }
}

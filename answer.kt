// N行分のピラミッドを生成する関数
fun GeneratePyramidPattern(N: Int) {
    for (i in 1..N) {
        // スペースを挿入してピラミッドを中央に配置
        val spacing = " ".repeat(N - i)
        print(spacing)

        // N段目で1からNまでを表示
        for (j in 1..i) {
            val value = j % 10 // 数値は10で割った余りを取得
            print(value)
        }

        // N段目でN-1から1まで表示
        for (j in i - 1 downTo 1) {
            val value = j % 10 // 数値は10で割った余りを取得
            print(value)
        }

        println() // 行を改行
    }
}

fun main() {
    val N = readLine()?.toIntOrNull()

    if (N != null && N > 0) {
        GeneratePyramidPattern(N) // ピラミッド生成関数を呼び出し
    } else {
        println("無効な入力です。1以上の整数を入力してください")
    }
}

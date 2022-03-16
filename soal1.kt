import java.text.DecimalFormat

fun hitungJarak (x1: Int, y1: Int, x2: Int, y2: Int):String{
    var h1 = x2-x1
    var p1 = Math.pow(h1.toDouble(),2.0)

    var h2 = y2-y1
    var p2 = Math.pow(h2.toDouble(),2.0)

    var akar = Math.sqrt(p1 + p2)
    val fd = DecimalFormat("#.##")
    var hasil = (fd.format(akar))
    return hasil
}
fun main(args: Array<String>) {
    val jarak1 = hitungJarak(2, 3,8,7)
    val jarak2 = hitungJarak(5, 3, -8, -4)
    println("$jarak1")
    println("$jarak2")
}
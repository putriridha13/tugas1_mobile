class barang {
    var nama: String = "Lemari"
    var harga: Int = 500000
    var jumlah:Int = 3
    var diskon: Int = 50

    fun tampil() {
        println("Nama Barang: $nama")
        println("Harga Barang: Rp.$harga")
        println("Jumlah Barang: $jumlah")
        println("Diskon: $diskon%")
    }

    fun hitungTotal(): Int {
        val hitung = harga * jumlah * diskon/100
        println("Total = Rp.$hitung")
        return 0
    }
}

fun main (args: Array<String>) {
    val lemari = barang()
    lemari.tampil()
    lemari.hitungTotal()
}
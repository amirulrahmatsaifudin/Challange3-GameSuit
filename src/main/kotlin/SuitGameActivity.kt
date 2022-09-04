class SuitGameActivity : Callback {
    init {
        println("===========================")
        println("GAME SUIT TERMINAL VERSION")
        println("===========================")
    }

    override fun start() {
        println("==================================")
        println(" Tentukan pilihan anda sekarang ! ")
        println("       Batu, Kertas, Gunting      ")
        println("==================================")
        inputan()
    }

    override fun inputan() {
            print("1. Masukkan pemain 1:  ")
            var pemain1 = readLine()
            print("2. Masukkan pemain 2:  ")
            var pemain2 = readLine()
            var status = false
            when {
                pemain1!!.toLowerCase() == (pemain2!!.toLowerCase()) -> {
                    println("Draw!!")
                }
                pemain1.toLowerCase() == ("batu") -> {
                    if (pemain2.toLowerCase() == ("gunting")) {
                        status = true
                        hasil(status)
                    } else {
                        status = false
                        hasil(status)
                    }
                }
                pemain1.toLowerCase() == ("gunting") -> {
                    if (pemain2.toLowerCase() == ("kertas")) {
                        status = true
                        hasil(status)
                    } else {
                        status = false
                        hasil(status)
                    }
                }
                pemain1.toLowerCase() == ("kertas") -> {
                    if (pemain2.toLowerCase() == ("batu")) {
                        status = false
                        hasil(status)
                    } else {
                        status = true
                        hasil(status)
                    }
                }
                else -> {
                    println("========================================")
                    println("Inputan Salah!! Coba lagi !! ")
                    start()
                }
            }
        keluar()
    }

    override fun keluar() {
        println("========================================")
        println("Apakah anda ingin keluar dari permainan?")
        println("1. Ya ")
        println("2. Tidak")
        println("pilihan anda: ")
        val exit = readLine()?.toInt()
        when (exit) {
            1 -> println("Sampai jumpa digame berikutnya !!")
            2 -> start()
            else -> {
                println("Inputan Salah!! Coba lagi !! ")
                keluar()
            }
        }
    }

    fun hasil(status: Boolean) {
        if (status) {
            println("Hasil")
            println("Pemain 1 Menang")
        } else {
            println("Hasil")
            println("Pemain 2 Menang")
        }
    }

}


package K0_kotlin_intro


import java.util.Scanner

    fun main(args: Array<String>) {
        println("Please, input your name")
        val userName = userName
        println("Hello, " + userName)
    }

    val userName: String
        get() {
            val scanner = Scanner(System.`in`)
            return scanner.nextLine()
        }


//Аннотация JvmStatic необходима для объявления статических методов - в Kotlin ключевого слова static нет!
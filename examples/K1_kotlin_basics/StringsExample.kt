package K1_kotlin_basics


    fun main(args: Array<String>) {
        val testString = "Это моя новая строка"
        println("testString = " + testString)

        println("\ntestString[4] вызовет ошибку!")
        println("\nСимвол строки по номеру символа можно получить так: <строка>.charAt(<номер>).\nНапример, четвертый символ testString: testString.charAt(4) // = " + testString[4])

        println("\n--------------------------------------------\n")

        println("Длину строки можно получить так: <строка>.length().\nНапример, длина строки testString: testString.length() // = " + testString.length)

        println("\n--------------------------------------------\n")

        println("Если мы будем сравнивать строки таким образом: testString == \"Это моя новая строка\", то результат будет: " + (testString === "Это моя новая строка"))
        println("Правильно сравнивать строки нужно с помощью <строка>.equals(): testString.equals(\"Это моя новая строка\"), результат: " + (testString == "Это моя новая строка"))

        println("\n--------------------------------------------\n")

        println("Для того, чтобы прибавить к строке другую строку можно использовать <строка_1>.concat(<строка_2>)")
        println("Результат такого сложения обязательно нужно присвоить какой-нибудь переменной, например: <строка_1> = <строка_1>.concat(<строка_2>)")
        println("Пример: testString = testString.concat(\" с новыми символами\") // = " + (testString + " с новыми символами"))
        println("Это аналогично записи testString += \" с новыми символами\"")

        println("\n--------------------------------------------\n")

        println("Найти индекс символа 'о' с начала строки: testString.indexOf('о') = " + testString.indexOf('о'))
        println("Индекс символа 'о' с конца строки: testString.lastIndexOf('о') = " + testString.lastIndexOf('о'))
        println("Индекс несуществующего символа 's': testString.indexOf('s') = " + testString.indexOf('s'))

        println("\n--------------------------------------------\n")

        println("Для замены в строке одного символа на другой используйте testString.replace(<символ_который_заменяем>, <символ_которым_заменяем>)")
        println("Пример: заменим в строке testString пробел на перевод каретки")
        println("testString.replace(\" \", \"\\n\") \nРезультат:\n" + testString.replace(" ", "\n"))


    }

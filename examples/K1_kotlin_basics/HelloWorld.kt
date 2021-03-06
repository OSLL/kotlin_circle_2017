package K1_kotlin_intro


fun main(args: Array<String>){
    println("Hello, world!")
}

/*
Как и в Java, ключевое слово package определяет пакет - пространство имен. K0_kotlin_intro - название пакета.
Ключевое слово fun используется для декларации функции (метода), после которого следует имя функции. Programming in Kotlin is lots of fun, indeed!(с)
Тип параметра (Array<String>) указывается после его имени (args), отделенное двоеточием (также возможна декларация "без типа" (впоследствии применяется
type inference - логическое приведение типа: тип переменной определяется исходя из первого действия, произведенного над ней))
Тип возвращаемого функцией значения (Int) указывается через двоеточие:
fun example(test) : Int{
    return test
}

Функция может быть объявлена на "главном уровне" файла, нет необходимости объявлять ее как метод класса.
Массив это тоже класс. В отличие от Java, в Kotlin нет специального синтаксиса для типа массива.
Можно использовать println вместо System.out.println: несмотря на то, что это часть стандартной библиотеки Java, в Kotlin имеется большое количество оберток над
методами и классами библиотек Java, println - одна из них.
Необязательно указывать точку с запятой в конце строки (более того, Intellij IDEA выводит предупреждения при установке точки  с запятой в конце строки).
*/

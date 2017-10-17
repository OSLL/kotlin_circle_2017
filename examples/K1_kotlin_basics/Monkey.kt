package K0_kotlin_intro

open class Monkey constructor(var name: String, var age: Int)
//Более лаконичное объявление, чем в Planet
//Ключевое слово open необходимо для наследования: по умолчанию, все классы final
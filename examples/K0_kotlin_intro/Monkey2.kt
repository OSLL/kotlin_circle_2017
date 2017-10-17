package K0_kotlin_intro

open class Monkey2 : MammalInterface {
    private val name: String? = null

    override fun sleep() { // Этот метод обязательно должен быть реализован!
        println("zzzzzzzz")
    }

    // все поля интерфейса доступны наследникам
    val isCheeksPresent: Boolean
        get() = isCheeksPresent
}
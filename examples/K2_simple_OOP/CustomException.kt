package K2_simple_OOP

class CustomException(override var message:String) : Throwable() {

}

fun main(args : Array<String>){
    throw CustomException("Custom exception")
}
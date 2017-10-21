package K2_simple_OOP

import java.util.*

class PhoneBook{
    var phoneBookMap = hashMapOf("VasyaPupkin" to "81234567890", "PetyaVasin" to "8987543210")

    fun getByName(input : String) : String {
        return if(!phoneBookMap.containsKey(input)) {
            print ("Wrong name")
            ""
        }
            else phoneBookMap[input].toString()
    }

    fun put(name : String, number : String){
        if(phoneBookMap.containsKey(name)){
            phoneBookMap.put(name, number)
            print ("Number updated")
            return
        }

        print ("Entry added")
        phoneBookMap.put(name, number)
    }

    fun getAll() {
        for (temp in phoneBookMap) print(temp.key + ", " + temp.value + "\n")
    }

    fun help(){
        print ("Usage:\n get [NAME] - get by name")
        print ("\n put [NAME] [PHONE] - put name+value pair into the phonebook")
        print ("\n getall - print entire phonebook")
        print ("\n help - get some help")
        print ("\n quit - exit the app \n")
    }

}

    fun main(args : Array<String>){
        var currentBook = PhoneBook()

        print ("Type your commands here: \n")
        var inputStr = readLine()

        while(inputStr!="quit") {
            var tokenizer = StringTokenizer(inputStr)
            var firstToken = if(tokenizer.hasMoreTokens()) tokenizer.nextToken()
                else ""

            when (firstToken) {
                "get" -> print (currentBook.getByName(tokenizer.nextToken()))
                "put" -> currentBook.put(tokenizer.nextToken(), tokenizer.nextToken())
                "getall" -> currentBook.getAll()
                else -> currentBook.help()
            }

            print ("\n")
            inputStr = readLine()
        }

    }
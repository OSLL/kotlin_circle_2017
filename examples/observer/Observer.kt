package observer

import kotlin.properties.Delegates

interface TextChangedListener {
    fun onTextChanged(newText: String)
}

class PrintingTextChangedListener : TextChangedListener {
    override fun onTextChanged(newText: String) = println("Text: $newText")
}

class TextView {

    var listener: TextChangedListener? = null

    var text: String by Delegates.observable("") { prop, old, new ->
        listener?.onTextChanged(new)
    }

    fun inputListener() {
        var inputStr = ""
        while(inputStr!="interrupt"){
            inputStr = readLine().toString()

            this.text = inputStr
        }
        print ("Listener has been interrupted")
    }

}

fun main(args: Array<String>) {

    val textView = TextView()
    textView.listener = PrintingTextChangedListener()
    textView.inputListener()
}
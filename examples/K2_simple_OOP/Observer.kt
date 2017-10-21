interface TextChangedListener {
    fun onTextChanged(newText: String)
}

class TextView {
    var listener: TextChangedListener? = null
    fun listen() {
        var inputStr = ""
        while(inputStr!="interrupt"){
            inputStr = readLine().toString()
            if (listener != null)
                (listener as TextChangedListener).onTextChanged(inputStr)
        }
    }
}

fun main(args: Array<String>) {

    val textView = TextView()
    //textView.listener = MyListener()
    textView.listen()
}

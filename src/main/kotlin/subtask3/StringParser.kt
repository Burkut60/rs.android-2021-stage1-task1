package subtask3

class StringParser {
//    var arrayResult = arrayListOf<String>()
//    var openChar = arrayOf('(','[','<')
//    var closeChar = arrayOf(')',']','>')
//    var openWrite: Int = 0
//    var closeWrite: Int = 0
//    var numbIndex: Int = 0

    fun getResult(inputString: String): Array<String> {
//
//      for (i in inputString.indices){
//           for (a in openChar.indices){
//               if (inputString[i] == openChar[a]){
//                 openWrite = i+1
//                   numbIndex  = lastIndex(inputString,closeChar)
//                    for (q in openWrite ..inputString[numbIndex].toInt())
//                       arrayResult.add(inputString[q].toString())
//                   }
//               }
//           }
//        return arrayResult.toTypedArray()
//    }
//
// fun lastIndex(closeArr: String, closeCharArr:Array<Char>): Int {
//    for (i in closeArr.indices) {
//        for (a in closeCharArr.indices)
//            if (closeArr[i] == closeCharArr[a]) {
//                closeWrite = i - 1
//                break
//            }
//    }
//    return closeWrite
//}
//}
        val openArr = arrayOf( '(' ,  '[' , '<' )
        val result: ArrayList<String> = ArrayList()
        var first: Int
        var last: Int
        var openIndex: Int

        for ( i in inputString.indices )
            if ( inputString[i] in openArr ) {
                first = i + 1
                openIndex = openArr.indexOf( inputString[i] )
                last = searchАorСlosure( openIndex, inputString[i], first, inputString )
                result.add(inputString.substring( first, last ))
            }
        return result.toTypedArray()
    }
    fun searchАorСlosure( indexOpenBracketInArray: Int, openBrackets: Char, beginTextIndex: Int, text: String ): Int {
        val close = arrayOf( ')' ,  ']' , '>' )
        var open= 0
        for ( i in beginTextIndex..text.indices.last )
            when (text[i]) {
                openBrackets -> ++open
                close[ indexOpenBracketInArray ] ->  if ( open ==  0 )
                    return i
                else --open
            }
        return -1
    }
}

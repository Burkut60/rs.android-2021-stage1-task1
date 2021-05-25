package subtask1

class HappyArray {
    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        val mayArray = sadArray.toMutableList()
        var happy: Boolean

        do {
            happy = false
            for (i in 1 until mayArray.size - 1) {

                val first = mayArray[i - 1]
                val second = mayArray[i + 1]
                val actual = mayArray[i]

                if (first + second < actual) {
                    mayArray.removeAt(i)
                    happy = true
                    break
                }
            }
        } while (happy)

        return mayArray.toIntArray()
    }
}
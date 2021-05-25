package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlySplit = "bon Appetit"

        var sum = 0
        var noeEat = 0

        for (i in bill.indices) {
            sum += bill[i]
            if (i == k) {
                noeEat = bill[i]
            }
        }
        return if (k != 0) {
            val calculation = b - ((sum - noeEat) / 2)
            if (calculation == 0) {
                return fairlySplit
            } else
                calculation.toString()
        } else {
            fairlySplit
        }
    }
}

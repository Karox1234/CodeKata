package Answer21to30

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = mutableListOf<Int>()

        for (num in arr) {
            if (num % divisor == 0) {
                answer.add(num)
            }
        }

        if (answer.isEmpty()) {
            return intArrayOf(-1)
        }

        return answer.sorted().toIntArray()
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/12910
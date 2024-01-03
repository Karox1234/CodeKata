package Answer21to30

class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size <= 1) {
            return intArrayOf(-1)
        }

        val minVal = arr.minOrNull()
        return arr.filter { it != minVal }.toIntArray()
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/12935
package Answer11to20

class Solution {
    fun solution(n: Long): IntArray {
        val reversedString = n.toString().reversed()
        val answer = reversedString.map { it.toString().toInt() }.toIntArray()

        return answer
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/12932
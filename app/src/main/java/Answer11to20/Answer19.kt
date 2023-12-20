package Answer11to20

class Solution {
    fun solution(n: Long): Long {
        val x = Math.sqrt(n.toDouble()).toLong()

        return if (x * x == n) {
            (x + 1) * (x + 1)
        } else {
            -1
        }
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/12934
package Answer21to30

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        if (a == b) {
            answer = a.toLong()
        } else {

            val start = minOf(a, b)
            val end = maxOf(a, b)

            for (i in start..end) {
                answer += i
            }
        }

        return answer
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/12912
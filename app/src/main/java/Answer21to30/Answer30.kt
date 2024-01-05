package Answer21to30

class Solution {
    fun solution(s: String): String {
        val length = s.length
        val middle = length / 2

        return if (length % 2 == 0) {
            s.substring(middle - 1, middle + 1)
        } else {
            s.substring(middle, middle + 1)
        }
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/12903
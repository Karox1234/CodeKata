package Answer11to20

class Solution {
    fun solution(s: String): Int {
        var sign = 1
        var startIndex = 0
        var answer = 0

        if (s[0] == '-') {
            sign = -1
            startIndex = 1
        } else if (s[0] == '+') {
            startIndex = 1
        }


        for (i in startIndex until s.length) {
            val digit = s[i].toInt() - '0'.toInt()
            answer = answer * 10 + digit
        }

        return sign * answer
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/12925
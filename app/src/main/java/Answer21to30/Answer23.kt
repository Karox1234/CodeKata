package Answer21to30

class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num.toLong()
        while (n != 1L) {
            if (answer >= 500) {
                return -1
            }

            if (n % 2 == 0L) {
                n /= 2
            } else {
                n = n * 3 + 1
            }

            answer++
        }

        return answer
    }
}
https://school.programmers.co.kr/learn/courses/30/lessons/12943
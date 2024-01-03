package Answer21to30

class Solution {
    fun solution(numbers: IntArray): Int {

        val digit = BooleanArray(10)

        for (number in numbers) {
            digit[number] = true
        }

        var answer = 0
        for (i in 0 until 10) {
            if (!digit[i]) {
                answer += i
            }
        }

        return answer
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/86051
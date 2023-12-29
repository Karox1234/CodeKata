package Answer21to30

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0
        val size = absolutes.size

        for (i in 0 until size) {
            if (signs[i]) {
                answer += absolutes[i]
            } else {
                answer -= absolutes[i]
            }
        }
        return answer
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/76501

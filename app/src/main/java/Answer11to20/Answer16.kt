package Answer11to20

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        for (i in 0 until n) {
            answer[i] = (i.toLong() + 1) * x.toLong()
        }

        return answer
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/12954
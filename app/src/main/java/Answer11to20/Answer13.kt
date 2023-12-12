package Answer11to20

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var num = n
        while (num > 0) {
            answer = answer + num % 10
            num = num / 10
        }
        println("${answer}")

        return answer
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/12931
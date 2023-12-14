package Answer11to20

class Solution {
    fun solution(n: Int): Int {
        var x = 1

        while (n % x != 1) {
            x++
        }

        return x
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/87389
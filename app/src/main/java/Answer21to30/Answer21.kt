package Answer21to30

class Solution {
    fun solution(x: Int): Boolean {
        var answer = x.toString().map { it.toString().toInt() }.sum()
        return x % answer == 0
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/12947
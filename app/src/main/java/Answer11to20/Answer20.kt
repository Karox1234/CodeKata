package Answer11to20

class Solution {
    fun solution(n: Long): Long {

        val answer = n.toString().toCharArray()

        answer.sortDescending()

        return String(answer).toLong()
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/12933
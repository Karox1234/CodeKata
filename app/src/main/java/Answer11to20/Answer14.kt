package Answer11to20

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var num = 0
        for(num in 1..n) {
            if(n % num == 0){
                answer += num
            }
        }
        return answer
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12928
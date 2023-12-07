package com.example.codekata

class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0

        if(0<angle && angle<90){
            answer = 1
        }else if(angle==90){
            answer = 2
        }else if(90<angle && angle<180){
            answer = 3
        }else if(angle==180){
            answer = 4
        }
        return answer
    }

}

https://school.programmers.co.kr/learn/courses/30/lessons/120829
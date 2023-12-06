package com.example.codekata

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(num1 > 0 && num1 <= 100 && num2 >0 && num2 <=100) {
            answer = num1 / num2
        }
        return answer
    }
}
문제 url https://school.programmers.co.kr/learn/courses/30/lessons/120805?language=kotlin#
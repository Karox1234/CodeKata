package com.example.codekata

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = -1
        if(-50000 <= num1 && num1 <= 50000 && -50000 <=num2 && num2 <= 50000){

            answer = num1 + num2
        }

        return answer
    }
}

문제 url : https://school.programmers.co.kr/learn/courses/30/lessons/120802
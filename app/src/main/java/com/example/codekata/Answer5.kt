package com.example.codekata

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(num1 == num2 && 0<=num1 && num1<=10000 && 0<=num2 && num2<=10000){
            answer = 1

        }else {
            answer = -1}
        return answer
    }
}

문제 url : https://school.programmers.co.kr/learn/courses/30/lessons/120807
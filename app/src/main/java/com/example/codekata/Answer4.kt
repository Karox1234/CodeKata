package com.example.codekata

class Solution {
    fun solution(age: Int): Int {
        var answer: Int = 0
        val year: Int = 2022
        if (age > 0 && age <= 120) {
            answer = year - age + 1;
        }
        return answer
    }
}

문제url https://school.programmers.co.kr/learn/courses/30/lessons/120820
package Answer21to30

class Solution {
    fun solution(phone_number: String): String {
        val length = phone_number.length
        val mozaick = "*".repeat(length - 4)
        val final4 = phone_number.substring(length - 4)
        return mozaick + final4
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/12948
package main.kotlin.lec05

fun main() {

}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 ==0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun getGrandWithSwitch(score: Int): String {
    when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }

    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun validateScoreIsNotNegative(score: Int) {
    //if (score < 0) {
    if (score !in 0..100) {
        //java 와 차이는 new 가 있고 없고
        //throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
        throw IllegalArgumentException("score의 범위는 0부터 100입니다")
    }
}

fun validateScore(score: Int) {
    if (score in 0..100) {
        //todo
    }
}

/**
 * Statement : 프로그램의 문장, 하나의 값으로 도촐되지 않음
 * Expression : 하나의 값으로 도출되는 문장
 */
fun getPassOrFail(score: Int): String {
//    if (score >= 50) {
//        return "P"
//    } else {
//        return "F"
//    }

    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if(score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}
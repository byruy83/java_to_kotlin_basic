package main.kotlin.lec18

import main.java.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_400),
        Fruit("수박", 10_000),
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    filterFruits(fruits, isApple)

    //모든 조건을 만족하면 true 아니면 false
    val isAppApple = fruits.all{ fruit -> fruit.name == "사과" }

    //조건을 모두 불만족하면 true 그렇지 않으면 false
    val isNoApple = fruits.none{ fruit -> fruit.name == "사과" }

    //조건을 하나라도 만족하면 true 그렇지 않으면 false
    val isNoApple2 = fruits.any{ fruit -> fruit.price >= 10_000 }

    val fruitCount = fruits.count();

    val fruitSorted = fruits.sortedBy { fruit -> fruit.price }
    val fruitSorted2 = fruits.sortedByDescending { fruit -> fruit.price }
    val distinctFruitNames = fruits.distinctBy{fruit -> fruit.name }
        .map{fruit -> fruit.name}

    fruits.first() // 첫번째값이 null이면 exception 발생
    fruits.firstOrNull()

    fruits.last()
    fruits.lastOrNull()

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}
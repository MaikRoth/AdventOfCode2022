package `Day 1`

import java.io.File

fun main(){
    var sum = mutableListOf<Int>()
    var calories = mutableListOf<Int>()
    File("src/main/kotlin/Day 1/inputPart1.txt").forEachLine {
        if (it != ""){
            calories.add(it.toInt())
        }else{
            sum.add(calories.sum())
            calories.clear()
        }
    }
    // Answer for Part 1
    println(sum.max())
    // Answer for Part 2 (Change inputPart1.txt to inputPart2.txt)
    println(sum.sorted().takeLast(3).sum())
}
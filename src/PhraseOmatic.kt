import kotlin.random.Random

fun main(args: Array<String>) {

    val array1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val array2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val array3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val word1 = array1[Random.nextInt(0,array1.size-1)]
    val word2 = array2[Random.nextInt(0,array2.size-1)]
    val word3 = array3[Random.nextInt(0,array3.size-1)]

    print("$word1, "); print("$word2, "); print("$word3, ")


}
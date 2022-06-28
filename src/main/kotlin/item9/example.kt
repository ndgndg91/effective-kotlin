package item9

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun countCharactersInFile(path: String): Int = File(path).useLines { line ->
    line.sumOf { it.length }
}

fun countCharactersInFile2(path: String): Int {
    BufferedReader(FileReader(path)).use { reader ->
        return reader.lineSequence().sumOf { it.length }
    }
}

fun main(args: Array<String>) {
    val count = countCharactersInFile("temp.txt")
    println(count)

    val count2 = countCharactersInFile2("temp.txt")
    println(count2)
}
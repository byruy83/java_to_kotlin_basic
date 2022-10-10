package main.kotlin.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

//todo 3 convert
class FilePrinter {

    //unchecked exception으로 간주하기 떄문에 throws가 필요 없음
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    /**
     * Kotlin은 try with resources가 존재하지 않음
     * use 라는 inline 함수로 변경하여 사용함
     */
    fun readFileV2(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
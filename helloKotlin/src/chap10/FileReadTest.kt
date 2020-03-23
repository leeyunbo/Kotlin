package chap10

import java.io.FileReader
import java.lang.Exception

/**
 * FileReader 예제
 * readText()는 내부적으로 StringWriter()를 호출하여, 텍스트를 메모리로 가져온 후 그 내용을 반환함
 */
fun main() {
    val path = "E:\\Over the Rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch(e : Exception) {
        println(e.message)
    }
}
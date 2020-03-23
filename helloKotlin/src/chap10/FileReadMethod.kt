package chap10

import java.io.BufferedReader
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception

/**
 * 확장 함수를 잘 사용하면 굉장히 간략하게 기능을 구현할 수 있다
 */
fun main() {
    val path ="E:\\Over the Rainbow.txt"

    //1. 코틀린스러운 방법, 확장 함수 사용
    val inputStream : InputStream = File(path).inputStream()
    val text = inputStream.bufferedReader().use {it.readText()}
    println(text)

    //2. 코틀린스럽지 않은 방법
    val inputStreamReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line : String?
    val br = BufferedReader(inputStreamReader)
    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, '\n')
            line = br.readLine()
        }
        println(sb)
    } catch(e:Exception) {
    }

    //3. 줄단위로 처리하는 방법, useLines를 이용해도 알아서 완료된 후 close()가 호출됨
    val bufferedReader = File(path).bufferedReader()
    val lineList = mutableListOf<String>()
    bufferedReader.useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach{println(it)}

}
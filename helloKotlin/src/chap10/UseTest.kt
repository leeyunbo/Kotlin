package chap10

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

/**
 * public inline fun <T : Closeable?, R> T.use(block : (T) -> R) : R
 * use() 사용 예제, use()는 객체를 사용한 후, 자동으로 close() 함수를 호출하여 객체를 닫아줄 수 있음
 * 따라서 닫아야 좋은 객체들을 사용할 때, use() 함수를 사용하면 편하다 ex)파일 입출력 관련 객체
 */
fun main() {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }

    val file = File("d:\\test\\contents.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
}
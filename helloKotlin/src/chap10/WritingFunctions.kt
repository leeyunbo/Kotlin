package chap10

import java.io.File
import java.io.PrintWriter

/**
 * PrintWriter와 BufferedWriter 예제
 * BufferedWriter는 Buffer에 모은 후, 출력 혹은 입력된다는 것이 다름
 */

fun main() {
    val outString : String = "안녕하세요!\tHello\r\nWorld!."
    val path ="E:\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.use{
        it.println(outString)
    }

    File(path).printWriter().use{it.println(outString)}
    File(path).bufferedWriter().use{it.write(outString)}
}
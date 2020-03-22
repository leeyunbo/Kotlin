package chap10

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

/**
 * 파일에 입력하는 예제
 * Paths 클래스를 이용하여 경로를 지정해주고, toByteArray()를 이용하여 Byte 배열로 변환 시켜준다.
 * CREATE 옵션은, 파일이 없으면 파일을 생성한다. 
 */

fun main() {
    val path = "D:\\test\\hello.txt"
    val text = "안녕하세요!"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch(e:IOException) {

    }
}
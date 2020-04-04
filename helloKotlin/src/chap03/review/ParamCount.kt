package chap03.review

/**
 * 람다식 매개변수 갯수에 따른 예제
 * 만약 매개변수를 사용하고 싶지 않을 때는 언더스코어를 사용하면 된다
 */
fun main() {
    noParam({"Hello World"})
    oneParam({a -> "Hello World $a"})
    oneParam({"Hello World $it"})
    twoParam({a,b -> "Hello World $a $b"})
    twoParam({_,b -> "Hello World $b"})

}

private fun noParam(out: () -> String) = println(out())

private fun oneParam(out: (String) -> String) = println(out("OneParam"))

private fun twoParam(out: (String,String) -> String) = println(out("Two","Param"))
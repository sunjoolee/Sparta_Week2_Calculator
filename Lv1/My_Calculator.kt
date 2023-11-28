fun main() {
    val calculator1 = Calculator()

    var input:String = ""
    while(input != "q"){
        println("계산할 수식을 입력하세요. (종료: q)")
        input = readLine() ?: ""
        calculator1.calculate(input)
    }
    println("계산기가 종료되었습니다.")
}

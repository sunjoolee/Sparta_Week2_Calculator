fun main() {
    val calculator1 = Calculator()

    var input:String = ""
    while(input != "q"){
        println("계산할 수식을 입력하세요. (계산기 종료: q)")
        input = readLine() ?: ""
        //input 확인
        if(input == ""){
            println("error! 연산식이 입력되지 않았습니다.")
            continue
        }
        
        //첫 연산식을 입력받은 경우:
        calculator1.calculateNewInput(input)

        while(input != "c" && input != "q"){
            println("추가 연산을 입력하세요. (연산 종료: c,계산기 종료: q)")
            input = readLine() ?: ""
            //input 확인
            if(input == ""){
                println("error! 연산식이 입력되지 않았습니다.")
                continue
            }
            if(input == "c" || input == "q") break

            //추가 연산을 입력받은 경우:
            calculator1.calculateNextInput(input)
        }
    }
    println("계산기가 종료되었습니다.")
}

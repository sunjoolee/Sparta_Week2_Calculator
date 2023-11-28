class Calculator {
    var a:Double = 0.0
    var op:Char = ' '
    var b:Double = 0.0

    init{
        println("계산기가 생성되었습니다.")
    }

    //사칙연산 함수
    fun add():Double{
        val output = a + b
        println("= ${output}")
        return output
    }
    fun sub():Double{
        val output = a - b
        println("= ${output}")
        return output
    }
    fun div():Double{
        val output = a / b
        println("= ${output}")
        return output
    }
   fun mul():Double{
       val output = a * b
       println("= ${output}")
       return output
   }

    //연산자 종류에 따라 사칙연산 함수 호출
    //연속적인 추가 연산을 위헤 a에 연산 결과 저장
    fun calculate(){
        when(op){
            ' ' -> println("error! 연산자가 입력되지 않았습니다.")
            '+' -> a = add()
            '-' -> a = sub()
            '/' -> if(b == 0.0) println("error! 0으로 나눌 수 없습니다.") else a = div()
            '*' -> a = mul()
            else -> println("error! 유효한 연산자가 아닙니다.")
        }
    }

    //첫 연산식을 입력받은 경우: input 문자열을 a,연산자,b로 나누기
    fun calculateNewInput(input:String){
        if(input == ""){
            println("error! 연산식이 입력되지 않았습니다.")
            return
        }
        for(i in 0 until input.length){
            if(input[i] == '+'|| input[i] == '-'|| input[i] == '/'|| input[i] == '*'){
                a = input.substring(0, i).toDouble()
                op = input[i]
                b = input.substring(i+1).toDouble()
                break;
            }
        }
        calculate()
    }
    
    //추가 연산을 입력받은 경우: input 문자열을 연산자,b로 나누기
    fun calculateNextInput(input:String){
        if(input == ""){
            println("error! 연산식이 입력되지 않았습니다.")
            return
        }
        for(i in 0 until input.length){
            if(input[i] == '+'|| input[i] == '-'|| input[i] == '/'|| input[i] == '*'){
                op = input[i]
                b = input.substring(i+1).toDouble()
                break;
            }
        }
        calculate()
    }
}

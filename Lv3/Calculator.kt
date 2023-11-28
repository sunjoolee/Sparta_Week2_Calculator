class Calculator {
    var a:Double = 0.0
    var op:Char = ' '
    var b:Double = 0.0

    var addOperation = AddOperation()
    var substractOperation = SubstractOperation()
    var divideOperation = DivideOperation()
    var multiplyOperation = MultiplyOperation()

    init{
        println("계산기가 생성되었습니다.")
    }

    //연산자 종류에 따라 사칙연산 함수 호출
    fun calculate(){
        when(op){
            ' ' -> println("error! 연산자가 입력되지 않았습니다.")
            '+' -> a = addOperation.calculateOutput(a,b)
            '-' -> a = substractOperation.calculateOutput(a,b)
            '/' -> a = divideOperation.calculateOutput(a,b)
            '*' -> a = multiplyOperation.calculateOutput(a,b)
            else -> println("error! 유효한 연산자가 아닙니다.")
        }
    }

    //첫 연산식을 입력받은 경우: input 문자열을 a,연산자,b로 나누기
    fun calculateNewInput(input:String){
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

class DivideOperation() : Operation() {
    override fun performOperation(a:Double, b:Double): Double = a / b
    override fun calculateOutput(a: Double, b: Double): Double {
        if(b == 0.0) {
            println("error! 0으로 나눌 수 없습니다.")
            return a
        }

        val output = performOperation(a,b)
        println("= ${output}")
        return output
    }
}

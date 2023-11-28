open abstract class Operation() {
    abstract fun performOperation(a:Double, b:Double):Double
    
    open fun calculateOutput(a:Double, b:Double):Double{
        val output = performOperation(a,b)
        println("= ${output}")
        return output
    }
}

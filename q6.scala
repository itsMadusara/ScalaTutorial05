object q6 extends App{
    def fibonacci(n:Int):Int= n match{
        case x if x==0 => 0
        case x if x==1 => 1
        case x => fibonacci(n-1)+fibonacci(n-2)
    }

    def fibonacciSeq(n:Int):Unit= {
        if (n > 0) fibonacciSeq(n-1)
        println(fibonacci(n))
    }

    fibonacciSeq(10)

}
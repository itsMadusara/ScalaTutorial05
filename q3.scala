object Q3 extends App{
    var tot:Int=0;
    def sum(n:Int):Int = n match{
        case 1 => return 1
        case _ => return n+sum(n-1)
    }
    print(sum(5));
}
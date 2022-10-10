import java.util.Scanner
fun main(){
    print10num()
    sum2()
}
fun print10num(){   //User defined function for printing 10 numbers
    for(i in 1..10)
        println(i)
}

//Program to find sum of 2 numbers with function
fun sum2(){
    val reader = Scanner(System.`in`)
    println("Enter two integers to add:")
    val x = reader.nextInt()
    val y = reader.nextInt()
    val sum = sum2num(x,y)
    println("$x + $y = $sum")
}
fun sum2num(x: Int,y: Int):Int{
    val z:Int
    z = x+y
    return z
}
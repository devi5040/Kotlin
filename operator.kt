fun main(){
    //Arithmetic Operators
    val x = 10
    val y = 20
    val sum = x + y //Addition
    val diff = x-y //Subtraction
    val mul = x*y //Multiplication
    val quo = x / y //Quotient
    val rem = x%y //Remainder
    println("$sum\t$diff\t$mul\t$quo\t$rem\n")
    //Logical and Comparison
    val a = true
    val b = false
    val and = a && b //Logical and
    val or = a|| b //Logical or
    val not = !a //Logical not
    val equal = (a==b)//returns true if a and b are same
    val not_equal = (a!=b) //Returns true if a and b are not equal
    println("$and\t$or\t$not\t$equal\t$not_equal")
}
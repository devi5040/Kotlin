fun main(){
    //if statement
    val a = true
    if(a)
    {
        println("a is true")
    }

    //if-else statement
    val b = false
    if(b)
    {
        println("b is true")
    }
    else
    {
        println("b is false")
    }

    //if-else ladder
    println("Enter any positive value:")
    val input = readLine() ?: "1"//null values
    if(input.toInt()==0)
    {
        println("Input is 0")
    }
    else if(input.toInt()==1)
    {
        println("Input is 1")
    }
    else if (input.toInt() == 2)
    {
        println("Input is 2")
    }
    else if(input.toInt()==3)
    {
        println("Input is 3")
    }
    else
    {
        println("Input is greater than 3")
    }

}
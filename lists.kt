fun main(){
    val num_list = listOf<Int>(10,20,30,40,50) //Immutable in default
    println(num_list[0])
    val floatList = listOf<Float>(11.1F,20.2F,30.3F,40.4F)
    println(floatList)
    val stringList = listOf<String>("cat","dog","cow")
    println(stringList)

    //Mutable Lists
    val num_list = mutableListOf<Int>(10,20,30,40,50)
    num_list[3] = 90
    println(num_list)
}
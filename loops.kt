fun main(){
    var count = 1
    while(count <= 10)
    {    
        println(count)
        count++
    }
    var string_list = listOf<String>("A","B","C","D","E")
    var c = 0
    while(c < string_list.size){
       print(string_list[c]+"\t")
       c++
    }
    println()
    for(i in 1..10){
        println(i)
    }
    for(str in string_list){
        println(str)
    }
}
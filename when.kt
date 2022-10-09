fun main(){
    val x = 5
    when(x){
        in 1..3->println("Value is between 1 and 3")
        in 4..10->println("Value is between 4 and 10")
        else->{
            println("Value is not in between 1 and 10")
        }
    }
}
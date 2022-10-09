fun main() {
    val x = readLine() ?: "0"
    val y = readLine() ?: "0"
    val sum = x.toInt()+ y.toInt()
    println(sum)
    /*
    val x = readLine()
    val y = readLine()
    val sum = x.toInt() + y.toInt() <-----It gives Error because readLine() returns  nullable value------->
    val sum = x?.toInt() + y?.toInt() <----It executes only if variables are not null ------->
    val sum = x!!.toInt() + y!!.toInt() <----The program crash if variables are null------->
     */
}
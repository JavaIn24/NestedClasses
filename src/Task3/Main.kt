package Task3

fun main(){
    val numbArray = intArrayOf(4,2,0,7,8,9,0,1,2,3,4,5,6)
    var start = 0
    var end = 0
    var count = 0
    for (i in 1..<numbArray.size){
        if (numbArray[i - 1] == 0 && numbArray[i] !=0){
            start = i
        } else if (numbArray[i - 1] != 0 && numbArray[i] == 0 && start > 0){
            end = i
            count += end - start
        }
    }
    println(count)
}

fun main(args: Array<String>) {
    val rebels = arrayListOf("solo", "Luke", "Brie", "Kerry")//loops are used to access information or chnage information
    val rebelVehicles= hashMapOf("solo" to "millenium falcon", "Luke" to "landSpeeder", "boba" to "fett")

    for(rebel in rebels){
        println("name: $rebel")
    }

    for ((key,value)in rebelVehicles) {
        println("$key gets in the $value")
    }
    var x=10
    while (x>0){
        println(x)
        x--//means x-1
    }
}
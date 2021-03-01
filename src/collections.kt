fun main(args: Array<String>) {
    val imperials = listOf("emperor", "darth", "Boba", "Tarkin")//can be changed
    println("imperial.sorted()")
    println()
    println(imperials[2])
    println(imperials.contains("lazy"))

    var rebels = arrayListOf("kerry", "tyrone", "luke")//cannot be changed
    println(rebels.size)
    rebels.add("chewbanca")//adding a value into an array
    println(rebels)
    rebels.add(0, "swiuy")
    println(rebels)
    println(rebels.indexOf("luke"))
    rebels.remove("kerry")

//a map is a collection of unordered key value pairs. you cant have duplicate value pairs eg phone numbers
    val rebelVehiclesMaps = mapOf("solo" to "millenium falcon", "Luke" to "landSpeeder")//key to value
    println(rebelVehiclesMaps["solo"])
    println(rebelVehiclesMaps.getOrDefault("swiuy","this ship doesnt exist"))
    println(rebelVehiclesMaps.get("solo"))
    println(rebelVehiclesMaps.values)//prints out all the values
    println(rebelVehiclesMaps.keys)//prints out all the keys

    val rebelVehicles= hashMapOf("solo" to "millenium falcon", "Luke" to "landSpeeder", "boba" to "fett")
    rebelVehicles["luke"]="xWing"
    rebelVehicles.put("leiah","Tantive")
    rebelVehicles.remove("boba")
    println(rebelVehicles)


}
fun main(args: Array<String>) {
    fun forceChoke(){
        println("you have failed me for the last time Admiral..")
    }
    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }
    makeAnEntrance (  "i find your lack of faith disturbing")

    fun calculateNumberGoodGuys(rebels: Int,eworks: Int) : Int{
        val goodGuys= rebels + eworks
        return goodGuys
    }
     val rebels=calculateNumberGoodGuys( 5,  6)
    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5,7)} rebel scum")

    fun viderIsFeeling(mood: String= "angry"){
        println(mood)
    }
    viderIsFeeling()
    viderIsFeeling(mood= "happy")

}
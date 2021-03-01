fun main(args: Array< String>) {
    val str= "hey there i am awesome"
    println(str)

    val contentEquals = str.contentEquals("may the force be with you").apply {
        println(this)
    }
    val subsequence= str.subSequence(4,13)
    println(subsequence)

    val brian= " brian studio"
    val lightSaberColour= "black car"
    val vehicle= "v8"
    println("$brian has a $lightSaberColour and is $vehicle" )
}

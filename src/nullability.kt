fun main(args: Array<String>) {
    var name: String="Baby"
   // name=null

    var nullableName: String? ="Do i really exist"
    nullableName= "baby"

    //null check
    var length=0
    if (nullableName !=null){
     length=nullableName.length}

    else{
        length=-1
    }
     println(length)

    val l= if(nullableName !=null) nullableName.length else -1//more concise way of doing null check

    //second method safe call operator(?)
    println(nullableName?.length)

    //third method is Elvis operator
    var len= nullableName?.length ?: -1
    val noName= nullableName?:"No one kmows me"
    println(noName)
}
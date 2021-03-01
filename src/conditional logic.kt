fun main(args: Array<String>) {
    val a=2
    val b=3
    if(a==b){
        println("a does in fact equal b")
    }
    if (a!=b){
        println(" a does not equal to b")
    }
    val accountBalance=1000
    val price= 500

    if (accountBalance>= price){
        println("you can buy this item")
    }
    else{
        println("sorry you are broke")
    }
    val degrees= 20
    if(degrees>=70){
        println("this is some nice weather")
    }
    else if(degrees<70&& degrees>=50)
    {
        println("grab a sweater")
    }
    else{
        println("holy crap it is cold")
    }
    fun vaderIsFeeling(mood: String= "angry"){
        if(mood=="angry"){
            println("run Vader is angry")
        }
        else{
            println("relax Vader is in a good mood")
        }
    }
     vaderIsFeeling(mood="happy")

}


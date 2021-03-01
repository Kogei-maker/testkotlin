import java.security.KeyStore

fun main(args: Array<String>) {
    val printMessage ={message: String-> println(message)}//parameters are declared on the left side of the arrow
    //on the right side is what is returned
    printMessage("hello world")

    val sumA= {x: Int, y:Int -> x + y}
    println(sumA(7,6))

    fun downloadData(url:String,completion: () ->Unit){
        //sent a download request
        //we got back data
        //there were no network errors
        completion()
    }
    //call downloadData function
    downloadData(url = "http.com"
    ) {
        println(
            "the code in this block will only execute " +
                    "after completion()"
        )
    }
    fun downloadCarData(url: String, completion:(Car)-> Unit){
        //sent a download request
        //got back data
        val car= Car("V8","f-1345","black")
        completion(car)
    }
      downloadCarData("fake url.com"){ Car ->
          println(Car.model)
          println(Car.colour)
      }
     fun downloadTruckData(url:String, completion:(Truck?,Boolean)-> Unit){
         //make web request
         //got data back
         val webRequestSuccess= true
         if(webRequestSuccess){
             //we received truck data
             val truck= Truck("Ford","f-150",1000)
             completion(truck,true)
         }
         else{completion(null, false)
     }
         downloadTruckData(url = "fake url.com") { truck, Success ->
             if(Success==true){
                 truck?.tow()
            //do sth with our truck
             }else{
                 //handle web request failure
                 println("something went wrong")
             }
         }

      }
}
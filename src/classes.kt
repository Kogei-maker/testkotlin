import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt

//a class wont do anything until we create a blueprint of the class
//a constructor is what we call when we are ready to create an instance of a class
//class Car(val model: String, val make: String,var colour: String){
//    fun accelerate(){
//        println("voom voom")
//    }
//    fun details(){
//        println("this is a $colour $make $model")
//
//    }
//}
//class Truck(val make:String, val model:String, val towingCapacity:Int) {
//    fun tow() {
//        println("taking the horses to the rodeo")
//    }
//    fun details(){
//        println("the $make $model has a towing capacity of $towingCapacity")
//    }
//}
open class Vehicle(val make:String, val model:String){
    open fun accelerate(){
        println("vroom vroom")
    }
    fun park(){
        println("parking the vehicle")
    }
}
class Car(make: String,model:String,var colour:String): Vehicle(model,make){
    override fun accelerate() {
        println("droo droo")//leaving at super.accelerate will print both functions
    }
}
class Truck(make:String,model:String,varcapacity:Int): Vehicle(model,make){
    fun tow(){
        println("it raced faster to the mountains")
    }
}

fun main(args: Array<String>){
    val tesla= Car("Tesla","model5","black")
    tesla.accelerate()

    val truck= Truck("ford","f-150",1000)
    truck.accelerate()
}
//{
//    val car= Car("Avalon","Toyota","purple")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//
//    val truck= Truck("ford", "f-150",15000)
//    truck.tow()
//    truck.details()
//}
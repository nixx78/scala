package lv.nixx.poc.scala.domain

class Customer (name : String, surname: String, age: Int) {
  
   private var _car = ""
   private var _sex = "M"

   // Getter with behavior 
   def car = {
     _car + "getter"
   }

   //   Setter with behavior  
   def car_= (value:String):Unit = _car = { 
         println(value) 
         value +"setter" 
        }   
  
   
   // Simple getter
   def sex = _sex
   
   // Simple setter
   def sex_=  (value:String):Unit = _sex = value

   
   // :Unit - void
   
   override def toString():String = name + ":" + surname + ":" + car + ":" + sex
    
}

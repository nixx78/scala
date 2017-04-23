package lv.nixx.poc.scala.collections

import lv.nixx.poc.scala.domain.Customer
import scala.collection.immutable.HashSet

object Sandbox extends App {
  
    val c = new Customer("name", "surname", 25)
      c.car_=("Audi")
    
      println(c.car);
      println(c);
 
      
    var i = 1
    
    val a = if (i == 1) 10 else 20;
    
    println(a);
    
  
    val c1 = new Customer("name", "surname", 25)
    
    println("s:" + c1.car);
    

  
}
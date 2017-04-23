package lv.nixx.poc

object SimpleConstructions extends App {

  val a = 100

  val x = a match {
    case 100 => 7777
    case 200 => 888
  }

  println(x)

  if (a == 100) {
    println("a = 7777")
  }

  val res = new Simple().sum(10, 20)

  println("res:" + res)

  for (x <- 1 to 5) {
    println(x)
  }

  
}

class Simple extends Ext {

  def sum(a: Int, b: Int): Int = {
    val r = a + b
    log(String.valueOf(r))
    r
  }

  def notDefined(): Unit = {
    ???
  }

}

trait Ext {
  
  def log(message: String) {
    println("Log:" + message)
  }
  
  def notDefined()
  
}
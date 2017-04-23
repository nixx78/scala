package lv.nixx.poc.scala.domain

class Transaction (id : Int, currency: String, amount: BigDecimal) extends Ordered [Transaction] {
  
  def getAmount(): BigDecimal = amount
  def _currency = currency              // Method name = return variable
  
  def compare(that: Transaction): Int = {
    if (this.getAmount() < that.getAmount())
      -1
    else if(this.getAmount() == that.getAmount())
      0
    else
      1
  }
  
  override def toString(): String = id + ":" + currency + ":" + amount
  
}
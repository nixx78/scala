package lv.nixx.poc.scala.collections

import lv.nixx.poc.scala.domain.Transaction

object CollectionsUsage extends App {
  
  val txns =  scala.collection.mutable.SortedSet[Transaction]()
  
  txns += new Transaction(1, "USD", BigDecimal.valueOf(20.00))
  txns += new Transaction(2, "USD", BigDecimal.valueOf(5.00))
  txns += new Transaction(3, "EUR", BigDecimal.valueOf(0.11))
  txns += new Transaction(4, "USD", BigDecimal.valueOf(7.77))
  
  txns.foreach(println)
  
  val s = txns.map(_.getAmount()).sum
  
  println(s)
  
  
}
package lv.nixx.poc.scala.collections

import lv.nixx.poc.scala.domain.Transaction
import scala.collection.mutable.HashSet
import scala.collection.mutable.Map

object CollectionsUsage extends App {

  val txns = scala.collection.mutable.SortedSet[Transaction]()

  txns += new Transaction(1, "USD", BigDecimal.valueOf(20.00))
  txns += new Transaction(2, "USD", BigDecimal.valueOf(5.00))
  txns += new Transaction(3, "EUR", BigDecimal.valueOf(0.11))
  txns += new Transaction(4, "USD", BigDecimal.valueOf(7.77))

  txns.foreach(println)

  val s = txns.map(_.getAmount()).sum
  println(s)

  val txnMap = Map[String, Transaction](
        "888" -> new Transaction(5, "USD", BigDecimal.valueOf(50.00)),
        "999" -> new Transaction(5, "USD", BigDecimal.valueOf(50.00))
  )

  txnMap.put("key1", new Transaction(1, "USD", BigDecimal.valueOf(20.00)))

  txnMap += "key2" -> new Transaction(2, "USD", BigDecimal.valueOf(20.00))
  txnMap += "key3" -> new Transaction(3, "USD", BigDecimal.valueOf(30.00))
  txnMap += "key4" -> new Transaction(4, "USD", BigDecimal.valueOf(40.00))
  txnMap += "key5" -> new Transaction(5, "USD", BigDecimal.valueOf(50.00))

  txnMap.foreach(println)
  
  println(txnMap.get("key4"))
  
  
  txnMap.get("key5") match {
        case Some(i) => println("Got something")
        case None => println("Got nothing")
  }
  
  val t = txnMap.getOrElse("key6", new Transaction(777, "USD", BigDecimal.valueOf(20.00)))
  
  println(t)
  
  val txnAmount = txnMap.get("key5") match  {
        case Some(txn) =>  txn.getAmount()
        case None => 0
  }
  
  println("Txn amount:" + txnAmount)
  

  var map = Map(
    "mykey" -> "myval",
    "myotherkey" -> "otherval"
    )

  map += "nextkey" -> "nextval"

  
  map.foreach(println)
  
}
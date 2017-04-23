package lv.nixx.poc.scala.collections

import scala.collection.mutable.ListBuffer

object SubSequence extends App {
  
  
    val seq = Seq(
        Seq(1,2,3),
        Seq(2,3,9),
        Seq(7,7,4),
        Seq(1,5,4),
        Seq(10,10),
        Seq(10)
        )
  
    println("sequence:" + seq)
    
//    		seq.stream()
//		.flatMap(lst -> lst.stream().map(t->new Pair(lst.hashCode(), t)))
//		.collect(Collectors.toMap( t->t.value, Function.identity(), (e, n) -> {
//			if ( e.seqNum != n.seqNum ) {
//				notUnique.add(n.value);
//			}
//			return n;
//		}));
//  
    
       val unique = new ListBuffer[Int]()
//       val r = seq.flatMap(f=>f.map( t=> (f.hashCode(), t))).map(i => i match { case (s, nr) => println("updating context"); nr })
       
//       val r = seq.flatMap(f=>f.map( t=> (f.hashCode(), t))).collect(pf)
        
//        .toMap( t => h(t._1, t, t._2))
        
//        .toMap(t=>t._1, Predef.identity(), (e, n) = > unique + =  )
      
//      println(unique)
//      println(r)    
    
    
    // One way
//    seq.foreach(f=> println(f.hashCode()))
//    println("==================")
//    // Another way
//    for (n <- seq) println(n.hashCode())
  
}

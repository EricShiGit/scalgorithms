package truthtable

object gates {

  def main(args: Array[String]): Unit = {}
  
  def and(a: Boolean, b: Boolean): Boolean = (a,b) match {
    case (true, true) => true
    case _ 			  => false
  }
  
  def or(a: Boolean, b: Boolean): Boolean = (a,b) match {
    case (true, _) => true
    case (_, true) => true
    case _ 		   => false
  }
  
  def not(a: Boolean): Boolean = a match {
    case true  => false
    case false => true
  }
  
  def equals(a: Boolean, b: Boolean): Boolean = 
    or ( and(a, b), and (not(a), not(b)))
  
  def xor(a: Boolean, b: Boolean): Boolean = 
    not(equals(a,b))
  
  def nand(a: Boolean, b: Boolean): Boolean = 
    not(and(a,b))
  
  def nor(a: Boolean, b: Boolean): Boolean =
    not(or(a,b))
  
  def impl(a: Boolean, b: Boolean): Boolean = 
    or(not(a),b)
    
}
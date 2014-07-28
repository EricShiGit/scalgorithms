package sizeof

object sizeof {

	def trival[A](lst: List[A]): Int = lst.size
	
	//folds
	def lengthFunc[A](lst: List[A]): Int = lst.foldLeft(0){
	  (c, _) => c + 1
	}
	
	def recursiveSimple[A](lst: List[A]): Int = lst match {
	  case Nil => 0
	  case _ :: tail => 1 + recursiveSimple(tail)
	}
	
	//Constant space 
	def recursiveTail[A](lst: List[A]): Int = {
		def length(result: Int, currList: List[A]): Int = currList match {
		  case Nil 		 => result
		  case _ :: tail => length(result + 1, tail) 
		}
		length(0, lst)
	}
	
	def main(args: Array[String]): Unit = {
	  val list = List(1,2,3,4,5,6)
	  val size = trival(list)
	  System.out.println(size)
	}
}
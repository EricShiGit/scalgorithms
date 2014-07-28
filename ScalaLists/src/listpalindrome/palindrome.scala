package listpalindrome

object palindrome {

  def main(args: Array[String]): Unit = {
    var ispalin = List("aexea")
    System.out.println("Is aexea a palin :" + isPalindrome(ispalin))
  }
  
  //reverse method
  def isPalindrome[A](lst: List[A]): Boolean = lst == lst.reverse 
}
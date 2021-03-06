package findelement

object findelement {

  //index number
  def findElement[A](n: Int, lst: List[A]): A =
    if (n >= 0) lst(n)
    else throw new NoSuchElementException

  def recursiveImpl[A](n: Int, lst: List[A]): A = (n, lst) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => recursiveImpl(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {}
  val list = List(1, 2, 3, 4, 5, 6, 7)
  val found = findElement(6, list)
  System.out.println("Found : " + found)

  val foundRecur = recursiveImpl(2, list)
  System.out.println("Found : " + found)
}
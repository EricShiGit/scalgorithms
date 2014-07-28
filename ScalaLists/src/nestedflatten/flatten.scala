package nestedflatten

object flatten {
	def flat(lst: List[Any]): List[Any] = lst flatMap {
	  case ms: List[_] => flat(ms)
	  case e => List(e)
	}
}
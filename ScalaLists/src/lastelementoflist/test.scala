package lastelementoflist
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class testtest extends FunSuite {

  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  test("adding ints") {
    assert(1 + 2 === 3)
  }
  import lastelemoflist._

  test("Testing last element for list -> integers") {
    val list = List(1, 2, 3)
    val lastvalue = lastElement(list)
    assert(3 == lastvalue)
  }

  test("Testing last element for list -> strings") {
    val list = List("first", "second", "third")
    assert("third" == lastElement(list))
  }

  test("Testing empty list -> Exception") {
    val list = null
    try {
      lastElement(list)
    } catch {
      case _: NoSuchElementException => //Expected continue
    }
  }
}
import java.io.PrintStream
import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 10/15/13
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzTest extends Specification with Mockito {
  isolated
  val mockPrinter = mock[PrintStream]

  val fizzBuzzPrinter = new FizzBuzz {
    override val printer = mockPrinter
  }
  "The FizzBuzz method" should {
    "print all numbers 1 to 100" in {
      fizzBuzzPrinter.fizzBuzz
      there was one(mockPrinter).println(1) before mockPrinter.println(2)
      there was one(mockPrinter).println(100) after mockPrinter.println(99)
    }
  }

  "The FizzBuzz method" should {
    "print Fizz for numbers divisible by 3" in {
      fizzBuzzPrinter.fizzBuzz
      there were 33.times(mockPrinter).println("Fizz")
    }
  }




}

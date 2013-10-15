import java.io.PrintStream

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 10/15/13
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzz {
  val printer = new PrintStream(System.out)

  def fizzBuzz {
    for (x <- 1 to 100)  {
      (x%3, x%5) match {
        case(0,0) => printer.println("FizzBuzz")
        case(0,_) => printer.println("Fizz")
        case(_,0) => printer.println("Buzz")
        case(_,_) => printer.println(x)
      }
    }
  }

}

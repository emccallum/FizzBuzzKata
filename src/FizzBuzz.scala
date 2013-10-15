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
      if (x % 3 == 0)
        printer.println("Fizz")
      else
        printer.println(x)
    }
  }

}

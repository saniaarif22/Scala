/**
  * Created by sania.
  */
import java.util.Date;

object Funct {
  def main(args: Array[String]) {
    println("Call by Name:")
    println("Returned value is: " + delayed(time()));
    println()
    println("Variable length args:")
    printStrings("Hi", "How", "are", "you") //Passing 4 args
    printStrings("I'm", "fine") //Passing 3 args
    println()
    println("Default param values:")
    println(addInt()) //Adds default values 5 and 7
    println(addInt(100, 100))
    println()
    println("Named Arguments:") //The order of the parameters don't matter since they are named
    showParams(b=10, a=5)
    println()
    println("Recursive Functions- Factorial:")
    println(factorial(10))
    println()
    

  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime //Return value - keyword 'return' is optional
  }

  /*
  Demonstrating call-by-name
  -- passes a code block to the callee and each time the callee accesses the parameter,
     the code block is executed and the value is calculated.
  */
  def delayed(t: => Long) = {
    //takes a call-by-name param represented by =>
    println("In delayed method")
    println("Param: " + t)
    t //Return value
  }

  /*
  Passing variable length arg lists to a function
   */
  def printStrings(args: String*) = { //"String*" is actually Array[String]
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }
  
  /*
  Default param values for a function
   */
  def addInt( a:Int=5, b:Int=7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    sum
  }
  
  /*
  Named Params
   */
  def showParams (a:Int, b:Int) = {
    println("a = " + a + " b = " + b);
  }
  
    /*
  Recursion
   */

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }
  
  /*
  Higher Order functions -- take a function as arg or return a function
   */
  def apply(f: Int => String, v: Int) = f(v)

  def layout(x: Int) = "In String: (" + x.toString() + ")"


}

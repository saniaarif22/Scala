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

  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime //Return value
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

}

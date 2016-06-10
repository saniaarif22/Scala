/**
  * Created by sania.
  */
import java.util.Date;

object Funct {
  def main(args: Array[String]) {
    println("Call by Name:")
    println("Returned value is: " + delayed(time()));
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

}
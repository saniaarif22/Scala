/**
  * Created by sania on 6/7/16.
  */
object HelloWorld {
  def main (args:Array[String]) {
    var x = 10
    var y = 150
    var z = add(x,y)
    printme("Result is " + z)
  }

  def add (a: Int, b: Int) : Int = {

    return a + b
  }

  def printme (s: String) : Unit = {

    println(s)
  }
}

import scala.collection.mutable.ListBuffer

// https://www.hackerrank.com/challenges/apple-and-orange/problem

object AppleAndOrange {
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    var applesCalculated = new ListBuffer[Int]
    var orangesCalculated = new ListBuffer[Int]
    apples.foreach(x => applesCalculated += (x + a))
    oranges.foreach(y => orangesCalculated += (y + b))

    var reachableApples = applesCalculated.filter(x => (x >= s && x <= t)).length
    var reachableOranges = orangesCalculated.filter(x => (x >= s && x <= t)).length
    println(reachableApples)
    println(reachableOranges)
  }

  def main(args: Array[String]): Unit = {
    countApplesAndOranges(9, 15, 4, 20, Array(6, 5, 2, 10, -2, 0, 6), Array(-6, -5, 3, 0, -1))
  }
}
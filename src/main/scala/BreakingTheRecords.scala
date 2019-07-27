
// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

object BreakingTheRecords {

  def breakingRecords(scores: Array[Int]): Array[Int] = {
    var min, max = scores(0)
    var minCounter, maxCounter = 0
    scores.foreach(x => {
      if(x < min) {
        min = x
        minCounter += 1
      }else if(x > max) {
        max = x
        maxCounter += 1
      }
    })
    val result: Array[Int] = Array(maxCounter, minCounter)
    result
  }

  def main(args: Array[String]): Unit = {
    val result = breakingRecords(Array(10, 5, 20, 20, 4, 5, 2, 25, 1))
    result.foreach(x => println(x))
  }
}

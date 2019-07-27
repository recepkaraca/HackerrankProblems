import scala.collection.mutable.ListBuffer

// https://www.hackerrank.com/challenges/between-two-sets/problem

object BetweenTwoSets {

  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
    val bMin = b.min
    val aDivider = new ListBuffer[Int]
    for(i <- 1 to bMin) {
      var addFlag = true
      for (aElement <- a) {
        if (i % aElement != 0)
          addFlag = false
      }
      if(addFlag == true) aDivider += i
    }

    val result = new ListBuffer[Int]
    for(dividerElement <- aDivider){
      var divideFlag = true
      for(bElement <- b){
        if(bElement % dividerElement != 0)
          divideFlag = false
      }
      if (divideFlag == true) result += dividerElement
    }

    result.length
  }

  def main(args: Array[String]): Unit = {
    println(getTotalX(Array(2, 4), Array(16, 32, 96)))
  }
}

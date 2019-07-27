
// https://www.hackerrank.com/challenges/the-birthday-bar/problem

object BirthdayChocolate {
  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    var result = 0
    for(i <- 0 until s.length + 1 - m){
      var sum = 0
      for(j <- 0 until m){
        sum += s(i + j)
      }
      if(sum == d)
        result += 1
    }
    result
  }

  def main(args: Array[String]): Unit = {
    println(birthday(Array(4), 4, 1))
  }
}

import scala.collection.mutable.ListBuffer

// https://www.hackerrank.com/challenges/grading/problem

object GradingStudents {
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    var returnList: ListBuffer[Int] = new ListBuffer[Int]
    grades.foreach(x => {
      if(x % 5 >= 3) {
        val calc = x + 5 - (x % 5)
        if (calc >= 40)
          returnList += calc
        else
          returnList += x
      }else {
        returnList += x
      }
    })
    returnList.toArray
  }

  def main(args: Array[String]): Unit = {
    val resultArr = gradingStudents(Array(37, 38, 43, 62, 83))
    resultArr.foreach(x => println(x))
  }
}

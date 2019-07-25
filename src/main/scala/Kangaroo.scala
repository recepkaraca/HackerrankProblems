object Kangaroo {

  // https://www.hackerrank.com/challenges/kangaroo/problem
  // o <= x1 <= x2 <= 10000
  
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    if(v2 >= v1) "NO"

    var pos1 = x1
    var pos2 = x2
    while(pos1 <= pos2){
      if(pos1 == pos2) return "YES"
      pos1 += v1
      pos2 += v2
    }
    "NO"
  }

  def main(args: Array[String]): Unit = {
    println(kangaroo(0, 3, 4, 2))
  }
}

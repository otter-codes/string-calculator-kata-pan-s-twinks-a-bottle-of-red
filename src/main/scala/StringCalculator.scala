import scala.util.matching.Regex

object StringCalculator extends App {

  def add(numbers: String): Int = {

    val regexPattern = new Regex("\\d+")

    val numbersMatched = regexPattern.findAllIn(numbers).toList

    val listAsInt = numbersMatched.map(p => p.toInt)

    //println(listAsInt.sum)

    listAsInt.sum

  }

  add("1, 2, 3, 4, 5, 10, 69")

}

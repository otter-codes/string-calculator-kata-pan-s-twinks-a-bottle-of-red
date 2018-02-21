object StringCalculator extends App {

  def add(numbers: String): Int = {

    val numbersMatched = "\\d+".r.findAllIn(numbers).map(p => p.toInt).toList

    numbersMatched.sum

  }

}

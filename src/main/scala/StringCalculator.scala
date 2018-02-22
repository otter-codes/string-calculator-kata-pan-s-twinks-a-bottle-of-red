object StringCalculator {

  def add(numbers: String): Int = {
    if(!numbers.contains('-')) {
      "\\d+".r.findAllIn(numbers).map(p => p.toInt).sum
    }
    else {
      val x = "\\-\\d+".r.findAllIn(numbers).toList
      throw new IllegalArgumentException(s"requirement failed: ${x.mkString(", ")}")
    }
  }
}
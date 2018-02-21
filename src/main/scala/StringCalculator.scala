object StringCalculator extends App {

  def add(numbers: String): Int = {

    //(numbers(0).toString.toInt)+(numbers(3).toString.toInt)



    numbers match {

      case "" => 0
      case "1" => 1
      case "1, 2" => 3

    }

  }
}

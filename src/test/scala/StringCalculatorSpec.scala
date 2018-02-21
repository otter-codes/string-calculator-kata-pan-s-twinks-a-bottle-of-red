import org.scalatest.{MustMatchers, WordSpec}

class StringCalculatorSpec extends WordSpec with MustMatchers {

  "StringCalculator" when {

    "add is called" must {

      "return an empty String if given an empty String" in {
        StringCalculator.add("") mustEqual 0
      }

      "return 1 if given a String with 1" in {
        StringCalculator.add("1") mustEqual 1
      }

      "return 3 if given a String with 1 and 2" in {
        StringCalculator.add("1, 2") mustEqual 3
      }

      "return 15 if given a String with 1, 2, 3, 4, 5" in {
        StringCalculator.add("1, 2, 3, 4, 5") mustEqual 15
      }

      "return 15 if given a String with 1, 2, 3, 4, 5, 10, 69" in {
        StringCalculator.add("1, 2, 3, 4, 5, 10, 69") mustEqual 94
      }

    }
  }
}

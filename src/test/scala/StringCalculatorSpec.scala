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

      "return an 3 if given a String with 1 and 2" in {
        StringCalculator.add("1, 2") mustEqual 3
      }

    }
  }
}

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

      "return 42 if given a String with 42" in {
        StringCalculator.add("42") mustEqual 42
      }

      "return 3 if given a String with 1,2" in {
        StringCalculator.add("1,2") mustEqual 3
      }

      "return 6 if given a String with 1,2,3" in {
        StringCalculator.add("1,2,3") mustEqual 6
      }

      "return 15 if given a String with 1,2,3,4,5" in {
        StringCalculator.add("1,2,3,4,5") mustEqual 15
      }

      "return 94 if given a String with 1,2,3,4,5,10,69" in {
        StringCalculator.add("1,2,3,4,5,10,69") mustEqual 94
      }

      "return 6 if given a String with 1\n2,3" in {
        StringCalculator.add("1\n2,3") mustEqual 6
      }

      "return 3 if given a String with //;\n1;2" in {
        StringCalculator.add("//;\n1;2") mustEqual 3
      }

      "return an IllegalArgumentException if given a String with 1,-2,-3" in {
        StringCalculator.add("1,-2,-3") mustEqual "requirement failed: -2,-3"
      }

    }
  }
}

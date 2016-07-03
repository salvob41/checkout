package salvob

import org.scalatest._

class CheckoutTest extends FlatSpec with Matchers {
  val correctItems = Array("apple", "orange", "orange")
  "Total" should "show the results" in {
    Checkout.getTotal(correctItems) should be(1.1)
  }

  val incorrectItems = Array("apl", "fea", "anas", "borr")
  "Total" should "get wrong items and ignore them" in{
    Checkout.getTotal(incorrectItems) should be (0)
  }

}

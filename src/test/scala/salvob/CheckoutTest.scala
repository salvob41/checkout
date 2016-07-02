package salvob

import org.scalatest._

class CheckoutTest extends FlatSpec with Matchers {
  val correctItems = List("apple", "orange", "orange").toArray

  "Total" should "show the results" in {

    Checkout.getTotal(correctItems) should be(1.1)
  }

}

package salvob

import scala.collection.mutable.ListBuffer

object Checkout {
  lazy val arrayItem = Map("apple" -> 0.60, "orange" -> 0.25)
  var total: Double = 0
  var fruits = new ListBuffer[String]()

  def getTotal(items:Array[String]): Double ={

    items.foreach(elem => {
      if (arrayItem.contains(elem.toLowerCase)) {
        total += arrayItem(elem.toLowerCase)
        fruits += elem
      }

    })
    total
  }

  def main(args: Array[String]) {

    val total = getTotal(args)
    val m = fruits.map(_.capitalize).groupBy(identity).mapValues(_.size)
    println(fruits.map(_.capitalize).mkString("[ ", ", ", " ]") + "=> £" + f" $total%1.2f")
    println(m)

  }


}

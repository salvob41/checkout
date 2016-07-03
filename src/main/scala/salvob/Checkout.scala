package salvob

import scala.collection.mutable.ListBuffer

/**
  *
  */
object Checkout {

  lazy val arrayItem = Map("apple" -> 0.60, "orange" -> 0.25)
  var total: Double = 0
  var fruits = new ListBuffer[String]()

  /**
    * Function that get the list of items [can be just Apple or Oranges] and return
    * @param items list of strings passed by the users. Ignoring items that are not sold
    * @return the total amount spent by the users
    */
  def getTotal(items:Array[String]): Double ={
    this.total = 0

    items.foreach(elem => {
      if (arrayItem.contains(elem.toLowerCase)) {
        this.total += arrayItem(elem.toLowerCase)
        fruits += elem
      }

    })

    this.total
  }

  def main(args: Array[String]) {
    val total = getTotal(args)
    val m = fruits.map(_.capitalize).groupBy(identity).mapValues(_.size)
    println(fruits.map(_.capitalize).mkString("[ ", ", ", " ]") + "=> £" + f" $total%1.2f")
    println(m)
  }

}

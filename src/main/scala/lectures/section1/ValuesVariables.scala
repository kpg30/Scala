/** ============================================ **/
// Author: Prasad
// Date: 13-12-2022
// Topic: Functions in Scala
/** ============================================ **/

package lectures.section1
object ValuesVariables extends App {

  val x: Int = 42  // 'val' is Immutable
  println(x)
  val y = 42  // compiler can 'infer schema'
  // val z :Int = "prasad" //if you define type, you should provide same type.

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables 'var' are mutable
  var aVariable: Int = 4

  aVariable = 5 // side effects

}

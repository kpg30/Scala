/**
Author: Prasad
Date: 13-12-2022
Topic: Expressions
 **/

package lectures.section1
object Expressions extends App {

  val x = 3 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println {
    1 == x
  }
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  println("=====================================================================")

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)


  val someValue = {
    2 < 3
  }
  println(someValue)



}
/**
Author: Prasad
Date: 23-12-2022
Topic: Functions in Scala
**/
package lectures.section1
object Functions extends App {

  def add(a: String, b :Int): Any = {
    a + " " + b
  }
  val b = add("prasad",4)
  println(b)

  def aParameterLess(): Int = 22
  println(aParameterLess())

  def aRepeatFunction(ab: String, bb: Int) : String = {
    if (bb == 1) ab
    else ab + aRepeatFunction(ab, bb-1)
  }
    println(aRepeatFunction("prasad", 4))


}

/* ============================================ */
// Author: Prasad
// Date: 23-12-2022
// Topic: Functions in Scala
/* ============================================ */

package lectures.section1
import io.Codec.string2codec

object Functions extends App {

  def add(a: String, b :Int): Any = {
    a + " " + b
  }
  val b = add("prasad",4)
  println(b)

  def aParameterLess(): Int = 22
  println(aParameterLess())

  def aRepeatFunction(a: String, b: Int) : String = {
    if (b == 1) a
    else a + aRepeatFunction(a, b-1)
  }
    println(aRepeatFunction("prasad", 2))

  // WHEN YOU NEED LOOPS, USE RECURSION.
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }
  println(aBigFunction(4))

  /*
     Exercises:
     1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
     2.  Factorial function 1 * 2 * 3 * .. * n
     3.  A Fibonacci function
         f(1) = 1
         f(2) = 1
         f(n) = f(n - 1) + f(n - 2)
     4.  Tests if a number is prime.
    */

  def greetings(name : String, age: Int) : Any =
    "Hi, My name is " + name + " and i am " + age + " years old."
  println(greetings("prasad",29))

  def factorial(n : Int) : Int =
    if (n <= 0 ) 1
    else n * factorial(n-1)

  println("factorial of given number is : " + factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  // 1 1 2 3 5 8 13 21
  println("fibonacci series of given number is : " + fibonacci(8))

  def fibonacci2(n: Int): Int = {
    n match {
      case i if i < 2 => i
      case i => fibonacci2(n - 1) + fibonacci2(n - 2)
    }
  }
  println("fibonacci series of given number is : " + fibonacci2(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
  println("given number is prime : " + isPrime(37))
  println("given number is prime : " + isPrime(2003))
  println("given number is prime : " + isPrime(37 * 17))

}

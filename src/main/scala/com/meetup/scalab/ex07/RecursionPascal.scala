package com.meetup.scalab.ex07

object RecursionPascal {

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * The following pattern of numbers is called Pascal’s triangle.

          1
         1 1
        1 2 1
       1 3 3 1
      1 4 6 4 1
         ...

      The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum of the two numbers above it.
      Write a function that computes the elements of Pascal’s triangle by means of a recursive process.

      Do this exercise by implementing the pascal function in Main.scala, which takes a column c and a row r,
      counting from 0 and returns the number at that spot in the triangle. For example, pascal(0,2)=1,pascal(1,2)=2 and pascal(1,3)=3.
    */
  def pascal(c: Int, r: Int): Int = ???

}

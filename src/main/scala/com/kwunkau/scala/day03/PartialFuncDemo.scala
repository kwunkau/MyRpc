package com.kwunkau.scala.day03

object PartialFuncDemo  {

  def func1: PartialFunction[String, Int] = {
    case "one" => {
      println("one case")
      1
    }
    case "two" => 2
    case _ => -1
  }

  def func2(num: String) : Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]) {
    println(func1("two"))
    println(func2("one"))
  }
}

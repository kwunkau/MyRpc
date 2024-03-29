package com.kwunkau.scala.day03

import scala.util.Random


object CaseDemo02 extends App{

  //val x = 3
  //val v = if(x >= 5) 1 else if(x < 2) 2.0 else "hello"
  val arr = Array("hello", 1, -2.0, CaseDemo02)
  val elem = arr(Random.nextInt(arr.length))

  println(elem)

  elem match {
    case x: Int => println("Int " + x)
    case y: Double if(y >= 0) => println("Double "+ y)
    case z: String => println("String " + z)
    case _ => throw new Exception("not match exception")
  }

}
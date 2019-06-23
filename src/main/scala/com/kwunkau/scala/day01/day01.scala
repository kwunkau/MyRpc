package com.kwunkau.scala.day01

/**
  * @Date 2019/5/30 0030 20:46
  * @Created by kwunkau
  */

object day01 {
  def main(args: Array[String]) {

    //    val不可变，var可变
    val s=1
    var s1="hello"
    s1="a"
    println(s)
    println(s1)

    /*Chapter 2
    val x = 1
    //判断x的值，将结果赋给y
    val y = if (x > 0) 1 else -1
    //打印y的值
    println(y)

    //支持混合类型表达式
    val z = if (x > 1) 1 else "error"
    //打印z的值
    println(z)

    //如果缺失else，相当于if (x > 2) 1 else ()
    val m = if (x > 2) 1
    println(m)

    //在scala中每个表达式都有值，scala中有个Unit类，写做(),相当于Java中的void
    val n = if (x > 2) 1 else ()
    println(n)

    //if和else if
    val k = if (x < 0) 0
    else if (x > 1) 1 else -1
    println(k)
    */
/*chapter 3
    //for(i <- 表达式),表达式1 to 10返回一个Range（区间）
    //每次循环将区间中的一个值赋给i
    for (i <- -1 to 10)
      print(i + " ")
    println()

    //for(i <- 数组)
    val arr = Array("a", "b", "c")
    for (i <- arr)
      print(i + " ")
    println()

    //高级for循环
    //每个生成器都可以带一个条件，注意：if前面没有分号
    for(i <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 * i + j) + " ")
    println()

    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val v = for (i <- 1 to 10) yield i * 10
    println(v)
*/


  }
}

 
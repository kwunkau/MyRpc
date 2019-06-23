package com.kwunkau.scala.day01

/**
  * @Date 2019/5/30 0030 21:38
  * @Created by kwunkau
  */
object day01_s3 {
  def main(args: Array[String]) {
    val list0 = List(1, 3, 5, 4, 2, 6, 7, 8, 9, 10)
    val list1 = list0.filter(_ % 2 == 0).map(_ * 10)
    val list2 = list0.filter(x => x % 2 == 0).map(x => x * 10)
    println(list0)
    println(list1)
    println(list2)

    //排序
    println(list0.sorted)
    //排序反转
    println(list0.sorted.reverse)

    //元素分成4组
    println(list0.grouped(4))
    println(list0.grouped(4).toList)
    //查看组内有多少个元素
    println(list0.grouped(4).map(_.size).toList)
    //压扁
    println(list0.grouped(4).toList.flatten)

    //计算单词次数
    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    val result = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t => (t._1, t._2.size))
    println(result)
    val result1 = result.toList.sortBy(_._2).reverse
    println(result1)

    val result3 = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
    println(result3)
  }

}

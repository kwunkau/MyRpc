package com.kwunkau.scala.day01

/**
  * @Date 2019/5/30 0030 21:13
  * @Created by kwunkau
  */
object day01_s2 {
    //定义一个方法
    //方法m2参数要求是一个函数，函数的参数必须是两个Int类型
    //返回值类型也是Int类型
    def m1(f: (Int, Int) => Int) : Int = {
      f(10, 10)
    }

    def m2(x:Int,y:Int):Int = x*y

    //定义一个函数f1，参数是两个Int类型，返回值是一个Int类型
    val f1 = (x: Int, y: Int) => x + y
    //再定义一个函数f2
    val f2 = (m: Int, n: Int) => m * n

    //main方法
    def main(args: Array[String]) {
      //打印f1方法
      println(f1(10,10))
      //打印f2方法
      println(f2(10,10))

      //调用m1方法，并传入f1函数
      val r1 = m1(f1)
      println(r1)

      //调用m1方法，并传入f2函数
      val r2 = m1(f2)
      println(r2)

      //方法换成函数
      val p =m2 _
      println(p)
//      println(m2) 报错，方法不能打印


    }

}

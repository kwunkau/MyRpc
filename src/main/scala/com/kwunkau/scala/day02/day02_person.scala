package com.kwunkau.scala.day02

/**
  * @Date 2019/5/30 0030 23:20
  * @Created by kwunkau
  */

class day02_person {

  //用val修饰的变量是只读属性，有getter但没有setter
  //（相当与Java中用final修饰的变量）
  val id = "9527"

  //用var修饰的变量既有getter又有setter
  var age: Int = 18

  //类私有字段,只能在类的内部使用（即派生对象）
  private var name: String = "唐伯虎"

  //对象私有字段,访问权限更加严格的，Person类的方法只能访问到当前对象的字段
  private[this] var pet: String = _

  def pet_def = {
    println(pet)
  }

}

object day02_person {
  def main(args: Array[String]): Unit = {
    val a = new day02_person
    println(a.id)
    println(a.age)
    println(a.name)
    //加上println会出现()
    a.pet_def
  }


}
 
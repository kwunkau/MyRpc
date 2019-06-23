package com.kuwnkau.Rpc

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

class Master extends Actor {

  println("Master函数")

  //crtl+o 构造方法
  override def preStart(): Unit = {
    println("preStart invoked")
  }

  //接收信息的
  override def receive: Receive = {
    case "connect" => {

      println("一个worker连接上")
      sender ! "reply"

    }

    case "Hello" => {
      println("Hello")

    }

  }
}

object Master {
  def main(args: Array[String]): Unit = {
    val host = args(0)
    val port = args(1).toInt
    // 准备配置
    val configStr =
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = "$host"
         |akka.remote.netty.tcp.port = "$port"
       """.stripMargin
    val config = ConfigFactory.parseString(configStr)
    //ActorSystem老大，辅助创建和监控下面的Actor，他是单例的
    val actorSystem = ActorSystem("MasterSystem", config)
    //创建Actor, 起个名字
    val master = actorSystem.actorOf(Props[Master], "Master") //Master主构造器会执行

  }

}

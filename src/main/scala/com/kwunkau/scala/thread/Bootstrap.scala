package com.kwunkau.scala.thread

/**
  * Created by ZX on 2016/3/29.
  * 从spark中扣出来的消费, 启动入口
  */
object Bootstrap {

  def main(args: Array[String]) {
    val eventLoop = new TaskProcessEventLoop("task-event-loop")
    eventLoop.start()
    for (i <- 1 to 10) {
      eventLoop.post(TaskSubmitted(s"task-$i"))//把任务放到队列中
    }
    Thread.sleep(10000)
  }
}

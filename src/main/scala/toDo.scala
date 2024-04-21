
import scala.io.StdIn.readLine
object toDo extends App {
  private class Task(){
    private var allTasks= Map[Int,String]()
    private var taskNum:Int =0
    def behaviour():Unit={
      println("Curent Tasks are :")
      listTasks()
      println("press n to to tick task,press a to add, anything else to quit")
      val input = readLine()
      val beh: Unit =input match{
        case "n" =>
        println("write number of task to tick Done")
        val tick = readLine()
        remTask(tick)
        case "a"=>
          getTask()
          behaviour()
        case _ =>    System.exit(0)
    }
    }
    private def remTask(taskKey:String): Unit ={
      allTasks=allTasks--List(taskKey.toInt)
      taskNum = taskNum - 1
      behaviour()
    }
    def getTask(): Unit ={
      println("Write your task")
      val task = readLine ()
      taskNum = taskNum + 1
      val tsk=taskNum
      allTasks= allTasks +(tsk->task)
    }
     private def  listTasks():Unit ={
      allTasks.foreach(println)
    }
  }
  private val aTask= new Task()
  aTask.behaviour()
}

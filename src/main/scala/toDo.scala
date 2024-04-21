
import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer
object toDo extends App {
  class Task(){
    var allTasks= Map[Int,String]()
    var taskNum:Int =0
    def behaviour():Unit={
      println("Curent Tasks are :")
      listTasks()
      println("press n to to tick task,press a to add, anything else to quit")
      val input = readLine()
      val beh=input match{
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
    private def remTask(taskKey:String)={
      allTasks=allTasks--List(taskKey.toInt)
      taskNum = taskNum - 1
      behaviour()
    }
    private def getTask() ={
      println("Write your task")
      val task = readLine ()
      taskNum = taskNum + 1
      val tsk=taskNum
      allTasks= allTasks +(tsk->task)
    }
     def  listTasks():Unit ={
      allTasks.foreach(println)
    }
  }
  val aTask= new Task()
  aTask.behaviour()
}

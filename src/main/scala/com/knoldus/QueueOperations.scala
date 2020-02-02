package com.knoldus

trait QueueOperations{
  def performEnqueue(list: List[Int],input:Int):List[Int]

  def performDequeue(list:List[Int]):List[Int]=
  {
    list.tail
  }
}
class ListDouble extends  QueueOperations {
  override  def performEnqueue(list : List[Int],input :Int):List[Int]={
    val doubleResult=input*2
    list:+doubleResult
  }

}

class ListSquare extends  QueueOperations {
  override  def performEnqueue(list : List[Int],input :Int):List[Int]={
    val squareResult=input*input
    list:+squareResult;
  }

}

object QueueWork extends App{
  val objectDouble=new ListDouble
  val objectSquare=new ListSquare
  val objectDequeue=new ListDouble
  println( objectDouble.performEnqueue(List(1,22,3),6))
  println( objectSquare.performEnqueue(List(1,3,1),6))
  println( objectDouble.performDequeue(List(1,2,3,6)))
}

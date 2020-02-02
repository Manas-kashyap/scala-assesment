package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    if (this.name == that.name) {
      this.age - that.age
    }
    else {
      this.name.length - that.name.length
    }
  }
}

object Person extends App {

  val personOne = new Person("test", 30)
  val personTwo = new Person("testcase", 39)
  val check = personOne < personTwo
  print(check)
}

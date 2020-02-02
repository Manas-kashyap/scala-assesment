package com.knoldus

class FirstName(val firstName: String) extends AnyVal {
  def getFirstName = firstName
}

class LastName(val lastName: String) extends AnyVal {
  def getLastName = lastName
}

class Age(val age: Int) extends AnyVal {
  def getAge = age
}

object displayDetails extends App {
  def displayDetails(firstName: FirstName, lastName: LastName, age: Age): Unit = {
    println(firstName.getFirstName + " " + lastName.getLastName + " is of " + age.getAge + " years")
  }
}

package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
}

class Person(name: String, val age: Int = 0) {
  //  body
  //  defines the implementation of the class

  //  overloading
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")
  def greet(): Unit = println(s"Hi, I am $name")
  //  Constructor definition
  def this(name: String) = this(name,0)
  def this() = this("John Doe")
}

//  class params are not FIELDS
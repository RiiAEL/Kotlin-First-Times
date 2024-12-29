//Kotlin Compiler version 1.3.11
//do not place package here, no need
import java.time.LocalTime

fun main(args: Array<String>) {
  val name = "name"
  var lastname = "lastname"
  var age = 000
  
  println("Name : $name")
  println("LastName : $lastname")
  println("Age : $age")
  
  val number = 50
  
  if (number % 10 == 0) {
    println ("$number is even")
  }
  else {
    println ("$number is ah...")
  }
  
  val fruits = listOf ("Cherry")
  
  for (fruit in fruits) {
    println (fruit)
  }
  
  for (i in 1..1000000) {
    println ("Number : $i")
  }
  
  val currenttime = LocalTime.now()
  println("currentTime : $currenttime")
}
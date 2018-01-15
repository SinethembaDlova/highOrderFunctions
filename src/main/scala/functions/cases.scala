package functions
import scala.collection.mutable.{LinkedHashSet,Set}

object cases extends App {

  val names = Array("Sinethemba", "Mark", "JAMES", "Aya")
  val yearOfBirths = Array(2000, 1990, 1971, 1994)

  //println("")
  //println("Names:")
  val lowerCase = (value:String) => value.toLowerCase()
  for (i <- names){
    //println(lowerCase(i))
  }

  //println("")
  //println("Ages next year:")

  val  ageNextYear = (age:Int) => 2019 - age
  for (x <- yearOfBirths){
    //println(ageNextYear(x))
  }

  def solveX (x:Int) = x -10
  (x:Int) => x + 10


  val ageMap = Map("Sinethemba" -> 18, "Mark" -> 29, "James" -> 48, "Aya" -> 24)
  val age2019 = ageMap.values.map((y:Int) => y +2)

  //println("")
  //println("Ages in 2019:")
  //age2019.foreach(println)

  // partially applied functions
  def multiply = (x:Int, y:Int, z:Int) => x*y*z
  //println(multiply(1,2,3))// added all parameters
  val results = multiply(1,2,_:Int)//left one parameter and added it later
  //println(results(3))

  val resultsNone = multiply(_:Int,_:Int,_:Int)
  //println(resultsNone(1,2,3))

  //Currying

  def add(x:Int)=(y:Int)=> x + y
  val sum = add(5)
  //println(sum(5))

  def adding (x:Int) (y:Int)= x+y
  //println(adding(5)(5))

  //build in high order functions

  val numbers = Array("One", "Two", "Three", "Four")

  val results0 = numbers.foreach(println)
  val results1 = numbers.map(_.toLowerCase())
  val result2 = numbers.filter(_.contains("o"))


  // Creating your own high order functions

  val ageMap0 = Map("Andile" -> 20, "Mark" -> 25, "King" -> 40, "Aya" -> 23)

  val andile = ageMap0.getOrElse("Andile",0)
  val mark = ageMap0.getOrElse("Mark", 0)
  val king = ageMap.getOrElse("King", 0)
  val aya =  ageMap0.getOrElse("Aya",0)

  //def compare(person1:Int, person2:Int, person3:Int, person4:Int, f:(Int,Int,Int) =>Int) = f(person1, person2, person3, person4)

  //val youngest = compare(andile, mark, king, aya, _ min _ min _)
  //val oldest = compare(andile, mark, king, aya, _ max  _ max _)
  //println(youngest)
  //println(oldest)


  //Closures

  var prefix = "Dlova"

  def reverseIt (name:String) = (name + prefix).reverse

  println(reverseIt("Sinethemba"))
}

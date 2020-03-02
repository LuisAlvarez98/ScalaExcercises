package lectures.part1basics

object StringOps extends App{

    val str: String = "Hello"
    println(str.charAt(2))
    println(str.substring(0,2))
    println(str.split("l").toList)
    println(str.startsWith("H"))
    println(str.replace("H","P"))
    println(str.toLowerCase())
    println(str.length)

    val aNum = "45"
    val aNumber = aNum.toInt
    //Appending
    println('a' +: aNum :+ 'z')
    println(str.reverse)
    println(str.take(2))

    //S-interpolators
    val name = "Luis"
    val age = 21
    val greeting = s"Hello, my name is $name and I am $age years old"
    val anotherGreeting = s"Hello, my name is $name and I will be ${age + 1} years old"
    // F-Interpolators Formatted strings
    val speed = 1.2f
    val myth = f"$name%s can eat $speed%2.2f burgers per minute"
    println(myth)
    // Raw-interpolator
    println(raw"This is a \n newline")
    val escaped = "This is a \n newline"
    println(raw"$escaped")

}

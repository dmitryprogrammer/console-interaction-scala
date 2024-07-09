import scala.io.StdIn.readLine

object hello {
    def main(args: Array[String]) = {
        println("Please enter your name:")
        val name = readLine()
        println("Please enter your favorite color:")
        val color = readLine()
        println("Please enter your favorite artist:")
        var artist = readLine()

        println("Hello " + name)
        println("Your favorite color is " + color)
        println("Your favorite artist is " + artist)
    }
}
package hello;

class HelloWorld {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        val greeter = Greeter()
        println(greeter.sayHello())
    }
}
package nell.studios

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
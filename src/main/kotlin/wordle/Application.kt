package wordle

class Application {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            GameMachine(6).start()
        }
    }
}

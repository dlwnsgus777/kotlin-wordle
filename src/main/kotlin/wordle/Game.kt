package wordle

import wordle.view.Printer

class Game {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            Printer().introduce()
        }
    }
}
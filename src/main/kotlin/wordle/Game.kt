package wordle

import view.Printer

class Game {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            Printer().introduce()
        }
    }
}
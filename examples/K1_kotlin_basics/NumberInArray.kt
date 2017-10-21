package K1_kotlin_basics

import java.util.Random
import java.util.Scanner

    fun main(args: Array<String>) {
        val randomNumbers = getRandomNumbers(100)
        printElements(randomNumbers)
        val count = checkSum(randomNumbers)
        println("\nThe count of numbers is " + count)
    }

    /**
     * Returns "count" integer random numbers
     *
     * @param count a count of numbers
     * @return array of integer numbers
     */

    fun getRandomNumbers(count: Int): IntArray {
        val random = Random()
        val result = IntArray(count)

        for (i in 0..count - 1) {
            result[i] = random.nextInt(50)
        }

        return result
    }

    /**
     * Returns "count" integer numbers from the console
     *
     * @param count a count of numbers
     * @return array of integer numbers
     */

    fun getConsoleNumbers(count: Int): IntArray {
        val result = IntArray(count)

        for (i in 0..count - 1) {

            val scanner = Scanner(System.`in`)
            result[i] = scanner.nextInt()
        }
        return result
    }

    /**
     * Prints all elements of integer array separated by a space
     *
     * @param elements
     */

    fun printElements(elements: IntArray) {
        for (element in elements) {
            print(element.toString() + " ")
        }
    }

    /**
     * Returns the number of array elements that need to add to get 100
     *
     * @param elements array of integer numbers
     * @return number of elements
     */

    fun checkSum(elements: IntArray): Int {
        val length = elements.size
        var sum = 0
        var count = 0
        for (i in 0..length - 1) {
            if (sum >= 100)
                break
            sum += elements[i]
            count++
        }
        return count
    }

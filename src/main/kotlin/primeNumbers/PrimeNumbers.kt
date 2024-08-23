package dev.passingarguments.primeNumbers

import kotlin.math.sqrt

class PrimeNumbers {
}

fun isPrime(number: Int): Boolean {
    val midpoint = sqrt(number.toDouble()).toInt() + 1

    for (n in 2..midpoint) {
        if (number % n == 0) {
            return false
        }
    }
    return true
}
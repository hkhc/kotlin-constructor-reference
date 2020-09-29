package io.hkhc

fun main() {
    System.out.println("Hello")
    val p = Factory().create(::Person)
    System.out.println(p)
}

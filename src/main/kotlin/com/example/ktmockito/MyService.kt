package com.example.ktmockito

class MyService(private val myDependency: MyDependency) {
    fun greet(name: String): String {
        return myDependency.getGreeting(name)
    }
}

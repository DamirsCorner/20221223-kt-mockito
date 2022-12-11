package com.example.ktmockito

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito

class MyServiceTest {

    @Test
    fun greet() {
        val myDependencyMock = Mockito.mock(MyDependency::class.java)
        Mockito.`when`(myDependencyMock.getGreeting(any())).thenReturn("Hello, World!")

        val myService = MyService(myDependencyMock)

        assertEquals("Hello, World!", myService.greet("ignore"))
    }
}
package com.example.ktmockito

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.mockito.kotlin.any
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

class MyServiceTest {

    @Test
    fun greet() {
        val myDependencyMock = mock<MyDependency> {
            on { getGreeting(any()) } doReturn "Hello, World!"
        }

        val myService = MyService(myDependencyMock)

        assertEquals("Hello, World!", myService.greet("ignore"))
    }
}
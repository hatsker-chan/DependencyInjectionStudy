package com.example.dependencyinjectionstart.example1

import com.example.dependencyinjection.example1.Component

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}
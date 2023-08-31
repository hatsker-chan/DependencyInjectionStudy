package com.example.dependencyinjectionstart.example1

class Activity {

    val monitor = Monitor()
    val keyboard = Keyboard()
    val computerTower = ComputerTower(Storage(), Memory(), Processor())
    val mouse = Mouse()


    val computer = Computer(monitor, computerTower, keyboard, mouse)
}
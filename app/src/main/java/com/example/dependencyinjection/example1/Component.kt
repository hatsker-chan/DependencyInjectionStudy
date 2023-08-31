package com.example.dependencyinjection.example1

import com.example.dependencyinjectionstart.example1.Activity
import com.example.dependencyinjectionstart.example1.Computer
import com.example.dependencyinjectionstart.example1.ComputerTower
import com.example.dependencyinjectionstart.example1.Keyboard
import com.example.dependencyinjectionstart.example1.Memory
import com.example.dependencyinjectionstart.example1.Monitor
import com.example.dependencyinjectionstart.example1.Mouse
import com.example.dependencyinjectionstart.example1.Processor
import com.example.dependencyinjectionstart.example1.Storage

class Component {
    private fun getComputer(): Computer{
        val monitor = Monitor()
        val computerTower = ComputerTower(Storage(), Memory(), Processor())
        val keyboard = Keyboard()
        val mouse = Mouse()
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    fun inject(activity: Activity){
        activity.computer = getComputer()
        activity.keyboard = Keyboard()
    }
}
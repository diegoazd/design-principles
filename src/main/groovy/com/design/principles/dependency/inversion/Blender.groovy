package com.design.principles.dependency.inversion

class Blender {
  boolean physicalState
  int speed

  void turnOn() {
    physicalState = true
    speed = 1
    println 'Do stuff on turn on'
  }

  void turnOff() {
    physicalState = false
    speed = 0
    println 'Do stuff on turn off'
  }
}

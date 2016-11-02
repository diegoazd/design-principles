package com.design.principles.dependency.inversion

class Blender implements Device {
  int speed
  boolean physicalState

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

  @Override
  boolean getState() {
    physicalState
  }
}

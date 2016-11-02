package com.design.principles.dependency.inversion

class Lamp {
  boolean physicalState

  void turnOn() {
    physicalState = true
  }

  void turnOff() {
    physicalState = false
  }
}

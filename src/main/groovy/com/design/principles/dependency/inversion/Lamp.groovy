package com.design.principles.dependency.inversion

class Lamp implements Device {
  boolean physicalState

  void turnOn() {
    physicalState = true
  }

  void turnOff() {
    physicalState = false
  }

  @Override
  boolean getState() {
    physicalState
  }
}

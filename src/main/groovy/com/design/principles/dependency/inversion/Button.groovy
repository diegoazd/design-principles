package com.design.principles.dependency.inversion

class Button {

  void pushSwitch(Device device) {
   if(device.getState()) {
     device.turnOff()
   }else {
     device.turnOn()
   }
  }
}

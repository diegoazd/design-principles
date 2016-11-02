package com.design.principles.dependency.inversion

class Button {

  void pushSwitch(Lamp lamp) {
   if(lamp.physicalState) {
     lamp.turnOff()
   }else {
     lamp.turnOn()
   }
  }

  void pushSwitch(Blender blender) {
    if(blender.physicalState) {
      blender.turnOff()
    }else {
      blender.turnOn()
    }
  }
}

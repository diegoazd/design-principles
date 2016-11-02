package com.design.principles.dependency.inversion

import spock.lang.Specification

class DependencyInversionSpec extends Specification {

 void "Should do action on the lamp when #physicalState"() {
    setup:
    Lamp lamp = new Lamp(physicalState: physicalState)
    when:
    new Button().pushSwitch(lamp)
    then:
    lamp.physicalState == expectedState
    where:
    physicalState | expectedState
    false         | true
    true          | false
  }

 void "Should do action on blender when #physicalState"() {
    setup:
    Blender blender = new Blender(physicalState: physicalState)
    when:
    new Button().pushSwitch(blender)
    then:
    blender.physicalState == expectedState
    blender.speed == speedExpected
    where:
    physicalState | expectedState | speedExpected
    false         | true          | 1
    true          | false         | 0
 }

}

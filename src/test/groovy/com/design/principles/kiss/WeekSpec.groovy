package com.design.principles.kiss

import spock.lang.*

class WeekSpec extends Specification {

  Week week = new Week()

  @Unroll
  void "Should get monday for #naturalDay"() {
    expect:
    week.dayOfTheWeek(day) == naturalDay
    where:
    day    |      naturalDay
    1      |      'Monday'
    2      |      'Tuesday'
    3      |      'Wednesday'
    4      |      'Thursday'
    5      |      'Friday'
    6      |      'Saturday'
    7      |      'Sunday'
  }

  @Unroll 
  void "Should thrown an exception for not a valid day #day"() {
    when:
    week.dayOfTheWeek(day)
    then:
    thrown(RuntimeException)
    where:
    day << [0,8, -1]
  }

}


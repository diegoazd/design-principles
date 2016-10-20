package com.design.principles.kiss

class Week {

  final List daysOfWeek = ['Monday', 'Tuesday', 'Wednesday', 'Thursday','Friday', 'Saturday', 'Sunday']

  String dayOfTheWeek(int day) {
    if(day < 1 || day > 7) {
      throw new RuntimeException('The day must be between 1 and 7')
    } 
    daysOfWeek[day - 1]
  }

}


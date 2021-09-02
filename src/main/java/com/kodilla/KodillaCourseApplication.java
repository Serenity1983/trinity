///
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kodilla;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;

//@SpringBootApplication
class Program {
    // public KodillaCourseApplication() {

    public static void main(String[] args) {


        LinkedList<Clock> clocks = new LinkedList<>();



            clocks.add(new Clock(20, 25));
            clocks.add(new Clock(14,32));
            clocks.add(new Clock(15,0));
            clocks.add(new Clock(18,9));



        for (Clock addedClocks : clocks) {

            addedClocks.addOneMinute();
            System.out.println(addedClocks.time);
        }


    }

     class Clock {


       LocalTime time;

      public Clock(int hours,int minutes) {
          this.time = LocalTime.of(hours, minutes);
      }


        public void addOneMinute() {

          this.time = time.plusMinutes(1);
        }
    }


    //SpringApplication.run(KodillaCourseApplication.class, args);}


}


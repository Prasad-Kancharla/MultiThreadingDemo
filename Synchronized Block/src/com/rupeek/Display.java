package com.rupeek;

public class Display {

  public void wish(String name) {
    //Hundreds of lines of code
    synchronized (this) {
      for (int i = 0; i < 3; i++) {
        System.out.println("Good Morning " + name);
      }
    }
    //Hundreds of lines of code
  }
}

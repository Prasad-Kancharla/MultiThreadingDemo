package com.rupeek;

public class Display {

  public synchronized void wish(String name) {
    for (int i = 0; i < 3; i++) {
      System.out.println("Good Morning " + name);
    }
  }
}

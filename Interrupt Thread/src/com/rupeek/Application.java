package com.rupeek;

public class Application {

  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();
    t.interrupt();

    //Main thread is not sleeping/waiting state
    //Thread.currentThread().interrupt();
  }
}

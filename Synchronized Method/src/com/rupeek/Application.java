package com.rupeek;

public class Application {

  public static void main(String[] args) {
    Display d = new Display();
    MyThread t1 = new MyThread(d,"John");
    MyThread t2 = new MyThread(d,"Mary");
    t1.start();
    t2.start();
  }
}

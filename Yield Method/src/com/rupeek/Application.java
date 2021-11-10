package com.rupeek;

public class Application {

  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();
    System.out.println("Inside Main method");
    System.out.println("Execution of Main method is completed");
  }

}

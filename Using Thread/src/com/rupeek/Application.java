package com.rupeek;

public class Application {

  public static void main(String[] args) {
    MyThread t1 = new MyThread();

    System.out.println("Main method is executed by thread : " + Thread.currentThread().getName());
    t1.start();
  }


}

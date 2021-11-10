package com.rupeek;

public class Application {

  public static void main(String[] args) {
    System.out.println("Thread priority of Main thread is " + Thread.currentThread().getPriority());
    MyThread t = new MyThread();
    t.start();
    System.out.println("Main thread continues");
    Thread.currentThread().setPriority(100);

  }
}

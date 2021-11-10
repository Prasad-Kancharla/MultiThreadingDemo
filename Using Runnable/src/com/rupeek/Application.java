package com.rupeek;

public class Application {

  public static void main(String[] args) {
    MyRunnable runnable = new MyRunnable();
    Thread t1 = new Thread(runnable);
    System.out.println("Main method is executed by thread : " + Thread.currentThread().getName());
    t1.start();
    //Calling a thread twice
    //t1.start();
  }
}

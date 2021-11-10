package com.rupeek;

public class MyThread extends Thread{

  @Override
  public void run() {
    System.out.println("Inside run method");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println("Thread got interrupted");
    }
  }
}

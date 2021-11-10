package com.rupeek;

public class MyThread extends Thread{

  @Override
  public void run() {
    //System.out.println("Thread priority of child thread is " + Thread.currentThread().getPriority());
    for(int i = 0; i<5; i++){
      System.out.println("Run method");
      Thread.yield();
    }
  }
}

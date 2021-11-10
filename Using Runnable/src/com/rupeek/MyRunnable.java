package com.rupeek;

public class MyRunnable implements Runnable{

  @Override
  public void run() {
    System.out.println("Run method is executed by thread : " + Thread.currentThread().getName());
  }

}

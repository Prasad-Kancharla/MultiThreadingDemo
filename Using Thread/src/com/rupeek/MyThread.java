package com.rupeek;

public class MyThread extends Thread {

  @Override
  public void run() {
    System.out.println("Run method is executed by thread : " + Thread.currentThread().getName());
  }
}

package com.rupeek;

public class MyThread extends Thread {

  @Override
  public void run() {
    Thread.yield();
    System.out.println("Started executing run method");
    System.out.println("Inside Run method");
    System.out.println("Execution of run method is completed");
  }
}

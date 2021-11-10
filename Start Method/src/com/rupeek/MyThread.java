package com.rupeek;

public class MyThread extends Thread{

  @Override
  public void run() {
    System.out.println("Run method executed by thread : " + Thread.currentThread().getName());
  }

  //Overriding start method
  public void start(){
    System.out.println("Overridden start method executed by thread : " + Thread.currentThread().getName());
  }

//  public void start(){
//    super.start();
//    System.out.println("This line is executed by thread : " + Thread.currentThread().getName());
//  }
}

package com.rupeek;

public class MyThread extends Thread {

  @Override
  public void run() {
    System.out.println("Inside Run method with No-Args");
  }

    //Overloading run method
//  public void run(int i){
//    System.out.println("Overloaded run method executed by thread : " + Thread.currentThread().getName());
//  }
}

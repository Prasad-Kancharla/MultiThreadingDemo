package com.rupeek;

public class Application {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Slide show started");
    for (int i = 1; i<4; i++){
      System.out.println("Slide - " + i);
      Thread.sleep(1000);
    }
    System.out.println("Slide show ended");
  }
}

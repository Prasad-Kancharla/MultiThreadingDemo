package com.rupeek;

public class Application {

  public static void main(String[] args) {
    System.out.println("Main method is executed by thread : " + Thread.currentThread().getName());
    Thread.currentThread().setName("Rupeek");
    System.out.println("Main method is executed by thread : " + Thread.currentThread().getName());
  }
}

package com.rupeek;

public class Application {

  public static void main(String[] args) throws InterruptedException {
    Thread fixTime = new Thread(new FixTime());
    Thread setupMeeting = new Thread(new SetupMeeting());
    Thread sendInvite = new Thread(new SendInvite());
    fixTime.start();
    //fixTime.join();
    setupMeeting.start();
    //setupMeeting.join();
    sendInvite.start();
    //sendInvite.join();
  }
}

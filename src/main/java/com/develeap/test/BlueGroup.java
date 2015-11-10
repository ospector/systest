package com.develeap.test;

/**
 * Created by Omri at 10/11/2015 21:52
 */
public class BlueGroup implements TestGroup {

  public void beforeGroup() {
    System.err.println("VERY LONG SETUP HAPPENS NOW...");
    UglyGlobal.state=BlueGroup.class.getName();
  }

  public void afterGroup() {
    System.err.println("Cleanup");
    UglyGlobal.state="";
  }
}

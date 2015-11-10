package com.develeap.test;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Runner;

/**
 * Created by Omri at 10/11/2015 22:27
 */
public class Main {
  public static void main(String[] args) {
    JUnitCore junit = new JUnitCore();
    junit.addListener(new TextListener(System.out));
    junit.run(AzureTest.class,ScarletTest.class,UltraMarineTest.class,VermilionTest.class);
  }
}

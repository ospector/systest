package com.develeap.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Omri at 10/11/2015 21:56
 */
public class ScarletTest {
  @Test
  public void aRedishTest() {
    assertEquals("This test requires the Red configuration",RedGroup.class.getName(),UglyGlobal.state);
  }
}

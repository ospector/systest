package com.develeap.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Omri at 10/11/2015 21:56
 */
public class AzureTest {
  @Test
  public void aTest() {
    assertEquals(BlueGroup.class.getName(),UglyGlobal.state);
  }
}

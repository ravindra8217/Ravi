package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNGExcelData {
  @Test(dataProvider = "Authentication")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] Authentication() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}

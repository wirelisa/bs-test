package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BStackLocalTest extends SeleniumTest {

    @Test
    public void test() throws Exception {
        driver.get("https://tailor-acceptance.mytheresa.com/de/en/women/designers/givenchy");
        Thread.sleep(10000);
        Assert.assertTrue(driver.getTitle().contains("BrowserStack Local"));
    }
}

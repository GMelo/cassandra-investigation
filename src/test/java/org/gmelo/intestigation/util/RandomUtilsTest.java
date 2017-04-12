package org.gmelo.intestigation.util;

import org.junit.Assert;
import org.junit.Test;

public class RandomUtilsTest {

    @Test
    public void testGenerateRandomString() throws Exception {
        String generated = RandomUtils.generateRandomString("Test", 3);
        System.out.println(generated);
        Assert.assertEquals(7,generated.length());
    }

    @Test
    public void testNextDouble(){
        double generated = RandomUtils.generateDouble(3);
        System.out.println(generated);
    }
}
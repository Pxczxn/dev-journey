package top.pxczxn;

import org.junit.Assert;
import org.junit.Test;



public class DemoTest {
    @Test
    public void testSay(){
        Demo d = new Demo();
        String ret =d.say("破星辰只寻你");
        Assert.assertEquals("Hello 破星辰只寻你",ret);
    }
}

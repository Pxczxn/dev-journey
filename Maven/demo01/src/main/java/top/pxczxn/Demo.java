package top.pxczxn;

import org.junit.Test;

public class Demo {
    @Test
    public String say(String name){
        System.out.println("Hello "+name);
        return "Hello "+name;
    }
}

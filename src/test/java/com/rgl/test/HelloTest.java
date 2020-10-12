package com.rgl.test;
import org.junit.Test;
import org.junit.Assert;
public class HelloTest{
    @Test
    public void sayHallo(){
        System.out.println("----junitTest,sayHello----");
	Assert.assertEquals("ok","ok");
    }
}

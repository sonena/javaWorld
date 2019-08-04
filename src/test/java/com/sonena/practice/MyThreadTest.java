package com.sonena.practice;

import org.junit.Test;

public class MyThreadTest {

    @Test
    public void testThreadExecution(){
        System.out.println("Starting Main thread");
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("Exiting Main thread");

    }


}

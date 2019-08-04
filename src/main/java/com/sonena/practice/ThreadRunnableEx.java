package com.sonena.practice;

import java.lang.*;

public class ThreadRunnableEx extends ThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In extended class ThreadRunnableEx ... i = " + i);
        }
    }
}
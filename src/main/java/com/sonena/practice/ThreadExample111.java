package com.sonena.practice;

public class ThreadExample111 extends Thread  {
    @Override
    public void run() {
        for (int i = 10; i <=20; i++) {
            System.out.println("In Worker thread ThreadExample111... i = " + i);

        }
    }
}

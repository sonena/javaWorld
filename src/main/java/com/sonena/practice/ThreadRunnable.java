package com.sonena.practice;

import java.lang.*;

public class ThreadRunnable implements Runnable {
    private int i;

    @Override
    public void run() {
        i = 290;
        while (i <= 300) {
            System.out.println("In the Runnable interface .. i = " + i);
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        System.out.println("In the Main Thread");

        for (i = 1 ; i<= 5; i++){
            Thread object = new Thread(new ThreadRunnable());
            System.out.println("Strating ThreadRunnable thread ... i = "+ i);
            object.start();
            Thread.sleep(10);
            Thread extendedObj = new Thread(new ThreadRunnableEx());
            System.out.println("STrating ThreadRunnableEx .. ");
            extendedObj.start();
        }
    }
}
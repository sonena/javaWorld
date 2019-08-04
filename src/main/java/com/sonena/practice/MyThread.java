package com.sonena.practice;
import java.lang.*;

class MyThread extends Thread {
   @Override
    public void run() {

       for (int i = 0;i <=10;i++) {
            System.out.println("In Worker thread ThreadExample Class ... i = " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("In Main Thread");
        Thread thread = new MyThread();
        Thread thread1 = new ThreadExample111();
        thread.start();
        sleep(100);
        thread1.start();
    }
}

package com.dong.io;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 0; i <50;i++) {
            System.out.println("我是分支");

        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadTest());
        t.start();
//        Thread.yield();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(t.getName());
        for (int i = 0; i <50 ; i++) {
            System.out.println("主分支");

        }

//        System.out.println(Thread.currentThread());
    }
}

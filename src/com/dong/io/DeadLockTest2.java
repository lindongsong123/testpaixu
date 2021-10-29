package com.dong.io;

public class DeadLockTest2 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread(new A2(o1, o2));
        Thread t2 = new Thread(new B2(o1, o2));
        t1.start();
        t2.start();

    }
}
class A2 implements Runnable{
    Object o1;
    Object o2;

    public A2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized(o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (o2){

        }

    }
}
class B2 implements Runnable{
    Object o1;
    Object o2;

    public B2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized(o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (o1){

        }

    }
}

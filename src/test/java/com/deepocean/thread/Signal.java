package com.deepocean.thread;

/**
 * 此实现方式并不高效，只是演示 volatile 的使用
 * volatile 修饰的变量必须是原子性的操作，因此 sychronized
 */
public class Signal {
    private static volatile int signal = 0;

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            while (signal < 10) {
                if (signal % 2 == 0) {
                    System.out.println("ThreadA: " + signal);
                    synchronized (this) {
                        signal++;
                    }
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            while (signal < 10) {
                if (signal % 2 == 1) {
                    System.out.println("ThreadB: " + signal);
                    synchronized (this) {
                        signal++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        new Thread(new ThreadA()).start();
        Thread.sleep(10);
        new Thread(new ThreadB()).start();
    }
}

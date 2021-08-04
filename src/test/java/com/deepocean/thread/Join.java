package com.deepocean.thread;

public class Join {
    static class ThreadA implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("子线程，准备睡1s");
                Thread.sleep(1000);
                System.out.println("子线程，已经睡1s");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadA());
        thread.start();
        thread.join();
        System.out.println("主线程，如果不加join，就非最后打印出来");
    }
}

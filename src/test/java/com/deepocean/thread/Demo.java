package com.deepocean.thread;

/**
 * <p>多线程验证demo</p>
 * @author missrye
 */
public class Demo {

    /**
     * <测试线程组和线程优先级不一致情况>
     * 线程优先级，最高不超过线程组最大优先级
     * 超过取线程组，不超过按照自身的优先级
     */
    /*public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("tg1");
        tg.setMaxPriority(6);
        Thread thread = new Thread(tg, "thread");
        thread.setPriority(5);
        System.out.println("线程组优先级：" + tg.getMaxPriority());
        System.out.println("线程优先级：" + thread.getPriority());
    }*/

    /**
     * <线程组统一异常处理>
     */
    /*public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("tg1"){
            // 继承 ThreadGroup 并重新定义以下方法
            // 当线程成员抛出 unchecked exception
            // 会执行此方法
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + ": " + e.getMessage());
            }
        };

        Thread thread = new Thread(tg, new Runnable() {
            @Override
            public void run() {
                // 抛出 unchecked exception
                throw new RuntimeException("测试异常");
            }
        });

        thread.start();
    }*/

    /**
     * <BLOCKED和RUNNABLE状态的转换>
     */
    public void blockedTest(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "a");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "b");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {}
        t2.start();

        System.out.println(t1.getName() + ": " + t1.getState());
        System.out.println(t2.getName() + ": " + t2.getState());

    }

    private synchronized void testMethod() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Demo().blockedTest();
    }

}

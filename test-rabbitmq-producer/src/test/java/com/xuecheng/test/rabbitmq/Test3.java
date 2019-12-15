package com.xuecheng.test.rabbitmq;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;

public class Test3 {
    public static void main(String[] args) {
        ThreadPoolExecutor t = new ThreadPoolExecutor(2, 2, 1000, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        ThreadFactory threadFactory = t.getThreadFactory();
        threadFactory.newThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行1了");
            }
        }).start();
        threadFactory.newThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("运行2了");
            }
        }).start();
        threadFactory.newThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行3了");
            }
        }).start();
    }
}

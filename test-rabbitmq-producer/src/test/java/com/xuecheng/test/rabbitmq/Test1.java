package com.xuecheng.test.rabbitmq;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    @Test
    public void test() {
        String s = "2341241234dfadf";
        String s1;
        byte[] bytes = s.getBytes();
        for (int i = bytes.length - 1; i >= 0; i--) {
            System.out.println(bytes[i]);
        }
        System.out.println();
    }

    @Test
    public void test1() {
        String s = "2341241234dfadf";
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1+=s.charAt(i);
        }
        System.out.println(s1);
        String s2 = new StringBuffer(s).reverse().toString();
        System.out.println(s2);
        String s3="";
        char[] chars = s.toCharArray();
        for (int i = chars.length-1;i>=0;i--){
            s3+=chars[i];
        }
        System.out.println(s3);
    }

    @Test
    public void testThread() throws InterruptedException {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1执行了");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("r2执行了");
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r3执行了");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1执行了");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("r2执行了");
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r3执行了");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }

    @Test
    public void test3() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行1了");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("运行2了");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行3了");
            }
        });
    }

    @Test
    public void test4() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行1了");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("运行2了");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行3了");
            }
        });
    }

}

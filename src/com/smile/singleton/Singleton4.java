package com.smile.singleton;

import java.util.concurrent.*;

/**
 * @author smi1e
 * Date 2019/8/15 10:03
 * Description 懒汉式（双重检测）
 */
public class Singleton4 {
    private static Singleton4 INSTANCE;
    private Singleton4(){}

    public static Singleton4 getInstance(){
        if (INSTANCE==null){
            synchronized (Singleton4.class){
                if (INSTANCE==null){
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,2,0L, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2));
        Future<Singleton4> submit = poolExecutor.submit(Singleton4::getInstance);
        Future<Singleton4> submit2 = poolExecutor.submit(Singleton4::getInstance);
        System.out.println(submit.get().hashCode());
        System.out.println(submit2.get().hashCode());
        poolExecutor.shutdown();
    }
}

package com.smile.singleton;

import java.util.concurrent.*;

/**
 * @author smi1e
 * Date 2019/8/15 9:41
 * Description 懒汉式(加锁)
 */
public class Singleton3 {
    private static Singleton3 INSTANCE;
    private Singleton3(){}

    /**
     * 不加锁，产生的hashcode会不一样，也就是不是单例
     * @return
     */
    public /*synchronized*/  static Singleton3 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,2,0L, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2));
        Future<Singleton3> submit = poolExecutor.submit(Singleton3::getInstance);
        Future<Singleton3> submit2 = poolExecutor.submit(Singleton3::getInstance);
        System.out.println(submit.get().hashCode());
        System.out.println(submit2.get().hashCode());
        poolExecutor.shutdown();
    }
}

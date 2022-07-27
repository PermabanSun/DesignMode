package com.zzx.singleton;

import org.junit.jupiter.api.Test;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.singleton
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-27 15:54
 * @Description: TODO
 * @Version: 1.0
 */
public class SingletonTest {

    /**
     * 饿汉式单例测试
     */
    @Test
    public void HungryHanStyleSingletonTest() {
        Singleton singleton = Singleton.getHungryStyleInstance();
        System.out.println(singleton);
    }

    /**
     * 懒汉式单例测试
     */
    @Test
    public void LazyStyleSingletonTest() {
        Singleton singleton = Singleton.getLazyStyleInstance();
        System.out.println(singleton);
    }
}
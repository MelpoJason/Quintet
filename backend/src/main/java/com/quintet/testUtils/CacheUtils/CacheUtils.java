/*
 * For personal use;
 */

package com.quintet.testUtils.CacheUtils;


import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

class CacheUtils {

    private static Logger log = LoggerFactory.getLogger(CacheUtils.class);

    private static Cache<Integer, String> cache = CacheBuilder.newBuilder()
            //设置cache的初始大小为10
            .initialCapacity(5)
            //设置并发数为5，即同一时间最多只能有5个线程往cache执行写入操作
            .concurrencyLevel(1)
            .expireAfterWrite(60, TimeUnit.SECONDS)
            .build();

    static void initCache(Object value) {
        cache.put(1, value.toString());
    }

    static void initCache(Integer key, Object value) {
        cache.put(key, value.toString());
        log.info("get cache success" + cache.getIfPresent(1));
    }

}

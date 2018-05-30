/*
 * For personal use;
 */

package com.quintet.exercise;

import com.google.common.collect.Maps;
import com.quintet.BackendApplicationTests;
import com.quintet.model.ConsultResult;
import com.quintet.service.thread.PaymentThread;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.*;

public class Exercise extends BackendApplicationTests {

    private static Integer CPU_UTILIZATION = 1;
    private static Integer WAIT_TIME = 5;
    private static Integer COMPUTE_TIME = 1;

    private static String INPUT_PAYMENT_TYPE_CASH = "CASH";
    private static String INPUT_PAYMENT_TYPE_CARD = "CARD";
    private static String INPUT_PAYMENT_TYPE_COUPON = "COUPON";
    private static String INPUT_PAYMENT_TYPE_OTHER1 = "OTHER1";
    private static String INPUT_PAYMENT_TYPE_OTHER2 = "OTHER2";

    Logger logger = LoggerFactory.getLogger(Exercise.class);

    @Test
    public void testConcurrent() {
        ExecutorService executor = Executors.newFixedThreadPool(setThreadPoolSize(Runtime.getRuntime().availableProcessors(), WAIT_TIME, COMPUTE_TIME)); //获取当前进程数量
        Callable paymentThread1 = new PaymentThread(INPUT_PAYMENT_TYPE_CASH);
        Callable paymentThread2 = new PaymentThread(INPUT_PAYMENT_TYPE_CARD);
        Callable paymentThread3 = new PaymentThread(INPUT_PAYMENT_TYPE_COUPON);
        Callable paymentThread4 = new PaymentThread(INPUT_PAYMENT_TYPE_OTHER1);
        Callable paymentThread5 = new PaymentThread(INPUT_PAYMENT_TYPE_OTHER2);
        Future paymentResultFuture1 = executor.submit(paymentThread1);
        Future paymentResultFuture2 = executor.submit(paymentThread2);
        Future paymentResultFuture3 = executor.submit(paymentThread3);
        Future paymentResultFuture4 = executor.submit(paymentThread4);
        Future paymentResultFuture5 = executor.submit(paymentThread5);
        Map<String, ConsultResult> resultList = Maps.newConcurrentMap();
        try {
            resultList.put(INPUT_PAYMENT_TYPE_CASH, (ConsultResult) paymentResultFuture1.get());
            resultList.put(INPUT_PAYMENT_TYPE_CARD, (ConsultResult) paymentResultFuture2.get());
            resultList.put(INPUT_PAYMENT_TYPE_COUPON, (ConsultResult) paymentResultFuture3.get());
            resultList.put(INPUT_PAYMENT_TYPE_OTHER1, (ConsultResult) paymentResultFuture4.get());
            resultList.put(INPUT_PAYMENT_TYPE_OTHER2, (ConsultResult) paymentResultFuture5.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        logger.info("RESULT IS {}", resultList);
    }

    private int setThreadPoolSize(Integer currentCores, Integer waitTime, Integer computeTime) {
        return currentCores * CPU_UTILIZATION * (1 + waitTime / computeTime);
    }
}

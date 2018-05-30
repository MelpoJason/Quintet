/*
 * For personal use;
 */

package com.quintet.service.thread;


import com.quintet.model.ConsultResult;
import com.quintet.service.impl.PaymentRemoteServiceImpl;
import org.springframework.http.HttpStatus;

import java.util.concurrent.Callable;

public class PaymentThread implements Callable {

    private String payment;

    public PaymentThread() {
    }

    public PaymentThread(String payment) {
        this.payment = payment;
    }

    @Override
    public Object call() {
        try {
            if (PaymentRemoteServiceImpl.getInstance().isEnable(payment)) {
                return new ConsultResult(true, HttpStatus.OK.toString());
            } else {
                return new ConsultResult(false, HttpStatus.NOT_FOUND.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

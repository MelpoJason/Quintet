/*
 * For personal use;
 */

package com.quintet.service.impl;

import com.quintet.model.enums.Payment;
import com.quintet.service.PaymentRemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentRemoteServiceImpl implements PaymentRemoteService {

    Logger logger = LoggerFactory.getLogger(PaymentRemoteServiceImpl.class);

    private static PaymentRemoteService paymentRemoteService = new PaymentRemoteServiceImpl();

    @Override
    public boolean isEnable(String paymentType) {
        return Payment.get(paymentType);
    }


    private PaymentRemoteServiceImpl() {

    }


    public static PaymentRemoteService getInstance() {
        return paymentRemoteService;
    }

}

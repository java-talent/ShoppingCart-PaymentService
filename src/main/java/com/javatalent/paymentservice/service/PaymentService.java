package com.javatalent.paymentservice.service;

import com.javatalent.paymentservice.payload.PaymentRequest;
import com.javatalent.paymentservice.payload.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(long orderId);
}
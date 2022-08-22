package com.platzi.javatests.payments;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
    PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

    @Test
    public void correctlyMadePayment() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(paymentProcessor.makePayment(1000));

    }

    @Test
    public void wronglyMadePayment() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));

    }

}
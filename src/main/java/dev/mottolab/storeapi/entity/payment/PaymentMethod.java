package dev.mottolab.storeapi.entity.payment;

import lombok.Getter;

public enum PaymentMethod {
    SLIP_VERIFY_VIA_PROMPTPAY,
    SLIP_VERIFY_VIA_ACCOUNT,
    TRUEMONEY_ENVELOP,
    PROMPTPAY,
    TRUEMONEY_APP;

    @Getter
    private String paymentMethod;
}

package com.deepocean.jdk.validator.valid;

import org.springframework.stereotype.Component;

@Component
public class ValidInternalImpl implements ValidInternal {
    @Override
    public void validateV1(ShopInfo shopInfo) {
        System.out.println("validateV1 execute...");
    }

    @Override
    public void validateV2(ShopInfo shopInfo) {
        System.out.println("validateV2 execute...");
    }
}

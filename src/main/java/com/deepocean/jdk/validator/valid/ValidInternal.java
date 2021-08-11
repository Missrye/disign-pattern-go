package com.deepocean.jdk.validator.valid;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Validated
public interface ValidInternal {
    void validateV1(@Valid ShopInfo shopInfo);

    void validateV2(@Validated ShopInfo shopInfo);
}

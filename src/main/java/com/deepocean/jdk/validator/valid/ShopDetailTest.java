package com.deepocean.jdk.validator.valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopDetailTest {

    @Autowired
    private ValidInternal validInternal;

    public void test() {
        ShopInfo shopInfo=new ShopInfo();
        shopInfo.setShopId("112");
        shopInfo.setCardNumber("123");

        validInternal.validateV1(shopInfo);
        validInternal.validateV2(shopInfo);

        System.out.println("=========================");

        // ==========================================

        // 手工校验
        ValidatorWrapper validatorWrapper=new ValidatorWrapperImpl();
        try{
            validatorWrapper.validate(shopInfo);
        }catch (BizException e){
            System.out.println(e.getErrorCode() + "--" + e.getErrorMsg());
        }
    }

}

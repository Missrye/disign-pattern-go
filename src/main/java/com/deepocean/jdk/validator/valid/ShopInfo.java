package com.deepocean.jdk.validator.valid;

import com.deepocean.jdk.validator.rest.IdentityCardNumber;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class ShopInfo {

    @NotNull(message="shopid不能为空")
    private String shopId;

    @NotBlank(message="shopName不能为空")
    private String shopName;

    @NotBlank(message = "身份证号不能为空")
    @IdentityCardNumber(message = "身份证信息有误,请核对后提交")
    private String cardNumber;


    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

package com.deepocean.jdk.validator.rest;

import com.deepocean.jdk.validator.valid.ShopDetailTest;
import com.deepocean.jdk.validator.valid.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class ShopInfoController {

    @Autowired
    private ShopDetailTest shopDetailTest;

    @GetMapping("/valid")
    public void save() {
        shopDetailTest.test();
    }

    @PostMapping("/test")
    public void test(@RequestBody @Validated ShopInfo shopInfo) {
        // do nothing
    }
}

package com.deepocean.jdk.validator.valid;


import org.apache.commons.lang3.StringUtils;

public class ValidatorWrapperImpl implements ValidatorWrapper  {
    @Override
    public void validate(Object object) {
        if(object == null){
            throw new RuntimeException();
        }
        String msg = ValidatorUtil.validate(object);
        if(!StringUtils.isEmpty(msg)){
            throw new BizException(ErrorCodeEnum.ILLEGAL_PARAM.getErrorCode(), ErrorCodeEnum.ILLEGAL_PARAM.getErrorMsg());
        }
    }
}

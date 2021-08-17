package com.deepocean.jdk.validator.valid;

public enum ErrorCodeEnum {
    ILLEGAL_PARAM("ILLEGAL_PARAM","服务正忙，请稍后再来");
    ;

    private String errorCode;

    private String errorMsg;


    ErrorCodeEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    // Setter and Getter

    public ErrorCodeEnum getErrorCode(String errorCode){
        for(ErrorCodeEnum code:values()){
            if(code.getErrorCode().equals(errorCode)){
                return code;
            }
        }
        return null;
    }
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

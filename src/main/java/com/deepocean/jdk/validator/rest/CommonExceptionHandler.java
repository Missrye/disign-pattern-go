package com.deepocean.jdk.validator.rest;

import com.deepocean.jdk.validator.valid.BizException;
import com.deepocean.jdk.validator.valid.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.StringJoiner;

@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler {

    /**
     * ConstraintViolationException
     */
    @ExceptionHandler(ValidationException.class)
    public BizException handleConstraintViolationException(ConstraintViolationException e) {
        log.error(e.getMessage(), e);
        StringJoiner sj = new StringJoiner(";");
        e.getConstraintViolations().forEach(x -> sj.add(x.getMessageTemplate()));
        return new BizException(ErrorCodeEnum.ILLEGAL_PARAM.getErrorCode(), sj.toString());
    }
}

package com.deepocean.jdk.validator.valid;


import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

public class ValidatorUtil {

    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static <T> String validate(T object){
        Set<ConstraintViolation<T>> violationSet = validator.validate(object);
        if(violationSet != null && !CollectionUtils.isEmpty(violationSet)){
            Iterator<ConstraintViolation<T>> iterator = violationSet.iterator();
            StringBuffer sb = new StringBuffer(64);
            while(iterator.hasNext()){
                sb.append(iterator.next().getMessage()).append(";");
            }
            return sb.toString();
        }
        return null;
    }
}


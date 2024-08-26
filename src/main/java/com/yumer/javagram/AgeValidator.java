package com.yumer.javagram;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AgeValidator implements ConstraintValidator<Age, Date> {

    @Override
    public boolean isValid(Date value, ConstraintValidatorContext constraintValidatorContext) {
        long diffMillisecond = new Date().getTime() - value.getTime();
        int age = (int) (TimeUnit.MILLISECONDS.toDays(diffMillisecond) / 365);

        if (age >= 18) return true;
        return false;
    }
}

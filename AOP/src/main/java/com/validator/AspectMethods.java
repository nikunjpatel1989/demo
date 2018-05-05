package com.validator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectMethods {

	@Before(value = "@annotation(com.validator.Validator)")
	public void validateRequest(JoinPoint joinPoint) {
		String clazzName = joinPoint.getTarget().getClass().getName();
		String name = joinPoint.getSignature().getName();
		System.out.println("Inside validate request");

	}

}
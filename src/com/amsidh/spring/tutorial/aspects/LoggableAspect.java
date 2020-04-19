package com.amsidh.spring.tutorial.aspects;

import org.aspectj.lang.ProceedingJoinPoint;


public class LoggableAspect {

	public void logMessageBeforeMethodCall() {
		System.out.println("Logging Message before method call.");
	}

	public void logMessageAfterMethodCall() {
		System.out.println("Logging Message after method call.");
	}

	public Object logMessageAroundMethodCall(ProceedingJoinPoint proceedingJoinPoint) {

		Object object = null;
		try {
			System.out.println("Around advice Message Before method call");
			object = proceedingJoinPoint.proceed();
			System.out.println("Around advice Message Aftor method call");
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		return object;
	}

}

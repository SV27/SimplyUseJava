package com.sv27.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Author {
	
	public enum BookStatus {
		DRAFT, PUBLISHED
	}
	
	public String writtenBy() default "";
	
	public BookStatus status() default BookStatus.DRAFT;

}

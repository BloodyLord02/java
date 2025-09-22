package com.education.ztu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Annotation {
    String author() default "-";
    String version() default "1.0";
    String purpose() default "???";
}

package org.xfl.annotation;import java.lang.annotation.*;@Repeatable(Persons.class)@Retention(RetentionPolicy.RUNTIME)@Target(ElementType.TYPE)public @interface Person {    String role() default "";}
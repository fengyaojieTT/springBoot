package com.oneeth.game.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR}) 
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreFixed {
   
}
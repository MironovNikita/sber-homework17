package org.application.hw8_spring.cacheData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Cache {
    CacheType cacheType() default CacheType.IN_MEMORY;

    String fileNamePrefix() default "";

    Class[] identityBy() default Class.class;

    boolean zip() default false;

    int listSize() default 0;
}

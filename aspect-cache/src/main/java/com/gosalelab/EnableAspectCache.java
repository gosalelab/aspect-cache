package com.gosalelab;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


/**
 * @author silwind
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AspectCacheAutoConfiguration.class)
@Documented
@Inherited
public @interface EnableAspectCache {
}

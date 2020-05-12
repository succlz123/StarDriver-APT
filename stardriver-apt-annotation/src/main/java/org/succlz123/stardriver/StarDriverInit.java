package org.succlz123.stardriver;

import androidx.annotation.Keep;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.TYPE})
@Keep
public @interface StarDriverInit {

    String name() default "";

    Class<?>[] after() default {};

    Class<?>[] before() default {};

}

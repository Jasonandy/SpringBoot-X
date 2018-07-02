/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @Title: BusinessLogAnnotation
* @Package cn.ucaner.aop.annotation
* @Description: 注解 记录log
* @Author Jason
* @Creator
* @Date 2017/12/9 -- 22:12
* @version V1.0
*/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BusinessLogAnnotation {

    /**
     * 业务的名称
     */
    String value() default "";


}

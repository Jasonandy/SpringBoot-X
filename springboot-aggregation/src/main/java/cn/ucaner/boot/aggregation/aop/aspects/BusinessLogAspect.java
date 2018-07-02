/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.aop.aspects;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import cn.ucaner.boot.aggregation.aop.annotation.BusinessLogAnnotation;

/**
* @Title: BusinessLogAspect
* @Package cn.ucaner.aop.aspects
* @Description: BusinessLogAspect
* @Author Jason
* @Creator
* @Date 2017/12/9 -- 21:52
* @version V1.0
*/
@Component
@Aspect
@Order(-5)
public class BusinessLogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessLogAspect.class);

    @Pointcut(value = "@annotation(cn.ucaner.aop.annotation.BusinessLogAnnotation)")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint point) throws NoSuchMethodException {
        //获取拦截的方法名
        Signature sig = point.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            LOGGER.error("该注解只能用于方法");
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Object target = point.getTarget();
        //获取拦截方法的参数
        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
        //获取操作业务的名称
        BusinessLogAnnotation annotation = currentMethod.getAnnotation(BusinessLogAnnotation.class);
        String bussinessName = annotation.value();
        LOGGER.info("进入{}方法...", bussinessName);
    }
}

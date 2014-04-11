package com.aspectj;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by chace.cai on 2014/4/11.
 * log拦截器
 */
@Component
@Aspect
public class LogInterceptor implements ThrowsAdvice {
    private static final Log logger = LogFactory.getLog(LogInterceptor.class);
    public static final String EDP = "execution(* *(..))";//定义一个切入点表达式

    @Before(EDP) //Before通知
    public void logBefore() {
        System.out.println("方法开始==============");
    }

    @Around(EDP) //Before通知
    public Object logAround(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Object obj=null;
        try {
             obj = joinPoint.proceed(args);
        } catch (Throwable throwable) {
            logger.error("在Around拦截器报错"+throwable.getMessage(),throwable);
        }

        System.out.println("方法名:"+joinPoint.getTarget().getClass()+"."+joinPoint.getSignature().getName());
        return obj;
    }

    @AfterThrowing(EDP)
    public void logException(Method method, Object[] args, Object target,RuntimeException  throwable){
        System.out.println("产生异常的方法名称：  " + method.getName());
        for(Object o:args){
            System.out.println("方法的参数：   " + o.toString());
        }
        System.out.println("代理对象：   " + target.getClass().getName());
        System.out.println("抛出的异常:    " + throwable.getMessage()+">>>>>>>"
                + throwable.getCause());
        System.out.println("异常详细信息：　　　"+throwable.fillInStackTrace());
    }
}

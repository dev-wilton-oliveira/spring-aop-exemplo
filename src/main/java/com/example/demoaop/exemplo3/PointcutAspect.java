package com.example.demoaop.exemplo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect {

    @Pointcut("execution(* com.example.demoaop.exemplo3.PointcutResource.pointcut*(..))")
    public void pointcut() { }

    @Before("pointcut()")
    public void antesDosMetodos(JoinPoint joinPoint) {
        System.out.printf("Antes da execução de um método do serviço. (%s)%n", joinPoint.getSignature());
    }

    @After("pointcut()")
    public void depoisDosMetodos(JoinPoint joinPoint) {
        System.out.printf("Depois da execução de um método do serviço. (%s)%n", joinPoint.getSignature());    }
}

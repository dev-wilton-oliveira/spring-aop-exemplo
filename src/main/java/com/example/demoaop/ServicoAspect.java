package com.example.demoaop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Log4j2
@Component
public class ServicoAspect {

    private static final String ASSINATURA_SALVAR = "execution(public com.example.demoaop.EventoRecord com.example.demoaop.EventoServico.salvar(..))";

    @Before(ASSINATURA_SALVAR)
    public void before(JoinPoint joinPoint) {
        log.warn("@Before: " + joinPoint.getSignature().getName());
    }

    @After(ASSINATURA_SALVAR)
    public void after(JoinPoint joinPoint) {
        log.warn("@After: " + joinPoint.getSignature().getName());
    }

    @Around(ASSINATURA_SALVAR)
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.warn("@Around: " + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            log.warn("Argumento: " + arg);
        }

        Object result;
        try {
            result = joinPoint.proceed();
            log.warn("Depois de executar o método (com sucesso): " + joinPoint.getSignature().getName());
            log.warn("Resultado: " + result);
        } catch (Throwable error) {
            log.warn("Depois de executar o método (com exceção): " + joinPoint.getSignature().getName());
            log.warn("Exceção: " + error.getMessage());
            throw error;
        }

        return result;
    }

    @AfterReturning(ASSINATURA_SALVAR)
    public void afterReturning(JoinPoint joinPoint) {
        log.warn("@AfterReturning: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(ASSINATURA_SALVAR)
    public void afterThrowing(JoinPoint joinPoint) {
        log.warn("@AfterThrowing: " + joinPoint.getSignature().getName());
    }

}

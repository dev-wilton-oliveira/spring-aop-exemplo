# 📝 Resumo – @Pointcut no Spring AOP

## ✅ O que é?
O @Pointcut define um ponto de corte reutilizável, que representa quais métodos devem ser interceptados pelos aspectos (como @Before, @After, etc.).

✅ Como usar?
1. Defina o Pointcut em um método vazio:
```java
@Pointcut("execution(* com.exemplo.servico.*.*(..))")
public void metodosDoServico() {}
```

2. Reutilize o Pointcut em outras anotações AOP:
```java
@Before("metodosDoServico()")
public void antes() {
    System.out.println("Executando antes do método.");
}
```
## ✅ Vantagens:
- ♻ Reutilização de lógica AOP
- ✅ Código mais limpo e organizado
- 🔄 Manutenção centralizada das expressões
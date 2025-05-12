# Exemplo de uso das anotações do AOP

## @Before("...")
- Executa antes da execução do método alvo.
- Ideal para: logging, validação, verificação de permissões.

## @After("...")
- Executa após a execução do método, independentemente de sucesso ou falha.
- Ideal para: limpeza de recursos, logging final.

## @Around("...")
- Envolve a execução do método alvo, podendo controlar se e quando ele será chamado.
- Ideal para: métricas, logging detalhado, transações manuais.

## @AfterReturning("...")
- Executa após a execução bem-sucedida do método (sem exceções).
- Ideal para: logging de retorno, transformação de resultados.

## @AfterThrowing("...")
- Executa após uma exceção ser lançada pelo método.
- Ideal para: logging de erros, auditoria, notificações.

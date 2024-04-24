public aspect VerificarSaldoAspect {
    pointcut transversalConta(): execution(* Conta.*(..));

    before(): transversalConta() {
        // Implementação da verificação de saldo aqui
        if (thisJoinPoint.getSignature().getName().equals("sacar")) {
            double valorSaque = (Double) thisJoinPoint.getArgs()[0];
            if (valorSaque > ((Conta) thisJoinPoint.getTarget()).saldo) {
                System.out.println("Erro: Saldo insuficiente para realizar o saque.");
            }
        }
    }
}

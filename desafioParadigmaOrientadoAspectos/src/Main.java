package src;

import java.util.Date;

import src.Conta;
import src.ContaInvestimento;
import src.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca("Pessoa Física", new Date(), 1000.0);
        
        // Criando uma conta investimento
        ContaInvestimento contaInvestimento = new ContaInvestimento("Pessoa Jurídica", new Date(), 5000.0);

        // Testando operações na conta poupança
        System.out.println("Saldo inicial da conta poupança: " + contaPoupanca.saldo);
        contaPoupanca.sacar(500.0);
        contaPoupanca.depositar(200.0);
        System.out.println("Saldo final da conta poupança: " + contaPoupanca.saldo);

        // Testando operações na conta de investimento
        System.out.println("\nSaldo inicial da conta de investimento: " + contaInvestimento.saldo);
        contaInvestimento.sacar(2000.0);
        contaInvestimento.depositar(1000.0);
        System.out.println("Saldo final da conta de investimento: " + contaInvestimento.saldo);
    }
}


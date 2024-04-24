package src;
import java.util.Date;

// Classe genérica Conta
public class Conta {
    protected String tipoConta;
    protected String tipoCliente;
    protected Date dataAbertura;
    protected double saldo;

    // Construtor
    public Conta(String tipoConta, String tipoCliente, Date dataAbertura, double saldo) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    // Método para calcular o valor da tarifa de manutenção
    public double calculaValorTarifaManutencao() {
        // Implementação genérica, pode variar de acordo com o tipo de conta
        return 0.0;
    }
}

package src;
import java.util.Date;

// Classe ContaPoupanca que herda da classe Conta
public class ContaPoupanca extends Conta {
    // Construtor
    public ContaPoupanca(String tipoCliente, Date dataAbertura, double saldo) {
        super("Poupança", tipoCliente, dataAbertura, saldo);
    }
}

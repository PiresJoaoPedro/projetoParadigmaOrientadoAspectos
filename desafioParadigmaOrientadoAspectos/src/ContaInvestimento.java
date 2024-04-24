package src;
import java.util.Date;

// Classe ContaInvestimento que herda da classe Conta
public class ContaInvestimento extends Conta {
    // Construtor
    public ContaInvestimento(String tipoCliente, Date dataAbertura, double saldo) {
        super("Investimento", tipoCliente, dataAbertura, saldo);
    }
}
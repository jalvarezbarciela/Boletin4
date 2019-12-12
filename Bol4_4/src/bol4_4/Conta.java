package bol4_4;
/**
 *
 * @author Jose
 */
public class Conta {
     private String nome;
    private String numeroConta;
    private double interese;
    private double saldo;

    public Conta() {
        nome = "";
        numeroConta = "";
        interese = 0;
        saldo = 0;
    }

    public Conta(String nome, String numeroConta, double interese, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.interese = interese;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getInterese() {
        return interese;
    }

    public void setInterese(double interese) {
        this.interese = interese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double ingreso(double ingreso) {
        saldo += ingreso;
        return saldo;
    }

    public double reintegro(double reintegro) {
        if (saldo < 0) {
            System.out.println("O reintegro coa conta en"
                    + " negativo non é posible");
        } else {
            saldo -= reintegro;
        }
        return saldo;
    }

    public void transferencia(Conta contaDestino, double importe) {
            reintegro(importe);
            contaDestino.ingreso(importe);
}
}

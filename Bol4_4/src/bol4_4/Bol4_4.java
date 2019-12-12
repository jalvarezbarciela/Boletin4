package bol4_4;
/**
 *
 * @author Jose
 */
public class Bol4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Conta conta = new Conta();
        conta.setSaldo(-20);
        System.out.println("O saldo da conta é " + conta.getSaldo());
        System.out.println("O saldo co ingreso é " + conta.ingreso(5));
        if (conta.getSaldo() < 0) {
            conta.reintegro(10);
        } else {
            System.out.println("O saldo co reintegro é " + conta.reintegro(10));
        }
        Conta contaOrixe = new Conta();
        Conta contaDestino = new Conta();
        contaOrixe.setSaldo(100);
        contaDestino.setSaldo(25);
        contaOrixe.transferencia(contaDestino, 50);
        System.out.println("O saldo da conta orixe coa transferencia "
                + "sería de " + contaOrixe.getSaldo());
        System.out.println("O saldo da conta destino coa "
                + "transferencia sería de " + contaDestino.getSaldo());
    }    }
    


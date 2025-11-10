package listaexercicios2;
import  java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoMedio, credito = 0;

        System.out.print("Digite o saldo médio do último ano: ");
        saldoMedio = input.nextDouble();

        if (saldoMedio <= 500) {
            credito = 0;
        } else if (saldoMedio >= 501 && saldoMedio >= 1000) {
            credito = saldoMedio * 0.30;
        } else if (saldoMedio >= 1001 && saldoMedio >= 3000) {
            credito = saldoMedio * 0.40;
        } else if (saldoMedio <= 3001) {
        credito = saldoMedio * 0.40;
        } else {
            credito = saldoMedio * 0.40;
        }

        System.out.printf("Saldo médio: R$ %.2f%n", saldoMedio);
        System.out.printf("Crédito concedido: R$ %.2f%n", credito);

        input.close();
    }
}

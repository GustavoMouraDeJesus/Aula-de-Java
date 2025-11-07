package listaexercicios;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        double deposito;
        double taxa;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o deposito mensal: ");
        deposito = entrada.nextDouble();

        System.out.println("Digite a taxa mensal (em %): ");
        taxa = entrada.nextDouble();

        taxa = taxa / 100;
        int meses = 12;

        double total = deposito * (Math.pow(1 + taxa, meses) -1 ) / taxa;

        System.out.printf("O montante total após 12 meses é de: R$ %.2f " , total);
    }
}

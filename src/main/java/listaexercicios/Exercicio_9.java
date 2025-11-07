package listaexercicios;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite sua idade em anos: ");
        int anos = input.nextInt();

        System.out.print("Digite os meses adicionais: ");
        int meses = input.nextInt();

        System.out.print("Digite os dias adicionais: ");
        int dias = input.nextInt();

        // Cálculo (1 ano = 365 dias, 1 mês = 30 dias)
        int totalDias = (anos * 365) + (meses * 30) + dias;

        // Saída
        System.out.println("Você tem aproximadamente " + totalDias + " dias de vida.");

        input.close();
    }
}

package listaexercicios2;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        input.close();
    }
}


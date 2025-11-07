package listaexercicios;

import java.util.Scanner;

public class Exercicio_4 {

    static void main(String[] args) {

        float nota1;
        float nota2;
        float nota3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a sua segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Digite a sua terceira nota: ");
        nota3 = entrada.nextFloat();

        float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) /10;

        System.out.printf("A média das suas notas é: %.2f" , media);

    }

}

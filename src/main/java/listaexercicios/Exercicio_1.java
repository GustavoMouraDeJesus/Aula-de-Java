package listaexercicios;

import java.util.Scanner;

public class Exercicio_1 {

    static void main(String[] args) {

        float numero1;
        float numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextFloat();

        float soma = numero1 + numero2;

        System.out.println("A soma entre os dois número é: " + soma);

        float subtracao = numero1 - numero2;

        System.out.println("A subtração entre os dois número é: " + subtracao);

        float multiplicacao = numero1 * numero2;

        System.out.println("A multiplicação entre os dois número é: " + multiplicacao);

        float divisao = numero1 / numero2;

        System.out.println("A divisão entre os dois número é: " + divisao);

    }


}

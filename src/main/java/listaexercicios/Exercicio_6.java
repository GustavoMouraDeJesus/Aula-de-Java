package listaexercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        float num1;
        float num2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextFloat();

        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextFloat();

        System.out.println("O primeiro número digitado foi: " + num2 + " e o segundo número digitado foi: " + num1);
    }
}

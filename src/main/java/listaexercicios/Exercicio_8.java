package listaexercicios;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.println("Digite um número: ");

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        entrada.close();
    }
}

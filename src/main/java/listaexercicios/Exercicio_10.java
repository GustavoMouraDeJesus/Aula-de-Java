package listaexercicios;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        float Salario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu salario antigo: ");
        Salario = entrada.nextFloat();

        float Aumento = Salario + (Salario * 0.15f);

        System.out.println("Seu novo salario é de: " + Aumento);


    }
}

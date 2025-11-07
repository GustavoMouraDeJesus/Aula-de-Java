package listaexercicios;

import java.util.Scanner;

public class Exercicio_5 {

    static void main(String[] args) {

        float salariobase;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario base: ");
        salariobase = entrada.nextFloat();

        float salarioliquido = salariobase + (salariobase * 0.05f);


        System.out.printf("Seu salario liquido é: %.2f" , salarioliquido);

    }

}

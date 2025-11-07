package listaexercicios;

import java.util.Scanner;

public class Exercicio_3 {


    static void main(String[] args) {

        float base;
        float altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        base = entrada.nextFloat();

        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextFloat();

        float area = (base * altura) / 2;

        System.out.printf("A aréa do triangulo é: %.2f" , area);

    }

}

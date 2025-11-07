package listaexercicios;

import java.util.Scanner;

public class Exercicio_2 {

    static void main(String[] args) {

        float raio;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio do seu circulo: ");
        raio = entrada.nextFloat();

        double area = Math.PI * (raio * raio);

        System.out.printf("A aréa do circulo é: %.2f" ,  area);

        double perimetro = 2 * Math.PI * raio;

        System.out.printf(" O perimetro do circulo é %.2f" , perimetro);

    }

}

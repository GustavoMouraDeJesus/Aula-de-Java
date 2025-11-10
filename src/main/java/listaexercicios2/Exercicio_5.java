package listaexercicios2;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prato, sobremesa, bebida;
        int calorias = 0;

        System.out.println("--- Escolha seu prato ---");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");
        System.out.print("Opção: ");
        prato = input.nextInt();

        System.out.println("\n--- Escolha sua sobremesa ---");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete diet (110 cal)");
        System.out.println("3 - Mouse diet (170 cal)");
        System.out.println("4 - Mouse chocolate (200 cal)");
        System.out.print("Opção: ");
        sobremesa = input.nextInt();

        System.out.println("\n--- Escolha sua bebida ---");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante diet (65 cal)");
        System.out.print("Opção: ");
        bebida = input.nextInt();

        switch (prato) {
            case 1: calorias += 180; break;
            case 2: calorias += 230; break;
            case 3: calorias += 250; break;
            case 4: calorias += 350; break;
            default: System.out.println("Opção de prato inválida!");
        }

        switch (sobremesa) {
            case 1: calorias += 75; break;
            case 2: calorias += 110; break;
            case 3: calorias += 170; break;
            case 4: calorias += 200; break;
            default: System.out.println("Opção de sobremesa inválida!");
        }

        switch (bebida) {
            case 1: calorias += 20; break;
            case 2: calorias += 70; break;
            case 3: calorias += 100; break;
            case 4: calorias += 65; break;
            default: System.out.println("Opção de bebida inválida!");
        }

        System.out.println("\n==============================");
        System.out.println("Total de calorias da refeição: " + calorias + " cal");
        System.out.println("==============================");

        input.close();
}}
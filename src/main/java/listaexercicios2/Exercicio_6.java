package listaexercicios2;
import java.util.Scanner;

public class Exercicio_6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7");
        int dia = input.nextInt();
        String nome_dia = "";

        switch (dia){
            case 1: nome_dia = "Domingo"; break;
            case 2: nome_dia = "Segunda-feira"; break;
            case 3: nome_dia = "Terça-feira"; break;
            case 4: nome_dia = "Quarta-feira"; break;
            case 5: nome_dia = "Quinta-feira"; break;
            case 6: nome_dia = "Sexta-feira"; break;
            case 7: nome_dia = "Sábado"; break;
            default: nome_dia = "Dia inválido!"; break;
        }
        System.out.println("O número corresponde ao seguinte dia: " + nome_dia);
        input.close();

    }
}

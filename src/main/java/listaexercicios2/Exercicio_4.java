package listaexercicios2;
import  java.util.Scanner;

public class Exercicio_4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int Idade = input.nextInt();
        if (Idade <16){
            System.out.println("Você não é um eleitor.");
        }else if (Idade >=18 && Idade<=65){
            System.out.println("Voto obrigatório");
        }else if (Idade >=16 && Idade <18 || Idade >65){
            System.out.println("Voto não obrigatório!");
        }else {
            System.out.println("ERRO! Digite uma idade válida!");
        }
    }
}

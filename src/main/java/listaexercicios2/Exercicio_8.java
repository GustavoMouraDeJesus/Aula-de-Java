package listaexercicios2;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = input.nextInt();

        int maior, meio, menor;

        if (A >= B && A >= C) {
            maior = A;
            if (B >= C) {
                meio = B;
                menor = C;
            } else {
                meio = C;
                menor = B;
            }
        } else if (B >= A && B >= C) {
            maior = B;
            if (A >= C) {
                meio = A;
                menor = C;
            } else {
                meio = C;
                menor = A;
            }
        } else {
            maior = C;
            if (A >= B) {
                meio = A;
                menor = B;
            } else {
                meio = B;
                menor = A;
            }
        }

        System.out.println("Os valores em ordem decrescente são: " + maior + ", " + meio + ", " + menor);

        input.close();
    }
}

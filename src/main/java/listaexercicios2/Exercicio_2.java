package listaexercicios2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o seu peso");
        double peso = entrada.nextDouble();

        System.out.println("Entre com a sua altura");
        String alturaStr = entrada.next().replace(",", ".");
        double altura = Double.parseDouble(alturaStr);

        double calculo;
        calculo = peso / Math.pow(altura, 2);

        System.out.println("Seu IMC é de: " + calculo);

        if(calculo < 20){
            System.out.println("Vc está abaixo do peso!");
        }else if((calculo>=20) && (calculo<=24.9)){
            System.out.println("Vc está no peso ideal");
        }else if((calculo >=25) && (calculo <=29.9)){
            System.out.println("Vc está levemente acima do peso");
        }else if((calculo >=30) && (calculo <=39.9)){
            System.out.println("Vc está na obeso");
        }else if((calculo >=40)){
            System.out.println("Vc está na obesidade morbida");
        }else{
            System.out.println("Vc está na obesidade morbida");
        }

    }
}

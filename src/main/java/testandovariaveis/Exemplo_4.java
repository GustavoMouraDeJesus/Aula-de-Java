package testandovariaveis;
import java.util.*;

public class Exemplo_4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o seu peso");
        double peso = entrada.nextDouble();

        System.out.println("Entre com a sua altura");
        double altura = entrada.nextDouble();

        double calculo;
        calculo = peso / Math.pow(altura, 2);

        System.out.println("Seu IMC é de: " + calculo);

        if(calculo < 18.5){
            System.out.println("Vc está abaixo do peso!");
        }else if((calculo>=18.5) && (calculo<=24.9)){
            System.out.println("Vc está no peso ideal");
        }else if((calculo >=25) && (calculo <=29.9)){
            System.out.println("Vc está levemente acima do peso");
        }else if((calculo >=30) && (calculo <=34.9)){
            System.out.println("Vc está na obesidade grau I");
        }else if((calculo >=35) && (calculo <=39.9)){
            System.out.println("Vc está na obesidade grau II");
        }else{
            System.out.println("Vc está na obesidade morbida");
        }

    }
}

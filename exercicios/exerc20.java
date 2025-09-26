import java.util.Scanner;

public class exerc20 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Faça um algoritmo que receba dois valores e um operador aritmético (+, -, /, * - adição, subtração, divisão e multiplicação). 
        //Caso o símbolo seja outro, informe “Símbolo inválido”. Faça o cálculo conforme o operador informado e exiba a expressão e o resultado.

        double num1, num2, resultado=0;
        char operador;

        System.out.println("Informe o primeiro número: ");
        num1 = s.nextDouble();

        System.out.println("Informe o segundo número: ");
        num2 = s.nextDouble();

        System.out.println("Informe um operador aritmético(+, -, /, *): ");
        operador = s.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1+num2;
                break;

            case '-':
                resultado = num1-num2;
                break;
            
            case '/':
                resultado = num1/num2;
                break;

            case '*':
                resultado = num1*num2;
                break;

            default:
                System.out.println("Operador inválido!");
                return;
        }
        System.out.println("Resultado: " + num1 + operador + num2 + " = " + resultado);
    }
}
